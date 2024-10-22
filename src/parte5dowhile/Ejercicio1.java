package parte5dowhile;

public class Ejercicio1 {

	public static void main(String[] args) {

		//Declaramos la variable del numero que vamos a cambiarle el valor hasta 20
		int uno = 1;

		//Hacemos un bucle en donde el numero avanza hasta salir del bucle con valor 21	
		do {
			System.out.println(uno++);
		} while (uno <= 20);

	}

}
