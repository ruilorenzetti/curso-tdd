package tdd.exercicios.desconto;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author douglas.japiassu
 *
 */
public class AplicadorDeDescontosTest {
	private AplicadorDeDescontos apl;
	private Compra compra;
	private List<Item> itens;
	
	@Before
	public void setUp() {
		this.itens = new ArrayList<Item>();
		this.apl = new AplicadorDeDescontos();
	}

	@Test
	@Deprecated
	public void aplicaDescontoPorProdutoQuinzePorcento() {
		Item macbook = new Item("MACBOOK", 1, 1500);
		Item iphone = new Item("IPHONE", 3, 500);
		
		this.itens.add(macbook);
		this.itens.add(iphone);
		
		this.compra = new Compra(itens);
		
		apl.aplica(compra);
		
		assertEquals(2550, compra.getValorLiquido(), 0);
	}
	
	@Test
	@Deprecated
	public void aplicaDescontoPorProdutoDozePorcento() {
		Item notebook = new Item("NOTEBOOK", 3, 1000);
		Item windowsPhone = new Item("WINDOWS PHONE", 7, 1000);
		
		this.itens.add(notebook);
		this.itens.add(windowsPhone);
		
		this.compra = new Compra(itens);
		
		apl.aplica(compra);
		
		assertEquals(8800, compra.getValorLiquido(), 0);
	}
	
	@Test
	@Deprecated
	public void aplicaDescontoPorProdutoSetentaPorcento() {
		Item xbox = new Item("XBOX", 5, 3000);
		
		this.itens.add(xbox);
		
		this.compra = new Compra(itens);
		
		apl.aplica(compra);
		
		assertEquals(4500, compra.getValorLiquido(), 0);
	}
	
	@Test
	@Deprecated
	public void aplicaDescontoPorValorDoisPorcento() {
		Item outroItem = new Item("OUTRO ITEM", 2, 500);
		
		this.itens.add(outroItem);
		
		this.compra = new Compra(itens);
		
		apl.aplica(compra);
		
		assertEquals(980, compra.getValorLiquido(), 0);
	}
	
	@Test
	@Deprecated
	public void aplicaDescontoPorValorCincoPorcento() {
		Item outroItem = new Item("OUTRO ITEM", 4, 1000);
		
		this.itens.add(outroItem);
		
		this.compra = new Compra(itens);
		
		apl.aplica(compra);
		
		assertEquals(3800, compra.getValorLiquido(), 0);
	}
	
	@Test
	@Deprecated
	public void aplicaDescontoPorValorSeisPorcento() {
		Item outroItem = new Item("OUTRO ITEM", 6, 1000);
		
		this.itens.add(outroItem);
		
		this.compra = new Compra(itens);
		
		apl.aplica(compra);
		
		assertEquals(5640, compra.getValorLiquido(), 0);
	}
	
	@Test
	@Deprecated
	public void naoAplicaDesconto() {
		Item outroItem = new Item("OUTRO ITEM", 2, 1000);
		
		this.itens.add(outroItem);
		
		this.compra = new Compra(itens);
		
		apl.aplica(compra);
		
		assertEquals(2000, compra.getValorLiquido(), 0);
	}

}
