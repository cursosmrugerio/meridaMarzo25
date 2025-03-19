package com.curso.v0;

public class ConexionMongoDb {
	
	String nombre;

	public ConexionMongoDb(String nombre) {
		this.nombre = nombre;
	}

	public void open() {
		System.out.println("Abrir conexion MongoDb");
	}
	
	@Override
	public String toString() {
		return "ConexionMongoDb [nombre=" + nombre + "]";
	}

}
