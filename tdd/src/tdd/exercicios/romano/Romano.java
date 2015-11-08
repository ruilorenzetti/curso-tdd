package tdd.exercicios.romano;

public class Romano {

	public Integer converte(String romano) {
		int n = 0;  
        int numeralDaDireita = 0;  
        for (int i = romano.length() - 1; i >= 0; i--) {  
            int valor = (int) tabela(romano.charAt(i));  
            n += valor * Math.signum(valor + 0.5 - numeralDaDireita);  
            numeralDaDireita = valor;  
        }  
        return n;
	}
	
	public Integer tabela(char caractere) {
		return (int) (Math.floor(Math.pow(10, "IXCM".indexOf(caractere))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere))));
	}
}
