package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V1");
		boolean res = false;
		Empleado emp1 = new Empleado("Patrobas",20,100.50);
		
		PredicadoEmpleado pre1 = e -> e.getEdad() >= 18;
		res = pre1.probar(emp1);
		System.out.println(res);
		
		PredicadoEmpleado pre2 = x -> x.getSueldo()<50.0;
		res = pre2.probar(emp1);
		System.out.println(res);
	}
}
