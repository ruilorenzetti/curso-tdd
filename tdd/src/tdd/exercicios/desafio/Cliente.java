package tdd.exercicios.desafio;

public class Cliente {
	private String nome;
	private String estado;
	
	public Cliente(String nome, String estado) {
		super();
		this.nome = nome;
		this.estado = estado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEstado() {
		return estado;
	}
}
