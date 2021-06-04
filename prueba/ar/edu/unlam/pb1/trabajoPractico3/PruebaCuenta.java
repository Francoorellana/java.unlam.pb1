package ar.edu.unlam.pb1.trabajoPractico3;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta franco = new Cuenta("Franco Orellana", 1000);
		
		franco.retirar(500);
		franco.setTitular("");
		System.out.println(franco.toString());
		System.out.println(franco.getSaldo());
		System.out.println(franco.getTitular());
	}

}
