package com.tryresource.v0;

public class Principal {

	public static void main(String[] args)  {

		ConexionMongoDb conn = new ConexionMongoDb("Atlas");
		
		try {
			conn.open();
			//OPERACIONES CON MONGODB
			System.out.println("Operaciones con MongoDb...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Fin de programa");
		
	}

}
