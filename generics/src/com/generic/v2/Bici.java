package com.generic.v2;

public class Bici extends Transporte{
	
	private String modelo;

	public Bici(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Bici [modelo=" + modelo + "]";
	}
	

}
