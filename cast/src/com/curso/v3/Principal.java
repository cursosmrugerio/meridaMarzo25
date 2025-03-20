package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		System.out.println("***AVE***");
		Ave ave0 = new Ave(); //AVE
		System.out.println(ave0.tipo);
		ave0.volarAve(); 
		
		System.out.println("***PATO***");
		Ave ave1 = new Pato();
		ave1.volar(); 
		System.out.println(ave1.tipo); //Ave
		System.out.println(((Pato)ave1).tipo); //Pato
		((Pato)ave1).volarPato(); 
		
		System.out.println("***PATO SILVESTRE***");
		Ave ave2 = new PatoSilvestre(); 
		System.out.println(ave2.tipo); //Ave
		System.out.println(((Pato)ave2).tipo); //Pato
		System.out.println(((PatoSilvestre)ave2).tipo); //PatoSilvestre
		((Pato)ave2).volarPato(); 
		((PatoSilvestre)ave2).volarPatoSilvestre(); 
	}

}
