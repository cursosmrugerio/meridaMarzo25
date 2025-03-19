package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Cliente c0 = new Cliente();
		//System.out.println(c0.nombre.length()); //NullPointerException

		Cliente c1 = new Cliente("Andronico");
		System.out.println(c1.nombre.length()); 
		
		Cliente c2 = new Cliente("Epeneto",20);
		System.out.println(c2.nombre);
		System.out.println(c2.edad);
	}

}
