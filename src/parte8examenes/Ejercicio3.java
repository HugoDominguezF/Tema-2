package parte8examenes;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int tamaño;
		int tamañoMod;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el tamaño del triangulo");
		tamaño=sc.nextInt();
		
		tamañoMod=tamaño;
		
		//este contador servira para contar las lineas que ejecuta
		for(int contador=1;contador<=tamaño;contador++) {
			
			if(contador==1) {
				for(int linea=0;linea<tamaño;linea++)
					System.out.print("* ");
			}else if(contador==tamaño) {
				for(int espacios=contador;espacios>0;espacios--) {
					System.out.print("  ");
				}
				System.out.println("* ");
			}else {
				for(int espacios=contador;espacios>0;espacios--) {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
		
	}

}
