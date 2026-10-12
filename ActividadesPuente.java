package actividades;

import java.util.Scanner;

public class ActividadesPuente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in) ;
		
		System.out.println("Introduce el primer número: ");
		double numero1 = scanner.nextDouble() ;
		
		System.out.println("Ingresar operador (-,+,*,/): ");
		String operador = sc.next() ;
		
		
		System.out.println("Introduce el segundo número: ");
		double numero2 = scanner.nextDouble() ;
		
		double resultado = 0;
        boolean operacionValida = true;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
               
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Error: Operador no válido.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + numero1 + " " + operador + " " + numero2 + " = " + resultado);
        }
        sc.close();
    }
		
		
	//Diapositiva 114
	
	         Scanner sc = new Scanner(System.in);
	       
	        int num = sc.nextInt();

	        if (num < 0 || num > 9999) {
	            System.out.println("El número está fuera del rango permitido.");
	        } else {
	            boolean esCapicua = false;

	            if (num < 10) {
	                esCapicua = true;
	            } else if (num < 100) {
	                if (num / 10 == num % 10) {
	                    esCapicua = true;
	                }
	            } else if (num < 1000) {
	                if (num / 100 == num % 10) {
	                    esCapicua = true;
	                }
	            } else {
	                int millar = num / 1000;
	                int unidad = num % 10;
	                int centena = (num / 100) % 10;
	                int decena = (num / 10) % 10;

	                if (millar == unidad && centena == decena) {
	                    esCapicua = true;
	                }
	            }

	            if (esCapicua) {
	                System.out.println("El número " + num + " SÍ es capicúa.");
	            } else {
	                System.out.println("El número " + num + " NO es capicúa.");
	            }
	        }
	        sc.close();
	    }
	


//Ejercicio DNI

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Introduce el número de DNI (8 dígitos): ");
        int dni = sc4.nextInt();

        char[] letrasDNI = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
            'C', 'K', 'E'
        };

        int resto = dni % 23;

        char letraCalculada = letrasDNI[resto];

        System.out.println("El DNI completo es: " + dni + "-" + letraCalculada) 
        
           //Ejercicio animales
      
                Scanner sc6 = new Scanner(System.in);

                System.out.println("Introduce la cantidad de comida diaria disponible (kg): ");
                double comidaDiaria = sc.nextDouble();

                System.out.println("Introduce el número de animales: ");
                int numAnimales = sc.nextInt();

                System.out.println("Introduce los kilos que come cada animal de media: ");
                double kilosPorAnimal = sc.nextDouble();

                // Evitar división por cero si no hay animales
                if (numAnimales <= 0) {
                    System.out.println("Error: El número de animales debe ser mayor que cero.");
                } else {
                    // Calcular la comida total necesaria
                    double comidaNecesaria = numAnimales * kilosPorAnimal;

                    if (comidaDiaria >= comidaNecesaria) {
                        System.out.println("¡Hay suficiente comida para todos los animales!");
                    } else {
                        System.out.println("No hay suficiente comida para la cantidad ideal.");
                        // Calculamos la ración que le toca a cada uno con lo que hay
                        double racionActual = comidaDiaria / numAnimales;
                        System.out.println("A cada animal le corresponde una ración ajustada de: " + racionActual + " kg.");
                    }
                }

                sc.close();
            }
        }
		
		
	//numeros a español
        
        
        import java.util.Scanner;

        public class EjercicioNumeroALetras {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Introduce un número comprendido entre 1 y 99: ");
                int num = sc.nextInt();

                if (num < 1 || num > 99) {
                    System.out.println("El número está fuera del rango permitido (1-99).");
                } else {
                    int decenas = num / 10;
                    int unidades = num % 10;

                    // Casos especiales para números del 11 al 15 (o hasta el 19 si se prefiere)
                    if (num >= 11 && num <= 15) {
                        switch (num) {
                            case 11: System.out.println("once"); break;
                            case 12: System.out.println("doce"); break;
                            case 13: System.out.println("trece"); break;
                            case 14: System.out.println("catorce"); break;
                            case 15: System.out.println("quince"); break;
                        }
                    } else {
                        // Imprimir la decena
                        switch (decenas) {
                            case 1:
                                if (unidades == 0) System.out.print("diez");
                                else if (unidades == 6) System.out.print("dieciséis");
                                else if (unidades == 7) System.out.print("diecisiete");
                                else if (unidades == 8) System.out.print("dieciocho");
                                else if (unidades == 9) System.out.print("diecinueve");
                                else System.out.print("dieci");
                                break;
                            case 2:
                                if (unidades == 0) System.out.print("veinte");
                                else if (unidades == 6) { System.out.print("veintiséis"); unidades = 0; }
                                else if (unidades == 7) { System.out.print("veintisiete"); unidades = 0; }
                                else if (unidades == 8) { System.out.print("veintiocho"); unidades = 0; }
                                else if (unidades == 9) { System.out.print("veintinueve"); unidades = 0; }
                                else { System.out.print("veinti"); }
                                break;
                            case 3: System.out.print(unidades == 0 ? "treinta" : "treinta y "); break;
                            case 4: System.out.print(unidades == 0 ? "cuarenta" : "cuarenta y "); break;
                            case 5: System.out.print(unidades == 0 ? "cincuenta" : "cincuenta y "); break;
                            case 6: System.out.print(unidades == 0 ? "sesenta" : "sesenta y "); break;
                            case 7: System.out.print(unidades == 0 ? "setenta" : "setenta y "); break;
                            case 8: System.out.print(unidades == 0 ? "ochenta" : "ochenta y "); break;
                            case 9: System.out.print(unidades == 0 ? "noventa" : "noventa y "); break;
                        }

                        // Imprimir la unidad (siempre que no se haya impreso ya en los casos especiales)
                        if (decenas != 1 && (decenas != 2 || unidades != 0)) {
                            switch (unidades) {
                                case 1: System.out.print("uno"); break;
                                case 2: System.out.print("dos"); break;
                                case 3: System.out.print("tres"); break;
                                case 4: System.out.print("cuatro"); break;
                                case 5: System.out.print("cinco"); break;
                                case 6: System.out.print("seis"); break;
                                case 7: System.out.print("siete"); break;
                                case 8: System.out.print("ocho"); break;
                                case 9: System.out.print("nueve"); break;
                            }
                        }
                        System.out.println();
                    }
                }
            }
            
            //Juego de la suma
            
            import java.util.Scanner;
            import java.util.Random;

            public class JuegoDeLaSuma {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Random rand = new Random();

                    // Generamos dos números aleatorios entre 1 y 99
                    int num1 = rand.nextInt(99) + 1;
                    int num2 = rand.nextInt(99) + 1;

                    // Mostramos la operación al usuario
                    System.out.print("¿Cuánto es " + num1 + " + " + num2 + "?: ");
                    int respuestaUsuario = sc.nextInt();

                    int sumaReal = num1 + num2;

                    // Comprobamos si acertó
                    if (respuestaUsuario == sumaReal) {
                        System.out.println("¡Correcto! Has acertado la suma.");
                    } else {
                        System.out.println("Incorrecto. El resultado correcto era: " + sumaReal);
                    }

                    sc.close();
                }
                
            
            }
            
            
            import java.util.Scanner;

            public class GradosARadianes {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    System.out.print("Introduce los grados del ángulo: ");
                    double grados = sc.nextDouble();

                    // Ajustar el ángulo al rango de 0° a 360° usando el operador módulo
                    grados = grados % 360;
                    if (grados < 0) {
                        grados = grados + 360; // Maneja por si el usuario introduce un número negativo
                    }

                    // Convertir los grados normalizados a radianes
                    double radianes = grados * Math.PI / 180;

                    System.out.println("Ángulo ajustado: " + grados + "°");
                    System.out.println("Su equivalente en radianes es: " + radianes);

                    sc.close();
                }
            }
            
            
            
            
            
            
        }
                
               
            
        

