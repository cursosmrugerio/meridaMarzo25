package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		PatoSilvestre patoSilvestre = new PatoSilvestre();
		
		Pato pato = patoSilvestre;
		
		Ave ave = pato;
		
		
		Aguila aguila = (Aguila)ave;
		aguila.volar(); //ClassCastException
	}

}
