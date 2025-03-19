package com.curso.v1;

import com.curso.v0.Cliente;

public class PrincipalCliente extends Cliente {
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		System.out.println(c1.nombre);
		//System.out.println(c1.edad);
		//System.out.println(c1.clave);
		//System.out.println(c1.peso);
		
		PrincipalCliente pc1 = new PrincipalCliente();
		System.out.println(pc1.clave);
		
	}

}
