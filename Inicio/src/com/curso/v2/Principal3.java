package com.curso.v2;

public class Principal3 {

	public static void main(String[] args) {
		int x = 5; //PRIMITIVOS
		String cadena = "Hola"; //OBJETOS INMUTABLES
		StringBuilder sb = new StringBuilder("Hello"); //OBJETOS MUTABLES 
		
		cadena = transforma(x,cadena,sb);
		
		System.out.println("x: "+x); //5 
		System.out.println("cadena: "+cadena); //Hola Mundo
		System.out.println("sb: "+sb); //Hello World

	}

	static String transforma(int x,String cadena, StringBuilder sb) {
		x = x + 5;
		sb.append(" World");
		return cadena.concat(" Mundo");
		
	}
}
