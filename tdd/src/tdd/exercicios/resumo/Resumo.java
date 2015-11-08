package tdd.exercicios.resumo;

import java.util.Calendar;

public class Resumo {

	private Calendar data;
	private double maior;
	private double menor;
	
	public Resumo() {
		
	}

	public Resumo(Calendar data, double maior, double menor) {
		this.data = data;
		this.maior = maior;
		this.menor = menor;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public double getMaior() {
		return maior;
	}
	
	public double getMenor() {
		return menor;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resumo other = (Resumo) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (Double.doubleToLongBits(maior) != Double.doubleToLongBits(other.maior))
			return false;
		if (Double.doubleToLongBits(menor) != Double.doubleToLongBits(other.menor))
			return false;
		return true;
	}

	
}
