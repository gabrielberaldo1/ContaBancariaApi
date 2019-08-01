package com.db1.conta.contaapi.domain.entity;

import static org.junit.Assert.assertNull;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class AgenciaTest {

	@Test
	public void deveRetornarExceptionQuandoNumeroAgenciaForNull() {
		String mensagem = null;
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Agencia agencia = new Agencia(null, "1566449465", cidade);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Numero é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoDigitoAgenciaForNull() {
		String mensagem = null;
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Agencia agencia = new Agencia("0465", null, cidade);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Dígito é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoCidadeForNull() {
		String mensagem = null;
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Agencia agencia = new Agencia("0465", "1566449465", null);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Cidade é obrigatória", mensagem);
	}
	@Test
	public void nãoDeveRetornarExceptionQuandoNenhumForNull() {
		String mensagem = null;
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Agencia agencia = new Agencia ("0465", "15645641561", cidade);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		assertNull(mensagem);
	}
	@Test
	public void deveCriarUmaAgencia() {
		Cidade cidade = Mockito.mock(Cidade.class);
			Agencia agencia = new Agencia("0465","12",cidade);
			Assert.assertEquals("0465", agencia.getNumero());
			Assert.assertEquals("12", agencia.getDigito());
		}
	}
