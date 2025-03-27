package com.generic.v1;

public class Motoneta implements Transporte {
	
	private String modelo;

	public Motoneta(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motoneta [modelo=" + modelo + "]";
	}
	

}
