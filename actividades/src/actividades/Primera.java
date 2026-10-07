package actividades;

import java.util.Scanner;

public class Primera {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Introduce la base: ");
		double Base = scanner.nextInt() ;
		
		System.out.println("Introduce la altura: ");
		double Altura = scanner.nextInt() ;
		
		double perimetro = Base + Base + Altura + Altura ;
		System.out.println("El perimetro del rectangulo es: " + perimetro);
	
		
		double area = Base * Altura ;
		System.out.println("El area del rectangulo es: " +area);
		
	
	}

}
