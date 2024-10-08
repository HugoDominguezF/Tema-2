package parte1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double raizCuadrada;
		double x;
		double x2;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el valor de 'a' 'b' y 'c' y mostrare una ecuacion de segundo grado con ellos");
		System.out.println("(La ecuacion es ax^2 + bx + c = 0)");
		System.out.println("Introduce el valor de a");
		a = sc.nextDouble();
		System.out.println("Introduce el valor de b");
		b = sc.nextDouble();
		System.out.println("Introduce el valor de c");
		c = sc.nextDouble();
		
		raizCuadrada = b*b-4*a*c;
		if(raizCuadrada >= 0){
			
			x = (-b+raizCuadrada/raizCuadrada)/(2*a);
			x2 = (-b-raizCuadrada/raizCuadrada)/(2*a);
			
			if (x==x2) {
				System.out.println("El valor de x es: "+ x);
			}else {
				System.out.println("Los valores de x son: "+ x+", "+x2);
			}
		}else {
			System.out.println("No existe una respuesta con los valores dados");
		}
		
		sc.close();
		
	}

}
