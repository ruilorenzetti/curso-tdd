package tdd.exercicios.resumo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NegocioBuilder {
	private List<Negocio> negocios;

	public NegocioBuilder() {
		negocios = new ArrayList<Negocio>();
	}
	
	public NegocioBuilder naData(Calendar data, int... valores) {
		
		for(int valor : valores) {
			negocios.add(new Negocio(data, valor));
		}
		
		return this;
	}
	
	public List<Negocio> constroi() {
		return this.negocios;
	}
}
