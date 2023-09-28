import javax.swing.JOptionPane;

/*Hacer un programa que tome 2 numeros y diga si ambos son pares e impares*/
public class Ejercicio13 {
	public static void main(String[] args) {
		int numero1,numero2;
		
		numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
		numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
		
		if(numero1 %2 == 0 && numero2 %2 == 0) {
			JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
		}
		else if(numero1 %2 == 1 && numero2 %2 == 1) {
			JOptionPane.showMessageDialog(null, "Ambos numeros son impares");
		}
		else {
			JOptionPane.showMessageDialog(null, "Hay un numero par y otro impar");
		}
	}
}
