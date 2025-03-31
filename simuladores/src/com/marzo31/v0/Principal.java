package com.marzo31.v0;

class A{
	
	String name; //Variable de instacia
	
	public Object myMethod() {
		String nombre=null; //Variable Local
		
		System.out.println(name); //null
		System.out.println(nombre); //null
		return 0;
	}
}

class B extends A{
	@Override
	public Long myMethod() {
		return 0l;
	}
	static class C {
		
	}
}

public class Principal {
	
	public static void main(String[] args) {
		
		new A().myMethod();
		
		String cadena = """
				abc
				def
				ghi
				jkl
				texto
				""";
		
	}

}
