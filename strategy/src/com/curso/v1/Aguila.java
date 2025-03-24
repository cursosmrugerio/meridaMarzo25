package com.curso.v1;

public class Aguila extends Ave {

	public Aguila(String nombre) {
		super(nombre);
	}

	@Override
	void volar() {
		//DELEGAR
		cv.ejecutaVuelo();
	}
	
	

}
