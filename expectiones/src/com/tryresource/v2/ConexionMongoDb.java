package com.tryresource.v2;

public class ConexionMongoDb implements AutoCloseable {
	
	private String name;

	public ConexionMongoDb(String name) {
		this.name = name;
	}
	
	void open()  {
		System.out.println("Abrir conexion MongoDB");
	}
	
	@Override
	public void close()  {
		System.out.println("Cerrar conexion MongoDB");
	}

}
