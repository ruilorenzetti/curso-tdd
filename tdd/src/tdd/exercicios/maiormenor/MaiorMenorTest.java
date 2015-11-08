package tdd.exercicios.maiormenor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaiorMenorTest {
	private MaiorMenor mem;

	@Before
	public void setUp(){
		this.mem = new MaiorMenor();
		System.out.println("Teste");
	}

   @Test
   public void ordemCrescente() {
       mem.encontra(new int [] {15, 7, 4, 5});
       
       assertEquals(15, mem.getMaior()); 
       assertEquals(4, mem.getMenor()); 
   }

   @Test
   public void ordemDescrescente() {
       mem.encontra(new int [] {43, 21, 7, 6, 5});
       
       assertEquals(43, mem.getMaior()); 
       assertEquals(5, mem.getMenor()); 
   }

   @Test
   public void numerosNegativos() {
       mem.encontra(new int [] {-3, 0, 51, 666, -7});
       
       assertEquals(666, mem.getMaior()); 
       assertEquals(-7, mem.getMenor()); 
   }
   
   @Test
   public void listaVazia() {
       mem.encontra(new int [] {});
       
       assertEquals(Integer.MIN_VALUE, mem.getMaior()); 
       assertEquals(Integer.MAX_VALUE, mem.getMenor());
   }
   
}
