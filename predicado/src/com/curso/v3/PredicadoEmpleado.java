package com.curso.v3;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	boolean probar(Empleado e);
	
	static PredicadoEmpleado and(PredicadoEmpleado pe1, 
						  		 PredicadoEmpleado pe2){
		
		return x -> (pe1.probar(x) && pe2.probar(x));
		
	}
}
