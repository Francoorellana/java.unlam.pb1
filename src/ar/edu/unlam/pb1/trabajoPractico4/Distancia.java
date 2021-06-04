package ar.edu.unlam.pb1.trabajoPractico4;

public class Distancia {
	public static final byte METRO = 0;
	public static final byte DECAMETRO = 1;
	public static final byte HECTOMETRO = 2;
	public static final byte KILOMETRO = 3;
	public double valor = 0 ;
	
	private final int UNIDAD_DE_CONVERSION_DECAMETRO = 10 ;
	private final int UNIDAD_DE_CONVERSION_HECTOMETRO = 100;
	private final int UNIDAD_DE_CONVERSION_KILOMETRO = 1000;
	
	public Distancia(double valor) {
		this.valor = valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public double convertir(byte unidad) {
		double resultadoConversion = 0.0;
		switch(unidad) {
		case METRO:
			resultadoConversion = this.valor;
			break;
		case DECAMETRO:
			resultadoConversion = this.valor * UNIDAD_DE_CONVERSION_DECAMETRO;
			break;
		case HECTOMETRO:
			resultadoConversion = this.valor * UNIDAD_DE_CONVERSION_HECTOMETRO;
			break;
		case KILOMETRO:
			resultadoConversion = this.valor * UNIDAD_DE_CONVERSION_KILOMETRO;
			break;
		}
		return resultadoConversion;
	}
}

