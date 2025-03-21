package com.curso.v4;

public class Pato extends Ave {
	
	String tipo = "Pato";
	int edad = 5;
	
	@Override
	void volar() {
		System.out.println("Pato volar");
	}
	
	void volarPato() {
		System.out.println("volarPato()");
	}

}
