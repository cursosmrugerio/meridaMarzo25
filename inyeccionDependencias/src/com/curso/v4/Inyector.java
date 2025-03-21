package com.curso.v4;

final public class Inyector {
	
	static void aplicar(Becario bec , String tipoCompu) {
		
		Compu compuWindows = new CompuWindows("Vista");
		Compu compuLinux = new CompuLinux("Ubuntu 18");
		Compu compuMac = new CompuMac("Sierra");
		Compu compuDummy = new CompuDummy("Test");

		//INYECCION POR SETTER
		if (tipoCompu.equals("WINDOWS"))
			bec.setComputadora(compuWindows);
		else if( tipoCompu.equals("LINUX"))
			bec.setComputadora(compuLinux);
		else if( tipoCompu.equals("MAC"))
			bec.setComputadora(compuMac);
		else
			bec.setComputadora(compuDummy);
	
	}

}
