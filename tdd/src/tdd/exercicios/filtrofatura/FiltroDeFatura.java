package tdd.exercicios.filtrofatura;

import java.util.ArrayList;
import java.util.List;

public class FiltroDeFatura {
	private FaturaDao dao;
	
	public FiltroDeFatura(FaturaDao dao) {
		this.dao = dao;
	}
	
	public List<Fatura> filtra() {
		List<Fatura> result = new ArrayList<Fatura>();
		List<Fatura> todasFaturas = dao.todas();
		
		for (Fatura fatura : todasFaturas) {
			if (fatura.getValor() > 2000) {
				result.add(fatura);
			}
		}
		
		return result;
	}

}
