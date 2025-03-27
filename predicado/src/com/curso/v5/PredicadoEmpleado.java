package com.curso.v5;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	boolean probar(Empleado e);
	
	default PredicadoEmpleado and(PredicadoEmpleado pe){
		return x -> (this.probar(x) && pe.probar(x));
	}
	
	default PredicadoEmpleado or(PredicadoEmpleado pe){
		return v -> (this.probar(v) || pe.probar(v));
	}
	
	default PredicadoEmpleado negate() {
		return z -> !this.probar(z);
	}
}
