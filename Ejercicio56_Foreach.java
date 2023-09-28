
public class Ejercicio56_Foreach {
	public static void main(String[] args) {
		String nombres[] = {"Mateo","Lucas","Juan","Marcos","Jesus"};
		
		/*for(int i=0; i<nombres.length; i++) {//metodo length devuelve la longitud que tiene el arreglo
			System.out.println(nombres[i]);
		}*/
		for(String i:nombres) {//bucle foreach, tipo de dato, el iterador(cualquier nombre) y el nombre del array
			System.out.println("Los nombres son: "+i);
		}
	}
}
