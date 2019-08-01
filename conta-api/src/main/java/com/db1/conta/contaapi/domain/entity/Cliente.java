package com.db1.conta.contaapi.domain.entity;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.Assert;

@Entity
@Table(name = "cliente")

public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	@Column(name = "enderecos", length = 300, nullable = false)
	private List<Endereco> endereco = new ArrayList<Endereco>();
	@Column(name = "contas", length = 100, nullable = false)
	private List<Conta> Conta = new ArrayList<Conta>();
	@Column(name = "cpf", length = 14, nullable = false, unique = true)
	private String cpf;
	
	public Cliente(String nome, Conta conta, String cpf) {
		Assert.hasText(nome, "Nome é obrigatório");
		Assert.hasText(cpf, "CPF é obrigatório");
		Assert.notNull(conta, "Conta é obrigatório");
		
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public List<Conta> getConta() {
		return Conta;
	}

	public String getCpf() {
		return cpf;
	}
	
	
	

}
