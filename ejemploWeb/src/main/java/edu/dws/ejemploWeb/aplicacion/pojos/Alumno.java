package edu.dws.ejemploWeb.aplicacion.pojos;

public class Alumno {

	private String nombre;
	private String apellidos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return "alumno [nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	public Alumno(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	public Alumno() {
		super();
	}	
	
	
	
}
