package clase.instancia.v0;

import java.util.function.Consumer;
import java.util.function.Supplier;


public class Principal {

	public static void main(String[] args) {

		Empleado e = new Empleado("Nereo",25,200.00);
		
		System.out.println(e);
		
		//Consumer<Double> con = x -> e.addSueldo(x);
		Consumer<Double> con = e::addSueldo;
			
		con.accept(60.0);
		
		System.out.println(e);
		
		System.out.println("*************");
		
		String cadena = "hola";
		
		//Supplier<String> sup = () -> cadena.toUpperCase();
		Supplier<String> sup = cadena::toUpperCase;
		
		System.out.println(sup.get());

	}

}
