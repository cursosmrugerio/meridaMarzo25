package com.curso.v5;

public class Principal {

	public static void main(String[] args) {

		int rabbit = 6;
		boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
		System.out.println(bunny);
		System.out.println(rabbit);  //6
		
		int rabbit2 = 6;
		boolean bunny2 = (rabbit2 >= 8) && (++rabbit2 <= 7);
		System.out.println(bunny2);
		System.out.println(rabbit2);  //6
	}

}
