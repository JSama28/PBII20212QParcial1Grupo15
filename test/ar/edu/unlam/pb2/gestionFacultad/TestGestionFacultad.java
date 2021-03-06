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
	public void testQuePermiteCrearUnEstudiante() {
		Estudiante facundo=new Estudiante("facundo","ben",123,"soltero");
		
		
		assertNotNull(facundo);
		
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
	
	@Test
	public void testCambiarEstadoCivilDePersona() {
		Persona eddy = new Persona("Eddy","Rizo",345,"Casado");
		eddy.cambiarEstadoCivil(345, "Viudo");
		
		assertNotEquals(eddy.getEstadoCivil(),"Viudo");
	}
	
	@Test
	public void testReasignacionDespachoDeEmpleado() {
		Empleado eddy = new Empleado("Eddy","Rizo",345,"Casado",2019,69);
		eddy.setNroDespacho(28);
		
		int valorEsperado = eddy.getNroDespacho();
				
		assertEquals(valorEsperado, 28);
	}
	@Test
	public void testMatriculacionDeNuevoAlumnoANuevoCurso() {
		Estudiante eddy = new Estudiante("eddy","Rizo",345,"Viudo");
		Curso nuevoCurso = new Curso("Algebra");
		
		eddy.registrarseACurso(nuevoCurso);
		
		assertTrue(eddy.getCursos().contains(nuevoCurso));
	}

	@Test
	public void testCambioDeDepartamentoAProfesor() {
		Profesor eddy = new Profesor("eddy","Rizo",345,"Viudo",2019,28);
		Departamento departamentoDeSalud = new Departamento("Salud");
		eddy.setDepartamentos(departamentoDeSalud);
		
		assertEquals(eddy.getDepartamentos(), departamentoDeSalud);
	
	}
	
	@Test
	public void testTrasladoDeSeccionAPersonal() {
		Seccion seccionDeLimpieza = new Seccion("Limpieza");
		Personal eddy = new Personal("Eddy","Rizo",345,"Viudo",2019,28,seccionDeLimpieza);
		eddy.setSecciones(seccionDeLimpieza);
		
		assertEquals(eddy.getSecciones(),seccionDeLimpieza);
	
	}
	
}
