package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
		
		try {
			int resultado = dividir(x,y);
			System.out.println(resultado);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("***Fin de Programa***");
	}

	private static int dividir(int x, int y) {
		int res;
		res = x / y;
		return res;
	}

}
