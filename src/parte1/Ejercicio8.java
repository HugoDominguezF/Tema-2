package parte1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		double nota;
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime cual nota tienes entre el 0 y 10");
		nota = sc.nextDouble();

		if (nota >= 0 && nota < 5) {
			System.out.println("Suspenso");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("Suficiente");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("Sobresaliente");
		} else
			System.out.println("El numero no esta entre el 0 y 10");

	}

}
