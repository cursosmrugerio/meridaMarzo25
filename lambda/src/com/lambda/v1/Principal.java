package com.lambda.v1;

import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("**********Function***********");

		Function<Double,Double> fun1 = i -> i+10.0; //15.0  //60.0
		Function<Double,Double> fun2 = x -> x*10.0; //150.0 //50.0
		
		Function<Double,Double> fun3 = fun1.andThen(fun2);
		double d1 = fun3.apply(5.0);
		System.out.println(d1); //150.0
		
		Function<Double,Double> fun4 = fun1.compose(fun2);
		double d2 = fun4.apply(5.0);
		System.out.println(d2); //60.0
		
		System.out.println("**********Unary Operator***********");
		
		UnaryOperator<Double> uo1 = i -> i+10.0; //15.0  //60.0
		UnaryOperator<Double> uo2 = x -> x*10.0; //150.0 //50.0
		
		Function<Double,Double> uo3 = uo1.andThen(uo2);
		d1 = uo3.apply(5.0);
		System.out.println(d1); //150.0
		
		Function<Double,Double> uo4 = uo1.compose(uo2);
		d2 = uo4.apply(5.0);
		System.out.println(d2); //60.0
		
	}

}
