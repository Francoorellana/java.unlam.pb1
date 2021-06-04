package ar.edu.unlam.pb1.trabajoPractico2;

public class Usuario {
	private String usuario = "";
	private String contrasenia = "";
	private String nombre = "";
	private String apellido = "";
	private int dni;
	private int edad;
	
	public Usuario(String usuario, String contrasenia, String nombre, String apellido, int dni, int edad) {
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}
	public String getUsuario() {
		return this.usuario;
	}
	public String getContrasenia() {
		return this.contrasenia;
	}
	public void setContrasenia(String password) {
		contrasenia = password;
	}
	public void setEdad(int valor) {
		edad = valor;
	}
	public String toString(){
		return usuario + " " + contrasenia + " " + nombre + " " + apellido + " " + dni + " " + edad ;

	}
}

