package parte7bucles;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int triangulo;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un numero y hare una piramide");
		triangulo = sc.nextInt();

		for (int contador = 1; contador <= triangulo; contador++) {
			for (int incremento = 1; incremento < contador; incremento++) {
				System.out.print(incremento);
			}
			for (int decremento = contador; decremento > 0; decremento--) {
				System.out.print(decremento);
			}
			System.out.println();
		}

		sc.close();
	}

}
