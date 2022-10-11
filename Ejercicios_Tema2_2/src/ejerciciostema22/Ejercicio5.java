package ejerciciostema22;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Que tipo de carnet tiene? ");
		respuesta = sc.next();
		
		
		switch(respuesta) {
		case "E": System.out.println("Dispone de un carnet de remolques"); break;
		case "D": System.out.println("Dispone de un carnet de autobuses"); break;
		case "C1", "C2", "C3", "C4" , "C5": System.out.println("Dispone de un carnet de camiones");
		break;
		case "A": System.out.println("Dispone de un carnet de motocicletas"); break;
		case "B1", "B2": System.out.println("Dispone de un carnet de automóviles"); break;
		
		default:
			System.out.println("Categoría no contemplada");
		}
		
		sc.close();
	}

}
