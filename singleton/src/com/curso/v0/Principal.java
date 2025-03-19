package com.curso.v0;

public class Principal {
	
	public static void main(String[] args) {
		ConexionMongoDb conn1 = new ConexionMongoDb("ERP");
		ConexionMongoDb conn2 = new ConexionMongoDb("ERP");
		ConexionMongoDb conn3 = new ConexionMongoDb("ERP");

		ConexionMongoDb conn999 = new ConexionMongoDb("ERP");
		
		System.out.println(conn1 == conn999); //true


	}

}
