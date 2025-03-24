package com.curso.v1;

import com.curso.v1.strategy.ComportamientoVolar;

public abstract class Ave {
	
	String nombre; //HAS A
	ComportamientoVolar cv; //HAS A

	public Ave(String nombre) {
		this.nombre = nombre;
	}
	
	abstract void volar();

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				"[nombre=" + nombre + "]";
	}
	
}
