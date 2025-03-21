package com.curso.v0;

public class Becario {

	String nombre;
	CompuWindows compu;
	
	public Becario(String nombre) {
		this.nombre = nombre;
		//ALTO ACOPLAMIENTO
		compu = new CompuWindows("Vista"); 
	}
	
	void iniciarTrabajo() {
		System.out.println(nombre+ " ,inicia trabajo");
		compu.encender();
	}

}
