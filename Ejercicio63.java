import java.util.Scanner;

/*Leer los datos correspondiente a 2 tablas de 12 elementos numericos y mezclarlos en una tercera de la forma:
 * 3 de la tabla a , 3 de la tabla b, otros de la a, otros 3 de la b,etc*/
public class Ejercicio63 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[]=new int[12];
		int b[]=new int[12];
		int c[]=new int[24];
		int i,j;
		
		System.out.println("Guardando datos del arreglo 1");
		for( i= 0; i<12; i++){
			System.out.print("Digite el numero "+(i+1)+":");
			a[i]=entrada.nextInt();
		}
		
		System.out.println();
		System.out.println("Guardando datos del arreglo 2:");
		for( i= 0; i<12; i++){
			System.out.print("Digite el numero "+(i+1)+":");
			b[i]=entrada.nextInt();
		}
		
		//Ahora vamos a mezclar los 2 arreglos a[] y b[]
		//El iterador i sera para los arreglos a[] y b[]
		//Y el iterador j[] sera para el arregloc[]
		
		i=0;
		j=0;
		
		while(i<12) {
		//copiar los 3 elementos de a[]	
			for(int k=0;k<3;k++) {
				c[j] = a[i+k];//el k se agrega por que quiero copiar 3 elementos en una solo vuelta de un bucle seria asi:
			//	0+0 =0, 0+1=1, 0+2=2 posicion 0,1,2
				j++;//posicion 0,1 y 2
			}
		//Ahora copiamos 3 elementos de b[]
			for(int k=0;k<3;k++) {
				c[j] = b[i+k];
				j++;//posicion 3,4 y 5
				}
				i+=3;//aumente 3 mas hasta que llegue a 11, en total serian 4 vueltas 3+0=3, 3+1=4, 3+2=5
				
		}
		
		System.out.print("El arreglo resultante es: ");
		for(i=0; i<24;i++) {
			System.out.print(c[i]+" - ");
		}
	System.out.println();
	}
}
