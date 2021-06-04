package ar.edu.unlam.pb1.trabajoPractico3;

public class Cerradura {
	private int claveDeApertura;
	private int cantidadDeFallosConsecutivosQueLaBloquean;
	private boolean puerta = false;
	private int contadorIntentosFallidos;
	
	public Cerradura(int claveDeApertura, 
			int cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveDeApertura = claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
		this.contadorIntentosFallidos = 0;
	}
	
	public String toString() {
		return "La puerta esta: " + estaAbierta();
	}
	
	public boolean abrir(int clave) {
		if(this.claveDeApertura == clave) {
			this.puerta = true;
			return true;
		} else {
			contadorIntentosFallidos++;
			return false;
		}
	}
	
	public void cerrar() {
		if(this.puerta == true) {
			this.puerta = !puerta;
		}
	}
	
	public boolean estaAbierta() {
		return this.puerta;
	}
	
	public boolean fueBloqueada() {
		if(this.contadorIntentosFallidos >= cantidadDeFallosConsecutivosQueLaBloquean) {
			return true;
		} else {
			return false;
		}
		
	}
}
