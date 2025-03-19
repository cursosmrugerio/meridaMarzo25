package com.curso.v3;

public class Principal2 {

	public static void main(String[] args) {

		StringBuilder name = new StringBuilder("Patrobas");
		
		for(int x=0; x<10; x++) {
			name.append(x);
			System.out.println(name);
		}
		
		String nameString = name.toString();
	}

}
