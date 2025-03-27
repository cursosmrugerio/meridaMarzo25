package com.tryresource.v1;

public class Principal {

	public static void main(String[] args)  {

		try (ConexionMongoDb conn = new ConexionMongoDb("Atlas")) {
			conn.open();
			System.out.println("Operaciones con MongoDb...");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("Fin de programa");
		
	}

}
