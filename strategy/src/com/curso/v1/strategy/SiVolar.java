package com.curso.v1.strategy;

public class SiVolar implements ComportamientoVolar {

	@Override
	public void ejecutaVuelo() {
		System.out.println("Si Volar");
	}

}
