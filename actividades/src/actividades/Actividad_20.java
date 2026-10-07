package actividades;

import java.util.Scanner;

public class Actividad_20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Introduce tu edad: ");
		int edad = scanner.nextInt() ;
		
		String mensaje = (edad <18 || edad >65) ? "Descuento aplicable" : "Tarifa normal"	;
		
		System.out.println(mensaje);

	}

}
