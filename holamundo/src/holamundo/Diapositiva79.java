package holamundo;

import java.util.Scanner;

public class Diapositiva79 {

	public static void main(String[]args) {
		
		Scanner scanner = new Scanner (System.in) ;
		
		System.out.println("Introduce tu edad: ");
		int edad = scanner.nextInt() ;
		
		boolean edadLaboral = (edad >=16 && edad < 67) ;
		
		System.out.println("Está en edad laboral: " +edadLaboral);
		
	}
	
			{
	}
}
