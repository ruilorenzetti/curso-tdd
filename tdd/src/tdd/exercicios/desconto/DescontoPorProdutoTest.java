package tdd.exercicios.desconto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DescontoPorProdutoTest {
	private DescontoPorProduto descProduto;
	private Compra compra;
	
	@Before
	public void setUp() {
		this.descProduto = new DescontoPorProduto();
	}

	@Test
	public void aplicaDescontoQuinzePorcento() {
		this.compra = new CompraBuilder()
				.com("MACBOOK", 1, 1500)
				.com("IPHONE", 3, 500).constroi();
		
		descProduto.executa(compra);
		
		assertEquals(2550, compra.getValorLiquido(), 0);
	}
	
	@Test
	public void aplicaDescontoDozePorcento() {
		this.compra = new CompraBuilder()
				.com("NOTEBOOK", 3, 1000)
				.com("WINDOWS PHONE", 7, 1000).constroi();
		
		descProduto.executa(compra);
		
		assertEquals(8800, compra.getValorLiquido(), 0);
	}
	
	@Test
	public void aplicaDescontoSetentaPorcento() {
		this.compra = new CompraBuilder()
				.com("XBOX", 5, 3000).constroi();
		
		descProduto.executa(compra);
		
		assertEquals(4500, compra.getValorLiquido(), 0);
	}
	
	@Test
	public void naoAplicaDesconto() {
		this.compra = new CompraBuilder()
				.com("OUTRO ITEM", 2, 1000).constroi();
		
		descProduto.executa(compra);
		
		assertEquals(2000, compra.getValorLiquido(), 0);
	}

}
