package com.curso.v0;

import java.util.Arrays;

public class PrincipalVarArgs {
	
	public static void main(String[] args) {
		
		PrincipalVarArgs principal = new PrincipalVarArgs();
		principal.show(args);
		principal.show();
		principal.show("1"); //<<
		principal.show("1","2","3","4");
		
	}

	//SOBRECARGA
//	void show(String cadenas) {
//		
//	}
//	void show(String[] cadenas) {
//		
//	}
	void show(String... cadenas) {
		System.out.println("Entro a los Varargs");
		System.out.println(Arrays.toString(cadenas));
		System.out.println("--------------");
	}
}
