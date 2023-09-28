import java.util.Scanner;

/*Leer por teclado una serie de 10 numeros enteros . la aplicacion debe indicarnos si los numeros estan ordenados
 *  de forma creciente,decreciente,si estan ordenados o si son iguales*/
public class Ejercicio64 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[10];
		boolean creciente = false;
		boolean decreciente = false;

		System.out.println("Guardando datos en el arreglo de 10 numeros:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + " en el indice " + (i)+ ":");
			numeros[i] = entrada.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			if (numeros[i] < numeros[i + 1]) {//comparo a la posicion 0 con la posicion 1,despues la posicion 1 con la posicion2
				creciente = true;
			}

			if (numeros[i] > numeros[i + 1]) {//comparo a la posicion 0 con la posicion1,despues la posicion 1 con la posicion2
				decreciente = true;
			}

		}

		if (creciente == true && decreciente== false) {
			System.out.println("El arreglo es creciente");
			
		} else if (decreciente == true && creciente== false) {
			System.out.println("El arreglo es decreciente");
		}
		else if(creciente == true && decreciente ==true) {
			System.out.println("El arreglo esta desordenado");
		}
			else if(creciente ==false && decreciente == false) {
				System.out.println("Todos los numeros del arreglo son iguales");
					
			}
		}
	}

