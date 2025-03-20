package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		Ave ave0 = new Ave();
		ave0.volar(); //Ave volar
		ave0.volarAve(); 
		
		System.out.println("***PATO***");
		Ave ave1 = new Pato();
		ave1.volar(); //Pato volar
		ave1.volarAve();
		((Pato)ave1).volarPato(); 
		//((PatoSilvestre)ave1).volarPato(); 
		
		System.out.println("***PATO SILVESTRE***");
		Ave ave1A = new Pato();
		ave1A.volar(); //Pato volar
		ave1A.volarAve();
		((Pato)ave1A).volarPato(); 
		((PatoSilvestre)ave1A).volarPato();
		
		Ave ave2 = new PatoSilvestre();
		ave2.volar(); //PatoSilvestre volar
		((PatoSilvestre)ave2).volarPatoSilvestre(); 
	}

}
