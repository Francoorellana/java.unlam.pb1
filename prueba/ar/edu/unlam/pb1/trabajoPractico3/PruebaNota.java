package ar.edu.unlam.pb1.trabajoPractico3;

public class PruebaNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nota alumno1;
		alumno1 = new Nota(3);
		System.out.println(alumno1.getValor());
		System.out.println(alumno1.aprobado());
		
		Nota alumno2;
		alumno2 = new Nota(7);
		System.out.println(alumno2.aprobado());
		
		Nota alumno3;
		alumno3 = new Nota(2);
		alumno3.recuperar(8);
		System.out.println(alumno3.aprobado());
		
	}

}
