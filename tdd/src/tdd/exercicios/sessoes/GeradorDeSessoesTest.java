package tdd.exercicios.sessoes;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GeradorDeSessoesTest {

	@Test
	public void dia() {
		int inicio = 1;
		int fim = 3;
		
		List<Sessao> sessoes = new ArrayList<Sessao>();
		
		for (int i = inicio; i <= fim; i++) {
			sessoes.add(new Sessao(i));
		}
		
		List<Sessao> sessoesGeradas = new GeradorDeSessoes().gera(inicio, fim, Periodo.DIARIA);
		
		assertEquals(true, sessoes.equals(sessoesGeradas));
	}
	
	@Test
	public void semana() {
		int inicio = 1;
		int fim = 20;
		
		List<Sessao> sessoes = new ArrayList<Sessao>();
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
		
		List<Sessao> sessoesGeradas = new GeradorDeSessoes().gera(inicio, fim, Periodo.SEMANAL);
		
		assertEquals(true, sessoes.equals(sessoesGeradas));
	}
}
