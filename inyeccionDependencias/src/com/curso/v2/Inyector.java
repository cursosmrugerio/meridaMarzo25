package com.curso.v2;

final public class Inyector {
	
	static void aplicar(Becario bec , String tipoCompu) {
		
		Compu compuWindows = new CompuWindows("Vista");
		Compu compuLinux = new CompuLinux("Ubuntu 18");
		Compu compuMac = new CompuMac("Sierra");
		Compu compuDummy = new CompuDummy("Test");

		//INYECCION POR ATRIBUTO
		if (tipoCompu.equals("WINDOWS"))
			bec.computadora = compuWindows;
		else if( tipoCompu.equals("LINUX"))
			bec.computadora = compuLinux;
		else if( tipoCompu.equals("MAC"))
			bec.computadora = compuMac;
		else
			bec.computadora = compuDummy;
	
	}

}
