package com.curso.v2;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;

		int resultado;

		resultado = dividir(x, y);
		System.out.println(resultado);

		System.out.println("***Fin de Programa***");
	}

	private static int dividir(int x, int y) {
		int res;
		if (y == 0)
			throw new RuntimeException();
		res = x / y;
		return res;
	}

}
