package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		String s = "Hello"; //POOL DE STRINGS
		String t = new String(s); // NO POOL DE STRINGS
		
		if ("Hello".equals(s)) 
			System.out.println("one");
		
		if (t.intern() == s) 
			System.out.println("three");
		
		if (t == s) 
			System.out.println("two");
		
		if ("Hello" == s) 
			System.out.println("four");
		
		if ("Hello".intern() == t) 
			System.out.println("five");
		
		System.out.println("******");
		String s1 = "purr";
		s1 = s1.toUpperCase(); //PURR
		s1 = s1.trim(); 
		s1 = s1.substring(1, 3);//UR
		s1 += "two"; //s1 = s1 + "URtwo"
		System.out.println(s1);  //URtwo
		
	}

}
