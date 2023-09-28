import java.util.Scanner;

/*leer 2 series de 10 enteros que estaran ordenados crecientemente, copiar(fusionar) las 2 tablas en una tercera de forma que
  sigan ordenadas*/
public class Ejercicio71 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		boolean creciente = true;

		System.out.println("Arreglo 1");
		do {
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite el numero " + (i + 1) + " de la posicion " + (i) + ":");
				a[i] = entrada.nextInt();

			}
			// comprobamos si esta ordenado
			for (int i = 0; i < 9; i++) {
				if (a[i] < a[i + 1]) {
					creciente = true;

				}
				if (a[i] > a[i + 1]) {
					creciente = false;
					break;// si ya se cumplio una vez significa que no esta ordenado
				}
			}
			// afuera del bucle for
			if (creciente == false) {
				System.out.println("El arreglo esta desordenado vuelva a digitarlo");
			}
		} while (creciente == false);

		System.out.println("\nArreglo 2");
		do {
			for (int i = 0; i < 10; i++) {
				System.out.print("Digite el numero " + (i + 1) + " de la posicion " + (i) + ":");
				b[i] = entrada.nextInt();
			}

			for (int i = 0; i < 9; i++) {
				if (b[i] < b[i + 1]) {
					creciente = true;
				}
				if (b[i] > b[i + 1]) {
					creciente = false;
					break;
				}
			}
			if (creciente == false) {
				System.out.println("El arreglo esta desordenado vuelva a digitarlo");

			}

		} while (creciente == false);
		
		int i=0;//iterador i para el arreglo a
		int j=0;//iterador j para el arreglo b
		int k=0;//iterador k para el arreglo c
		
		while(i<10 && j<10) {//se ejecutara mientras la condicion sea verdadera cuando uno de los 2 llegue a 10 termina
			if(a[i]< b[j]) {//si el elemento a es menor que el de b
				c[k] = a[i];//copiamos el elemento a
				i++;//avanzamos una posicion en a se convierte en 1
			}
			
			else {
				c[k]=b[j];//copiamos el elemento de b
				j++;//avanzamos una posicion mas en b y se convierte en 1
			}
			k++;//avanzamos una posicion en c , esta dara 19 vueltas en total ya que en esa vuelta uno de ellos llega a 10 y
			//termina
		}
//cuando salimos del while es porque un arreglo(a o b) se ha copiado completamente	se completa primero un arreglo el otro
		//falta el ultimo elemento	
		if(i==10) { //si i es igual a 10
			while(j<10) {
				c[k]=b[j];
				j++;// a j se le aumenta otra vuelta(10) para que copie el ultimo elemento
				k++;// a k tambien(20)
			}
		}
		else {
			while(i<10) {
				c[k] = a[i];
				i++;
				k++;
			}
		}
		
		System.out.println("\nEl arreglo c completo es: ");
		for(k=0;k<20;k++) {
			System.out.print(c[k]+"  - ");
		}
	}

}
