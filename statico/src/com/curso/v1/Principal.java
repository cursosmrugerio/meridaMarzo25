package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(Estudiante.getContador()); //0

		Estudiante e1 = new Estudiante("Patrobas",19);
		Estudiante e2 = new Estudiante("Epeneto",15);
		Estudiante e3 = new Estudiante("Andronico",21);
		
		System.out.println(Estudiante.getContador()); //1 3
		System.out.println(e3.getContador()); //1 3
		System.out.println(Estudiante.getContador()); //1 3

	}

}
