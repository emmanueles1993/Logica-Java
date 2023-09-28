import javax.swing.JOptionPane;

/*pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero */
public class Ejercicio43 {
	public static void main(String[] args) {
		int numero, mult;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 0 y 10"));
		for (int i = 1; i <= 10; i++) {
			if (numero > -1 && numero <= 10) {
				mult = numero * i;
				JOptionPane.showMessageDialog(null, "La tabla de multiplicar del numero " + numero + " es: " + numero
						+ " * " + i + " = " + mult);
			} else {
				JOptionPane.showMessageDialog(null, "No ha ingresado un numero entre 0 y 10 adios" + "!");
				break;
			}
		}
	}
}
