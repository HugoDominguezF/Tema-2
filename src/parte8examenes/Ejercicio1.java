package parte8examenes;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tamaño;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime el tamaño del cuadrado y lo dibujare");
		tamaño = sc.nextInt();

		for (int lineas = 1; lineas <= tamaño; lineas++) {

			if (lineas == 1 || lineas == tamaño) {
				for (int contador = 0; contador < tamaño; contador++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for (int contador = 1; contador <= tamaño; contador++) {
					if (contador == 1 || contador == tamaño) {
						System.out.print("* ");

					}else {
						System.out.print("  ");
					}
					
				}
				System.out.println();
			}
		}

		sc.close();
	}

}
