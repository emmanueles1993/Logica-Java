import java.util.Scanner;

/*Crear un programa que lea por teclado una tabla de 10 numeros enteros y desplace n posiciones en el arreglo
 * (N es digitado por el usuario).*/
public class Ejercicio67 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int n_posiciones;
		int ultimo;

		System.out.println("Guardando datos....");
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite el numero " + (i + 1) + " del indice " + i + ":");
			arreglo[i] = entrada.nextInt();
		}

		System.out.print("\nIngrese la cantidad de posiciones a desplazar: ");
		n_posiciones = entrada.nextInt();

		for (int vuelta = 1; vuelta <= n_posiciones; vuelta++) {// se inicia un bucle que se ejecutara la cantidad de
																// posiciones a desplazar que el usuario indico
			ultimo = arreglo[9];//guarda el último elemento en una variable temporal ultimo.(100)del 10 al 100
			for (int i = 8; i >= 0; i--) {//inicializa en la ultima posicion ,y finaliza en la primera posicion
				arreglo[i + 1] = arreglo[i];// copia el valor del elemento en la posicion i (la posición actual) en la
// posición i + 1 (la posición siguiente).movemos el contenido de la posición actual una posición hacia adelante en el arreglo.

			}
			arreglo[0] = ultimo;//ultimo elemento queda en la posicion 0
		}
		//[100, 10, 20, 30, 40, 50, 60, 70, 80, 90] vuelta 1
		//[90, 100, 10, 20, 30, 40, 50, 60, 70, 80]vuelta 2
		//[80, 90, 100, 10, 20, 30, 40, 50, 60, 70]vuelta 3
		System.out.println("\nEl nuevo arreglo es:");
		for (int i = 0; i < 10; i++) {
			System.out.println("numero " + (i + 1) + " en la posicion " + i + ":" + arreglo[i]);
		}
	}

}
