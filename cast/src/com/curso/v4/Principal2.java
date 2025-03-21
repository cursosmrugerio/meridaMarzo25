package com.curso.v4;

public class Principal2 {
	
	
	public static void main(String[] args) {
		Ave ave = new Pato();
		
//		Pato pato = (Pato)ave;
//		System.out.println(pato.edad);
		
		System.out.println(((Pato)ave).edad);
	}

}
