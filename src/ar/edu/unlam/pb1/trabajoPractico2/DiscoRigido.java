package ar.edu.unlam.pb1.trabajoPractico2;

public class DiscoRigido {
	private double tama�o;
	
	//constructor
	public DiscoRigido(double tama�o) {
		this.tama�o = tama�o;
	}
	
	//metodos
	public double equivalenciaDVD() {
		double dvd = 4.5;		
		double equivalenciaDVD;
		equivalenciaDVD = this.tama�o / dvd;
		int resultadoReal = (int) Math.round(equivalenciaDVD);
		return resultadoReal;
	}
	
	public double equivalenciaBlueRay() {
		double blueRay = 15 ;
		double equivalenciaBlueRay;
		equivalenciaBlueRay = this.tama�o / blueRay;
		int resultadoReal = (int) Math.round(equivalenciaBlueRay);
		return resultadoReal;
	}

}
