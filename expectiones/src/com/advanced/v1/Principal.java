package com.advanced.v1;

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
	public void volar() throws ExceptionC {
		System.out.println("Aguila Real Volar");
	}
}

public class Principal {
	public static void main(String[] args) {
		AguilaReal aguila1 = new AguilaReal();
		try {
			aguila1.volar();
		} catch (ExceptionC e) {
			e.printStackTrace();
		}
		
		Aguila aguila2 = new AguilaReal();
		try {
			aguila2.volar();
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
	}

}
