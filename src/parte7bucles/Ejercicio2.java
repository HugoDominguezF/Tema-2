package parte7bucles;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num;
		
		boolean primo=true;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero y te dire cuantos numeros primos hay entre el 1 y ese numero");
		num=sc.nextInt();
		
		System.out.println("Los numeros primos entre el 1 y el "+num+" son:");
		
		for (int incremento = 1, incremento2 =2 ; incremento <= num; incremento++, incremento2=2) {
			
			while(incremento2<incremento) {
				
				if(incremento % incremento2 == 0) {
					primo=false;
					incremento2=incremento;
				}
				incremento2++;
				}
				if(primo) {
					System.out.print(incremento+" ");
					incremento2=incremento;
				}
				primo=true;
		}
		
		sc.close();
	}
}
