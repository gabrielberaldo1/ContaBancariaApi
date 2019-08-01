package com.db1.conta.contaapi.domain.entity;

import org.junit.Assert;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import org.mockito.Mockito;


public class ClienteTest {
	
	@Test
	public void deveRetornarExceptionQuandoNomeForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Cliente cliente = new Cliente(null, conta, "98765432101");
	}catch (Exception e){
	mensagem = e.getMessage();	
	}
	Assert.assertEquals("Nome é obrigatório", mensagem);
}
	@Test
	public void deveRetornarExceptionQuandoContaForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Cliente cliente = new Cliente("Gabriel", null, "98765432101");
	}catch (Exception e){
	mensagem = e.getMessage();	
	}
	Assert.assertEquals("Conta é obrigatório", mensagem);
}
	@Test
	public void deveRetornarExceptionQuandoCPFForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Cliente cliente = new Cliente("Gabriel", conta, null);
	}catch (Exception e){
	mensagem = e.getMessage();	
	}
	Assert.assertEquals("CPF é obrigatório", mensagem);
}
	@Test
	public void naoDeveRetornarExceptionSeNenhumForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Cliente cliente = new Cliente("Gabriel", conta, "98765432101");
	}catch(Exception e) {
	mensagem = e.getMessage();	
	}
	assertNull(mensagem);
	}
}
