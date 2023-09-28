import java.util.Scanner;

/*Leer 10 enteros en una tabla. guardar en otra tabla los elementos pares de la primera y a continuacion los elementos impares*/
public class Ejercicio70 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int conteo_pares = 0, conteo_impares = 0;

		System.out.println("Tabla 1");
		for (int i = 0; i < 10; i++) {// El iterador recorre todos los elementos del array desde la posicion 0 hasta
										// la 9(10 vueltas)
			System.out.print("Digite el numero " + (i + 1) + " de la posicion " + (i) + ":");// ingresa un valor para
																								// cada elemento del
																								// array
			arreglo[i] = entrada.nextInt();// se almacena el valor en esa posicion del array

			if (arreglo[i] % 2 == 0) {// si el numero es par
				conteo_pares++;// va sumando 1 por cada elemento que es par ya que el iterador verifica solo
								// los pares

			} else {
				conteo_impares++;
			}
			
		}
		// creamos arreglos
		int par[] = new int[conteo_pares];// creamos el arreglo para almacenar los numeros pares
		int impares[] = new int[conteo_impares];

		// Almacenamos los numeros pares e impares en su arreglo
		conteo_pares = 0;// iterador(recorre las posiciones)
		conteo_impares = 0;// iterador

		for (int i = 0; i < 10; i++) {
			if (arreglo[i] % 2 == 0) {// si en el arreglo hay un par (con el iterador i recorre las 10 posiciones
										// comprobandolo)
				par[conteo_pares] = arreglo[i];// en el arreglo par que tiene el iterador en 0 almacena el valor del
												// primer
				// elemento par que tiene el array arreglo ya que se esta recorriendo 1 por 1
				conteo_pares++;// aumenta en 1 la posicion del array par cada vez que se recorre
			} else {
				impares[conteo_impares] = arreglo[i];
				conteo_impares++;
			}
		}
		System.out.print("\nArreglo de pares:");//sin ln para que no haya salto de linea en los numeros con \n para salto de linea 
		//en la palabra
		for (int i = 0; i < conteo_pares; i++) {
			System.out.print("-"+par[i]);
			System.out.print("");
		}
		System.out.print("\nArreglo de impares:");
		for (int i = 0; i < conteo_impares; i++) {
			System.out.print("-"+impares[i]);
			System.out.print("");
	}
}
}
