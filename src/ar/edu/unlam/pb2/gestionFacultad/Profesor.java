package ar.edu.unlam.pb2.gestionFacultad;

import java.util.Arrays;

public class Profesor extends Empleado {
	private Departamento departamentos;
	private static int cantidadProfesores=0;
	

	public Profesor(String nombre, String apellido, Integer dni, String estadoCivil, Integer anioIngreso,
			Integer nro_despacho,Departamento despartamentos) {
		super(nombre, apellido, dni, estadoCivil, anioIngreso, nro_despacho);
		this.departamentos =departamentos;
		this.cantidadProfesores++;
	}
	
	@Override
	public void cambiarEstadoCivil(Integer dni,String nuevoEstado){
		super.cambiarEstadoCivil(dni, nuevoEstado);
				
	}
	
	@Override
	public String MostarInformacion(){
		return "Nombre=" + super.getNombre()+ ", Apellido=" + super.getApellido() + ", Dni=" + super.getDni()+ ", Estado_Civil=" + super.getEstadoCivil()+", A�o_Ingreso=" + super.getAnioIngreso()
				+ ", Numero_Despacho=" + super.getNro_despacho()+", Departamento=" +getDepartamentos();
	}

	public Departamento getDepartamentos() {
		return departamentos;
	}


	public void setDepartamentos(Departamento departamentos) {
		this.departamentos = departamentos;
	}


	public static int getCantidadProfesores() {
		return cantidadProfesores;
	}
	
}
