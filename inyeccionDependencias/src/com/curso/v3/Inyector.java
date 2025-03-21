package com.curso.v3;

final public class Inyector {
	
	static Becario aplicar(String nombre, String tipoCompu) {
		
		Compu compuWindows = new CompuWindows("Vista");
		Compu compuLinux = new CompuLinux("Ubuntu 18");
		Compu compuMac = new CompuMac("Sierra");
		Compu compuDummy = new CompuDummy("Test");

		//INYECCION POR SETTER
		if (tipoCompu.equals("WINDOWS"))
			return new Becario(nombre,compuWindows);
		else if( tipoCompu.equals("LINUX"))
			return new Becario(nombre,compuLinux);
		else if( tipoCompu.equals("MAC"))
			return new Becario(nombre,compuMac);
		else
			return new Becario(nombre,compuDummy);
	
	}

}
