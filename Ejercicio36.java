import javax.swing.JOptionPane;

/*Diseñar un programa que muestre la suma de los 10 pŕimeros numeros impares introducidos por el usuario*/
public class Ejercicio36 {
	public static void main(String[] args) {
		int numero,suma = 0;
		
		for(int i=1; i<=10; i++) {
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			if(numero%2==1) {
				suma+=numero;

			}
			else {
				JOptionPane.showMessageDialog(null, "El numero debe ser impar");
				i--;
			}
		}
		JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: "+suma);
	}
}

	