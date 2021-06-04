package ar.edu.unlam.pb1.trabajoPractico3;

public class PartidoDeTenis {
	private String nombreJugador ;
	private int puntaje ;
	
	public PartidoDeTenis(String nombreJugador, int puntaje) {
		this.nombreJugador = nombreJugador ;
		this.puntaje = puntaje;
	}
	
	public void setPuntaje(int set1, int set2, int set3, int set4,
			int set5) {
		this.puntaje = set1 + set2 + set3 + set4 + set5;
	}
	
	public int getPuntaje() {
		return this.puntaje;
	}
	
	
}
