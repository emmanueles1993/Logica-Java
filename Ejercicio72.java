import java.util.Scanner;

import javax.swing.JOptionPane;

/*leer 10 enteros ordenados crecientemente. leer n y buscarlo en la tabla. se debe mostrar la posicion en  que se encuentra. 
 * si no esta, indicarlo con un mensaje*/
public class Ejercicio72 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[] =new int[10];
		boolean creciente =true;
		int numero;
		
		System.out.println("Guardando arreglo");
		do {
		for(int i=0; i<10; i++) {
			System.out.print("Digite el numero " + (i + 1) + " de la posicion " + (i) + ":");	
		a[i] =entrada.nextInt();
		}
		for(int i=0; i<9; i++) {
		if(a[i]< a[i+1]) {
			creciente = true;
		}
		if(a[i]> a[i+1]) {
			creciente = false;
			break;
		}
		}
		if(creciente == false) {
			System.out.println("El arreglo no es creciente vuelva a intentarlo");
		}
		}while(creciente == false);
		
		System.out.print("\nIngrese el numero que quiere buscar en el arreglo:");
		numero=entrada.nextInt();
		//buscamos el numero en el arreglo
		int i=0;
		while(i<10 && a[i]<numero) {//i se ejecutara hasta el 10 donde la condicion no se cumple , 
			//el arreglo debe tener un numero menor al numero que digito el usuario
			i++;
		}
		if(i==10) {
			System.out.println("\nNumero no encontrado");
		}
		else {
			if(a[i]==numero) {
				System.out.println("\nNumero encontrado en la posicion:"+i);
			}
			else {
				System.out.println("");
			}
			
		}
		
	}
	
}
