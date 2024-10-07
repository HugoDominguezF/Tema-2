package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
			
		//declaramos las variables que usaremos para saber si son iguales
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);	
		
		//le preguntamos al usuario que nos indique los valores de a y b
		System.out.println("Dime un numero");
		a=sc.nextInt();
		
		System.out.println("Ahora dime otro");
		b=sc.nextInt();
		
		//comprovamos si son iguales y decimos si son o no iguales
		if (a == b) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros son diferentes");
			}
		//cerramos el scanner
		sc.close();

	}

}
