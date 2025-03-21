package com.curso.v1;

public class Becario {

	String nombre;
	CompuWindows compuWindows;
	CompuLinux compuLinux;

	public Becario(String nombre) {
		this.nombre = nombre;

	}

	void iniciarTrabajo() {
		System.out.println(nombre + " ,inicia trabajo");
		
		if (compuWindows!=null)
			compuWindows.encender();
		else
			compuLinux.encender();
	}

	void setCompuWindows() {
		// ALTO ACOPLAMIENTO
		compuWindows = new CompuWindows("Vista");
	}
	
	void setCompuLinux() {
		// ALTO ACOPLAMIENTO
		compuLinux = new CompuLinux("Ubuntu 20");
	}

}
