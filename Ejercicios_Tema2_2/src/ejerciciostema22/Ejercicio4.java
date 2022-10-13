package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String dado1, dado2;
		int respuesta1=0, respuesta2=0;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Responda usando 'UNO', 'DOS',...,'SEIS'");
		System.out.print("Cuanto ha sacado en la primera tirada?: ");
		dado1 = sc.next();
		System.out.print("Cuanto ha sacado en la segunda tirada?: ");
		dado2 = sc.next();
		switch(dado1) {
		case "UNO": respuesta1 = 1; break;
		case "DOS": respuesta1 = 2; break;
		case "TRES": respuesta1 = 3; break;
		case "CUATRO": respuesta1 = 4; break;
		case "CINCO": respuesta1 = 5; break;
		case "SEIS":respuesta1 = 6; break;
		default:
			System.out.println("Respuesta invalida");
			}
			
		switch(dado2) {
		case "UNO": respuesta2 = 1; break;
		case "DOS": respuesta2 = 2; break;
		case "TRES": respuesta2 = 3; break;
		case "CUATRO": respuesta2 = 4; break;
		case "CINCO": respuesta2 = 5; break;
		case "SEIS":respuesta2 = 6; break;
		default:
			System.out.println("Respuesta invalida");
		}
		
		System.out.println(respuesta1+respuesta2);
		sc.close();

	}

}
