package actividades;

import java.util.Scanner;

public class Actividad_18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Introduce cuantas monedas tienes de 2euros: ");
		int Monedas2e = scanner.nextInt() ;
		
		System.out.println("Introduce cuantas monedas tienes de 1euro: ");
		int Monedas1e = scanner.nextInt() ;
		
		System.out.println("Introduce cuantas monedas tienes de 50centimos: ");
		int Monedas50c = scanner.nextInt() ;
		
		System.out.println("Introduce cuantas monedas tienes de 20centimos: ");
		int Monedas20c = scanner.nextInt() ;
		
		System.out.println("Introduce cuantas monedas tienes de 10centimos: ");
		int Monedas10c = scanner.nextInt() ;

		int euros = (200 * Monedas2e) + (100 * Monedas1e) ;
		
		int centimos = (50 * Monedas50c) + (20 * Monedas20c) + (10 * Monedas10c) ;
		
		System.out.printf("Usted tiene un total de %d euros y %d centimos  \n", euros/100, centimos%100  ) ;
		
	}

}
