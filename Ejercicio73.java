import java.util.Scanner;

/*Ejercicio 16: Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo
 * (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. 
 * Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la
  *  posición N (N se lee por teclado).*/
public class Ejercicio73 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primerTrimestre[] = new int[5];
		int segundoTrimestre[] = new int[5];
		int tercerTrimestre[] = new int[5];
		float promedioTrimestre1 = 0, promedioTrimestre2 = 0, promedioTrimestre3 = 0, promedioAlumno;
		int contadorPrimer = 0, contadorSegundo = 0, contadorTercero = 0;
		int posicionN;
		int sumaAlumno = 0;

		System.out.println("Centro educativo fe y esperanza");
		System.out.println("Grupo 1 primer trimestre");
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite la nota  " + (i + 1) + " del alumno " + (i + 1) + ":");
			primerTrimestre[i] = entrada.nextInt();
		}
		System.out.println("Grupo 1 segundo trimestre");
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite la nota  " + (i + 1) + " del alumno " + (i + 1) + ":");
			segundoTrimestre[i] = entrada.nextInt();
		}
		System.out.println("Grupo 1 tercer trimestre");
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite la nota  " + (i + 1) + " del alumno " + (i + 1) + ":");
			tercerTrimestre[i] = entrada.nextInt();
		}

		/// promedio de trimestres
		for (int i = 0; i < 5; i++) {
			promedioTrimestre1 += primerTrimestre[i];
			contadorPrimer++;// o no le pongo contador y lo divido entre 5 y ya
		}

		for (int i = 0; i < 5; i++) {
			promedioTrimestre2 += segundoTrimestre[i];
			contadorSegundo++;
		}

		for (int i = 0; i < 5; i++) {
			promedioTrimestre3 += tercerTrimestre[i];
			contadorTercero++;
		}

		// pedimos posicion N para sacar el promedio del alumno
		do {
			System.out.print("\nPara sacar la media del alumno digite la posicion del alumno entre 0 y 4:");
			posicionN = entrada.nextInt();
		} while (posicionN > 4 || posicionN < 0);

		// sacamos la suma de las notas del alumno

		sumaAlumno = primerTrimestre[posicionN] + segundoTrimestre[posicionN] + tercerTrimestre[posicionN];
		promedioAlumno = sumaAlumno / 3;
		System.out.println("\nMostrando datos solicitados");
		System.out
				.println("El promedio  del grupo 1 en el primer trimestre es:" + promedioTrimestre1 / contadorPrimer);
		System.out
				.println("El promedio  del grupo 1 en el segundo trimestre es:" + promedioTrimestre2 / contadorSegundo);
		System.out
				.println("El promedio  del grupo 1 en el tercer trimestre es:" + promedioTrimestre3 / contadorTercero);
		System.out.println(
				"La media del alumno " + (posicionN + 1) + " en la posicion " + (posicionN) + " es:" + promedioAlumno);

	}
}
