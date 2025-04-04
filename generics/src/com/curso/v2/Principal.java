package com.curso.v2;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		List<Object> listaObjects = new ArrayList<>();
		listaObjects.add(new Object());
		listaObjects.add("Hello");
		listaObjects.add(new StringBuilder("Hola"));
		listaObjects.add(new Figura(0));
		listaObjects.add(new Circulo(0));
		//System.out.println("***Lista Objects");
		//show(listaObjects); //NO SE PUEDE
		
		List<String> listaStrings = new ArrayList<>();
		listaStrings.add("Hello");
		listaStrings.add("World");
		//System.out.println("***Lista String");
		//show(listaStrings); //NO SE PUEDE
		
		List<Figura> listaFiguras = new ArrayList<>();
		listaFiguras.add(new Figura(0));
		listaFiguras.add(new Circulo(0));
		listaFiguras.add(new Cuadrado(0));
		//showObject(listaFiguras); //NO SE PUEDE
		System.out.println("***Lista Figura");
		show(listaFiguras);
		
		List<Circulo> listaCirculo = new ArrayList<>();
		listaCirculo.add(new Circulo(1));
		listaCirculo.add(new Circulo(1));
		listaCirculo.add(new Circulo(1));
		System.out.println("***Lista Circulo");
		show(listaCirculo);

		List<Cuadrado> listaCuadrado = new ArrayList<>();
		listaCuadrado.add(new Cuadrado(1));
		listaCuadrado.add(new Cuadrado(1));
		listaCuadrado.add(new Cuadrado(1));
		System.out.println("***Lista Cuadrado");
		show(listaCuadrado);
		
		List<Triangulo> listaTriangulo = new ArrayList<>();
		listaTriangulo.add(new Triangulo(1));
		listaTriangulo.add(new Triangulo(1));
		listaTriangulo.add(new Triangulo(1));
		System.out.println("***Lista Triangulo");
		show(listaTriangulo);
	}
	
	//<? extends Class> UpperBounded Wildcard
	static void show(List<? extends Figura> lista) {
		//lista.add(new Triangulo(2.0)); //NO SE PUEDE
		for(Figura f: lista)
			System.out.println(f);
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

