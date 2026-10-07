package holamundo;

import java.util.Scanner;

public class Diapositiva73 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Dime la primera nota: ");
		int nota1 = scanner.nextInt();
		
		System.out.println("Dime la segunda nota: ");
		
	int nota2 = scanner.nextInt();
	
	double mediaAritmetica = (nota1 + nota2)/ 2 ;
System.out.println("La media aritmetica de las dos notas es 3%f \n" +mediaAritmetica);


		
	}

}
