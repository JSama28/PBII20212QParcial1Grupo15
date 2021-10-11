package ar.edu.unlam.pb2.gestionFacultad;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGestionFacultad {

	@Test
	public void testQuePermiteCrearUnaUniversidad() {
		Facultad unlam= new Facultad("unlam",2,1,2,3);
			
		assertNotNull(unlam);
		
	}
	
	@Test
	public void testQuePermiteCambiarEstadoCivilDeUnaPersona() {
		Estudiante facundo=new Estudiante("Facundo","Benitez",123,"soltero");
		facundo.cambiarEstadoCivil(123, "casado");
		String valorEsperado="casado";	
		
		assertEquals(valorEsperado,facundo.getEstadoCivil());
		
	}
	
	@Test
	public void testQueNoPermiteCambiarEstadoCivilDeUnaPersonaPorQueNoCoincidenSusDatos() {
		Estudiante facundo=new Estudiante("Facundo","Benitez",123,"soltero");
		facundo.cambiarEstadoCivil(222, "casado");
		String valorEsperado="casado";	
		
		
		assertNotEquals(valorEsperado,facundo.getEstadoCivil());
		
	}
	
	


}
