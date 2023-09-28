import javax.swing.JOptionPane;

/*pedir 10 numeros y escribir la suma total*/
public class Ejercicio35 {
	public static void main(String[] args) {
		int numero,suma=0;
		for (int i = 1; i <= 10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
			suma+=numero;
		}
		JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: +"+suma);
	}
}
