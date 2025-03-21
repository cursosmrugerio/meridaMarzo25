package com.curso.v2;

public class CompuLinux implements Compu {
	
	String version;
	
	public CompuLinux(String version) {
		this.version = version;
	}
	
	@Override
	public void encender() {
		System.out.println("Encender computadora Linux: "+version);
	}
	
	

}
