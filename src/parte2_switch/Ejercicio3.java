package parte2_switch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		double numero;
		double numero2;
		String letra;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elija dos numeros");
		System.out.println("Numero 1:");
		numero = sc.nextDouble();
		System.out.println("Numero 2:");
		numero2 = sc.nextDouble();
		
		System.out.println("Elija una opcion:");
		System.out.println("A) Sumar los numeros");
		System.out.println("B) Restar los numeros");
		System.out.println("C) Multiplicar los numeros");
		System.out.println("D) Dividir los numeros");
		letra = sc.next().toUpperCase();
		
		switch (letra) {
		
		case "A" ->
			System.out.println("Resultado: "+ (numero+numero2));
		case "B" ->
			System.out.println("Resultado: "+ (numero-numero2));
		case "C" ->
			System.out.println("Resultado: "+ (numero*numero2));
		case "D" ->
			System.out.println("Resultado: "+ (numero/numero2));
		default ->
			System.out.println("No existe esa opcion");
		}
		sc.close();
	}

}
