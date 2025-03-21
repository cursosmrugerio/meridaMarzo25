package com.curso.v4;

public class Becario {

	private String nombre;
	private Compu computadora;

	public Becario(String nombre) {
		this.nombre = nombre;
	}

	void iniciarTrabajo() {
		System.out.println(nombre + " ,inicia trabajo");
		computadora.encender();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Compu getComputadora() {
		return computadora;
	}

	public void setComputadora(Compu computadora) {
		this.computadora = computadora;
	}
	
	

}
