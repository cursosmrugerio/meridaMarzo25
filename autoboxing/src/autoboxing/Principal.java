package autoboxing;

public class Principal {

	public static void main(String[] args) {

		Integer[] ints = {1,2,3,4,5};
		
		for(int i: ints) {
			
			Integer data = i;
			
			System.out.println(data);
		}
	}

}
