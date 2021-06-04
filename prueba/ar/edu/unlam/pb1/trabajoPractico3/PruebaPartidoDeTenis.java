package ar.edu.unlam.pb1.trabajoPractico3;

public class PruebaPartidoDeTenis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartidoDeTenis nole = new PartidoDeTenis("nole",0);
		nole.setPuntaje(1, 1, 1, 1, 1);
		nole.getPuntaje();
		
		PartidoDeTenis delpo = new PartidoDeTenis("delpo",0);
		delpo.setPuntaje(1, 1, 1, 1, 1);
		delpo.getPuntaje();
		
		if(nole.getPuntaje()>delpo.getPuntaje()) {
			System.out.println("Nole gano el partido.");
		}else if (delpo.getPuntaje()>nole.getPuntaje()){
			System.out.println("Delpo gano el partido");
		}else {
			System.out.println("El partido fue empate");
		}
	}

}
