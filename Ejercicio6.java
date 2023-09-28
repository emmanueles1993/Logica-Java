import javax.swing.JOptionPane;

/*Hacer un programa que calcule el cuadrado de una suma (a+b)^2 = a^2 +b^2+2ab()*/
public class Ejercicio6 {
	public static void main(String[] args) {
		double a,b,resultado;
		
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de a: "));
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de b: "));
		
		resultado = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);
		
		JOptionPane.showMessageDialog(null, "El resultado es: " +resultado);

	}
 
}
