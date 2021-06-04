package ar.edu.unlam.pb1.trabajoPractico2;

public class Calculadora {
	
	private double operador1;
	private double operador2;
	
	public Calculadora() {
	}
	
	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
	
	public double sumar() {
		double resultadoSumar;
		resultadoSumar = this.operador1 + this.operador2;
		return resultadoSumar;
	}
	
	public double restar() {
		double resultadoRestar;
		resultadoRestar = this.operador1 - this.operador2;
		return resultadoRestar;
	}
	
	public double multiplicar() {
		double resultadoMultiplicar;
		resultadoMultiplicar = this.operador1 * this.operador2;
		return resultadoMultiplicar;
	}
	
	public double dividir() {
		double resultadoDividir;
		if (this.operador2 == 0) {
			resultadoDividir = 0;
		} else {
			resultadoDividir = this.operador1 / this.operador2;
		}
		
		return resultadoDividir;
	}
	
	public double area() {
		double valorArea;
		valorArea = Math.PI * (this.operador1 * this.operador2);
		return valorArea;
	}
	public String esPositivo(int numero) {
		String tipoNumero;
		if (numero > 0 || numero > 0 ) {
			tipoNumero = "El numero ingresado es positivo.";
		} else {
			tipoNumero = "El numero ingresado es negativo.";
		}
		return tipoNumero;
	}

}

