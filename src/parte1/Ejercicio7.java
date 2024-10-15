package parte1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double numero;

		System.out.println("Dime un numero entre 0 y 99999");
		numero = sc.nextInt();

		/*
		 * Comprobamos si el numero es mayor que los numeros de 4,3,2,1 cifras, si el
		 * numero es mayor que alguno, este tendra una cifra mas, es decir que si el
		 * numero tiene menos que 5 cifras pero mas que 3 tendra 4 cifras.
		 */
		if (numero > 9999 && numero < 100000) {
			System.out.println("Tu numero tiene 5 cifras");
		} else if (numero > 999 && numero < 100000) {
			System.out.println("Tu numero tiene 4 cifras");
		} else if (numero > 99 && numero < 100000) {
			System.out.println("Tu numero tiene 3 cifras");
		} else if (numero > 9 && numero < 100000) {
			System.out.println("Tu numero tiene 2 cifras");
		} else if (numero >= 0 && numero < 100000) {
			System.out.println("Tu numero tiene 1 cifra");
		} else {
			System.out.println("Tu numero NO esta entre el 0 y 99999");
		}

		sc.close();
	}

}
