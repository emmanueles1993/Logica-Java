import javax.swing.JOptionPane;

/*pedir 10 numeros e indicar cual es el mayor*/
public class Ejercicio52 {
	public static void main(String[] args) {
		int numero, numeroMayor = 0;

		for (int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " + i));

			if (numero > numeroMayor) {
				numeroMayor = numero;
			}
		}
		JOptionPane.showMessageDialog(null, "El numero mayor es: " + numeroMayor);
	}
}
