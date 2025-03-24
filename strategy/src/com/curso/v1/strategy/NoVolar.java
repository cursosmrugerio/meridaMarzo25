package com.curso.v1.strategy;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutaVuelo() {
		System.out.println("No Volar");
	}

}
