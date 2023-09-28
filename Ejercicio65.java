import java.util.Scanner;

/*Diseñar una aplicacion que declare una tabla de 10 elementos enteros. leer mediante el teclado 8 numeros. 
 * Despues se debe pedir un numero y una posicion, insertalo en la posicion indicada, desplazando los que esten detras*/
public class Ejercicio65 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int numero, posicion;

		System.out.println("Guardando datos del arreglo...");
		for (int i = 0; i < 8; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + " del arreglo en la posicion " + i + ":");
			arreglo[i] = entrada.nextInt();//los otros 2 elementos del array quedan en 0 , indice 8 y indice 9
		}
		System.out.print("\nDigite un numero:");
		numero = entrada.nextInt();
		System.out.print("Digite una posicion:");
		posicion = entrada.nextInt();

		for (int i = 7; i >= posicion; i--) {// i inicializa en la ultima posicion la 7 , para que se ejecute la
// posicion debe ser antes o igual a i(7 o menor) y el i--el numero se va a mover desde la posicion inicial 7 hasta la posicion
		//	que indique el usuario	
			arreglo[i + 1] = arreglo[i];// copia el valor del elemento en la posicion i (la posición actual la 7) en la
// posición i + 1 (la posición siguiente la 8).movemos el contenido de la posición actual una posición hacia adelante en el arreglo.
//ejemplo [10, 20, 30, 40, 50, 60, 70, 80, 80, 0] primera vuelta  y empezo [10, 20, 30, 40, 50, 60, 70, 80, 0, 0] al final queda
			// [10, 20, 30, 40, 40, 50, 60, 70, 80, 0] posicion 3  copio
		}

		arreglo[posicion] = numero;//estamos  (guardando) el valor de numero en la posición del arreglo
//que especificó el usuario con posicion [10, 20, 30, 100, 40, 50, 60, 70, 80, 0] , posicion 3 numero 100 y remplazo

		System.out.println("\nEl nuevo arreglo es:");
		for (int i = 0; i < 9; i++) {
			System.out.println("posicion " + i + ": " + arreglo[i]);
		}
	}
}
