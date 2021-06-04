package ar.edu.unlam.pb1.trabajoPractico2;

public class PruebaTelevisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor sony;
		sony = new Televisor(2, 23);
		sony.isEncendido();
		sony.seleccionarEntrada('1');
		sony.bajarDeCanal(); 
		sony.subirDeCanal();
		sony.subirDeCanal();
		sony.cambiarDeCanal(1,2,3,5);
		sony.volverAlCanalAnterior();
		sony.silenciar();
		sony.bajarElVolumen();
		sony.bajarElVolumen();
		sony.getCanalActual();
		sony.getVolumenActual();
		
		System.out.println(sony);
	
	}

}
