package tdd.exercicios.sessoes;

public class Sessao {
	private int numero;

	public Sessao(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Sessao) {
			Sessao sessaoParametro = (Sessao) obj;
			
			if (this.getNumero() == sessaoParametro.getNumero()) {
				return true;
			}
		}
		
		return false;
	}

}
