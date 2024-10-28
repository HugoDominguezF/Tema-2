package parte7bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num;
		int num2;
		int incremento;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el valor de dos numeros y te dire el maximo comun divisor");
		System.out.println("Numero 1 ->");
		num=sc.nextInt();
		System.out.println("Numero 2 ->");
		num2=sc.nextInt();
		
		sc.close();
		
		if(num>num2) {
			incremento=num2;
		}else {
			incremento=num;
		}
		for(;incremento>1;incremento--) {
			if(num%incremento==0 && num2%incremento==0) {
				System.out.println("El maximo comun divisor es "+incremento);
				incremento=1;
			}
			
		}
	}

}
