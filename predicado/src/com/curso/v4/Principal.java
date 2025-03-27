package com.curso.v4;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("V4");
		
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
	
		show(listaEmpleados,PredicadoEmpleado.or(emp -> emp.getSueldo()<50.0 , 
												 z -> z.getNombre().length()>7));
		
		System.out.println("***Menores de Edad");
		show(listaEmpleados,PredicadoEmpleado.negate(t -> t.getEdad()>=18));
	}
	
	static void show(List<Empleado> lista, PredicadoEmpleado pe ) {
		for(Empleado e:lista) 
			if (pe.probar(e)) //<EJECUTA LA LAMBA QUE REGRESA EL METODO or()
				System.out.println(e);
	}
}
