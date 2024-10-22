package parte5dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * Creamos las variables jugador 1 y 2 para almacenar las respuestas de ambas
		 * personas, tambien el String de seguir para saber si los jugadores quieren
		 * continuar la partida, abrimos el scanner para leer al usuario
		 */
		String jugador1;
		String jugador2;
		String seguir;

		Scanner sc = new Scanner(System.in);

		/*
		 * realizamos el ejercicio de piedra papel o tijeras de los ejercicios del
		 * switch, pero metemos todo en un do-while para preguntar al final si los
		 * jugadores quieren seguir jugando, en caso afirmativo se repetira todo el
		 * codigo
		 */
		do {

			do {
				System.out.println("Jugador 1 elija Piedra, Papel o tijeras");
				jugador1 = sc.next();
			} while (!jugador1.equalsIgnoreCase("piedra") && !jugador1.equalsIgnoreCase("papel")
					&& !jugador1.equalsIgnoreCase("tijeras"));

			do {
				System.out.println("Jugador 2 elija Piedra, Papel o tijeras");
				jugador2 = sc.next();
			} while (!jugador2.equalsIgnoreCase("piedra") && !jugador2.equalsIgnoreCase("papel")
					&& !jugador2.equalsIgnoreCase("tijeras"));

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

			System.out.println("Quieres seguir jugando?");
			seguir = sc.next();
		} while (seguir.equalsIgnoreCase("S"));

		//cerramos el scanner
		sc.close();
	}

}
