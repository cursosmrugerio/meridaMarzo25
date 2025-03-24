package com.curso.v6;

final public class Inyector {
	
	static Becario aplicar(String nombre, TIPO_COMPUTADORA tipoCompu) {
		
		Compu compuWindows = new CompuWindows("Vista");
		Compu compuLinux = new CompuLinux("Ubuntu 18");
		Compu compuMac = new CompuMac("Sierra");
		Compu compuDummy = new CompuDummy("Test");
		
		switch(tipoCompu) {
			case WINDOWS: return new Becario(nombre,compuWindows);
			case LINUX: return new Becario(nombre,compuLinux);
			case MAC: return new Becario(nombre,compuMac);
			default: return new Becario(nombre,compuDummy);
		}
	}

}
