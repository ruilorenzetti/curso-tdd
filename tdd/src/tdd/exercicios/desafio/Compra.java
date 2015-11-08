package tdd.exercicios.desafio;

import java.util.List;

public class Compra {
	private Cliente cliente;
	private List<Item> itens;
	private double valorLiquido;

	public Compra(Cliente cliente, List<Item> itens) {
		this.itens = itens;
		this.cliente = cliente;
		somaItens();
	}
	
	private void somaItens() {
		for(Item item : itens) {
			valorLiquido += item.getPrecoTotal();
		}
	}
	
	public void aumentaValor(double aumenta) {
		this.valorLiquido += aumenta;
	}
	
	public void reduzValor(double reducao) {
		this.valorLiquido -= reducao;
	}

	public double getValorLiquido() {
		return valorLiquido;
	}

	public int qtdItens() {
		int qtd = 0;
		for(Item item : itens) {
			qtd+= item.getQuantidade();
		}
		return qtd;
	}

	public boolean tem(String produto) {
		for(Item item : itens) {
			if(item.getNome().equals(produto)) return true;
		}
		
		return false;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
}
