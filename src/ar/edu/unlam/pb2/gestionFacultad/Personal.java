package ar.edu.unlam.pb2.gestionFacultad;

import java.util.Arrays;

public class Personal extends Empleado {
	private Seccion[] secciones;

	public Personal(String nombrePersona, String apellido, Integer id, String estadoCivil, Integer anioIngreso,
			Integer nro_despacho,Integer legajo, Seccion[] secciones) {
		super(nombrePersona, apellido, id, estadoCivil, anioIngreso, nro_despacho,legajo);
		this.secciones=new Seccion[Seccion.getCantidadSeccion()];
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
		return "Personal [secciones=" + Arrays.toString(secciones) + ", AnioIngreso=" + super.getAnioIngreso()
				+ ", Nro_despacho()=" + super.getNro_despacho() + ", Legajo=" + super.getLegajo() + ", Nombre="
				+ super.getNombrePersona() + ", Apellido=" + super.getApellido() + ", Id()=" + super.getId()
				+ ", EstadoCivil=" + super.getEstadoCivil() + "]";
	}

	public Seccion[] getSecciones() {
		return secciones;
	}

	public void setSecciones(Seccion[] secciones) {
		this.secciones = secciones;
	}
	
	
	
}
