package com.generic.v1;

public class Principal {

	public static void main(String[] args) {

		Bici bici = new Bici("biciXYZ");
		Moto moto = new Moto("motoABC");
		Motoneta motoneta = new Motoneta("motoneta123");
		
		Contenedor<Motoneta> cont1 = new Contenedor<>(motoneta);
		System.out.println(cont1.getT());

		Contenedor<Bici> cont2 = new Contenedor<>(bici);
		System.out.println(cont2.getT());
		
		Contenedor<Moto> cont3 = new Contenedor<>(moto);
		System.out.println(cont3.getT());
		
//		Contenedor<StringBuilder> cont4 = 
//				new Contenedor<>(new StringBuilder("Hello"));
//		System.out.println(cont4.getT());
		
		
	}

}
