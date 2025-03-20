package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Ave ave0 = new Ave();
		ave0.volar(); //Ave volar
		
		Ave ave1 = new Pato();
		ave1.volar(); //Pato volar
		
		Ave ave2 = new PatoSilvestre();
		ave2.volar(); //PatoSilvestre volar
	}

}
