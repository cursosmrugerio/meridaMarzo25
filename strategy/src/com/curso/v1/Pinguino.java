package com.curso.v1;

public class Pinguino extends Ave {

	public Pinguino(String nombre) {
		super(nombre);
	}

	@Override
	void volar() {
		cv.ejecutaVuelo();
	}
	
	

}
