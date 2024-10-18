package parte5dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int a;
		int resultado;
		int relog;

		relog = 1;
		resultado = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero y te dire su tabla de multiplicar");
		a = sc.nextInt();

		do {
			resultado = a * relog;
			System.out.println(a + " * " + relog + " = " + resultado);
			relog++;
		} while (relog < 11);

	}

}
