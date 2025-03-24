package com.curso.v5;

enum TIPO_COMPUTADORA{
	WINDOWS,
	LINUX,
	MAC,
	DUMMY
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("V5 ENUM");
		Becario bec1 = Inyector.aplicar("Filologo", TIPO_COMPUTADORA.WINDOWS);
		bec1.iniciarTrabajo();
		
		Becario bec2 = Inyector.aplicar("Andronico",TIPO_COMPUTADORA.MAC);
		bec2.iniciarTrabajo();
		
		Becario bec3 = Inyector.aplicar("Epeneto", TIPO_COMPUTADORA.LINUX);
		bec3.iniciarTrabajo();
		
		bec3 = Inyector.aplicar("Epeneto",TIPO_COMPUTADORA.DUMMY);
		bec3.iniciarTrabajo();

		Becario bec4 = Inyector.aplicar("Tercio", TIPO_COMPUTADORA.DUMMY);
		bec4.iniciarTrabajo();
		
		
	}

}
