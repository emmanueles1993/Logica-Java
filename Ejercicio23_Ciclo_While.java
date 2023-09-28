import javax.swing.JOptionPane;
/*recomendable usar cuando queremos ejecutar una accion muchas veces, hasta que hacemos lo contrario y el bucle se
  rompe ,el while es diferente al if , por que es ciclo se ejecuta varias veces y el if solo se ejecuta una vez
 * tambien se pueden hacer con un do while*/
/*leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo  */
public class Ejercicio23_Ciclo_While{
	public static void main(String[] args) {
		int numero,cuadrado;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
		
		while(numero>=0) {
			cuadrado=(int) Math.pow(numero, 2);
			JOptionPane.showMessageDialog(null, "El numero "+numero+" elevado al cuadrado es: "+cuadrado);
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
		}
	}
}