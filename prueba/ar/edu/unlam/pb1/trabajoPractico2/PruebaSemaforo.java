package ar.edu.unlam.pb1.trabajoPractico2;

public class PruebaSemaforo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char color = 'a';
		switch(color) {
			case 'V':
			System.out.println("El semaforo esta en verde");
			break;
			case 'A':
			System.out.println("El semaforo esta en amarillo");
			break;
			case 'R':
			System.out.println("El semaforo esta en rojo");
			break;
			default :
			System.out.println("Semaforo roto");
			break;
		}
	}

}
