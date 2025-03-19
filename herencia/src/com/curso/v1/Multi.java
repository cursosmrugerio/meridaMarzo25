package com.curso.v1;

public class Multi extends Operacion{
	
	public Multi(int x, int y) {
		super(x,y);
	}
	
	public int ejecuta() {
		return x * y;
	}

	@Override
	public String toString() {
		return "Multi [x=" + x + ", y=" + y + "]";
	}

}
