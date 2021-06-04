package ar.edu.unlam.pb1.trabajoPractico2;

public class Coche {
	private int CERO_KM = 0;
	private int ANO_ACTUAL = 2021;
	private static int cantidadCoches = 0;
	private String marca = "";
	private String modelo = "";
	private int kilometrosActuales = 0;
	private int anioDeFabricacion = 2021;
	private double precio = 0.0;
	
	//constructor	
	/*public Coche(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		cantidadCoches++;
	}*/
	
	public Coche(String marca, String modelo, int kilometrosActuales, int anioDeFabricacion, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.kilometrosActuales = kilometrosActuales;
		this.anioDeFabricacion = anioDeFabricacion;
		this.precio = precio;
		cantidadCoches++;
	}
	
	//metodos
	public static int getCantidadCoches() {
		return cantidadCoches;
	}
	
	public void setKilometrosActuales(int kilometros) {
		this.kilometrosActuales++;
	}
	
	public void setPrecio (double precio) {
		this.precio = precio;
	}
	
	public double getPrecio () {
		return precio;
	}
	
	public int calcularAntiguedad () {
		int Antiguedad;
		Antiguedad = this.ANO_ACTUAL - this.anioDeFabricacion;
		return Antiguedad;
	}
	
	public int getKilometros () {
		return kilometrosActuales;
	}
	public String toString(){
		return marca + " " + modelo + " " + kilometrosActuales + " " + anioDeFabricacion + " " + precio + " " + cantidadCoches;

	}
	
}

