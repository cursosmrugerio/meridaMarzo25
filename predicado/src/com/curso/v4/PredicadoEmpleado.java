package com.curso.v4;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	boolean probar(Empleado e);
	
	static PredicadoEmpleado and(PredicadoEmpleado pe1, 
						  		 PredicadoEmpleado pe2){
		
		return x -> (pe1.probar(x) && pe2.probar(x));
	}
	
	static PredicadoEmpleado or(PredicadoEmpleado pe1, 
	  		 					 PredicadoEmpleado pe2){

		return v -> (pe1.probar(v) || pe2.probar(v));
	}
	
	static PredicadoEmpleado negate(PredicadoEmpleado pe) {

		return z -> !pe.probar(z);
	}
}
