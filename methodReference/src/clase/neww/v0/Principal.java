package clase.neww.v0;

import java.util.function.Supplier;

public class Principal {

	public static void main(String[] args) {

		//Empleado emp1 = new Empleado();
		
		//Supplier<Empleado> sup = () -> new Empleado();
		Supplier<Empleado> sup = Empleado::new; //Method Reference
		Empleado emp1 = sup.get();
		System.out.println(emp1);
		
		
	}

}
