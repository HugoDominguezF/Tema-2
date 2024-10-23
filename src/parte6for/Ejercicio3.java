package parte6for;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * declaramos las variables que vamos a utilizar tanto para calcular la suma de
		 * los numeros, el numero dado por el usuario y el resultado de la media total
		 * de todos los numeros
		 */
		int num;
		int suma = 0;
		double resultado;

		// abrimos el scanner para leer al usuario
		Scanner sc = new Scanner(System.in);

		/*
		 * le pedimos 10 numeros al usuario y a continuacion creamos un bucle que se
		 * repita hasta 10 veces y vaya sumando el resultado de todos los numeros dados
		 * por el usuario
		 */
		System.out.println("Dime diez numeros");
		for (int contador = 1; contador <= 10; contador++) {

			System.out.println("Siguiente numero ->");
			num = sc.nextInt();

			suma += num;

		}

		// por ultimo hacemos la media total y se la decimos al usuario
		resultado = (double) suma / 10;

		System.out.println("La media de los 10 numeros es: " + resultado);

		// cerramos scanner
		sc.close();
	}

}
