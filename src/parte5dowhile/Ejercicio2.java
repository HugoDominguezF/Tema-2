package parte5dowhile;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos la variable num
		int num = 0;
		
		//Hacemos un bucle en donde el numero se le sumara dos para que sean numeros pares todo el tiempo
		do {
			System.out.println(num += 2);
		} while (num < 200);
		
	}

}
