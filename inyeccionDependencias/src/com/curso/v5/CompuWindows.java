package com.curso.v5;

public class CompuWindows implements Compu {
	
	String version;
	
	public CompuWindows(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender computadora Windows: "+version);
	}
	
	

}
