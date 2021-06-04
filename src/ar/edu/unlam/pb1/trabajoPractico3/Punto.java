package ar.edu.unlam.pb1.trabajoPractico3;


public class Punto {
	private int puntoX;
	private int puntoY;
	
	public Punto(int puntoX, int puntoY) {
		this.puntoX = puntoX;
		this.puntoY = puntoY;
	}
	
	public String getPunto() {
		String coordenadaPrueba = "Esta en: " + this.puntoX + " " +  this.puntoY ;
		return coordenadaPrueba;
	}
	
	public void setPunto(int nuevoPuntoX, int nuevoPuntoY) {
		this.puntoX = nuevoPuntoX;
		this.puntoY = nuevoPuntoY;
	}
	
	public String ubicacion() {
		String ubicacion;
		if(this.puntoX == 0 && this.puntoY == 0) {
			ubicacion = "Esta en el origen de las coordenadas";
		} else if (this.puntoX == 0) {
			ubicacion = "Esta en el eje x";		
		} else if (this.puntoY == 0) {
			ubicacion = "Esta en el eje Y";
		} else {
			ubicacion = "La ubicacion es: " + this.puntoX + " " + this.puntoY;
		}
		return ubicacion;
	}
		
}
