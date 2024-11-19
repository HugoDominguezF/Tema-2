package parte9excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int cantidadNums;
		int fallos;
		int numero;
		int numUsuario;
		boolean error = false;

		Scanner sc = new Scanner(System.in);

		numero = 0;
		cantidadNums = 0;
		fallos = 0;
		numUsuario = 1;

		do {
			try {
				System.out.println("Dime un numero inicial:");
				numero = sc.nextInt();
				error=false;
			} catch (InputMismatchException a) {
				
				System.out.println("Introduce un numero, no palabras");
				error = true;
			}
		} while (error);

		while (numUsuario != 0) {
			System.out.println("Dime un numero:");
			numUsuario = sc.nextInt();
			if (numUsuario < numero && numUsuario != 0) {
				System.out.println("Fallo, es menor");
				fallos++;
			}
			if (numUsuario != 0)
				cantidadNums++;

		}
		System.out.println("Has introducido " + cantidadNums + " y has tenido " + fallos + " fallos");

		sc.close();
	}

}
