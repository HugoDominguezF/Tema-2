package parte1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		String jugador1;
		String jugador2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador uno elija piedra,papel o tijeras");
		jugador1 = sc.next();
		System.out.println("Jugador uno elija piedra,papel o tijeras");
		jugador2 = sc.next();

		if (jugador1.equalsIgnoreCase("piedra") && jugador2.equalsIgnoreCase("piedra")) {
			System.out.println("empate");
		} else if (jugador1.equalsIgnoreCase("papel") && jugador2.equalsIgnoreCase("papel")) {
			System.out.println("empate");
		} else if (jugador1.equalsIgnoreCase("tijeras") && jugador2.equalsIgnoreCase("tijeras")) {
			System.out.println("empate");
		} else if (jugador1.equalsIgnoreCase("piedra") && jugador2.equalsIgnoreCase("tijeras")) {
			System.out.println("Gana jugador 1");
		} else if (jugador1.equalsIgnoreCase("tijeras") && jugador2.equalsIgnoreCase("papel")) {
			System.out.println("Gana jugador 1");
		} else if (jugador1.equalsIgnoreCase("papel") && jugador2.equalsIgnoreCase("piedra")) {
			System.out.println("Gana jugador 1");
		} else if (jugador1.equalsIgnoreCase("papel") && jugador2.equalsIgnoreCase("tijeras")) {
			System.out.println("Gana jugador 2");
		} else if (jugador1.equalsIgnoreCase("piedra") && jugador2.equalsIgnoreCase("papel")) {
			System.out.println("Gana jugador 2");
		} else if (jugador1.equalsIgnoreCase("tijeras") && jugador2.equalsIgnoreCase("piedra")) {
			System.out.println("Gana jugador 2");
		}

	}

}
