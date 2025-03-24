package com.curso.v2;

@FunctionalInterface
public interface Operacion {
	
	//UN SOLO METODO ABSTRACT
	int ejecuta(int x, int y);
	
	//n métodos static y/o default
//	static int ejecuta1(double d) {
//		return 0;
//	}
//	default long ejecuta2(boolean d) {
//		return 5;
//	}
}
