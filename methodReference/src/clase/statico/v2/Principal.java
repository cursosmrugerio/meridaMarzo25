package clase.statico.v2;

import java.util.function.BiConsumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Function;


public class Principal {

	public static void main(String[] args) {

		System.out.println("***BiConsumer");
		Empleado e = new Empleado("Nereo",25,100.00);
		System.out.println(e);
		BiConsumer<Empleado,Double> bc = Empleado::addSueldo;
		
					//(emp,inc) -> Empleado.addSueldo(emp,inc);
					
		bc.accept(e,55.0);
		System.out.println(e);
		
		System.out.println("************");
		
		//UnaryOperator<Double> uo = d -> Math.cos(d);
		//UnaryOperator<Double> uo = Math::cos;
		//Function<Double,Double> uo = Math::cos;
		DoubleUnaryOperator uo = Math::cos;
		System.out.println( uo.applyAsDouble(.5) ); 
		

	}

}
