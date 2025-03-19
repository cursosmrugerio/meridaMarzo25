package com.curso.v0;

public class PrincipalPato {

	public static void main(String[] args) {

		Pato pato1 = new Pato("lucas");
		Pato pato2 = new Pato("lucas");
		
		System.out.println(pato1==pato2); //false
		System.out.println(pato1.equals(pato2)); //true
	}

}
