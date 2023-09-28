import java.util.Scanner;

import javax.swing.JOptionPane;

/*Crear y cargar una matriz de tamaño n x m y decir si es simetrica o no(simetrica es cuando es una  matriz cuadrada 
 * osea numero de filas y  columnas son iguales y cuando se obtiene la misma matriz al cambiar sus filas y columnas) */
public class Ejercicio74_Matrices {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][], nFilas, nColumnas;
		boolean simetrica = true;

		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas:"));
		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));

		matriz = new int[nFilas][nColumnas];
		System.out.println("Guardando matriz");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				System.out.print("Digite la matriz[" + i + "][" + j + "]:");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		if(nFilas == nColumnas) {
			int i,j;
			i=0;
			while(i<nFilas && simetrica == true) {
				j=0;
				while(j<i && simetrica ==true) {
					if(matriz[i][j]!=matriz[j][i]) {//compara  el elemento de i y j y el de j y i que sean iguales por ejemplo 
//matriz 1,0 y matriz 0, 1,  matriz 2, 0 y 0,2 y asi sucesivamente solo los de diagonal principal no entraria en el while  						
						simetrica = false;
					}
					j++;
				}
				i++;
			}
			if(simetrica==true) {
				JOptionPane.showMessageDialog(null, "La matriz es simetrica");
			}
			else {
				JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
		}
	}
}
