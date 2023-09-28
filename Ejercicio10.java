import javax.swing.JOptionPane;

/*Programa que lea un caracter por teclado y compruebe si es una letra mayuscula*/
public class Ejercicio10 {
	public static void main(String[] args) {
		char letra;
		/*String palabra;*/
		
		letra =JOptionPane.showInputDialog("Digite un caracter").charAt(0);
		/*palabra =JOptionPane.showInputDialog("Cual es tu nombre: ");*/
		
		if(Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "La letra es mayuscula");
		}
		else{
			JOptionPane.showMessageDialog(null, "La letra es minuscula");

		}
	}
}
