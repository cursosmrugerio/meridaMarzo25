package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		int x = 5; //PRIMITIVOS
		String cadena = "Hola"; //OBJETOS INMUTABLES
		StringBuilder sb = new StringBuilder("Hello"); //OBJETOS MUTABLES 
		
		transforma(x,cadena,sb);
		
		System.out.println("x: "+x); //5 
		System.out.println("cadena: "+cadena); //Hola Mundo
		System.out.println("sb: "+sb); //Hello World

	}

	static void transforma(int x,String cadena, StringBuilder sb) {
		x = x + 5;
		cadena.concat(" Mundo");
		sb.append(" World");
		
	}
}
