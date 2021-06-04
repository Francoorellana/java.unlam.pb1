package ar.edu.unlam.pb1.trabajoPractico3;

public class Nota {
	private float valor;
	
	public Nota(float valorInicial) {
		this.valor = valorInicial;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public boolean aprobado() {
		boolean aprobado = false;
		if (this.valor >= 4.0) {
			aprobado = true;
		} else {
			aprobado = false;
		}
		return aprobado;
	}
	
	public void recuperar(float nuevoValor) {
		this.valor = nuevoValor;
		
	}
	
}


