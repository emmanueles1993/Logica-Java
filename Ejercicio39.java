import javax.swing.JOptionPane;

/*Pedir un numero y calcular su factorial*/
public class Ejercicio39 {
	public static void main(String[] args) {
		int numero,factorial=1;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
		for(int i=1;i<=numero;i++) {
			factorial = factorial*i;

		}
		JOptionPane.showMessageDialog(null, "El factorial del numero es: "+factorial);

	}
	
}
