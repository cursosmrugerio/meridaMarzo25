package com.generic.v3;

public class Contenedor<T extends Transporte> {
	
	private T t;

	public Contenedor(T t) {
		this.t = t;
	}
	
	public <V> V showLicencia(V v) {
		System.out.println(t + ": Licencia: "+v);
		return v;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "Contenedor [t=" + t + "]";
	}
	
}
