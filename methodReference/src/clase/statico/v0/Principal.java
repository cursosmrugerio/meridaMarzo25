package clase.statico.v0;

import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {

		Empleado e = new Empleado("Nereo",25,100.00);
		
		System.out.println(e);
		
		BiFunction<Empleado,Double,Empleado> bf =
					(emp,inc) -> Empleado.addSueldo(emp,inc);
					
		bf.apply(e,50.0);
		
		System.out.println(e);

	}

}
