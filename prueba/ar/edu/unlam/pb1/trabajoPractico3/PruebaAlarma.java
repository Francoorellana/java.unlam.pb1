package ar.edu.unlam.pb1.trabajoPractico3;

public class PruebaAlarma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alarma x28 = new Alarma(123, 123);
		
		x28.encender();
		if(x28.activada() == true) {
			System.out.println("La alarma esta activada.");
		} else {
			System.out.println("La alarma esta desactivada.");
		}
		
		
		System.out.println(x28.toString());
	}

}
