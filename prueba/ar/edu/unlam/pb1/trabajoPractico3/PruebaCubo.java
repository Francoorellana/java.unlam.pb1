package ar.edu.unlam.pb1.trabajoPractico3;

public class PruebaCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cubo Nuevo = new Cubo(4);
		Nuevo.setLongitudLado(2);
		
		System.out.println(Nuevo.getLongitudLado());
		System.out.println(Nuevo.getSuperficieCara());
		System.out.println(Nuevo.getVolumen());
		
	}

}
