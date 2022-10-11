package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero1, numero2;
		String respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte el primer numero: ");
		numero1 = sc.nextInt();
		System.out.print("Inserte el segundo numero: ");
		numero2 = sc.nextInt();
		
		System.out.println("A continuación se le mostrara una lista de acciones posibles para realizar");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		System.out.print("¿Qué acción desea realizar? ");
		respuesta = sc.next();
		
		switch(respuesta) {
		case "A": System.out.println(numero1+numero2); break;
		case "B": System.out.println(numero1-numero2); break;
		case "C": System.out.println(numero1*numero2); break;
		case "D": System.out.println(numero1/numero2); break;
		
		default:
			System.out.println("Su respuesta no es valida");
		}
		
		sc.close();
	}

}
