package com.generic.v2;

public class Motoneta extends Transporte {
	
	private String modelo;

	public Motoneta(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motoneta [modelo=" + modelo + "]";
	}
	

}
