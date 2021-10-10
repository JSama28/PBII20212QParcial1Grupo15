package ar.edu.unlam.pb2.gestionFacultad;

import java.util.Arrays;

public class Profesor extends Empleado {
	private Departamento[] departamentos;
	private static int cantidadProfesor=0;

	public Profesor(String nombrePersona, String apellido, Integer id, String estadoCivil, Integer anioIngreso,
			Integer nro_despacho,Integer legajo) {
		super(nombrePersona, apellido, id, estadoCivil, anioIngreso, nro_despacho,legajo);
		this.departamentos = new Departamento[Departamento.getCantidadDepartamento()];
		this.cantidadProfesor++;
	}

	@Override
	public void resignarNuevoDespacho(Integer legajo,Integer nuevoDespacho){
		super.resignarNuevoDespacho(legajo, nuevoDespacho);	
	}
	
	@Override
	public void cambiarEstadoCivil(Integer identificador,String nuevoEstado){
		super.cambiarEstadoCivil(identificador, nuevoEstado);
				
	}
	
	@Override
	public String toString() {
		return "Profesor [departamentos=" + Arrays.toString(departamentos) + ", AnioIngreso=" + super.getAnioIngreso()
				+ ", Nro_despacho=" + super.getNro_despacho() + ", legajo=" + super.getLegajo() + ", Nombre=" + super.getNombrePersona()
				+ ", Apellido=" + super.getApellido() + ", Id=" + super.getId() + ", EstadoCivil=" + super.getEstadoCivil()
				+ "]";
	}

	public Departamento[] getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}

	public static int getCantidadProfesor() {
		return cantidadProfesor;
	}
	
}
