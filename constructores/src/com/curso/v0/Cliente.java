package com.curso.v0;

public class Cliente {
	
	String nombre; //null
	int edad; //0
	
	Cliente() {
		//this("Sin nombre",0);
	}
	
	Cliente(String nombre) {
		this.nombre = nombre;
	}
	
	Cliente(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	
}
