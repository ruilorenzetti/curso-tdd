package tdd.exercicios.carrinho;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Produto> produtos;
	
	public Carrinho() {
		this.produtos = new ArrayList<Produto>();
	}

	public void addItem(List<Produto> produtos) {
		this.produtos.addAll(produtos);
	}

	public Double buscaMenorValor() {
		return 0.0;
	}

}
