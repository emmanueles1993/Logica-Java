import javax.swing.JOptionPane;

/*leer un numero e indica si es positivo o negativo el proceso se repetira hasta que se introduzca un 0 */
public class Ejercicio24 {
	public static void main(String[] args) {
		int numero;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));

		while (numero > 0) {
			JOptionPane.showMessageDialog(null, "El numero: " + numero + " es positivo");
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
			while (numero < 0) {
				JOptionPane.showMessageDialog(null, "El numero: " + numero + " es negativo");
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));

			}
		}
		

	}
}
