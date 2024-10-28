package parte7bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int triangulo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la altura que quieres que tenga la piramide");
		triangulo= sc.nextInt();
		
		for(int contador=0;contador<triangulo;contador++) {
			for(int espacios=triangulo;espacios>contador;espacios--) {
				System.out.print(" ");
			}
			for(int signos=0;signos<=contador;signos++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
		
		
	}

}
