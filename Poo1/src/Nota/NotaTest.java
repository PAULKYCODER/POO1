package Nota;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {

	@Test
	public void iniciarTest() {
		Nota n1 = new Nota(4);
		
		assertNotNull(n1);
		
	}
	
	@Test
	public void obtenerValorTest() {
		Nota n1 = new Nota(4);
		
		int esperado = 4;
		int obtenido = n1.obtenerValorNota();
		
	
		assertEquals(esperado, obtenido);
		
		
	}
	
	@Test
	public void estaAprobadoCon10Test() {
		Nota n1 = new Nota(10);
		
		assertEquals(10, n1.obtenerValorNota());
		assertTrue(n1.estaAprobado());
	}
	
	@Test
	public void estaDesaprobadoCon3Test() {
		Nota n1 = new Nota(3);
		
		assertEquals(3, n1.obtenerValorNota());
		assertTrue(n1.estaDesaprobado());
	}
	
	@Test
	public void promocionaCon7Test() {
		Nota n1 = new Nota(7);
		
		assertEquals(7, n1.obtenerValorNota());
		assertTrue(n1.promociona());
	}
	
	@Test
	public void noPromocionaCon6Test() {
		Nota n1 = new Nota(6);
		
		assertEquals(6, n1.obtenerValorNota());
		assertFalse(n1.promociona());
		
	}
	
	
	
	@Test
	public void noApruebacon3PeroRecuperacon9Test() {
		Nota n1 = new Nota(3);
		
		assertEquals(3, n1.obtenerValorNota());
		assertTrue(n1.estaDesaprobado());
		
		n1.recupera(9);
		assertTrue(n1.estaAprobado());
		assertTrue(n1.promociona());
		
		
		
		
	}
	
		
	

}
