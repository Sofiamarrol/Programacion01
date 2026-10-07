package actividades;

import java.util.Scanner;

public class Actividad_21 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Introduce tu primera nota: ");
		int nota1 = scanner.nextInt() ;
		
		System.out.println("Introduce tu segunda nota: ");
		int nota2 = scanner.nextInt() ;
		
		System.out.println("Introduce tu tercera nota: ");
		int nota3 = scanner.nextInt() ;
		
		int suma = nota1 + nota2 + nota3 ;
		int promedio = suma / 3 ;
		
		boolean aprobado = (promedio >= 5) ;
		
		String mensaje = (aprobado= true && nota1>3 && nota2>3 && nota3>3) ? "Aprobado" : "Suspenso" ;
		
		System.out.println(mensaje);
	}

}
