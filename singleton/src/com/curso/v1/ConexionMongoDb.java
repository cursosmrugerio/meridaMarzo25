package com.curso.v1;

public class ConexionMongoDb {
	
	String nombre; //HAS-A
	private static ConexionMongoDb conexion; //HAS-A
	
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
		if (conexion == null)
			conexion = new ConexionMongoDb("Atlas");
		return conexion;
	}

}
