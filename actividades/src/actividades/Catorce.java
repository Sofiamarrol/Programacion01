package actividades;

import java.util.Scanner;

public class Catorce {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in)  ;
		System.out.println("Introduce los minutos: ");
		
		int minutos = scanner.nextInt() ;
		
		int resto = minutos % 2 ;
		
		System.out.printf("Corresponde a : %d horas y %d minutos \n", minutos/60, minutos%60);
		
	}
}
