package primitivo;

public class Principal {

	public static void main(String[] args) {
		
		int binario = 0B110;
		int hexadecimal = 0xF;
		int octal = 010;
		
		System.out.println("binario: "+binario);
		System.out.println("hexadecimal: "+hexadecimal);
		System.out.println("octal: "+octal);

		int x = 1;
		int y = 010; //octal
		System.out.println(x+y); //9
		
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2);
		
		float f = 8.0f;
		
		char ch1 = 'A';
		System.out.println((int)ch1);
		
		long l1 = 10000000000L;
		System.out.println(l1);
		
		short sh1 = 32_767;
		
		byte b4 = 1;
		byte b5 = 2;
		//byte b6 = b4 + b5;
		
		b5+=b4;
		
		System.out.println(b5);
		
	}

}
