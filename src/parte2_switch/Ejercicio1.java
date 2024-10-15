package parte2_switch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int nota;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime cuanta nota tienes");
		nota = sc.nextInt();

		switch (nota) {

		case 0, 1, 2, 3, 4 -> System.out.println("Suspenso");
		case 5 -> System.out.println("Suficiente");
		case 6 -> System.out.println("Bien");
		case 7, 8 -> System.out.println("Notable");
		case 9, 10 -> System.out.println("Sobresaliente");
		default -> System.out.println("Ese numero no esta entre el 0 y 10");
		}
		sc.close();

	}

}
