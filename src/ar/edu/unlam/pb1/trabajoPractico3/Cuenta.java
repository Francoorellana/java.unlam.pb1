package ar.edu.unlam.pb1.trabajoPractico3;

public class Cuenta {
	private String titular = " ";
	private double saldo = 0;
	
	public Cuenta (String titular) {
		this.titular = titular;
	}
	
	public Cuenta (String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public String toString() {
		return this.titular + " " + this.saldo;
	}
	public void depositar(double cantidad) {
		this.saldo = saldo + cantidad;
	}
	public void retirar(double cantidad) {
		if(cantidad <= this.saldo) {
			this.saldo = saldo - cantidad;	
		} else {
			this.saldo = 0.0;
		}
	}
}

