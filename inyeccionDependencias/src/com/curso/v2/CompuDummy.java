package com.curso.v2;

public class CompuDummy implements Compu {
	
	String version;
	
	public CompuDummy(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender computadora Dummy: "+version);
	}
	
	

}
