import java.util.Scanner;

/*Leer por teclado una tabla de 10 elementos numericos enteros y una posicion(entre 0 y 9) eliminar el elemento situado en la 
 * posicion dada sin dejar huecos*/
public class Ejercicio69 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] = new int[10];
		int posicion;

		System.out.println("Guardando arreglo");
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite el numero " + (i + 1) + " de la posicion " + (i) + ":");
			arreglo[i] = entrada.nextInt();
		}
		do {
			System.out.print("\nDigite una posicion entre 0 y 9 para eliminar:");
			posicion = entrada.nextInt();
		} while (posicion > 9 || posicion < 0);

		//eliminando el elemento de la posicion indicada(ejemplo posicion 5)
		for(int i= posicion; i<9;i++) {//sera del 5 al 8
			arreglo[i]= arreglo[i+1];//copiamos en la posicion 5 la posicion 6 y asi queda eliminado ese numero de la posicion5
		}
		
		System.out.println("\nEl nuevo arreglo es:");
		for(int i=0 ; i<9; i++) {
			System.out.print( "-"+arreglo[i]);
		}
	}
}
