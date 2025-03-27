package com.tryresource.v2;

public class Principal {

	public static void main(String[] args)  {
		System.out.println("V2");
		
		//Effective final
		ConexionMongoDb conn = new ConexionMongoDb("Atlas"); 

		try (conn) {
			conn.open();
			System.out.println("Operaciones con MongoDb...");
		} 
		
		System.out.println("Fin de programa");
		//conn = null;
		
	}

}
