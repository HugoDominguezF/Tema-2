package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		//declaramos dos variables para comprobar cual es menor 
		double a;
		double b;
		double c;
		
		Scanner sc = new Scanner(System.in);
	
		//Le pedimos al usuario que nos de dos numeros
		System.out.println("Dime tres numeros y te los ordenare de menor a mayor");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		//comprobamos cual numero es el menor e imprimimos la respuesta
		if (a>b && a>c && b>c ) {
			System.out.println("El orden de mayor a menor es: " + a + ", "+ b + ", " + c);
		}else if (a>b && a>c && b<c) {
			System.out.println("El orden de mayor a menor es: " + a + ", "+ c + ", " + b);
		}else if (b>a && b>c && a<c){
			System.out.println("El orden de mayor a menor es: " + b + ", "+ c + ", " + a);
		}else if (b>a && b>c && a>c) {
			System.out.println("El orden de mayor a menor es: " + b + ", "+ a + ", " + c);
		}else if (c>a && c>b && a<b) {
			System.out.println("El orden de mayor a menor es: " + c + ", "+ b + ", " + a);
		}else if (c>a && c>b && a>b) {
			System.out.println("El orden de mayor a menor es: " + c + ", "+ a + ", " + b);
		}else if (b>a && b>c && a==c) {
			System.out.println("El orden de mayor a menor es: " + b + ", pero "+a+" y "+c+" son iguales");
		}else if (a>b && a>c && b==c) {
			System.out.println("El orden de mayor a menor es: " + a + ", pero "+b+" y "+c+" son iguales");
		}else if (c>b && c>a && b==a) {
			System.out.println("El orden de mayor a menor es: " + c + ", pero "+b+" y "+a+" son iguales");
		}else if (c==b && c==a && b==a) {
			System.out.println("Todos los numeros son iguales");
		}else if (b<a && b<c && a==c) {
			System.out.println("El orden de mayor a menor es: " + a+" y "+c+" son mayores que "+b );
		}else if (a<b && a<c && b==c) {
			System.out.println("El orden de mayor a menor es: " + b+" y "+c+" son mayores que "+a );
		}else if (c<b && c<a && b==a) {
			System.out.println("El orden de mayor a menor es: " + a+" y "+b+" son mayores que "+c );
		}
			
		
		//cerramos el scanner
		sc.close();
	}

}
