import java.util.Scanner;

/*Crear un programa que lea por teclado una tabla de 10 numeros enteros y la desplace una posicion hacia abajo: 
 * el  primero pasa a ser el segundo, el segundo pasa a ser el tercero y asi sucesivamente el ultimo pasa a ser el primero*/
public class Ejercicio66 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int ultimo;

		System.out.println("Guardando datos...");
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite el numero " + (i + 1) + " del indice " + i + ":");
			arreglo[i] = entrada.nextInt();
		}
		ultimo = arreglo[9];// guardamos el ultimo elemento

		for (int i = 8; i >= 0; i--) { // empieza en la ultima posicion(8) y se ejecuta hasta la primera posicion(i--) 
			arreglo[i + 1] = arreglo[i];// 	y va sumando una posicion y asi lo mueve hacia abajo

		}
		arreglo[0]=ultimo;//ultimo elemento queda en la posicion 0
		 
		System.out.println("\nmostrando arreglo:");
		for (int i = 0; i < 10; i++) {
			System.out.println("numero " + (i + 1) + " indice " + i + ":" + arreglo[i]);
		}
	}
}
