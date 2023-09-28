import java.util.Scanner;

/*Utilizando 2 matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda*/
public class Ejercicio79 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[][] = new int[5][9];
		int b[][] = new int[9][5];

		System.out.println("Guardando datos de la matriz A");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print("Digite la matriz[" + i + "][" + j + "]:");
				a[i][j] = entrada.nextInt();
			}
		}
		//Matriz transpuesta
		for(int i =0; i<9; i++ ) {//se movera por filas , en la matriz a la j que es columna la toma como fila = 9 veces
			for(int j=0; j<5; j++) {//se movera por columnas , en la matriz a la i que es fila la toma como columna= 5 veces
		b[i][j]= a[j][i];//en esas 9 filas voy a ingresar las nueve columnas, y en esas 5 columnas voy a ingresar las 5 filas
			}
		}
		//mostrando matriz original
				System.out.println(" ");
				System.out.println("Matriz");
				for(int i =0 ; i<5; i++) {
					for(int j=0; j<9; j++) {
						System.out.print("["+a[i][j]+"]"+" ");	
						
					}
					System.out.println("");
				}
				//mostrando matriz transpuesta
				System.out.println("Matriz transpuesta");
				for(int i =0 ; i<9; i++) {
					for(int j=0; j<5; j++) {
						System.out.print("["+b[i][j]+"]"+" ");	
						
					}
					System.out.println("");
				}
		}
	}

