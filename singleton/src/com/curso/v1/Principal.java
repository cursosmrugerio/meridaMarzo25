package com.curso.v1;

public class Principal {
	
	public static void main(String[] args) {
		ConexionMongoDb conn1 = ConexionMongoDb.getInstance();
		System.out.println(conn1);
		
		ConexionMongoDb conn2 = ConexionMongoDb.getInstance();
		ConexionMongoDb conn3 = ConexionMongoDb.getInstance();

		ConexionMongoDb conn999 = ConexionMongoDb.getInstance();
		System.out.println(conn999);

		
		System.out.println(conn1 == conn999); 
		System.out.println(conn1 == conn3); 
		System.out.println(conn2 == conn999); 

	}

}
