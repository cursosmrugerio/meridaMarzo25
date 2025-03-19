package com.abs.v1;

public interface Operacion {
//Es una forma como java resuelve el tema de herencia multiple
//No se pueden crear objetos o instancias de clase
	
    //public static final
	//int x = 8;
	//int y = 4;
	
//	public Operacion(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
		
	//public abstract 
	int ejecuta();

	//JAVA8
	//Metodos con comportamiento
	//static o default
	
//	@Override
//	public String toString() {
//		return this.getClass().getSimpleName()  
//				+ "[x=" + x + ", y=" + y + "]";
//	}

}
