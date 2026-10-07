package holamundo;

import java.util.Scanner;

public class Diapositiva78 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Introduce un número: ");
		int numero = scanner.nextInt()  ; 
		
		boolean par =  (numero %2 <= 0 ) ;
		
		System.out.println("el numero es par: " + par);
		
	}

}
