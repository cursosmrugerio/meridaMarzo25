package com.curso.v1;

import java.util.function.IntBinaryOperator;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V1 Lambda");
		
		Operacion ope1 = (int a,int b) -> {
							System.out.println("Suma");
							return a+b;
							};
		
		System.out.println(ope1.ejecuta(8,4));
		
		Operacion ope2 = (z,w) -> z-w;
		System.out.println(ope2.ejecuta(8,4));
		
		Operacion ope3 = (x,y) -> (int)Math.pow(x, y);
		System.out.println(ope3.ejecuta(8,4));

		IntBinaryOperator ope4 = (z,w)->  z*w;
		System.out.println(ope4.applyAsInt(8,4));
		
		Operacion ope5 = (pato1,pato2) -> pato1/pato2;
		System.out.println(ope5.ejecuta(8,4));
	}
	
	

}
