/*los arrays son coleciones de un mismo tipo de datos
 la sintaxis para declarar e inicializar un array sera:
 Tipo_de_variable[]Nombre_del_array = new tipo_de_variable[dimension];
 Ejemplos:
 -int[]edad= new int[4];
 -long[]edad=new long[4;
 -float[]estatura =new float[3];
 -double[]estatura=new double[3];
 -boolean[]estado=new boolean[5]
; -char[]sexo=new char[2]
; -String[]nombre = new String[2];
 * */

public class Ejercicio54_Array_Unidimensional {
	public static void main(String[] args) {
		int[]numeros = new int[3];
		
		int[]numeros1={15,17,19};//primera forma,indice 0,1 y2
		
		numeros[0] =5;//indice o posicion 0
		numeros[1] =7;//indice 1
		numeros[2] =9;//indice 2
		
		//System.out.println(numeros[0]);
		//System.out.println(numeros1[2]);
		
		for(int i=0; i<3; i++) {
			System.out.println(numeros[i]);
			System.out.println(numeros1[i]);

		}
	}
}
