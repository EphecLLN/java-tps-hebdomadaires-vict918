package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FonctionTest {

	@Test
	public void testCarre() {
		Fonction calcul = new Fonction();
		assertEquals(0, calcul.carre(0)); 
	}
	
	@Test
	public void testPair() {
		Fonction calcul2 = new Fonction();
		assertEquals("Le nombre 19 est impair", calcul2.pair(19));
	}
	
	@Test
	public void testPerimetre() {
		Fonction calcul3 = new Fonction();
		assertEquals(5, calcul3.perimetre(1)); 
	}
	
	@Test
	public void testCar() {
		Fonction calcul4 = new Fonction();
		assertEquals(0, calcul4.caract('c', "vvvvvv")); 
	}
}
