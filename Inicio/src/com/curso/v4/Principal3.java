package com.curso.v4;

public class Principal3 {

	public static void main(String[] args) {

		String dia = "JUEVES";
		
		switch(dia) {
		
		case "LUNES": System.out.println("0"); break;
		
		case "MIERCOLES": System.out.println("3"); break;
		
		case "VIERNES": System.out.println("5"); break;
		
		default: System.out.println(99);
		
		}
		
		// 99 
		// 99 0 3 5 
		
	}

}
