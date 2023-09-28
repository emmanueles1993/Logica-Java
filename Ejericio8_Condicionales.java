import javax.swing.JOptionPane;

/*Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10*/
public class Ejericio8_Condicionales {
	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero y le indicaremos si es multiplo de 10 o no"));
		
		if(numero%10==0 && numero!=0) {
			JOptionPane.showMessageDialog(null, "El numero es multiplo de 10");
		}
		else{
			JOptionPane.showMessageDialog(null, "El numero no es multiplo de 10");
	
		}
	}
}
