package com.curso.v1;

public class Pato extends Ave {

	public Pato(String nombre) {
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	

}
