package clase.neww.v4;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;


public class Principal {

	public static void main(String[] args) {

		Supplier<Empleado> sup = () -> new Empleado(); 
		Empleado emp1 = sup.get();
		System.out.println(emp1);
		
		Function<String,Empleado> fun = name -> new Empleado(name); 
		Empleado emp2 = fun.apply("Filologo");
		System.out.println(emp2);
		
		BiFunction<String,Integer,Empleado> biFun = 
									(name,age) -> new Empleado(name,age); 
		Empleado emp3 = biFun.apply("Aristobulo",20);
		System.out.println(emp3);
		
		TriFunction<String,Integer,Double,Empleado> triFun = 
							(name,age,salary) -> new Empleado(name,age,salary);
		Empleado emp4 = triFun.apply("Urbano",20,100.50);
		System.out.println(emp4);
	}

}
