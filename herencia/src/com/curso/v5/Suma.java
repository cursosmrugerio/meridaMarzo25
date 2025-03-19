package com.curso.v5;

public class Suma extends Operacion{
	
	public Suma(int x, int y) {
		super(x,y);
	}
	
	public int ejecuta() {
		return x + y;
	}
	
	//HIDDEN OCULTAR
//	static void ejecutaStatic() {
//		System.out.println("Static Method Suma");
//	}


}
