package parte6for;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		/*
		 * declaramos la variable num para guardar el numero que nos da el usuario y el
		 * boolean primo que servira como identificador de si el numero que nos han dado
		 * es primo
		 */
		int num;
		boolean primo = true;

		// abrimos el scanner para leer al usuario
		Scanner sc = new Scanner(System.in);

		// le pedimos al usuario un numero
		System.out.println("Dime un numero y te dire si es primo");
		num = sc.nextInt();

		/*
		 * creamos un bucle que se repetira hasta comprovar todos los numeros desde el 2
		 * hasta el numero que nos han dado, aqui haremos el modulo del numero dado con
		 * todos los numeros para comprovar si este es divisible entre alguno, esto nor
		 * servira ya que si este numero no se divide enteramente con alguno este sera
		 * primo
		 */
		for (int incremento = 2; incremento < num; incremento++) {
			if (num % incremento == 0) {
				primo = false;
				incremento = num;
			}
		}
		/*
		 * si el numero no es primo o igual a 1 le diremos al usuario que este no es
		 * primo, en caso contrario le diremos que si es primo
		 */
		if (primo == false || num == 1) {
			System.out.println("El numero no es primo");
		} else
			System.out.println("El numero es primo");

		// cerramos el scanner
		sc.close();
	}

}
