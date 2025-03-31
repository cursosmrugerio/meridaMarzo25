package com.curso.v3;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		Empleado emp1 = new Empleado("Patrobas",15,10.50);
		Empleado emp2 = new Empleado("Tercio",17,110.50);
		Empleado emp3 = new Empleado("Andronico",19,60.50);
		Empleado emp4 = new Empleado("Filologo",25,40.50);
		Empleado emp5 = new Empleado("Epeneto",16,75.50);
		Empleado[] emps = {emp1,emp2,emp3,emp4,emp5};
		
		Arrays.sort(emps);
		
		for(Empleado e:emps)
			System.out.println(e);
		
	}

}
