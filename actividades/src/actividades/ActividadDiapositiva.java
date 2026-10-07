package actividades;

import java.util.Scanner;

public class ActividadDiapositiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Dime un número entero: ");
		int numero1 = scanner.nextInt(); 
		
		System.out.println("Dime otro número entero: ");
		int numero2 = scanner.nextInt(); 
		
		boolean resultado1 = numero1 != numero2 || numero1==0 || numero2 == 0 ;
		
		
		System.out.println("Ambos son distintos entre si o alguno de ellos es 0 : "+resultado1);
		
		
		/*Diseñar una aplicación 
		 * que solicite al usuario un número e indique si
		 *  es par o impar.Haciendo uso del if podemos
		 *   mostrar como resultado final:
		 *   “Es par”
		 *   “Es impar”
		 */

Scanner scanner2 = new Scanner(System.in) ;

		System.out.println("Introduce un número: ");
		int numero = scanner.nextInt() ;
		
		if (numero % 2 == 0 ) {
			System.out.println("Es par");
		}
		
		if (numero % 2 != 0 ) {
			System.out.println("Es impar");
		}

		
		/*Pedir dos números enteros 
		 * y decir si son iguales o no.
		 */

		Scanner scanner3 = new Scanner(System.in) ;

		System.out.println("Introduce un número: ");
		int numeroEntero1 = scanner.nextInt() ;
		
		System.out.println("Introduce un número: ");
		int numeroEntero2 = scanner.nextInt() ;
		
		
		if (numeroEntero1 == numeroEntero2 ) {
			System.out.println("Son iguales");
		}
		
		if (numeroEntero1 != numeroEntero2 ) {
			System.out.println("No son iguales");
		}
		
		/* Solicitar dos números enteros 
		 * y mostrar cuál es el mayor
		 */
		
		Scanner scanner4 = new Scanner(System.in) ;

		System.out.println("Introduce un número: ");
		int numeroEntero3 = scanner.nextInt() ;
		
		System.out.println("Introduce un número: ");
		int numeroEntero4 = scanner.nextInt() ;
		
		
		if (numeroEntero3 > numeroEntero4 ) {
			System.out.println("El mayor es: " + numeroEntero3);
		}
		
		if (numeroEntero3 < numeroEntero4 ) {
			System.out.println("El mayor es: " + numeroEntero4);
		}
		if (numeroEntero3 == numeroEntero4 ) {
			System.out.println("Son iguales" );
		}
		
		/*Escribir una aplicación que indique 
		 * cuántas cifras tiene un número entero
		 *  introducido por teclado que estará comprendido 
		 *  entre 0 y 99999.
		 */

		Scanner scanner5 = new Scanner(System.in) ;

		System.out.println("Introduce un número: ");
		int numeroAleatorio = scanner5.nextInt() ;
		
		if (numeroAleatorio >= 0 && numeroAleatorio <= 99999) {
            if (numeroAleatorio < 10) {
		System.out.println("El número es de una cifra");
            } else if (numeroAleatorio < 100) { 
            System.out.println("El número es de dos cifras");
            }
            else if (numeroAleatorio <1000) {
            	System.out.println("El numero es de tres cifras");
            }
            else if (numeroAleatorio < 10000) {
            	System.out.println("El numero es de cuatro cifras");
            }
            else if (numeroAleatorio < 1000000) {
            	System.out.println("El número es de cinco cifras");
            }
            else if (numeroAleatorio > 1000000) {
            	System.out.println("Has introducido uno fuera del rango.");
            
            }
            }
		
		/*Pedir tres números y mostrarlos 
		 * ordenados de mayor a menor
		 */

		Scanner scanner6 = new Scanner(System.in) ;
		
		System.out.println("dime un numero: ");
		int a = scanner6.nextInt() ;
		
		System.out.println("dime otro numero: ");
		int b = scanner6.nextInt() ;
		
		System.out.println("dime otro numero: ");
		int c = scanner6.nextInt() ;
		
		
		// A > B > C
		if (a > b && b > c) {
			System.out.printf("%d > %d > %d \n", a, b , c);
		}
		// A > C > B 
		else if ( a > c && c > b) {
			System.out.printf("%d > %d > %d \n", a, c , b);
		}
		// B > A > C 
		else if ( b > a && a > c) {
			System.out.printf("%d > %d > %d \n", b, a , c);
		}
		// B > C > A
		else if ( b > c && c > a) {
			System.out.printf("%d > %d > %d \n", b, c , a);
		}
		// C > B > A
		else if ( c > b && b > a) {
			System.out.printf("%d > %d > %d \n", c, b , a);
		}
		// C > A > B
		else if ( c > a && a > b) {
			System.out.printf("%d > %d > %d \n", c, a , b);
		}
		else {
			
		}
		
		
		
	}
	

}
