package com.curso.v6;

enum TIPO_COMPUTADORA{
	WINDOWS("Alto"){
		@Override
		String getLicencia() {
			return "ABC123";
		}
	},
	LINUX("Bajo"){
		@Override
		String getLicencia() {
			return "XYZ456";
		}
	},
	MAC("Muy Alto"){
		@Override
		String getLicencia() {
			return "PIY123";
		}
	},
	DUMMY("No aplica"){
		@Override
		String getLicencia() {
			return "UYT999";
		}
	};
	
	String costo;
	
	//PRIVATE
	TIPO_COMPUTADORA(String costo) {
		this.costo = costo;
	}
	
	String getCosto() {
		return costo;
	}
	
	abstract String getLicencia();
	
}

public class Principal {

	public static void main(String[] args) {
		System.out.println("V6 ENUM");
		
		TIPO_COMPUTADORA tc = TIPO_COMPUTADORA.LINUX;
		System.out.println(tc.name());
		System.out.println(tc.getCosto());
		System.out.println(tc.getLicencia());

		System.out.println("*********");

		for (TIPO_COMPUTADORA tipo: TIPO_COMPUTADORA.values()) {
			System.out.println(tipo.toString());
			System.out.println(tipo.ordinal());
			System.out.println(tipo.name());
			System.out.println("*********");


		}
	}

}
