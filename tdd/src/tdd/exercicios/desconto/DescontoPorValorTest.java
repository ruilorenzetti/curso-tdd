package tdd.exercicios.desconto;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DescontoPorValorTest {
	private DescontoPorValor descValor;
	private Compra compra;
	
	@Before
	public void setUp() {
		this.descValor = new DescontoPorValor();
	}

	@Test
	public void aplicaDescontoDoisPorcento() {
		this.compra = new CompraBuilder()
				.com("OUTRO ITEM", 2, 500).constroi();
		
		descValor.executa(compra);
		
		assertEquals(980, compra.getValorLiquido(), 0);
	}
	
	@Test
	public void aplicaDescontoCincoPorcento() {
		this.compra = new CompraBuilder()
				.com("OUTRO ITEM", 4, 1000).constroi();

		descValor.executa(compra);
		
		assertEquals(3800, compra.getValorLiquido(), 0);
	}
	
	@Test
	public void aplicaDescontoSeisPorcento() {
		this.compra = new CompraBuilder()
				.com("OUTRO ITEM", 6, 1000).constroi();
		
		descValor.executa(compra);
		
		assertEquals(5640, compra.getValorLiquido(), 0);
	}
	
	@Test
	public void naoAplicaDesconto() {
		this.compra = new CompraBuilder()
				.com("OUTRO ITEM", 2, 1000).constroi();
		
		descValor.executa(compra);
		
		assertEquals(2000, compra.getValorLiquido(), 0);
	}

}
