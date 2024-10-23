package parte6for;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*
		 * declaramos la variable suma que nos servira para calcular la suma total de
		 * los impares
		 */
		int suma = 0;

		/*
		 * declaramos las variables contador y impar que serviran para contar el numero
		 * de bucles realizados y los numeros impares, ademas en el bucle realizamos la
		 * suma total de los numeros impares a la vez que le sumamos 2 a la variable ya
		 * que cada dos numeros a partir de un impar viene otro impar
		 */
		for (int contador = 1, impar = 1; contador <= 10; contador++) {

			System.out.print(impar + " ");
			suma += impar;
			impar += 2;
		}

		//le decimos el total al usuario
		System.out.println("La suma total de los numeros impares es: " + suma);
		
	}

}
