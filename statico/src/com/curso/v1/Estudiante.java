package com.curso.v1;

public class Estudiante {
	
	private String nombre;
	private int edad;
	private static int contador; 
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad+"]";
	}
	

}
