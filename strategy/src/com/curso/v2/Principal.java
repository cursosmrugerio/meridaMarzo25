package com.curso.v2;

import com.curso.v1.strategy.*;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V2");
		
		ComportamientoVolar cv1 = new SiVolar();
		ComportamientoVolar cv2 = new NoVolar();
		ComportamientoVolar cv3 = new AleatorioVolar();
		
		Ave ave1 = new Aguila("Tetra");
		System.out.println(ave1);
		ave1.volar();
			
		Ave ave2 = new Pinguino("Pin");
		System.out.println(ave2);
		ave2.setCv(cv2);
		ave2.volar();

		Ave ave3 = new Pato("Lucas");
		System.out.println(ave3);
		ave3.setCv(cv3);
		ave3.volar();
		ave3.setCv(cv1);
		ave3.volar();


		
	}

}
