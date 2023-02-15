import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBonjour {
	@Test
	void testBernard() {
		assertEquals("Bonjour, Bernard.", Bonjour.bonjour("Bernard"));
	}
	@Test
	void testAlice() {
		assertEquals("Bonjour, Alice.", Bonjour.bonjour("Alice"));
	}
	@Test
	void testNul() {
		assertEquals("Bonjour, ami.", Bonjour.bonjour(null));
	}
	@Test
	void testHurleNorbert() {
		assertEquals("BONJOUR, NORBERT !", Bonjour.bonjour("NORBERT"));
	}

	@Test
	void testHurlePatrick() {
		assertEquals("BONJOUR, PATRICK !", Bonjour.bonjour("PATRICK"));
	}
	
	@Test
	void testTicEtTac() {
		assertEquals("Bonjour, Tic et Tac.", Bonjour.bonjour("Tic", "Tac"));
	}
	
	@Test
	void testAlainBarnabeCharlotteDiane() {
		assertEquals("Bonjour, Alain, Barnabé, Charlotte et Diane.", Bonjour.bonjour("Alain", "Barnabé", "Charlotte", "Diane"));
	}
	
	@Test
	void testAlainBARNABECharlotteDiane() {
		assertEquals("Bonjour, Alain et Charlotte. ET BONJOUR BARNABÉ !", Bonjour.bonjour("Alain", "Charlotte", "BARNABÉ"));
	}
}
