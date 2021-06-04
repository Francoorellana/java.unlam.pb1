package ar.edu.unlam.pb1.trabajoPractico4;

public class Dia {
	private int numeroDia;
	
	public Dia(int numeroDia) {
		this.numeroDia = numeroDia;
	}
	
	public void nombreDia() {
		switch(numeroDia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("fin del mundo");
		}
	}
}
