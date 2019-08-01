package com.db1.conta.contaapi.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.Assert;
@Entity
@Table(name = "endereco")


public class Endereco {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Cliente", length  = 100, nullable = false)
	private Cliente cliente;
	@Column(name = "logradouro", length = 200, nullable = false)
	private String logradouro;
	@Column(name = "numero", length = 5, nullable = false)
	private String numero;
	@Column(name = "cidade", length = 64, nullable = false)
	private Cidade cidade;
	@Column(name = "tipoendereco", length = 20, nullable = false)
	private TipoEndereco tipoendereco;
	@Column(name = "complemento", length = 20)
	private String complemento;
	
	public Endereco(Cliente cliente, String logradouro, String numero, Cidade cidade, TipoEndereco tipoendereco) {
		Assert.notNull(cliente, "Cliente é obrigatório");
		Assert.hasText(logradouro, "Logradouro é obrigatório");
		Assert.hasText(numero, "Número é obrigatório");
		Assert.notNull(cidade, "Cidade é obrigatória");
		Assert.notNull(tipoendereco, "Tipo de endereço é obrigatório");
		
		this.cliente = cliente;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;
		this.tipoendereco = tipoendereco;
	}

	public Long getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public TipoEndereco getTipoendereco() {
		return tipoendereco;
	}

	public String getComplemento() {
		return complemento;
	}

}
