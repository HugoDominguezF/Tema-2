package parte2_switch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero de dia");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1 ->
			System.out.println("Es Lunes");
		case 2 ->
			System.out.println("Es Martes");
		case 3 ->
			System.out.println("Es Miercoles");
		case 4 ->
			System.out.println("Es Jueves");
		case 5 ->
			System.out.println("Es Viernes");
		case 6 ->
			System.out.println("Es Sabado");
		case 7 ->
			System.out.println("Es Domingo");
		default ->
			System.out.println("No esta entre el 1 y el 7 el dia");
		
		
		}
		sc.close();
	}

}
