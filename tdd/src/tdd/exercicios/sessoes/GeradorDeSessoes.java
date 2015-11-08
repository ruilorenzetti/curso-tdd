package tdd.exercicios.sessoes;

import java.util.ArrayList;
import java.util.List;

public class GeradorDeSessoes {

	public List<Sessao> gera(int inicio, int fim, Periodo periodo) {
		List<Sessao> sessoes = new ArrayList<Sessao>();
		if (Periodo.DIARIA.equals(periodo)) {
			for (int i = inicio; i <= fim; i++) {
				sessoes.add(new Sessao(i));
			}
		} else if (Periodo.SEMANAL.equals(periodo)) {
			int aux = 0;
			for (int i = inicio; i <= fim; i++) {
				if (i == inicio) {
					sessoes.add(new Sessao(inicio));
					aux = i;
				} else {
					aux += Periodo.SEMANAL.getTamanho();
					if (aux <= fim) {
						sessoes.add(new Sessao(aux));
					} else {
						i = fim;
					}
				}
			}
		} else if (Periodo.MENSAL.equals(periodo)) {
			
		}
		
		return sessoes;
	}
	
}
