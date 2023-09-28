import javax.swing.JOptionPane;

/*pedir 10 numeros y mostrar al final si se ha introducido alguno negativo*/

public class Ejercicio51_For_Boolean {
	public static void main(String[] args) {
		int numero;
		boolean hay_negativos = false;
		
		for (int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + i));
			
			if(numero<0) {
				hay_negativos =true;
			}
			
		}
		if(hay_negativos==true) {
			JOptionPane.showMessageDialog(null, "Al menos hay un numero negativo");
		}
		else {
			JOptionPane.showMessageDialog(null, "No existe ningun numero negativo");

		}
	}
}
