package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		
		Operacion ope1 = new Suma();
		System.out.println(ope1.ejecuta(8,4));
		
		//CLASES ANONIMAS
		Operacion ope2 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				return x-y;
			}			
		};
		System.out.println(ope2.ejecuta(8,4));
		
		Operacion ope3 = new Operacion() {
			@Override
			public int ejecuta(int x, int y) {
				return (int)Math.pow(x, y);
			}			
		};
		System.out.println(ope3.ejecuta(8,4));

		Operacion ope4 = new Operacion() {
			@Override
			public int ejecuta(int z, int w) {
				return z*w;
			}			
		};
		System.out.println(ope4.ejecuta(8,4));
		
		Operacion ope5 = new Operacion() {
			@Override
			public int ejecuta(int pato1, int pato2) {
				return pato1/pato2;
			}			
		};
		System.out.println(ope5.ejecuta(8,4));
	}
	
	

}
