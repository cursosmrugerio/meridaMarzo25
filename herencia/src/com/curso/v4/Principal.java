package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		
		show(new Operacion(8,4),
			 new Suma(8,4),
			 new Resta(8,4),
			 new Multi(8,4),
			 new Exponencial(8,4),
			 new Suma(9,4));
	}
	
	static void show(Operacion... operaciones) {
		//Polimorfismo
		for (Operacion ope : operaciones) {
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}
	}

}
