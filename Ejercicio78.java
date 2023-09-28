import java.util.Scanner;

import javax.swing.JOptionPane;

/*crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y cada columna*/
public class Ejercicio78 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][], n, m;
		int sumaCol=0, sumaFila=0;
		
		n= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas:"));
		m= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
		
		matriz = new int[n][m];
		System.out.println("Guardando matriz");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <m; j++) {
				System.out.print("Digite la matriz[" + i + "][" + j + "]:");
				matriz[i][j] = entrada.nextInt();
			}
		}
		System.out.println("");
		System.out.println("Mostrando elementos de la  matriz");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <m; j++) {
				System.out.print("["+matriz[i][j]+"]"+" ");		
				
			}
			System.out.println("");
			
		}
		System.out.println("");
		System.out.println("La suma de cada  columna de la matriz es:");
		for(int i=0 ; i<n; i++) {
			for(int j=0; j<m; j++) {
				sumaCol += matriz[i][j];
				
			}
			System.out.print(sumaCol+".");
		    sumaCol =0;
		    System.out.print("");

		}
		System.out.println("");
		System.out.println("La suma de cada  fila de la matriz es:");
		for(int j=0 ; j<m; j++) {
			for(int i=0; i<n; i++) {
				sumaFila += matriz[i][j];
				
			}
			System.out.print(sumaFila+".");
		    sumaFila =0;
			System.out.print("");
		}
		
	}
}
