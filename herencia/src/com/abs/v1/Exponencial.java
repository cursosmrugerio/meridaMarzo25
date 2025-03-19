package com.abs.v1;

public class Exponencial implements Operacion{
	
	int x;
	int y;
	
	public Exponencial(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int ejecuta() {
		return (int)Math.pow(x, y);
	}

	@Override
	public String toString() {
		return "Exponencial [x=" + x + ", y=" + y + "]";
	}

}
