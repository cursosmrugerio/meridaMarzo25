package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
		System.out.println("V2");
		System.out.println("***AVE***");
		Ave ave0 = new Ave();
		ave0.volarAve(); 
		
		System.out.println("***PATO***");
		Ave ave1 = new Pato();
		Pato pato1 = (Pato)ave1;
		pato1.volarPato(); 
		
		System.out.println("***PATO SILVESTRE***");
		Ave ave2 = new PatoSilvestre();
		PatoSilvestre patoSil2 = (PatoSilvestre)ave2;
		patoSil2.volarPatoSilvestre(); 
	}

}
