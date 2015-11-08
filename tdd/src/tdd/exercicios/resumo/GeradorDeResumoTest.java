package tdd.exercicios.resumo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeradorDeResumoTest {
	private GeradorDeResumo geradorDeResumo;
	
	@Before
	public void setUp() {
		this.geradorDeResumo = new GeradorDeResumo();
	}

	@Test
	public void deveResumirVariosDias() {
		GregorianCalendar data1 = new GregorianCalendar(2015,1,15);
		GregorianCalendar data2 = new GregorianCalendar(2015,1,16);
		
		List<Negocio> negocios = new NegocioBuilder()
				.naData(data1, 30, 40, 50, 10, 25)
				.naData(data2, 200, 250, 300)
				.constroi();
		
		List<Resumo> resumo = geradorDeResumo.gera(negocios);
		
		assertEquals(2, resumo.size());
		assertEquals(50, resumo.get(0).getMaior(), 0.0001);
		assertEquals(10, resumo.get(0).getMenor(), 0.0001);
		assertEquals(300, resumo.get(1).getMaior(), 0.0001);
		assertEquals(200, resumo.get(1).getMenor(), 0.0001);
		
		List<Resumo> esperado = Arrays.asList(
				new Resumo(data1, 50, 10),
				new Resumo(data2, 300, 200));
		
		assertEquals(resumo, esperado);
	}

}
