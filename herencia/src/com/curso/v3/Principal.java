package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V3");
		Operacion ope0 = new Operacion(8,4);
		Operacion ope1 = new Suma(8,4);
		Operacion ope2 = new Resta(8,4);
		Operacion ope3 = new Multi(8,4);
		Operacion ope4 = new Exponencial(8,4);
		
		//show();
		//show(ope0,ope1);
		show(ope0,ope1,ope2,ope3,ope4);
	}
	
	static void show(Operacion... operaciones) {
		//Polimorfismo
		for (Operacion ope : operaciones) {
			System.out.println(ope);
			System.out.println(ope.ejecuta());
		}
	}

}
