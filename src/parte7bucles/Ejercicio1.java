package parte7bucles;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//declaro las variables que mediran el tiempo, y sus contrapartes que seran las variables modificadas
		int horas;
		int mins;
		int secs;
		int mas;
		int horasFinales;
		int minsFinales;
		int secsFinales;
		
		//creamos un scanner para leer lo que nos diga el usuario
		Scanner sc = new Scanner(System.in);
		
		//
		System.out.println("Dime el tiempo en HORAS");
		horas = sc.nextInt();
		System.out.println("Dime el tiempo en MINUTOS");
		mins = sc.nextInt();
		System.out.println("Dime el tiempo en SEGUNDOS");
		secs = sc.nextInt();
		System.out.println("Ahora dime cuanta cantidad de segundos quieres incrementar");
		mas = sc.nextInt();
		
		secsFinales = secs;
		minsFinales= mins;
		horasFinales=horas;
		while(mas>0) {
			secsFinales++;
			mas--;
		}
		while(secsFinales>60) {
			secsFinales=secsFinales-60;
			minsFinales++;
			while(minsFinales>60) {
				minsFinales=minsFinales-60;
				horasFinales++;
			}
		}
		System.out.println("La hora sera: "+horasFinales+":"+minsFinales+":"+secsFinales);
		sc.close();
	}

}
