package tdd.exercicios.desafio;

public class CalculoCompra {

	private Compra compra;
	private static final String SP = "SP";
	private static final String RJ = "RJ";
	private static final String SUL = "SUL";

	public void executa(Compra compra) {
		this.compra = compra;
		aplicaDesconto();
		aplicaValorFrete();
	}

	private void aplicaValorFrete() {
		if (SP.equalsIgnoreCase(compra.getCliente().getEstado())) {
			if (compra.qtdItens() > 3) {
				compra.aumentaValor(17.0);
			} else {
				compra.aumentaValor(10.0);
			}
		} else if (RJ.equalsIgnoreCase(compra.getCliente().getEstado())) {
			if (compra.qtdItens() > 4) {
				compra.aumentaValor(15.0);
			} else {
				compra.aumentaValor(11.0);
			}
		} else if (SUL.equalsIgnoreCase(compra.getCliente().getEstado())) {
			compra.aumentaValor(22.0);
		} else {
			compra.aumentaValor(25.0);
		}
	}
	
	private void aplicaDesconto() {
		if (compra.getValorLiquido() <= 500) {
			compra.reduzValor(compra.getValorLiquido() * 0.05);
		} else if (compra.getValorLiquido() <= 2000) {
			compra.reduzValor(compra.getValorLiquido() * 0.1);
		} else {
			compra.reduzValor(compra.getValorLiquido() * 0.15);
		}
	}

}
