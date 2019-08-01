package com.db1.conta.contaapi.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.db1.conta.contaapi.domain.entity.Agencia;
import com.db1.conta.contaapi.domain.entity.Cidade;
import com.db1.conta.contaapi.domain.entity.Cliente;
import com.db1.conta.contaapi.domain.entity.Endereco;
import com.db1.conta.contaapi.domain.entity.Estado;
import com.db1.conta.contaapi.domain.entity.TipoEndereco;
import com.db1.conta.contaapi.domain.entity.Conta;
import com.db1.conta.contaapi.domain.entity.ContaTipo;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ClienteRepositoryTest {
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private AgenciaRepository agenciaRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@After
	public void afterTest() {
		clienteRepository.deleteAll();
		agenciaRepository.deleteAll();
		cidadeRepository.deleteAll();
	}
	@Test
	public void deveSalvarUmaPessoaComEndereco() {
		//salvando uma cidade para usar futuramente
		Cidade cidade = cidadeRepository.save(new Cidade("Maringá", Estado.PR));
		
		//cliente errado
		Endereco endereco = enderecoRepository.save(new Endereco(Cliente, "Rua A","156", cidade, TipoEndereco.comercial));
		
		
	}
}
	
