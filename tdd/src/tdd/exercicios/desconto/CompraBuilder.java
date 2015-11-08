package tdd.exercicios.desconto;

import java.util.ArrayList;
import java.util.List;

public class CompraBuilder {
	private List<Item> itens;
	
	public CompraBuilder() {
		this.itens = new ArrayList<Item>();
	}
	
	public CompraBuilder com(String nome, Integer quantidade, Integer preco) {
		return com(nome, quantidade, preco.doubleValue());
	}
	
	public CompraBuilder com(String nome, Integer quantidade, Double preco) {
		this.itens.add(new Item(nome, quantidade, preco));
		
		return this;
	}
	
	public Compra constroi() {
		return new Compra(this.itens);
	}
	
}
