import java.util.Scanner;

/*Leer por teclado 2 tablas de 10 numeros enteros y mezclarlas en una tercera de la forma: el 1 de a, el 1 de b
 * el segundo de a , el segundo de b etc*/
public class Ejercicio62 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int tabla1[] = new int[10];
		int tabla2[] = new int[10];
		int tabla3[] = new int[20];

		System.out.println("Guardando datos de la tabla 1:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + " de la tabla:");
			tabla1[i] = entrada.nextInt();

		}
		System.out.println();
		System.out.println("Guardando datos de la tabla 2:");
		for (int i = 0; i < 10; i++) {
			System.out.print("Ingrese el numero " + (i + 1) + " de la tabla:");
			tabla2[i] = entrada.nextInt();
		}
		//El iterador i controla los arreglos tabla1 y tabla2 y el iterador j controla el arreglo tabla3, cuando se agrega
		//un nuevo elemento el iterador j aumenta
		int j=0;
		for (int i = 0; i < 10; i++) {
		tabla3[j] = tabla1[i];//copiamos el primer elemento del arreglo tabla1 
		//en el arreglo tabla 3 que va estar con el iterador j 
		j++;//avanza en 1 el iterador
		tabla3[j] = tabla2[i];
		j++;
		
		}
		System.out.print("\nEl tercer arreglo es: ");
		for(int i = 0; i < 20; i++) {
			System.out.print(tabla3[i] + "");
			
		}
		System.out.println();
	}
}
