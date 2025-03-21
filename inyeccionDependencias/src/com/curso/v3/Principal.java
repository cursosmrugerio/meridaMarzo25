package com.curso.v3;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V3");
		Becario bec1 = Inyector.aplicar("Filologo", "WINDOWS");
		bec1.iniciarTrabajo();
		
		Becario bec2 = Inyector.aplicar("Andronico", "MAC");
		bec2.iniciarTrabajo();
		
		Becario bec3 = Inyector.aplicar("Epeneto", "LINUX");
		bec3.iniciarTrabajo();
		
		bec3 = Inyector.aplicar("Epeneto","MAC");
		bec3.iniciarTrabajo();

		
		Becario bec4 = Inyector.aplicar("Tercio", "XYZ");
		bec4.iniciarTrabajo();
		
		
	}

}
