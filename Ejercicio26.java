import javax.swing.JOptionPane;

/*leer un numero e indica si es positivo o negativo el proceso se repetira hasta que se introduzca un 0 */

public class Ejercicio26 {
	public static void main(String[] args) {
		int numero;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
		
		while(numero!=0) {
			if(numero>0) {
				JOptionPane.showMessageDialog(null, "El numero: "+numero+ " Es positivo");
			}
			else {
				JOptionPane.showMessageDialog(null, "El numero: "+numero+ " Es negativo");
			}
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
		}
	}
}
