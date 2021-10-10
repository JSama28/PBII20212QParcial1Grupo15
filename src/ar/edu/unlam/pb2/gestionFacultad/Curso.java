package ar.edu.unlam.pb2.gestionFacultad;

public class Curso {
	private String nombreCurso;
	private static int cantidadCurso = 0;

	public Curso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
		this.cantidadCurso++;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public static int getCantidadCurso() {
		return cantidadCurso;
	}
}
