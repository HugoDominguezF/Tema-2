package parte5dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		//Declaramos las variables para realizar la tabla de multiplicar con el numero dado por el usuario
		int a;
		int resultado;
		int contador;

		//Le damos un valor inicial a el contador y el resultado
		contador = 1;
		resultado = 0;

		//abrimos el scanner
		Scanner sc = new Scanner(System.in);

		//le pedimos al usuario el valor del numero que vamos a utilizar
		System.out.println("Introduce un numero y te dire su tabla de multiplicar");
		a = sc.nextInt();

		// hacemos el bucle en donde a el numero que multilica se le va sumando uno hasta llevar al 10
		do {
			resultado = a * contador;
			System.out.println(a + " * " + contador + " = " + resultado);
			contador++;
		} while (contador < 11);
			
		//cerramos scanner
		sc.close();
	}

}
