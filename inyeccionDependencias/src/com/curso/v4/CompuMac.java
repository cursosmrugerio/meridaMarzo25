package com.curso.v4;

public class CompuMac implements Compu {
	
	String version;
	
	public CompuMac(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender computadora Mac: "+version);
	}
	
	

}
