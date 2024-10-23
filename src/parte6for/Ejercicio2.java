package parte6for;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*
		 * creamos la variable num que utilizaremos para marcar un maximo dicho por el
		 * usuario
		 */
		int num;

		// abrimos el scanner para leer lo que nos dice el usuario
		Scanner sc = new Scanner(System.in);

		// le pedimos un numero al usuario para tomarlo como el maximo de los multiplos
		// de 3
		System.out.println("Dime un numero y dire todos los multipos de 3 entre el uno y tu numero");
		num = sc.nextInt();

		/*
		 * creamos un bucle que se repite hasta llegar del 0 al numero dicho por el
		 * usuario, aqui procedemos a hacer el modulo de el incremento que es la
		 * variable que incrementa hasta llegar a la variable num, si el modulo da 0
		 * imprimimos ese numero ya que sera un multiplo de 3
		 */
		for (int incremento = 0; incremento <= num; incremento++) {
			if (incremento % 3 == 0)
				System.out.print(incremento + " ");
		}

		//cerramos el scanner
		sc.close();
	}

}
