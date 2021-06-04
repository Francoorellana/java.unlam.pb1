package ar.edu.unlam.pb1.trabajoPractico4;

public class Letra {
	private char letraIngresada = 'a';
	
	public Letra(char letraIngresada) {
		this.letraIngresada = letraIngresada;
	}
	
	public void esVocal() {
		switch(letraIngresada) {
		case 'a':
			System.out.println("Es vocal");
			break;
		case 'e':
			System.out.println("Es vocal");
			break;
		case 'i':
			System.out.println("Es vocal");
			break;
		case 'o':
			System.out.println("Es vocal");
			break;
		case 'u':
			System.out.println("Es vocal");
			break;
		default:
			System.out.println("Es consonante");
		}
	}
	
	
}
