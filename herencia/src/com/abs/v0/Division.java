package com.abs.v0;

public class Division extends Operacion {

	public Division(int x, int y) {
		super(x, y);
	}

	@Override
	public int ejecuta() {
		return x/y;
	}
	
	

}
