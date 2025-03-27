package com.curso.v3;

import com.curso.v1.Estudiante;
import static com.curso.v1.Estudiante.getContador;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(getContador()); //0

		Estudiante e1 = new Estudiante("Patrobas",19);
		Estudiante e2 = new Estudiante("Epeneto",15);
		Estudiante e3 = new Estudiante("Andronico",21);
		
		System.out.println(getContador()); //3
		
	}

}
