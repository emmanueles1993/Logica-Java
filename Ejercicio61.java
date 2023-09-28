import java.util.Scanner;

/*Leer 10 numeros enteros, guardarlos en un arreglo. debemos mostrarlos en el siguiente orden:
 * el primero, el ultimo,el segundo, el penultimo, el tercero,etc*/
public class Ejercicio61 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[10];
		
		System.out.println("Guardando arreglo");
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite el numero " + (i + 1) + ":");
			numeros[i] = entrada.nextInt();
		}
		
		System.out.print("\nAhora el orden de los elementos del arreglo es:");
		for (int i = 0; i < 5; i++) {
		System.out.print(numeros[i]);
		System.out.print(numeros[9-i]+" ");
		}
		System.out.println();
	}
}
