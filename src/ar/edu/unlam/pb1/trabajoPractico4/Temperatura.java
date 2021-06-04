package ar.edu.unlam.pb1.trabajoPractico4;

public class Temperatura {
	public static final byte CELSIUS = 0; 
	public static final byte FARENHEIT = 1;
	public static final byte KELVIN = 2;
	private double valor;
		
	private final double UNIDAD_DE_CONVERSION_FARENHEIT = 0.556 ;
	private final int UNIDAD_DE_CONVERSION_KELVIN = 273;
	
	public Temperatura(double valor) {
		this.valor = valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setValor(double valor, int unidad) {
		switch(unidad) {
		case CELSIUS:
			this.valor = valor;
			break;
		case FARENHEIT:
			this.valor = valor * UNIDAD_DE_CONVERSION_FARENHEIT;
			break;
		case KELVIN:
			this.valor = valor - UNIDAD_DE_CONVERSION_KELVIN;
			break;	
			}
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public double convertir(byte unidad) {
		double resultado = 0.0;
		switch(unidad) {
		case CELSIUS:
			resultado = this.valor;
			break;
		case FARENHEIT:
			resultado = this.valor / UNIDAD_DE_CONVERSION_FARENHEIT;
			break;
		case KELVIN:
			resultado = this.valor - UNIDAD_DE_CONVERSION_KELVIN;
			break;
		}
		return resultado;
	}
	
}

