package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		int x = 8;
		int y = 0;
		
		int resultado;
		try {
			resultado = dividir(x,y);
			System.out.println(resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("***Fin de Programa***");
	}

	private static int dividir(int x, int y) throws Exception {
		int res;
		if (y == 0)
			throw new Exception();
		res = x / y;
		return res;
	}

}
