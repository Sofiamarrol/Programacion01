package actividades;

import java.util.Scanner;

public class Actividad_19 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in) ;
	 System.out.println("Introduce tu edad: ");
	 int edad = scanner.nextInt();
	 
	 
	 System.out.println("¿Tienes pase VIP? (true/false) ");
	 boolean VIP = scanner.nextBoolean() ;
	 
	 String mensaje = ( edad >= 18 || VIP == true)? "Acceso permitdo" : "Acceso denegado";
	 
	 System.out.println(mensaje);
	 
	 
	}
	
}
