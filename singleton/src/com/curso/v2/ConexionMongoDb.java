package com.curso.v2;

public class ConexionMongoDb {
	
	String nombre; //HAS-A
	private static ConexionMongoDb conexion= new ConexionMongoDb("Atlas");
	
	private ConexionMongoDb(String nombre) {
		this.nombre = nombre;
	}

	public void open() {
		System.out.println("Abrir conexion MongoDb");
	}
	
	@Override
	public String toString() {
		return "ConexionMongoDb [nombre=" + nombre + "]";
	}
	
	public static ConexionMongoDb getInstance() {
		return conexion;
	}

}
