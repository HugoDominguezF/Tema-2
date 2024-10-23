package parte6for;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*
		 * declaramos las variables nota para almacenar las notas de los estudiantes y
		 * aprovados y suspensos que nos serviran para saber cuanta cantidad de
		 * suspensos hay segun las notas presentadas antes
		 */
		double nota;
		int suspensos = 0;
		int aprovados = 0;

		// abrimos el scanner para leer al usuario
		Scanner sc = new Scanner(System.in);

		/*
		 * le pedimos al usuario 5 notas de estudiantes y guardamos los valores en la
		 * variable num
		 */
		System.out.println("Dime la nota de 5 estudiantes");

		for (int contador = 0; contador <= 4; contador++) {

			System.out.println("Siguiente nota ->");
			nota = sc.nextDouble();

			// creamos un if que denominada donde pertenece la nota, si esta aprovado o suspenso
	
			if (nota >= 5) {
				aprovados++;
			} else
				suspensos++;
		}
		// le decimos al usuario la cantidad de aprovados y cantidad de suspensos
		System.out.println("Han aprovado " + aprovados + " alumnos y han suspendido " + suspensos + " alummnos");

		// cerramos el scanner
		sc.close();
	}

}
