package com.curso.v1;

public class Alumno {
	
	private String nombre;
	private int edad;
	private static int contador; 
	
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad+"]";
	}
	

}
