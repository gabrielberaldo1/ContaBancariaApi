package com.db1.conta.contaapi.domain.entity;

import java.time.LocalDateTime;

import org.springframework.util.Assert;

public class Historico {
	
	private Long id;
	
	private HistoricoTipo tipo;
	
	private LocalDateTime data;
	
	private Double valor;
	
	private Conta conta;
	
	private Double valorresultante;
	
	public Historico(HistoricoTipo tipo, Double valor, Conta conta, Double valorresultante) {
		Assert.notNull(tipo, "Tipo do Histórico é obrigatório");
		Assert.notNull(conta, "Conta é obrigatória");
		Assert.notNull(valor, "Valor é obrigatório");
		Assert.notNull(valorresultante, "Valor Resultante é obrigatório");
		
		this.tipo = tipo;
		this.valor = valor;
		this.conta = conta;
		this.valorresultante = valorresultante;
	}

	public Long getId() {
		return id;
	}

	public HistoricoTipo getTipo() {
		return tipo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public Double getValor() {
		return valor;
	}

	public Conta getConta() {
		return conta;
	}

	public Double getValorresultante() {
		return valorresultante;
	}

}
