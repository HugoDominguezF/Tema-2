package parte5dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// abrimos el scanner para poder leer las respuestas del usuario
		Scanner sc = new Scanner(System.in);

		/*
		 * Declaramos las variables que son el resultado, el numero que nos da el
		 * usuario y el valor num que servira para contar los numero que se suman
		 */
		int resultado;
		int numero;
		int num;

		// le preguntamos al usuario el numero final para la suma
		System.out.println("Dime un numero");
		numero = sc.nextInt();

		// Establecemos el valor 0 de inicio a los valores resultado y num
		resultado = 0;
		num = 0;

		/*
		 * hacemos un bucle en donde sumamos al resultado un numero partiendo de uno
		 * hasta que llegue al numero dado por el usuario
		 */
		do {
			resultado = resultado + (++num);
			--numero;
		} while (numero > 0);

		// le devolvemos el valor final al usuario
		System.out.println(resultado);
		
		//cerramos el scanner
		sc.close();
	}

}
