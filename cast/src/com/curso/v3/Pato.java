package com.curso.v3;

public class Pato extends Ave {
	
	String tipo = "Pato";
	
	@Override
	void volar() {
		System.out.println("Pato volar");
	}
	
	void volarPato() {
		System.out.println("volarPato()");
	}

}
