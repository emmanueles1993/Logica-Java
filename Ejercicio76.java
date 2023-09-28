import java.util.Scanner;

/*Crear y cargar una matriz de tamaño 3x3,trasponerla y mostrarla*/
public class Ejercicio76 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int matrizTranspuesta[][]= new int[3][3];
		
		//llenando matriz
		System.out.println("Ingresando datos en la matriz");
		for(int i =0 ; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Digite el numero en la posicion["+i+"]["+j+"]:");
				matriz[i][j] = entrada.nextInt();	
			}		
		}
		//matriz transpuesta
		for(int i =0; i<3; i++ ) {
			for(int j=0; j<3; j++) {
				matrizTranspuesta[i][j]= matriz[j][i];
			}
		}
		//mostrando matriz original
		System.out.println(" ");
		System.out.println("Matriz");
		for(int i =0 ; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+matriz[i][j]+"]"+" ");	
				
			}
			System.out.println("");
		}
		//mostrando matriz transpuesta
		System.out.println("Matriz transpuesta");
		for(int i =0 ; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+matrizTranspuesta[i][j]+"]"+" ");	
				
			}
			System.out.println("");
		}
	}
}
