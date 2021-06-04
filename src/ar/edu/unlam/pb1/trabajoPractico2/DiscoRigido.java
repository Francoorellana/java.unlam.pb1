package ar.edu.unlam.pb1.trabajoPractico2;

public class DiscoRigido {
	private double tamaño;
	
	//constructor
	public DiscoRigido(double tamaño) {
		this.tamaño = tamaño;
	}
	
	//metodos
	public double equivalenciaDVD() {
		double dvd = 4.5;		
		double equivalenciaDVD;
		equivalenciaDVD = this.tamaño / dvd;
		int resultadoReal = (int) Math.round(equivalenciaDVD);
		return resultadoReal;
	}
	
	public double equivalenciaBlueRay() {
		double blueRay = 15 ;
		double equivalenciaBlueRay;
		equivalenciaBlueRay = this.tamaño / blueRay;
		int resultadoReal = (int) Math.round(equivalenciaBlueRay);
		return resultadoReal;
	}

}
