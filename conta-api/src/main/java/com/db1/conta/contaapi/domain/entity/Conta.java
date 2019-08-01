package com.db1.conta.contaapi.domain.entity;

import java.util.List;

import org.springframework.util.Assert;


public class Conta {
	private Agencia agencia;
	
	private ContaTipo tipo;
	
	private Cliente cliente;
	
	private String saldo;
	
	private List<Historico> conta;
	
	private Long id;
	
	public Conta(Agencia agencia, ContaTipo tipo, Cliente cliente) {
		Assert.notNull(agencia,"Agência é obrigatória");
		Assert.notNull(tipo, "Tipo de conta é obrigatório");
		Assert.notNull(cliente, "Cliente é obrigatório");
		Assert.hasText(saldo, "Saldo é obrigatório");
		Assert.notNull(conta, "Histórico é obrigatório");
		this.agencia = agencia;
		this.tipo = tipo;
		this.cliente = cliente;
		this.saldo = saldo;
		this.conta = conta;
		
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public ContaTipo getTipo() {
		return tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getSaldo() {
		return saldo;
	}

	public List<Historico> getConta() {
		return conta;
	}

	public Long getId() {
		return id;
	}
	

}
