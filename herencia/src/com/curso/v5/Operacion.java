package com.curso.v5;

//CLASE NO PUEDES SER HEREDADA
//public final class Operacion {

public class Operacion {
	
	int x;
	int y;
	
	public Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	static final void ejecutaStatic() {
		System.out.println("Static Method Operacion");
	}
		
	//NO PUEDE SER SOBREESCRITO
	//public final int ejecuta() {
	public int ejecuta() {
		return 0;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()  
				+ "[x=" + x + ", y=" + y + "]";
	}
	
	

}
