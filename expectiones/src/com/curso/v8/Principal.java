package com.curso.v8;

public class Principal {

	public static void main(String[] args) {

		int x = 1008;
		int y = 4;

		int resultado;

		try {
			resultado = dividir(x, y);
			System.out.println(resultado);
		} catch (DividirCeroException e) {
			e.printStackTrace();
		} catch (NoNegativoException e) {
			e.printStackTrace();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Paso por Finally");
		}

		System.out.println("***Fin de Programa***");
	}

	private static int dividir(int x, int y) throws Exception {
		int res;
		if (y == 0)
			throw new DividirCeroException("No se puede dividir entre 0");
		if (y < 0)
			throw new NoNegativoException("No se permite dividir entre negativos");
		if (x > 100)
			throw new UnsupportedOperationException("X no puede ser mayor a 1000");
		res = x / y;
		return res;
	}

}
