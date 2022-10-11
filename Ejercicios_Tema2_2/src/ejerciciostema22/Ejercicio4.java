package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String dado1, dado2, UNO = null, DOS = null, TRES = null, CUATRO = null , CINCO = null, SEIS = null;
		int respuesta;
		
		UNO.equals(1);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Responda usando 'UNO', 'DOS',...,'SEIS'");
		System.out.print("Cuanto ha sacado en la primera tirada?: ");
		dado1 = sc.nextLine();
		switch(dado1) {
		case "UNO","DOS", "TRES", "CUATRO", "CINCO", "SEIS":
			System.out.print("Cuanto ha sacado en la segunda tirada?: ");
			dado2 = sc.nextLine();
			switch(dado2) {
				case "UNO","DOS", "TRES", "CUATRO", "CINCO", "SEIS":
					System.out.println(dado1+dado2);
					break;
			default:
				System.out.println("Respuesta invalida");
			}
			
		default:
			System.out.println("Respuesta invalida");
		}

	}

}
