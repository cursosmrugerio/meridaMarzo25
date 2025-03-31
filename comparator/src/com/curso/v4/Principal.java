package com.curso.v4;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


import com.curso.v2.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("V4 TreeSet");
		
		Comparator<Empleado> comparator = Comparator.comparingInt(Empleado::getEdad)
				  .thenComparingDouble(Empleado::getSueldo)
				  .thenComparing(Empleado::getNombre)
				  .reversed();

		Empleado emp1 = new Empleado("Patrobas",15,10.50);
		Empleado emp2 = new Empleado("Tercio",17,75.5);
		Empleado emp3 = new Empleado("Andronico",17,60.50);
		Empleado emp4 = new Empleado("Filologo",25,40.50);
		Empleado emp5 = new Empleado("Epeneto",17,75.50);
		Empleado emp6 = new Empleado("Andronico",17,60.50);
		
		Empleado[] emps = {emp1,emp2,emp3,emp4,emp5};
		
		List<Empleado> lista = Arrays.asList(emps);
		
		Set<Empleado> treeSetEmpleado = new TreeSet<>(comparator);
		treeSetEmpleado.addAll(lista);
		
		treeSetEmpleado.forEach(System.out::println);
		
		
		
		
		
		
	}

}
