package com.abs.v2;

public class Resta extends OperacionAbs{

	public Resta(int x, int y) {
		super(x, y);
	}

	@Override
	public int ejecuta() {
		return x-y;
	}
	

}
