package com.curso.v2;

import com.curso.v1.strategy.ComportamientoVolar;
import com.curso.v1.strategy.SiVolar;

public abstract class Ave {
	
	private String nombre; //HAS A
	private ComportamientoVolar cv = new SiVolar(); //HAS A

	public Ave(String nombre) {
		this.nombre = nombre;
	}
	
	void volar() {
		//DELEGAR
		cv.ejecutaVuelo();
	}
	
	public ComportamientoVolar getCv() {
		return cv;
	}

	public void setCv(ComportamientoVolar cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				"[nombre=" + nombre + "]";
	}
	
}
