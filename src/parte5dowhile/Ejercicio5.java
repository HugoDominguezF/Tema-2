package parte5dowhile;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int numero;
		String respuesta;
		int limite;
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		numero= rand.nextInt(1,101);
		
		System.out.println("Piensa en un numero y lo intentare adivinar, dime si es mayor, menor o igual");
		System.out.println("Tu numero es "+numero+"?");
		do {
			respuesta = sc.next();
			if(respuesta.equals("mayor")){
				limite = numero;
				numero= rand.nextInt(limite,101);
			}
			if(respuesta.equals("menor")){
				limite = numero;
				numero= rand.nextInt(1,limite);
			}
			System.out.println("Es "+numero+" tu numero?");
		}while(respuesta.equals("igual"));
	}

}
