import javax.swing.JOptionPane;
/*tambien se pueden poner 2 veces if */
/*pedir 2 numeros y decir cual es el mayor o si son iguales*/
public class Ejercicio9 {
	public static void main(String[] args) {
		int numero1,numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

		if (numero1>numero2) {
			JOptionPane.showMessageDialog(null, "El primer numero es mayor");
		}
		else if (numero1<numero2) {
			JOptionPane.showMessageDialog(null, "El segundo numero es mayor");
		}
		else {
			JOptionPane.showMessageDialog(null, "El primer numero es igual al segundo");

		}
	}
}
