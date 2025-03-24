package com.curso.v0;

public class Pato extends Ave {

	public Pato(String nombre) {
		super(nombre);
	}

	@Override
	void volar() {
		System.out.println("Volar Aleatorio");
	}
	
	

}
