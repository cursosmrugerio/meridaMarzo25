package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		String name = "Patrobas";
		
		for(int x=0; x<1_000_000; x++) {
			name = name.concat(x+"");
			System.out.println(name);
		}
	}

}
