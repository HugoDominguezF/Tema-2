package parte7bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int numero;
		int resto;
		int invertido;
		int numFinal;

		Scanner sc = new Scanner(System.in);

		invertido = 0;

		System.out.println("Dime un numero y comprobare si es capicua");
		numero = sc.nextInt();

		numFinal = numero;
		if (numFinal >= 0) {
			while (numFinal > 0) {

				resto = numFinal % 10;
				invertido = invertido * 10 + resto;
				numFinal /= 10;
			}

			if (invertido == numero) {
				System.out.println("El numero es capicua");
			} else {
				System.out.println("El numero no es capicua");
			}
		} else {
			System.out.println("El numero no es positivo");
		}

		sc.close();
	}
}
