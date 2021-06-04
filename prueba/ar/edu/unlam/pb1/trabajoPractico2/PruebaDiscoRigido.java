package ar.edu.unlam.pb1.trabajoPractico2;

public class PruebaDiscoRigido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscoRigido seagate;
		seagate = new DiscoRigido((10*1024));
		DiscoRigido hitachi;
		hitachi = new DiscoRigido((20*1024));
		DiscoRigido westernDigital;
		westernDigital = new DiscoRigido((32*1024));
		DiscoRigido toshiba;
		toshiba = new DiscoRigido((48*1024));
		
		System.out.println(seagate.equivalenciaBlueRay());
		System.out.println(seagate.equivalenciaDVD());
		System.out.println(hitachi.equivalenciaDVD());
		System.out.println(hitachi.equivalenciaBlueRay());
		System.out.println(westernDigital.equivalenciaBlueRay());
		System.out.println(westernDigital.equivalenciaDVD());
		System.out.println(toshiba.equivalenciaBlueRay());
		System.out.println(toshiba.equivalenciaDVD());

	}

}
