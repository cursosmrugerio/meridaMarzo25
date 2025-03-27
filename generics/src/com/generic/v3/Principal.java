package com.generic.v3;

public class Principal {

	public static void main(String[] args) {

		Bici bici = new Bici("biciXYZ");
		Moto moto = new Moto("motoABC");
		Motoneta motoneta = new Motoneta("motoneta123");
		
		Contenedor<Motoneta> cont1 = new Contenedor<>(motoneta);
		System.out.println(cont1.getT());
		String s = cont1.showLicencia("LIC123");

		Contenedor<Bici> cont2 = new Contenedor<>(bici);
		System.out.println(cont2.getT());
		Double d = cont2.showLicencia(Double.valueOf(12.34));
		
		Contenedor<Moto> cont3 = new Contenedor<>(moto);
		System.out.println(cont3.getT());
		StringBuilder sb = cont3.showLicencia(new StringBuilder("LICxyz"));

		
//		Contenedor<StringBuilder> cont4 = 
//				new Contenedor<>(new StringBuilder("Hello"));
//		System.out.println(cont4.getT());
		
		
	}

}
