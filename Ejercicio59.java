import java.util.Scanner;

/*leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido */
public class Ejercicio59 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroInverso[]=new int[5];
		
		System.out.println("Guardando los datos del arreglo");
		for(int i=0; i<numeroInverso.length; i++) {
			System.out.print("Digite el numero "+(i+1)+":");
			numeroInverso[i]= entrada.nextInt();
		}
		System.out.println("\nLos numeros del arreglo  ingresados inversamente son:");
		for(int i=4; i>=0;i--) {
			System.out.print(numeroInverso[i]+" ");
		}
	}
}
