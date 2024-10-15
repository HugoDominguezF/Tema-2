package parte1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// declaramos la variable a para saber si es par o impar
		int a;

		Scanner sc = new Scanner(System.in);

		// le preguntamos al usuario un numero que sera el valor de a
		System.out.println("Dime un numero y te dire si es par o impar");
		a = sc.nextInt();

		// comprobamos si a es impar a traves de un modulo
		if (a % 2 == 1) {
			System.out.println("Tu numero es impar");
		} else {
			System.out.println("Tu numero es par");
		}

		// cerramos el scanner
		sc.close();
	}

}
