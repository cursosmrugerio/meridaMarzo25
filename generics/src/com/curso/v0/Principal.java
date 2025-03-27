package com.curso.v0;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Object> listaObjects = new ArrayList<>();
		listaObjects.add(new Object());
		listaObjects.add("Hello");
		listaObjects.add(new StringBuilder("Hola"));
		listaObjects.add(new Figura(0));
		listaObjects.add(new Circulo(0));
		System.out.println("***Lista Objects");
		showObject(listaObjects); //SI SE PUEDE
		//show(listaObjects);
		
		List<String> listaStrings = new ArrayList<>();
		listaStrings.add("Hello");
		listaStrings.add("World");
		//showObject(listaStrings); //NO SE PUEDE
		System.out.println("***Lista String");
		show(listaStrings);
		
		List<Figura> listaFiguras = new ArrayList<>();
		listaFiguras.add(new Figura(0));
		listaFiguras.add(new Circulo(0));
		listaFiguras.add(new Cuadrado(0));
		//showObject(listaFiguras); //NO SE PUEDE
		System.out.println("***Lista Figura");
		show(listaFiguras);
	}
	
	static void showObject(List<Object> lista) {
		lista.add(Integer.valueOf(5));
		lista.add(new Triangulo(0));
		for(Object o: lista)
			System.out.println(o);
	}
	
	//<?> Unbounded Wildcard
	static void show(List<?> lista) {
		//lista.add(new Object()); //NO SE PUEDE
		for(Object o: lista)
			System.out.println(o);
	}

}

class Figura{
	private double area;
	public Figura(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
				" [area=" + area + "]";
	}
}
class Circulo extends Figura{
	public Circulo(double area) {
		super(area);
	}
}
class Cuadrado extends Figura{
	public Cuadrado(double area) {
		super(area);
	}
}
class Triangulo extends Figura{
	public Triangulo(double area) {
		super(area);
	}
}

