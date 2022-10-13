package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Nombramos la variable como numero entero
		int numero1, numero2;
		//Nombramos la variable como una cadena
		String respuesta;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que inserte el primer numero requerido
		System.out.print("Inserte el primer numero: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero1"
		numero1 = sc.nextInt();
		//Pedimos al usuario que inserte el segundo numero requerido
		System.out.print("Inserte el segundo numero: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero2"
		numero2 = sc.nextInt();
		
		//Presentamos al usuario las posibles opciones que tiene para ejecutar
		System.out.println("A continuación se le mostrara una lista de acciones posibles para realizar");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.print("¿Qué acción desea realizar? ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "respuesta"
		respuesta = sc.next();
		
		/*Creamos un switch y dependiendo de la respuesta anterior ejecuitamos una opción u otra
		y mostramos el resultado por consola*/
		switch(respuesta) {
		case "A": System.out.println(numero1+numero2); break;
		case "B": System.out.println(numero1-numero2); break;
		case "C": System.out.println(numero1*numero2); break;
		case "D": System.out.println(numero1/numero2); break;
		/*En caso de que el valor introducido no esté dentro del parámetro, muestra un mensaje de
		error*/
		default:
			System.out.println("Su respuesta no es valida");
		}
		//Cerramos el scanner
		sc.close();
	}

}
