import javax.swing.JOptionPane;

/*pedir 10 numeros y mostrar al final si se ha introducido alguno negativo*/
public class ejercicio50 {
	public static void main(String[] args) {
		int numero,contador=0;
		
		for(int i=1; i<=10;i++) {
			numero= Integer.parseInt(JOptionPane.showInputDialog("Digite el numero " +i));
			
			if(numero<0) {
				contador++;
			}
		}
		JOptionPane.showMessageDialog(null, "Los numero negativos que se han introducidos han sido "+contador);
	}
}
