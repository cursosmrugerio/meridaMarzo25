package com.curso.v0;

public class Resta{
	
	int x;
	int y;
	
	public Resta(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int ejecuta() {
		return x - y;
	}

	public String toString() {
		return "Resta [x=" + x + ", y=" + y + "]";
	}

}
