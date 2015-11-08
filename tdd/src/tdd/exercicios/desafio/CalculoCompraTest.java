package tdd.exercicios.desafio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculoCompraTest {
	private Compra compra;
	private CalculoCompra calculo;
	
	@Before
	public void setUp() {
		
	}

	@Test
	public void verificaDescontoCincoPorcentoFreteSpAteTresItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SP")
				.com("ITEM 1", 3, 10)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.05) + 10.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoCincoPorcentoFreteSpAcimaTresItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SP")
				.com("ITEM 1", 4, 10)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.05) + 17.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoDezPorcentoFreteSpAteTresItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SP")
				.com("ITEM 1", 3, 200)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.1) + 10.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoDezPorcentoFreteSpAcimaTresItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SP")
				.com("ITEM 1", 4, 200)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.1) + 17.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoQuinzePorcentoFreteSpAteTresItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SP")
				.com("ITEM 1", 3, 1000)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.15) + 10.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoQuinzePorcentoFreteSpAcimaTresItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SP")
				.com("ITEM 1", 4, 1000)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.15) + 17.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoCincoPorcentoFreteRjAteQuatroItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "RJ")
				.com("ITEM 1", 4, 10)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.05) + 11.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoCincoPorcentoFreteRjAcimaQuatroItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "RJ")
				.com("ITEM 1", 5, 10)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.05) + 15.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoDezPorcentoFreteRjAteQuatroItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "RJ")
				.com("ITEM 1", 4, 200)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.1) + 11.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoDezPorcentoFreteRjAcimaQuatroItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "RJ")
				.com("ITEM 1", 5, 200)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.1) + 15.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoQuinzePorcentoFreteRjAteQuatroItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "RJ")
				.com("ITEM 1", 4, 1000)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.15) + 11.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoQuinzePorcentoFreteRjAcimaQuatroItens() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "RJ")
				.com("ITEM 1", 5, 1000)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.15) + 15.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoCincoPorcentoFreteSul() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SUL")
				.com("ITEM 1", 4, 10)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.05) + 22.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoDezPorcentoFreteSul() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SUL")
				.com("ITEM 1", 4, 200)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.1) + 22.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoQuinzePorcentoFreteSul() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "SUL")
				.com("ITEM 1", 4, 1000)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.15) + 22.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoCincoPorcentoFreteRestante() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "OUTRO")
				.com("ITEM 1", 4, 10)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.05) + 25.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoDezPorcentoFreteRestante() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "OUTRO")
				.com("ITEM 1", 4, 200)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.1) + 25.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
	@Test
	public void verificaDescontoQuinzePorcentoFreteRestante() {
		this.compra = new CompraBuilder()
				.cliente("Fulano", "OUTRO")
				.com("ITEM 1", 4, 1000)
				.constroi();
		
		double esperado = compra.getValorLiquido() - (compra.getValorLiquido() * 0.15) + 25.0;
		
		this.calculo = new CalculoCompra();
		this.calculo.executa(this.compra);
		
		assertEquals(esperado, this.compra.getValorLiquido(), 0.0001);
	}
	
}