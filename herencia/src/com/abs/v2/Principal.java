package com.abs.v2;

public class Principal {
	
	//public abstract void other(); NO SE PUEDE

	public static void main(String[] args) {
		System.out.println("Interface ClaseAbstracta v2 ");
		show(
			 new Suma(8,4),
			 new Resta(8,4),
			 new Multi(8,4),
			 new Exponencial(8,4),
			 new Division(8,4));
	}
	
	static void show(Operacion... operaciones) {
		for (Operacion ope : operaciones) {
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}
	}

}
