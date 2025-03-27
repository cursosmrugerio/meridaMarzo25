package com.generic.v3;

public class Moto implements Transporte {
	
	private String modelo;

	public Moto(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Moto [modelo=" + modelo + "]";
	}
	

}
