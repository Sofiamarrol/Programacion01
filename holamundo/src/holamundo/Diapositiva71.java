package holamundo;

import java.util.Scanner;

public class Diapositiva71 {
	
	public static void main(String[] args) {
		//Pedir al usuario su edad y mostrar la que tendrá el proximo año
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Dime tu edad: ");
		
		int edad = scanner.nextInt();
		
		edad++; 
		
		System.out.printf("El próximo año tendrás %d años \n", edad);
		
	}
	
}
