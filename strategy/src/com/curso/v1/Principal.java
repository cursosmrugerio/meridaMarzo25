package com.curso.v1;

import com.curso.v1.strategy.*;

public class Principal {

	public static void main(String[] args) {
		
		ComportamientoVolar cv1 = new SiVolar();
		ComportamientoVolar cv2 = new NoVolar();
		ComportamientoVolar cv3 = new AleatorioVolar();
		
		Ave ave1 = new Aguila("Tetra");
		System.out.println(ave1);
		ave1.cv = cv1;
		ave1.volar(); //SI VUELA
		ave1.cv = cv2;
		ave1.volar(); //NO VUELA
		ave1.cv = cv3;
		ave1.volar(); //ALEATORIO VUELO
		
		
//		Ave ave2 = new Pinguino("Pin");
//		System.out.println(ave2);
//		ave2.volar();
//		
//		Ave ave3 = new Pato("Lucas");
//		System.out.println(ave3);
//		ave3.volar();
//		
//		//????
//		
//		ave3.volar(); //SI VUELE
		
	}

}
