import java.util.Scanner;

/*Leer 5 numeros por teclado, almacenarlos en un arreglo y a continuacion realizar la media de los numeros positivos, la 
 * media de los numeros negativos y contar el numero de ceros*/
public class Ejercicio60 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numeros[] = new double[5];
		float sumap = 0, suman = 0, contadorn = 0, contadorp = 0, contador_ceros = 0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite el numero " + (i + 1) + ":");
			numeros[i] = entrada.nextDouble();
			if (numeros[i] > 0) {
				sumap += numeros[i];
				contadorp++;
			} else if (numeros[i] < 0) {
				suman += numeros[i];
				contadorn++;
			}
			else {
				contador_ceros++;
			}
		}
		if(contadorp==0) {
			System.out.println("No se puede sacar la media de los numeros positivos");
		}
		else {
			System.out.println("\nLa media de los  numeros positivos es: " + sumap / contadorp);

		}
		if(contadorn==0) {
			System.out.println("No se puede sacar la media de los numeros negativos");
		}
		else {
			System.out.println("La media de los  numeros negativos es: " + suman / contadorn);
		}
		System.out.println("Los ceros son: " + contador_ceros);
	}
}
