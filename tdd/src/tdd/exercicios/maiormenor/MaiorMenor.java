package tdd.exercicios.maiormenor;

import java.util.Arrays;

public class MaiorMenor {
	int maior = Integer.MIN_VALUE;
	int menor = Integer.MAX_VALUE;
	
	public void encontraOld(int[] num) {
		Arrays.sort(num);
		menor = num[0];
		maior = num[num.length - 1];
	}
	
	public void encontra(int[] num) {
	       for (int n : num) {
	           if (n > maior)  maior = n;
	           if (n < menor) menor = n;
	       }
	   }
	
	public int getMaior() {
		return maior;
	}
	
	public int getMenor() {
		return menor;
	}
}
