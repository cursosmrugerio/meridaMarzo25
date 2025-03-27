package clase.neww.v1;

import java.util.function.Supplier;
import java.util.function.Function;

public class Principal {

	public static void main(String[] args) {

		Supplier<Empleado> sup = Empleado::new; 
		Empleado emp1 = sup.get();
		System.out.println(emp1);
		
		//Function<String,Empleado> fun = s -> new Empleado(s);
		Function<String,Empleado> fun = Empleado::new; 
		Empleado emp2 = fun.apply("Filologo");
		System.out.println(emp2);
	}

}
