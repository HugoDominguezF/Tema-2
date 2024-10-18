package parte5dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int resultado;
		int numero;
		int num;

		System.out.println("Dime un numero");
		numero = sc.nextInt();

		resultado = 0;
		num = 0;

		do {
			resultado = resultado + (num + 1);
			++num;
			--numero;
		} while (numero > 0);

		System.out.println(resultado);

		sc.close();
	}

}
