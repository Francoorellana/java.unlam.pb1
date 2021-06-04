package ar.edu.unlam.pb1.trabajoPractico2;

public class EjemploCasio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora casio;
		casio = new Calculadora (4,2);
		
		System.out.println(casio.sumar());
		System.out.println(casio.restar());
		System.out.println(casio.multiplicar());
		System.out.println(casio.dividir());
		System.out.println("El valor del area de un circulo es: "+ casio.area());
		System.out.println(casio.esPositivo(-10));
		
	}

}
