package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Nombramos las variables como cadenas
		String dado1, dado2;
		//Nombramos las variables como numeros enteros y las inicializamos a 0
		int respuesta1=0, respuesta2=0;
	
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Mostramos al usuario las posibles respuestas que puede proporcionar
		System.out.println("Responda usando 'UNO', 'DOS',...,'SEIS'");
		//Preguntamos al usuario por la primera tirada
		System.out.print("Cuanto ha sacado en la primera tirada?: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "dado1"
		dado1 = sc.next();
		//Preguntamos al usuario por la primera tirada
		System.out.print("Cuanto ha sacado en la segunda tirada?: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "dado2"
		dado2 = sc.next();
		
		/*Creamos un switch para el primer dado y dependiendo de la respuesta le damos valores
		diferentes a la variable "respuesta1"*/
		switch(dado1) {
		case "UNO": respuesta1 = 1; break;
		case "DOS": respuesta1 = 2; break;
		case "TRES": respuesta1 = 3; break;
		case "CUATRO": respuesta1 = 4; break;
		case "CINCO": respuesta1 = 5; break;
		case "SEIS":respuesta1 = 6; break;
		/*En caso de que el valor introducido no esté dentro del parámetro, muestra un mensaje de
		error*/
		default:
			System.out.println("Respuesta invalida");
			}
		/*Creamos un switch para el segundo  dado y dependiendo de la respuesta le damos valores
		diferentes a la variable "respuesta2"*/	
		switch(dado2) {
		case "UNO": respuesta2 = 1; break;
		case "DOS": respuesta2 = 2; break;
		case "TRES": respuesta2 = 3; break;
		case "CUATRO": respuesta2 = 4; break;
		case "CINCO": respuesta2 = 5; break;
		case "SEIS":respuesta2 = 6; break;
		/*En caso de que el valor introducido no esté dentro del parámetro, muestra un mensaje de
		error*/
		default:
			System.out.println("Respuesta invalida");
		}
		//Mostramos por consola la suma de los dados
		System.out.println(respuesta1+respuesta2);
		//Cerramos el scanner
		sc.close();

	}

}
