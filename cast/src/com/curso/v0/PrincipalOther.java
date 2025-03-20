package com.curso.v0;

import java.util.Random;

public class PrincipalOther {
	
	public static void main(String[] args) {
		Ave ave = getAve();
		ave.volar();
	}

	private static Ave getAve() {
		Ave[] aves = {new Ave(),new Pato(),new PatoSilvestre()};
		int random = new Random().nextInt(aves.length);
		//0,1,2
		Ave ave = aves[random];
		System.out.println(ave.getClass().getSimpleName());
		return ave;
	}

}
