package com.generic.v2;

public class Moto extends Transporte {
	
	private String modelo;

	public Moto(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Moto [modelo=" + modelo + "]";
	}
	

}
