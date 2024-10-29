package parte7bucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int numero;
		int resultado;
		int cifras;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero y te dire cuantos digitos tiene");
		numero=sc.nextInt();
		
		resultado=numero;
		cifras=1;
		
		if(resultado<0) {
			resultado=resultado*-1;
		}
		
		while(resultado>9) {
			resultado=resultado/10;
			cifras++;
		}
		System.out.println("El numero tiene "+cifras+" cifras");
		
		sc.close();
	}

}