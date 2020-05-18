package group.DniValidator;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import groupo.Clases.Dni;
public class comparadorTest {
	Dni dni = new Dni();
	@Test
	public void testAComparadorTrue() 
	{
		 assertEquals("",true,dni.comparador("S", 2298888));

	}
	@Test
	public void testAComparadorFalse() 
	{
		 assertEquals("",false,dni.comparador("F", 2298888));

	}
	@Test 
	public void testDni() 
	{
		dni.validadorDni("02298888S");
	}
	@Test 
	public void testDniFail() 
	{
		dni.validadorDni("12398887J");
	}
	@Test 
	public void testDniMalFormation() 
	{
		dni.validadorDni("0229@888J");
	}
}
