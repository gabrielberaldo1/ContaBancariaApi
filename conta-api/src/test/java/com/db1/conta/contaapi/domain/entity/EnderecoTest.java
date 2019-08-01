package com.db1.conta.contaapi.domain.entity;

import static org.junit.Assert.assertNull;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class EnderecoTest {
	
	@Test
	public void deveRetornarExceptionQuandoClienteForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Endereco endereco = new Endereco(null, "Rua A", "156", cidade, TipoEndereco.residencial);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Cliente é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoLogradouroForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Endereco endereco = new Endereco(cliente, null, "156", cidade, TipoEndereco.residencial);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Logradouro é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoNumeroForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Endereco endereco = new Endereco(cliente, "Rua A", null, cidade, TipoEndereco.residencial);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Número é obrigatório", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoCidadeForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Endereco endereco = new Endereco(cliente, "Rua A", "156", null, TipoEndereco.residencial);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Cidade é obrigatória", mensagem);
	}
	@Test
	public void deveRetornarExceptionQuandoTipoEnderecoForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Endereco endereco = new Endereco(cliente, "Rua A", "156", cidade, null);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		Assert.assertEquals("Tipo de endereço é obrigatório", mensagem);
	}
	@Test
	public void naodeveRetornarExceptionQuandoNenhumForNull() {
		String mensagem = null;
		Cliente cliente = Mockito.mock(Cliente.class);
		Cidade cidade = Mockito.mock(Cidade.class);
		try {
			Endereco endereco = new Endereco(cliente, "Rua A", "156", cidade, TipoEndereco.residencial);
		}catch(Exception e) {
			mensagem = e.getMessage();
		}
		assertNull(mensagem);
	}
}
