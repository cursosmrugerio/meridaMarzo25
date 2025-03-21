package com.curso.v4;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V4");
		Becario bec1 = new Becario("Filologo");
		Inyector.aplicar(bec1, "WINDOWS");
		bec1.iniciarTrabajo();
		
		Becario bec2 = new Becario("Andronico");
		Inyector.aplicar(bec2, "MAC");
		bec2.iniciarTrabajo();
		
		Becario bec3 = new Becario("Epeneto");
		Inyector.aplicar(bec3, "LINUX");
		bec3.iniciarTrabajo();
		
		Becario bec4 = new Becario("Tercio");
		Inyector.aplicar(bec4, "XYZ");
		bec4.iniciarTrabajo();
	}

}
