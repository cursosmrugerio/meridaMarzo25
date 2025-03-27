package com.curso.v6;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	default Predicado<T> and(Predicado<T> pe){
		return t -> (this.probar(t) && pe.probar(t));
	}
	
	default Predicado<T> or(Predicado<T> pe){
		return v -> (this.probar(v) || pe.probar(v));
	}
	
	default Predicado<T> negate() {
		return z -> !this.probar(z);
	}
}
