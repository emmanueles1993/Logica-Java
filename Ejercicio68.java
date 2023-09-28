import java.util.Scanner;

import javax.swing.JOptionPane;

/*leer 5 elementos numericos que se introduciran ordenados de forma creciente , estos los guardaremos en una tabla de tamaño 10.
 * leer un numero n , e insertalo en el lugar adecuado para que la tabla continue ordenada*/
public class Ejercicio68 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arreglo[] =new int[10];
		boolean creciente= true;
		int numero,sitio_num=0,j=0;// los iteradores inician en posiciones
		
		System.out.println("Llenar el arreglo");
		do {
			//llenando el arreglo
			for(int i =0 ;i <5; i++) {
				System.out.print("Digite el numero "+(i+1)+ " de la posicion "+(i)+":");
				arreglo[i] = entrada.nextInt();
			}
			//comprobar si el arreglo esta ordenado en orden creciente
			for(int i=0; i<4; i++) {
				if(arreglo[i]<arreglo[i+1]) {
					creciente=true;
					
				}
				if(arreglo[i]>arreglo[i+1]) {
					creciente=false;
					break;
					
				}
			}
				if(creciente == false) {
					System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a digitar:\n");
				}
			
		} while (creciente == false);
		
		System.out.print("\nDigite un elemento a insertar: ");
		numero =entrada.nextInt();
		
		//Esto es para darnos cuenta en que posicion va el numero
		while(arreglo[j]<numero && j<5) { //el iterador j esta en la posicion 0 y se compara el numero de esa posicion con el
//numero ingresado, y j<5 quiere decir del 0 al 4
			
			sitio_num++;// esta en posicion 0 y va avanzado 1
			j++;// esta en posicion 0 y va avanzando 1
		}
		
		//por ultimo, trasladamos una posicion en el arreglo a los elementos que van detras de numero
		for (int i=4;i>=sitio_num; i--) {
			arreglo[i+1] = arreglo[i];
		}
		
		//Insertamos el numero que el usuario puso
		arreglo[sitio_num] = numero;
		
		System.out.println("\nEl arreglo queda: ");
		for(int i=0; i<6; i++) {
			System.out.print(arreglo[i]+ " - ");
		}
		System.out.println();
	}
}
