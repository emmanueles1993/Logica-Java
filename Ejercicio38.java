import javax.swing.JOptionPane;

/*Diseñar un programa que muestre la multiplicacion de los 10 pŕimeros numeros impares  */

public class Ejercicio38 {
	public static void main(String[] args) {

		int mult=1;
		
		for(int i=1; i<=20;i+=2) {
			mult*=i;
			
		}
		JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ mult);
	}
}
