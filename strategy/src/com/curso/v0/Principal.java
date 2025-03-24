package com.curso.v0;

public class Principal {

	public static void main(String[] args) {
		
		Ave ave1 = new Aguila("Tetra");
		System.out.println(ave1);
		ave1.volar(); //SI VUELA
		
		//????
		ave1.volar(); //NO VUELA
		
		Ave ave2 = new Pinguino("Pin");
		System.out.println(ave2);
		ave2.volar();
		
		Ave ave3 = new Pato("Lucas");
		System.out.println(ave3);
		ave3.volar();
		
		//????
		
		ave3.volar(); //SI VUELE
		
	}

}
