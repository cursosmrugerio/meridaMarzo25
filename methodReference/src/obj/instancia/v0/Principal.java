package obj.instancia.v0;

import java.util.function.BiConsumer;
import java.util.function.UnaryOperator;


public class Principal {

	public static void main(String[] args) {

		Empleado e = new Empleado("Nereo",25,100.00);
		
		System.out.println(e);
		
		//BiConsumer<Empleado,Double> con = (t,u) -> t.addSueldo(u);
		BiConsumer<Empleado,Double> con = Empleado::addSueldo;
			
		con.accept(e,20.0);
		
		System.out.println(e);
		
		System.out.println("*************");
		
		String cadena = "hello";
		
		//UnaryOperator<String> sup = t -> t.toUpperCase();
		UnaryOperator<String> sup = String::toUpperCase;
		
		System.out.println(sup.apply(cadena));

	}

}
