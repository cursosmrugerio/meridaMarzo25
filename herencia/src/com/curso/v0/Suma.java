package com.curso.v0;

public class Suma {
	
	int x;
	int y;
	
	public Suma(int x, int y) {
		super(); //<= Invoca al contructor de Object
		this.x = x;
		this.y = y;
	}
	
	public int ejecuta() {
		return x + y;
	}

	@Override
	public String toString() {
		return "Suma [x=" + x + ", y=" + y + "]";
	}

}
