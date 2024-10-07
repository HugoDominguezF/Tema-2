package parte1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		//declaramos dos variables para comprobar cual es menor 
		double a;
		double b;
		
		Scanner sc = new Scanner(System.in);
	
		//Le pedimos al usuario que nos de dos numeros
		System.out.println("Dime dos numeros y te los ordenare de menor a mayor");
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		//comprobamos cual numero es el menor e imprimimos la respuesta
		if (a>b) {
			System.out.println("El orden de menor a mayor es: " + b + ", "+ a);
		}else if (a<b) {
			System.out.println("El orden de menor a mayor es: " + b + ", "+ a);
		} else {
			System.out.println("No se puede ordenar ya que todos los numeros son iguales");
		}
		
		//cerramos el scanner
		sc.close();
	}

}
