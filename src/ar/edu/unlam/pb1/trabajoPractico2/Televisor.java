package ar.edu.unlam.pb1.trabajoPractico2;

public class Televisor {
	public static final char ENTRADA_TELEVISION_DE_AIRE = 'A';
	public static final char ENTRADA_TELEVISION_POR_CABLE = 'C';
	public static final char ENTRADA_HDMI1 = '1';
	public static final char ENTRADA_HDMI2 = '2';
	public static final char ENTRADA_USB = 'U';
	
	private static long numeradorDePlaquetas = 0;
	
	private long plaqueta;
	private boolean encendido = false; 
	private int volumen;
	private int canal;
	private char entradaActual;
	private final int VOLUMEN_MAXIMO = 100;
	private final int VOLUMEN_MINIMO = 0;
	private final int CANAL_MINIMO = 1;
	private final int CANAL_MAXIMO = 2000;
	private int canalPrevio;
	
	public Televisor(int canal, int volumen) {
		Televisor.numeradorDePlaquetas++;
		this.plaqueta = numeradorDePlaquetas;
		this.canal = canal;
		this.volumen = volumen;
		
	}
	
	public void isEncendido() {
		encendido =! encendido;
	}
	
	private String botonPower() {
		String estado;
		if (this.encendido) {
			estado = "encendida";
		} else {
			estado = "apagada";
		}
		return estado;
	}
	
	
	public String toString() {
		return "La tele esta " + botonPower() + "\n El numero de plaqueta es: " + this.plaqueta + "\n El televisor se encuentra en el canal: " +  this.canal + "\n El volumen actual es: " + this.volumen
				+ "\n Se encuentra en la entrada: " + this.entradaActual ;
		
	}
	
	
	public void seleccionarEntrada(char entradaDeseada ) {
		if (entradaDeseada == ENTRADA_TELEVISION_DE_AIRE || entradaDeseada == ENTRADA_TELEVISION_POR_CABLE || entradaDeseada == ENTRADA_HDMI1 ||
				entradaDeseada == ENTRADA_HDMI2 || entradaDeseada == ENTRADA_USB) {
			this.entradaActual = entradaDeseada;
		}
	}
	
	
	public int subirElVolumen() {
		if (this.volumen<VOLUMEN_MAXIMO) {
			this.volumen++;
		}
		return this.volumen;
	}
	
	public int bajarElVolumen() {
		if (this.volumen>VOLUMEN_MINIMO) {
			this.volumen--;
		}
		return this.volumen;
	}
		
	public int subirDeCanal() {
		if (this.canal>=CANAL_MINIMO || this.canal<=CANAL_MAXIMO) {
			this.canal++;
		}
		return this.canal;
	}
	public int bajarDeCanal() {
		if (this.canal>CANAL_MINIMO || this.canal<=CANAL_MAXIMO) {
			this.canal--;
		}
		return this.canal;
	}
	
	private void setCanal(int canal) {
	this.canalPrevio = this.canal;
	this.canal = canal;
	}
	
	public void cambiarDeCanal(int canalDeseado) {
		setCanal(canalDeseado);
	}
		
	public void cambiarDeCanal(int decena, int unidad) {
		setCanal((decena * 10) + unidad);
	}

	public void cambiarDeCanal(int centena, int decena, int unidad) {
		setCanal((centena * 100) + (decena * 10) + unidad);
	}

	public void cambiarDeCanal(int unidadDeMil, int centena, int decena, int unidad) {
		setCanal((unidadDeMil * 1000) + (centena * 100) + (decena * 10) + unidad);
	}

	
	
	
	public void volverAlCanalAnterior() {
		setCanal(canalPrevio);
	}
	
	public void silenciar() {
		this.volumen = VOLUMEN_MINIMO;
	}
	
	public char getEntradaUsb() {
		return this.entradaActual = ENTRADA_USB;
	}
	
	public long getNumeroDeSerie() {
		return this.plaqueta;
	}
	
	
	public int getVolumenActual() {
		return this.volumen;
	}
	public int getCanalActual() {
		return this.canal;
	}
	public char getEntradaActual() {
		return this.entradaActual;
	}
	
}
