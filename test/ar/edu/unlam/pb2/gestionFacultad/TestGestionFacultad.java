package ar.edu.unlam.pb2.gestionFacultad;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGestionFacultad {

	@Test
	public void testQuePermiteCrearUnEstudiante() {
		Estudiante facundo=new Estudiante("facundo","ben",123,"soltero");
		
		
		assertNotNull(facundo);
		
	}
	
	@Test
	public void testCambiarEstadoCivilEstudiante() {
		Estudiante facundo=new Estudiante("facundo","ben",123,"soltero");
		facundo.cambiarEstadoCivil(123, "casado");
		
		String valorEsperado="casado";
		
		assertEquals(valorEsperado,facundo.getEstadoCivil());
		
	}
	


}
