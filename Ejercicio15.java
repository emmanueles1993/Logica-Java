import javax.swing.JOptionPane;

/*pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene*/
public class Ejercicio15 {
	public static void main(String[] args) {
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0-99999"));

		if ( numero < 10) {
			JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
			
		} else if ( numero < 100) {
			JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
			
		} else if (numero < 1000) {
			JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
			
		} else if ( numero < 10000) {
			JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
			
		} else if ( numero < 100000) {
			JOptionPane.showMessageDialog(null, "El numero tiene 5 cifras");
			
		} else {
			JOptionPane.showMessageDialog(null, "El numero tiene mas de 5 cifras");
		}
	}
}
