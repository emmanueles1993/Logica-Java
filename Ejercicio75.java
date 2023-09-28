import java.util.Scanner;

/*crear y cargar 2 matrices de tamaño 3x3, sumarlas y mostrar su suma*/
public class Ejercicio75 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		

		System.out.println("Ingresando elementos en la matriz A");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Ingrese el numero en la posicion[" + i + "][" + j + "]:");
				a[i][j] = entrada.nextInt();
			}

		}
		System.out.println(" ");
		System.out.println("Ingresando elementos en la matriz B");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Ingrese el numero en la posicion[" + i + "][" + j + "]:");
				b[i][j] = entrada.nextInt();
			}
			
		}
		for (int i = 0; i < 3;i++) {
			for (int j = 0;j < 3; j++) {
				c[i][j]= a[i][j]+b[i][j];
			}	
			}
		
		
		System.out.println(" ");
		System.out.println("Suma de las 2 matrices");
		for (int i = 0; i < 3;i++) {
			for (int j = 0;j < 3; j++) {
				System.out.print(c[i][j]+" ");
			}	
			}
	}
}
