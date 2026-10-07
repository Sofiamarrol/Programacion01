package actividades;

import java.util.Scanner;

public class Actividad_8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Introduce un número: ");
		int numero1 = scanner.nextInt() ;
		
		
		System.out.println("Introduce otro número: ");
		int numero2 = scanner.nextInt() ;
		
		int diferencia = numero1 - numero2 ;
		
		Math.absExact(diferencia) ;
		
		System.out.println("La distancia entre ellos es: " +Math.absExact(diferencia) ) ;
		
	}

}
