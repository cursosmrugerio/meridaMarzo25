package com.curso.v2;

public class Becario {

	String nombre;
	//BAJO ACOPLAMIENTO
	Compu computadora;

	public Becario(String nombre) {
		this.nombre = nombre;

	}

	void iniciarTrabajo() {
		System.out.println(nombre + " ,inicia trabajo");
		computadora.encender();
	}

}
