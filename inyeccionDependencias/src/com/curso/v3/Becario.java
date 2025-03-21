package com.curso.v3;

public class Becario {

	private String nombre;
	private Compu computadora;

	public Becario(String nombre, Compu computadora) {
		this.nombre = nombre;
		this.computadora = computadora;
	}

	void iniciarTrabajo() {
		System.out.println(nombre + " ,inicia trabajo");
		computadora.encender();
	}


}
