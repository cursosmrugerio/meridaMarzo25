package com.tryresource.v0;

public class ConexionMongoDb {
	
	private String name;

	public ConexionMongoDb(String name) {
		this.name = name;
	}
	
	void open() throws Exception {
		System.out.println("Abrir conexion MongoDB");
		//throw new Exception("Error abrir conexion");
	}
	
	void close() throws Exception {
		System.out.println("Cerrar conexion MongoDB");
		//throw new Exception("Error cerrar conexion");
	}

}
