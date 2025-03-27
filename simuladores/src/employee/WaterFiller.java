package employee;

import aquarium.Water; 
import aquarium.jellies.*;

//import aquarium.*; 
//import aquarium.jellies.Water;

//import aquarium.*; 
//import aquarium.jellies.*;

//import aquarium.Water; 
//import aquarium.jellies.Water;

public class WaterFiller {
	Water water1 = new Water();
	aquarium.jellies.Water water2 = new aquarium.jellies.Water();
	
	public static void main(String[] args) {
		System.out.println(new WaterFiller().water1.salty);
		System.out.println(new WaterFiller().water2.salty);
	}
}
