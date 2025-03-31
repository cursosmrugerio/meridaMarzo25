package com.advanced.v0;

class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}

class Aguila {
	void volar() throws ExceptionA {
		System.out.println("Aguila Volar");
	}
}

class AguilaReal extends Aguila {
	@Override
	void volar() {
		System.out.println("Aguila Real Volar");
	}
}

public class Principal {
	public static void main(String[] args) {
		AguilaReal aguila1 = new AguilaReal();
		aguila1.volar();
		
		Aguila aguila2 = new AguilaReal();
		try {
			aguila2.volar();
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
	}

}
