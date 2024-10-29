package parte8examenes;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int numeroMod;
		int cifras;
		
		
		System.out.println("Dame un numero y te dire si sus cifras son pares o impares");
		numero=sc.nextInt();
		
		numeroMod=numero;
		cifras=1;
		
		while(numeroMod>=10) {
			numeroMod=numeroMod/10;
			cifras++;
		}
		if(cifras%2==0) {
			System.out.println("El numero tiene "+cifras+" cifras por lo que es par");
		}else {
			System.out.println("El numero tiene "+cifras+" cifras por lo que es impar");
		}
		sc.close();
	}

}
