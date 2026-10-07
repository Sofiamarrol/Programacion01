  package holamundo;

import java.util.Scanner;

public class Diapositiva80 {

	Scanner scanner = new Scanner (System.in) ;

		System.out.println("Está lloviendo?") ; 
		boolean lluvia = scanner.nextBoolean();

		System.out.println("Has terminado las tareas?"); 
		boolean tareas = scanner.nextBoolean();
		
		System.out.println("Tienes que ir a la biblioteca?"); 
		boolean biblio = scanner.nextBoolean();
		
		boolean salir = (biblio || tareas && lluvia) ;
		
		System.out.println("Puedes salir a la calle: " +salir); 
}
	
	


