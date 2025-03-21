package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		Becario bec1 = new Becario("Filologo");
		bec1.setCompuWindows();
		bec1.iniciarTrabajo();
		
		Becario bec2 = new Becario("Andronico");
		bec2.setCompuWindows();
		bec2.iniciarTrabajo();
		
		Becario bec3 = new Becario("Epeneto");
		bec3.setCompuLinux();
		bec3.iniciarTrabajo();
	}

}
