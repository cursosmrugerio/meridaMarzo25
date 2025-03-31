package com.curso.v1;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V1 Clases Anomimas");

		Empleado emp1 = new Empleado("Patrobas",15,10.50);
		Empleado emp2 = new Empleado("Tercio",17,110.50);
		Empleado emp3 = new Empleado("Andronico",19,60.50);
		Empleado emp4 = new Empleado("Filologo",25,40.50);
		Empleado emp5 = new Empleado("Epeneto",16,75.50);
		Empleado[] emps = {emp1,emp2,emp3,emp4,emp5};
		
		System.out.println("***Ordenar por Edad");
		
		Arrays.sort(emps,
				new Comparator<Empleado>() {
					@Override
					public int compare(Empleado o1, Empleado o2) {
						return o1.getEdad() - o2.getEdad();
					}
				}
		);
		for(Empleado e:emps)
			System.out.println(e);
		
		System.out.println("***Ordenar por Sueldo");
		Arrays.sort(emps,
				new Comparator<Empleado>() {
					@Override
					public int compare(Empleado o1, Empleado o2) {
						return (int)(o1.getSueldo() - o2.getSueldo());
					}
				}
		);
		for(Empleado e:emps)
			System.out.println(e);
		
		System.out.println("***Ordenar por Nombre");
		Arrays.sort(emps,
				new Comparator<Empleado>() {
					@Override
					public int compare(Empleado o1, Empleado o2) {
						return o1.getNombre().compareTo(o2.getNombre());
					}
				}
		);
		for(Empleado e:emps)
			System.out.println(e);
		
	}

}
