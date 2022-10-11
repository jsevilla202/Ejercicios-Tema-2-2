package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Nombramos la variable como numero entero
		int dia;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca una nota entre 1 y 7
		System.out.print("Introduzca la nota entre 1 y 7, solo valores enteros: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "dia"
		dia = sc.nextInt();
		
		//Creamos un switch para que dependiendo del valor introducido responda un día u otro
		switch(dia) {
		case 1: System.out.println("Lunes"); break;
		case 2: System.out.println("Martes"); break;
		case 3: System.out.println("Miercoles"); break;
		case 4: System.out.println("Jueves"); break;
		case 5: System.out.println("Viernes"); break;
		case 6: System.out.println("Sabado"); break;
		case 7: System.out.println("Domingo"); break;
		
		default:
			System.out.println("El día no es correcto"); break;
		}
		
		sc.close();
	}
}

