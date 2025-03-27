package com.generic.v1;

public class Bici implements Transporte{
	
	private String modelo;

	public Bici(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Bici [modelo=" + modelo + "]";
	}
	

}
