package tdd.exercicios.atualizadorcadastro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AtualizadorDeCadastroTest {
	private ProdutoDao dao;
	private AtualizadorDeCadastro cadastro;
	
	@Before
	public void setUp() {
		
	}

	@Test
	public void deveAtualizarProduto() {
		dao = Mockito.mock(ProdutoDao.class);
		
		Produto p1 = new Produto(1.0);
		Produto p2 = new Produto(2.0);
		
		List<Produto> produtos = Arrays.asList(p1, p2);
		
		cadastro = new AtualizadorDeCadastro(dao);
		cadastro.atualiza(produtos);
		Mockito.verify(dao).atualiza(p1);
	}

}
