package parte1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaro la vaiable en double 
		double a;
		
		Scanner sc = new Scanner(System.in);	
		
		//pedimos el numero al usuario
		System.out.println("Dime un numero y te dire si es casi-cero");
		a=sc.nextDouble();
		
		//comprovamos si el numero decimal esta en el intervalo -1,1  excluyendo a los numeros enteros
		if (a>-1 && a<1 && a!=0) {
			System.out.println("Es un casi-cero");
		}else {
			System.out.println("No es un casi-cero");
		}
		//cerramos scanner
		sc.close();

	}

}
