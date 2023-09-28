import javax.swing.JOptionPane;

/*leer numeros hasta que se introduzca un 0 para cada uno indicar si es par o impar*/
public class Ejercicio27 {
	public static void main(String[] args) {
		int numero;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		while(numero!=0) {
			if(numero%2==0) {
				JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
			}
			else {
				JOptionPane.showMessageDialog(null, "El numero "+numero+" es impar");
			}
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

		}
	}
}
