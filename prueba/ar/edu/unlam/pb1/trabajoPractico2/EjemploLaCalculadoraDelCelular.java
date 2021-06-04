package ar.edu.unlam.pb1.trabajoPractico2;

public class EjemploLaCalculadoraDelCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora laCalculadoraDelCelular;
		laCalculadoraDelCelular = new Calculadora (3, 7);
		
		System.out.println(laCalculadoraDelCelular.sumar());
		System.out.println(laCalculadoraDelCelular.restar());
		System.out.println(laCalculadoraDelCelular.multiplicar());
		System.out.println(laCalculadoraDelCelular.dividir());
	}

}
