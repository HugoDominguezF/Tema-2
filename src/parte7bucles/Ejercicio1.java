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
		
		//le preguntamos al usuario cada valor dado, asi como el numero de segundos que quiere incrementar
		System.out.println("Dime el tiempo en HORAS");
		horas = sc.nextInt();
		System.out.println("Dime el tiempo en MINUTOS");
		mins = sc.nextInt();
		System.out.println("Dime el tiempo en SEGUNDOS");
		secs = sc.nextInt();
		System.out.println("Ahora dime cuanta cantidad de segundos quieres incrementar");
		mas = sc.nextInt();
		
		//cambiamos los valores a variables que podamos cambiar
		secsFinales = secs;
		minsFinales= mins;
		horasFinales=horas;
		//creamos un bucle que añada los segundos incrementados al valor
		while(mas>0) {
			secsFinales++;
			mas--;
		}
		//ahora pasamos las variables que sobrepasen el valor de 60 al siguiente
		while(secsFinales>60) {
			secsFinales=secsFinales-60;
			minsFinales++;
			while(minsFinales>60) {
				minsFinales=minsFinales-60;
				horasFinales++;
			}
		}
		//le decimos al usuario los valores finales, ademas cerramos el scanner
		System.out.println("La hora sera: "+horasFinales+":"+minsFinales+":"+secsFinales);
		sc.close();
	}

}
