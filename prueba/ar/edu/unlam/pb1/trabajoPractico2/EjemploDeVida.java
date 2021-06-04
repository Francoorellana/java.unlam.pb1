package ar.edu.unlam.pb1.trabajoPractico2;

public class EjemploDeVida {

	public static void main(String[] args) {
		
		Persona sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50,16);
		
		/*System.out.println(sofia.toString());
		
		System.out.println(sofia.pesar());
		System.out.println(sofia.medir()); 		
		
		sofia.alimentar(1.0);
		sofia.crecer(0.5);*/
		sofia.CumplirAños();
		//System.out.println(sofia.pesar());
		//System.out.println(sofia.medir());
		if(sofia.esMayorDeEdad() == true) {
			System.out.println("La persona es mayor de edad.");
		}else {
			System.out.println("La persona es menor de edad.");
		}

	}

}
