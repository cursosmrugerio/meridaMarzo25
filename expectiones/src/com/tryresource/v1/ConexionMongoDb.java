package com.tryresource.v1;

public class ConexionMongoDb implements AutoCloseable {
	
	private String name;

	public ConexionMongoDb(String name) {
		this.name = name;
	}
	
	void open() throws Exception {
		System.out.println("Abrir conexion MongoDB");
		throw new Exception("Error abrir conexion");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Cerrar conexion MongoDB");
		//throw new Exception("Error cerrar conexion");
	}

}
