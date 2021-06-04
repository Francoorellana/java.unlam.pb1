package ar.edu.unlam.pb1.trabajoPractico4;

public class PruebaTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperatura termometro = new Temperatura(23.5);
		
		
		termometro.setValor(30, 2);
		System.out.println(termometro.getValor());
	
		System.out.println(termometro.convertir(Temperatura.FARENHEIT));
		
	}

}
