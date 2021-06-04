package ar.edu.unlam.pb1.trabajoPractico2;

public class EjemploDeCoches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche ford;
		ford= new Coche("Ford", "Ecosport", 0, 2021, 500000.0);
		Coche mercedes;
		mercedes = new Coche("Mercedes-Benz", "AMG250", 0, 2021, 770000.0);
		Coche volkswagen;
		volkswagen = new Coche("Volkswagen", "Corsa", 0, 2021, 300000.0);
		
		System.out.println(ford.toString());
		System.out.println(mercedes.toString());
		System.out.println(volkswagen.toString());
		System.out.println(Coche.getCantidadCoches());
		

	}

}
