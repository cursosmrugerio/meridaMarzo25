package com.curso.v0;

public class Pato{
	
	String nombre;

	public Pato(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		Pato other = (Pato) obj;
		return this.nombre.equals(other.nombre);
	}
	
	

}
