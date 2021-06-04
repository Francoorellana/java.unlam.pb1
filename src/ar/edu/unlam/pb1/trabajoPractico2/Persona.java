package ar.edu.unlam.pb1.trabajoPractico2;

public class Persona {
	private String nombre = "";
	private String genero = "";
	private long dni ;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva;
	public static final int EDAD_LEGAL = 18;
	
	//constructor
	public Persona(String nombre, String genero, long dni, double peso, double altura, int edad) {
		this.nombre = nombre;
		this.genero = genero;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	
	//metodos
	public void alimentar(double kilos) {
		this.peso += peso;
	}
	
	public void crecer(double metros) {
		this.altura += altura;
	}
	
	public void CumplirAños() {
		++edad;
	}
	
	public void morir() {
		this.viva = false;
	}
	
	public double pesar() {
		return peso;
	}
	
	public double medir() {
		return altura;
	}
	
	public String toString(){
		return nombre + " " + genero + " " + dni + " " + peso + " " + altura;
	}
	
	public boolean esMayorDeEdad() {
		boolean situacionLegal = false;
		if(this.edad>=EDAD_LEGAL) {
			situacionLegal = true;
		}else{
			situacionLegal =false;
		}
		return situacionLegal;
	}
}

