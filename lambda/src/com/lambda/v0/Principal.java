package com.lambda.v0;

import java.util.function.Function;

public class Principal {
	
	public static void main(String[] args) {
		
		Function<Integer,String> fun1 = i -> "Hello";
		String s = fun1.apply(999);
		System.out.println(s);
		
		Function<String,Integer> fun2 = cadena -> cadena.length();
		System.out.println(fun2.apply("Hola Mundo"));
		
		Function<String,String> fun3 = cadena -> cadena+"!!!";
		System.out.println(fun3.apply("Python"));
		
		
	}

}
