package parte5dowhile;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * Declaramos las variables y los limites que usaremos como topes en los numeros
		 * aleatorios
		 */
		String respuesta;
		int numero;
		int limiteMenor;
		int limiteMayor;

		// abrimos el scanner y el random que nos servira para los numeros aleatorios
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		/*
		 * establecemos los numeros en un valor base y ademas le damos un valor
		 * aleatorio a el numero para empezar a adivinar
		 */
		limiteMenor = 1;
		limiteMayor = 101;
		numero = rand.nextInt(1, 101);

		/*
		 * le decimos al usuario que piense en un numero y le damos el valor aleatorio
		 * que le dimos a numero para empezar a adivinar
		 */
		System.out.println("Piensa en un numero y lo intentare adivinar, dime si es mayor, menor o igual");
		System.out.println("Tu numero es " + numero + "?");

		/*
		 * hacemos un bucle en donde establecemos un limite menor o mayor dependiendo de
		 * la respuesta del usuario, cerrando cada vez mas el intervalo en el que se
		 * encuentra el numero del usuario
		 */
		do {
			respuesta = sc.next();
			if (respuesta.equalsIgnoreCase("mayor")) {
				limiteMenor = numero;
				numero = rand.nextInt(limiteMenor, limiteMayor);
			}
			if (respuesta.equalsIgnoreCase("menor")) {
				limiteMayor = numero;
				numero = rand.nextInt(limiteMenor, limiteMayor);
			}
			if (!respuesta.equalsIgnoreCase("igual")) {
				System.out.println("Es " + numero + " tu numero?");
			}
		} while (!respuesta.equalsIgnoreCase("igual"));

		// si responde igual le decimos el numero que estaba pensando
		System.out.println("Entonces el numero que estas pensando es " + numero);

		// cerramos el scanner
		sc.close();
	}

}
