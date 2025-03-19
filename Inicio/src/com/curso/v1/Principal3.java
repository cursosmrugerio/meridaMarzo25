package com.curso.v1;

public class Principal3 {
	
	public static void main(String[] args) {
		
		String s0 = "Hola";
		String s1 = "Hola";
		String s2 = new String("Hola");
		
		System.out.println(s0==s1); //true
		System.out.println(s1==s2); //false

		System.out.println(s0.equals(s1)); //true
		System.out.println(s1.equals(s2)); //true
		
		System.out.println("***StringBuilder***");
		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false

		
	}

}
