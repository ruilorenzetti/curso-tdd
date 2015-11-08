package tdd.exercicios.romano;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RomanoTest {

	@Before
	public void setUp(){
		
	}

   @Test
   public void umAlgarismo() {
	   assertEquals(1, new Romano().converte("I"), 0);
	   assertEquals(5, new Romano().converte("V"), 0);
	   assertEquals(10, new Romano().converte("X"), 0);
	   assertEquals(50, new Romano().converte("L"), 0);
	   assertEquals(100, new Romano().converte("C"), 0);
	   assertEquals(500, new Romano().converte("D"), 0);
	   assertEquals(1000, new Romano().converte("M"), 0);
   }
   
   @Test
   public void nAlgarismos() {
	   assertEquals(6, new Romano().converte("VI"), 0);
	   assertEquals(7, new Romano().converte("VII"), 0);
	   assertEquals(16, new Romano().converte("XVI"), 0);
   }
}
