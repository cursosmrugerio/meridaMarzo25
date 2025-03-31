package com.advanced.v2;

class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}

class Aguila {
	Aguila() throws ExceptionB {}
}

class AguilaReal extends Aguila {
	AguilaReal() throws ExceptionA {}
}

public class Principal {
	public static void main(String[] args) {
		try {
			Aguila aguila1 = new Aguila();
		} catch (ExceptionB e) {
			e.printStackTrace();
		}
	}
}
