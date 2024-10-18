package parte4while;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int numero;
		int resultado;
		int numero2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime numeros positivos");
		numero = sc.nextInt();

		numero2 = 0;
		resultado = numero;

		while (numero >= 0 && numero2 >= 0) {

			System.out.println("Dime otro numero positivo");
			numero2 = sc.nextInt();
			if (numero2 >= 0) {
				resultado = resultado + numero2;
			}
		}
		if (numero >= 0) {
			System.out.println("La suma de todos los numeros positivos es: " + resultado);
		} else
			System.out.println("No se han introducido suficientes valores positivos");

		sc.close();

	}

}
