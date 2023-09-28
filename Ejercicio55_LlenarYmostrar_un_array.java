import java.util.Scanner;

import javax.swing.JOptionPane;
/*pedirle al usuario cuantos elementos tendra nuestro arreglo y cuales seran esos elementos, llenarlos y mostrarlos*/
public class Ejercicio55_LlenarYmostrar_un_array {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		//llenar array
		int nElementos;
		
		nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
	
		char letras[] = new char[nElementos];
		
		System.out.println("Digite los elementos del arreglo:");
	
		for(int i=0; i<nElementos; i++) {
			System.out.print((i+1)+". Digite un caracter: ");
		letras[i] = entrada.next().charAt(0);
		//letras[i] = JOptionPane.showInputDialog((i+1)+". Digite un caracter").charAt(0);

			
		}
		//mostrar array
	System.out.println("\nLos caracteres del arreglos son: ");
	for(int i=0; i<nElementos; i++) {
		System.out.print(letras[i]+" ");
	//	JOptionPane.showMessageDialog(null,"\nLos caracteres del arreglos son: "+letras[i]+" ");
	}
	}
}
