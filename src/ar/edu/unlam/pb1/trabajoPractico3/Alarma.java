package ar.edu.unlam.pb1.trabajoPractico3;

public class Alarma {
	public boolean sensorDeMovimiento;
	public boolean sensorDeContacto; 
	public boolean sensorDeSonido;
	
	public boolean encendida = false;
	public int codigoDeSeguridad;
	public int codigoIngresado;
	
	public Alarma(int codigoDeSeguridad, int codigoIngresado) {
		this.codigoDeSeguridad = codigoDeSeguridad;
		this.codigoIngresado = codigoIngresado;
	}
	
	public void encender() {
		this.sensorDeContacto = true;
		this.sensorDeMovimiento = true;
		this.sensorDeSonido = true;
	}
	
	public void apagar() {
		this.sensorDeContacto = false;
		this.sensorDeMovimiento = false;
		this.sensorDeSonido = false;
	}
	
	public String toString() {
		return "Estado de los sensores: " + this.sensorDeContacto + this.sensorDeMovimiento + this.sensorDeSonido;
	}
	
	public boolean activada() {
		if (this.codigoIngresado == this.codigoDeSeguridad) {
			return true;
		} else {
			return false;
		}
	}
	
}
