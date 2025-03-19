package com.curso.v0;

public class Principal {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("Patrobas",19);
		Estudiante e2 = new Estudiante("Epeneto",15);
		Estudiante e3 = new Estudiante("Andronico",21);
		
		System.out.println(Estudiante.contador); //1 3
		System.out.println(e3.contador); //1 3
		System.out.println(Estudiante.contador); //1 3


		
	}

}
