package com.db1.conta.contaapi.domain.entity;

import static org.junit.Assert.assertNotNull;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class ContaTest {
	
	@Test
	public void deveRetornarExceptionQuandoAgenciaForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		try {
			Conta conta = new Conta(null, ContaTipo.corrente, cliente);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Agência é obrigatória", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoContaTipoForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Agencia agencia = Mockito.mock(Agencia.class);
		try {
			Conta conta = new Conta(agencia, null, cliente);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Tipo de conta é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoClienteForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Agencia agencia = Mockito.mock(Agencia.class);
		try {
			Conta conta = new Conta(agencia, ContaTipo.corrente, null);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Cliente é obrigatório", mensagem);
	}
	@Test
	public void naodeveRetornarExceptionQuandoNenhumForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Agencia agencia = Mockito.mock(Agencia.class);
		try {
			Conta conta = new Conta(agencia, ContaTipo.corrente, cliente);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		assertNotNull(mensagem);
	}

}
