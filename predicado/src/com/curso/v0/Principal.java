package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		boolean res = false;
		Empleado emp1 = new Empleado("Patrobas",20,100.50);
		
		PredicadoEmpleado pre1 = new PredicadoEmpleado() {
			@Override
			public boolean probar(Empleado e) {
				return e.getEdad() >= 18;
			}
		};
		
		res = pre1.probar(emp1);
		
		System.out.println(res);
		
		PredicadoEmpleado pre2 = new PredicadoEmpleado() {
			@Override
			public boolean probar(Empleado e) {
				return e.getSueldo()<50.0;
			}
		};
		
		res = pre2.probar(emp1);
		
		System.out.println(res);
	}
}
