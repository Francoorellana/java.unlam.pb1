package ar.edu.unlam.pb1.trabajoPractico3;

public class Cubo {
	public float longitudLado = 0;
	
	public Cubo(float lado) {
		this.longitudLado = lado;
	}
	public float getLongitudLado() {
		return longitudLado;
	}
	public void setLongitudLado(float longitudLado) {
		this.longitudLado = longitudLado;
	}
	public float getSuperficieCara() {
		return  longitudLado * longitudLado;
	}
	public float getVolumen() {
		return longitudLado * longitudLado * longitudLado;
	}
}

