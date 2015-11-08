package tdd.exercicios.carrinho;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoTest {
	private Carrinho carrinho;
	private List<Produto> produtos;

	@Before
	public void setUp(){
		this.carrinho = new Carrinho();
		this.produtos = new ArrayList<Produto>();
	}

   @Test
   public void carrinhoVazio() {
       carrinho.addItem(produtos);
       
       Double valor = carrinho.buscaMenorValor();
       
       assertEquals(0.0, valor, 0); 
   }
}
