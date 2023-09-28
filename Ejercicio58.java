import java.util.Scanner;

/*/*Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido*/

public class Ejercicio58 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int numeros[]= new int[5];
		
		for(int i=0; i<numeros.length;i++) {
			System.out.print("Ingrese el numero "+(i+1)+":");
			numeros[i] = entrada.nextInt();
		}
		System.out.print("\nLos numeros introducidos son: ");
		for(int i=0; i<numeros.length;i++) {
		System.out.print(+numeros[i]+" ");	
		}
	}
}
