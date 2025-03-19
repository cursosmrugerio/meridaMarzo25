package com.curso.v1;

public class Resta extends Operacion{
	
	public Resta(int x, int y) {
		super(x,y);
	}
	
	public int ejecuta() {
		return x - y;
	}

	public String toString() {
		return "Resta [x=" + x + ", y=" + y + "]";
	}

}
