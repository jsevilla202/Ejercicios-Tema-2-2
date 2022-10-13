package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Nombramos a la variable como cadena
		String respuesta;
		
		//Creamos el scanner y lo llamamos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos al usuario por su tipo de carnet de conducir tiene
		System.out.print("¿Que tipo de carnet de conducir tiene? ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "respuesta"
		respuesta = sc.next();
		
		/*Creamos un switch y dependiendo de la respuesta mostramos por consola el tipo de 
		carnet de conducir que tiene*/
		switch(respuesta) {
		case "E": System.out.println("Dispone de un carnet de remolques"); break;
		case "D": System.out.println("Dispone de un carnet de autobuses"); break;
		case "C1", "C2", "C3", "C4" , "C5": System.out.println("Dispone de un carnet de camiones");
		break;
		case "A": System.out.println("Dispone de un carnet de motocicletas"); break;
		case "B1", "B2": System.out.println("Dispone de un carnet de automóviles"); break;
		/*En caso de que el valor introducido no esté dentro del parámetro, muestra un mensaje de
		error*/
		default:
			System.out.println("Categoría no contemplada");
		}
		//Cerramos el scanner
		sc.close();
	}

}
