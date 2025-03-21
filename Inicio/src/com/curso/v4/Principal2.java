package com.curso.v4;

public class Principal2 {

	public static void main(String[] args) {

		String dia = "MIERCOLES";
		
		switch(dia) {
		
		default: System.out.println(99); 
		
		case "LUNES": System.out.println("0");
		
		case "MIERCOLES": System.out.println("3");
		
		case "VIERNES": System.out.println("5");
		
		}
		
		// 99 
		// 99 0 3 5 
		
	}

}
