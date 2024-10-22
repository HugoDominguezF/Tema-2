package parte6for;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime un numero y dire todos los multipos de 3 entre el uno y tu numero");
		num = sc.nextInt();

		for (int incremento = 0; incremento <= num; incremento++) {
			if (incremento % 3 == 0)
				System.out.print(incremento + " ");
		}

	}

}
