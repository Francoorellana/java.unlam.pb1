package ar.edu.unlam.pb1.trabajoPractico3;

public class PruebaCerradura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cerradura pentagono = new Cerradura(1234, 2);
		
		pentagono.abrir(1234);
		
		System.out.println(pentagono.toString());
		
		pentagono.cerrar();
		
		pentagono.abrir(123);
		
		System.out.println(pentagono.toString());
		
		pentagono.abrir(123);
		pentagono.abrir(123);
		pentagono.abrir(123);
		
		System.out.println(pentagono.toString());
		
	}

}
