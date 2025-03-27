package clase.statico.v1;

import java.util.function.BiFunction;

public class Principal {

	public static void main(String[] args) {

		Empleado e = new Empleado("Nereo",25,100.00);
		
		System.out.println(e);
		
		BiFunction<Empleado,Double,Empleado> bf = Empleado::addSueldo;
					
		bf.apply(e,55.0);
		
		System.out.println(e);

	}

}
