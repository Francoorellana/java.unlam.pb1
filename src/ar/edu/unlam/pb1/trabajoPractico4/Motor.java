package ar.edu.unlam.pb1.trabajoPractico4;

public class Motor {
	private int tipoBomba;
	private String tipoFluido = "";
	private String combustible = "";
	
	public Motor(int tipoBomba, String tipoFluido, String combustible) {
		this.tipoBomba = tipoBomba;
		this.tipoFluido = tipoFluido;
		this.combustible = combustible;
	}
	
	public void dimeTipoMotor() {
		switch(tipoBomba) {
		case 0:
			System.out.println("No hay establecido un valor definido para el tipo de bomba");
			break;
		case 1:
			System.out.println("La bomba es una bomba de agua"); 
			break;
		case 2:
			System.out.println("La bomba es una bomba de gasolina");
			break;
		case 3:
			System.out.println("La bomba es una bomba de hormigon");
			break;
		case 4:
			System.out.println("La bomba es una bomba de pasta alimenticia");
			break;
		default:
			System.out.println("No existe un valor valido para el tipo de bomba.");
			break;
		}
	}
	
}

