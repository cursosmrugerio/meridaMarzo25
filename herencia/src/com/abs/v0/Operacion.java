package com.abs.v0;

public abstract class Operacion {
//No se pueden crear objetos o instancias de clase
	
	int x;
	int y;
	
	public Operacion(int x, int y) {
		this.x = x;
		this.y = y;
	}
		
	public abstract int ejecuta();

	@Override
	public String toString() {
		return this.getClass().getSimpleName()  
				+ "[x=" + x + ", y=" + y + "]";
	}

}
