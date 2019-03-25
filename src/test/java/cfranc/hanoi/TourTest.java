package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	Disque dSmall = new Disque(1);
	Disque dMedium = new Disque(2);
	Disque dLarge = new Disque(3);
	Tour t = new Tour();

	@Test
	public void testEmpilerOnEmpty() {

		boolean expected = true;
		boolean actual = t.empiler(dSmall);

		assertEquals(expected, actual);

	}

	@Test
	public void testEmpilerOnFull(){

		t.empiler(dLarge);
		t.empiler(dMedium);
		t.empiler(dSmall);

		boolean expected = false;
		boolean	actual = t.empiler(dSmall);

		assertEquals(expected, actual);

	}

	@Test
	public void testEmpilerGrosSurPetit(){

		t.empiler(dSmall);

		boolean expected = false;
		boolean actual = t.empiler(dLarge);

		assertEquals(expected, actual);

	}

	@Test
	public void testEmpilerPetitSurGros(){

		t.empiler(dLarge);

		boolean expected = true;
		boolean actual = t.empiler(dSmall);

		assertEquals(expected, actual);

	}

	@Test
	public void testEmpiler_LargeSmall_onFull(){

		t.empiler(dLarge);
		t.empiler(dMedium);
		t.empiler(dSmall);

		boolean expected = false;
		boolean actual = t.empiler(dLarge);

		assertEquals(expected, actual);


	}

}
