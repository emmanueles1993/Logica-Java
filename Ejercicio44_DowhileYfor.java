import javax.swing.JOptionPane;

/*pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero */

public class Ejercicio44_DowhileYfor {
	public static void main(String[] args) {
		int numero;
		do {
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		}while(numero<0 || numero >10);
		
		JOptionPane.showMessageDialog(null, "La multiplicacion del numero "+numero+ " es:");
		for(int i=1; i<=10; i++) {
			JOptionPane.showMessageDialog(null, numero+ " * " +i+" = "+numero*i);
		}
	}
}
