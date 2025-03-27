package com.curso.v3;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V3");
		
		boolean res = false;
		Empleado emp1 = new Empleado("Patrobas",15,10.50);
		Empleado emp2 = new Empleado("Tercio",17,110.50);
		Empleado emp3 = new Empleado("Andronico",19,60.50);
		Empleado emp4 = new Empleado("Filologo",25,40.50);
		Empleado emp5 = new Empleado("Epeneto",16,75.50);
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(emp1);
		listaEmpleados.add(emp2);
		listaEmpleados.add(emp3);
		listaEmpleados.add(emp4);
		listaEmpleados.add(emp5);
		
		PredicadoEmpleado pe1 = emp -> emp.getSueldo()<50.0;
		PredicadoEmpleado pe2 = z -> z.getNombre().length()>7;
		PredicadoEmpleado pe3 = PredicadoEmpleado.and(pe1, pe2);
	
		show(listaEmpleados,pe3);
	}
	
	static void show(List<Empleado> lista, PredicadoEmpleado pe ) {
		for(Empleado e:lista) 
			if (pe.probar(e))
				System.out.println(e);
	}
}
