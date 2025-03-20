package com.curso.v4;

import java.util.Random;

public class PrincipalOther2 {
	
	public static void main(String[] args) {
		Ave ave = getAve();
		
		if (ave instanceof Ave a)
			a.volarAve();
		
		if (ave instanceof Aguila a)
			a.volarAguila();
		
		if (ave instanceof Pato p)
			p.volarPato();
		
		if (ave instanceof PatoSilvestre ps)
			ps.volarPatoSilvestre();
		
		System.out.println("Fin Programa");
		
	}

	private static Ave getAve() {
		Ave[] aves = {new Ave(),new Aguila(),new Pato(),new PatoSilvestre()};
		int random = new Random().nextInt(aves.length);
		//0,1,2,3
		Ave ave = aves[random];
		System.out.println(ave.getClass().getSimpleName());
		return ave;
	}

}
