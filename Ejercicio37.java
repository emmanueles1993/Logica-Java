import javax.swing.JOptionPane;

/*Diseñar un programa que muestre la multiplicacion de los 10 pŕimeros numeros impares  introducidos por el usuario*/
public class Ejercicio37 {
	public static void main(String[] args) {
		int numero,mult=1;
		
		for(int i=1; i<=10; i++) {
			numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
			if(numero%2==1) {
				mult = mult*numero;
			}
			
			else {
				JOptionPane.showMessageDialog(null, "El numero debe ser impar");
				i--;
			}
			JOptionPane.showMessageDialog(null, "La multiplicacion de los numeros ingresados es: "+mult);

		}
	}
}
