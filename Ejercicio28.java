import javax.swing.JOptionPane;

/*pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se han introducido*/
public class Ejercicio28 {
	public static void main(String[] args) {
		int numero;
		int contador=0;
		
		numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
		
		while(numero>=0) {
			JOptionPane.showMessageDialog(null, "El numero es: "+numero);
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
			contador++;
		}
		JOptionPane.showMessageDialog(null, "usted a introducido "+contador+" numeros positivos");
		
	/*	do {
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));

			while(numero>=0) {
				JOptionPane.showMessageDialog(null, "El numero es: "+numero);
				numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero:"));
				contador++;
			}
			JOptionPane.showMessageDialog(null, "usted a introducido "+contador+" numeros positivos");
			
		}while(numero>=0);*/
		
	}
}
