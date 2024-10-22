package parte5dowhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		/*
		 * declaramos las variables de los dos numero que queremos operar y la letra de
		 * las opciones que el usuario eligira para cada operacion y abrimos el scanner
		 */
		double numero;
		double numero2;
		String letra;

		Scanner sc = new Scanner(System.in);

		/*
		 * repetimos el ejercicio de la calculadora con la unica excepcion de que
		 * metemos todo en un do-while para seguir calculando si el usuario lo desea,
		 * pero añadimos una nueva opcion que se llama salir la cual termina todo el
		 * do-while y termina el codigo saliendo del bucle
		 */
		do {
			System.out.println("Elija dos numeros");
			System.out.println("Numero 1:");
			numero = sc.nextDouble();
			System.out.println("Numero 2:");
			numero2 = sc.nextDouble();

			System.out.println("Elija una opcion:");
			System.out.println("A) Sumar los numeros");
			System.out.println("B) Restar los numeros");
			System.out.println("C) Multiplicar los numeros");
			System.out.println("D) Dividir los numeros");
			System.out.println("E) Salir");
			letra = sc.next().toUpperCase();

			if (!letra.equalsIgnoreCase("e")) {
				switch (letra) {

				case "A" -> System.out.println("Resultado: " + (numero + numero2));
				case "B" -> System.out.println("Resultado: " + (numero - numero2));
				case "C" -> System.out.println("Resultado: " + (numero * numero2));
				case "D" -> System.out.println("Resultado: " + (numero / numero2));
				default -> System.out.println("No existe esa opcion");
				}
			}
			System.out.println("");
		} while (!letra.equalsIgnoreCase("e"));
		
		//cerramos el scanner
		sc.close();
	}

}
