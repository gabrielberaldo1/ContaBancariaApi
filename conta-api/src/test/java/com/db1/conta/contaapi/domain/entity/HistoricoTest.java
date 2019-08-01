package com.db1.conta.contaapi.domain.entity;

import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class HistoricoTest {
	
	@Test
	public void deveRetornarExceptionQuandoTipoHistoricoForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Historico historico = new Historico(null, 100.0, conta, 50.0);
	}catch(Exception e) {
	
	mensagem = e.getMessage();
	}
	Assert.assertEquals("Tipo do Histórico é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoValorForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Historico historico = new Historico(HistoricoTipo.entrada, null, conta, 50.0);
	}catch(Exception e) {
	
	mensagem = e.getMessage();
	}
	Assert.assertEquals("Valor é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoContaForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Historico historico = new Historico(HistoricoTipo.entrada, 50.0, null, 50.0);
	}catch(Exception e) {
	
	mensagem = e.getMessage();
	}
	Assert.assertEquals("Conta é obrigatória", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoValorResultanteForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Historico historico = new Historico(HistoricoTipo.entrada, 50.0, conta, null);
	}catch(Exception e) {
	
	mensagem = e.getMessage();
	}
	Assert.assertEquals("Valor Resultante é obrigatório", mensagem);
	}
	@Test
	public void naodeveRetornarExceptionQuandoNenhumForNull() {
		String mensagem = null;
		Conta conta = Mockito.mock(Conta.class);
	try {
		Historico historico = new Historico(HistoricoTipo.entrada, 100.0, conta, 50.0);
	}catch(Exception e) {
	
	mensagem = e.getMessage();
	}
	assertNull(mensagem);
	}
}
