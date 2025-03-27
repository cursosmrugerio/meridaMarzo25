package clase.neww.v2;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;


public class Principal {

	public static void main(String[] args) {

		Supplier<Empleado> sup = Empleado::new; 
		Empleado emp1 = sup.get();
		System.out.println(emp1);
		
		Function<String,Empleado> fun = Empleado::new; 
		Empleado emp2 = fun.apply("Filologo");
		System.out.println(emp2);
		
		BiFunction<String,Integer,Empleado> biFun = Empleado::new; 
		Empleado emp3 = biFun.apply("Aristobulo",20);
		System.out.println(emp3);
	}

}
