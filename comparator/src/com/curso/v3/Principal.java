package com.curso.v3;

import java.util.Arrays;
import java.util.Comparator;

import com.curso.v2.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V3 Functional");

		Empleado emp1 = new Empleado("Patrobas",15,10.50);
		Empleado emp2 = new Empleado("Tercio",17,75.5);
		Empleado emp3 = new Empleado("Andronico",17,60.50);
		Empleado emp4 = new Empleado("Filologo",25,40.50);
		Empleado emp5 = new Empleado("Epeneto",17,75.50);
		Empleado[] emps = {emp1,emp2,emp3,emp4,emp5};
		
		Comparator<Empleado> comparator = Comparator.comparingInt(Empleado::getEdad)
										  .thenComparingDouble(Empleado::getSueldo)
										  .thenComparing(Empleado::getNombre)
										  .reversed();
		Arrays.sort(emps,comparator);
		for(Empleado e:emps)
			System.out.println(e);
		
		
	}

}
