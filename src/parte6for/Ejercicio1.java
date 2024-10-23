package parte6for;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Creamos la variable num que sera el numero introducido por el usuario
		int num;

		//abrimos scanner para leer al usuario
		Scanner sc = new Scanner(System.in);

		//le pedimos al usuario un numero como valor maximo
		System.out.println("Dime un numero y contare hasta llegar a ese numero");
		num = sc.nextInt();

		//hacemos que el valor incremento cuente hasta el numero dicho por el usuario
		for (int incremento = 1; incremento <= num; incremento++) {
			System.out.print(incremento + " ");
		}

		sc.close();
	}

}
