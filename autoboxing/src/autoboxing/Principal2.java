package autoboxing;

public class Principal2 {

	public static void main(String[] args) {
		
		//CACHE INTEGERS
		//-128 AL 127

		Integer i1 = 127; //Autoboxing
		Integer i2 = 127;
		
		System.out.println(i1==i2); //true
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i3==i4); //false
	}

}
