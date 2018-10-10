package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class parcial {

	@Test
	public void testIncrementarCanal() {
		
		Televisor tele=new Televisor("Samsung",18902,39,40,12,50,false);
		
		tele.incrementarCanal();
		tele.incrementarCanal();
		tele.incrementarCanal();
		
		Integer valorEsperado=2;
		
		assertEquals(valorEsperado,tele.getCanal());
		
	}
	
	@Test
	public void testVerificaCanal() {
		Televisor tele=new Televisor("Samsung",18902,39,40,12,50,false);
		
		assertTrue(tele.verificaCanal(40));
	}
	
	@Test
	public void testApagar() {
		Televisor tele=new Televisor("Samsung",18902,39,40,12,50,false);
		
		tele.apagarTelevisor();
		tele.encenderTelevisor();
		tele.apagarTelevisor();
		assertFalse(tele.estado());
		
	}
	
	@Test
	public void testVolumen() {
		Televisor tele=new Televisor("Samsung",18902,39,40,12,50,false);
		
		Integer valorEsperado=16;
		tele.subirVolumen();
		tele.subirVolumen();
		tele.subirVolumen();
		Integer valorActual=tele.subirVolumen(15);
		
		assertEquals(valorEsperado,valorActual);
		
	}


}
