package parte6for;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*
		 * declaramos las variables num que recopilara el numero dado por el usuario y
		 * la variable multiplicacion que nos servira para multiplicar seguidamente el
		 * numero dado y todos los que vienen detras
		 */
		int num;
		int multiplicacion = 1;

		// abrimos el scanner para poder leer al usuario
		Scanner sc = new Scanner(System.in);

		// le pedimos al usuario un numero para calcular su factorial
		System.out.println("Dime un numero y te dire su factorial");
		num = sc.nextInt();

		/*
		 * Creamos un bucle en donde le damos el valor num a la variable decremento para
		 * contar hasta llegar al 1, esta variable la utilizaremos para decrementar y
		 * multiplicar por el resultado anterior hasta llegar a 1
		 */
		for (int decremento = num; decremento > 1; decremento--) {

			multiplicacion = multiplicacion * decremento;
		}
		// le decimos al usuario el resultado del factorial del numero
		System.out.println("El factorial del numero es: " + multiplicacion);

		// cerramos el scanner
		sc.close();
	}

}
