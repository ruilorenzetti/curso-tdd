package tdd.exercicios.filtrofatura;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FiltroDeFaturaTest {
	private FiltroDeFatura filtro;
	
	@Before
	public void setUp() {
		
	}

	@Test
	public void filtraMenoresQue2000() {
		Fatura fat1 = new Fatura(3000.0);
		Fatura fat2 = new Fatura(500.0);
		
		FaturaDao daoDeMentirinha = Mockito.mock(FaturaDao.class);
		Mockito.when(daoDeMentirinha.todas())
			.thenReturn(Arrays.asList(fat1, fat2));
		filtro = new FiltroDeFatura(daoDeMentirinha);
		
		List<Fatura> result = filtro.filtra();
		
		assertEquals(1, result.size());
		
	}

}
