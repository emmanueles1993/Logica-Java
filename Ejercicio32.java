import javax.swing.JOptionPane;

/*Pedir un numero N, y mostrar todos los numeros del 1 al N*/
public class Ejercicio32 {
	public static void main(String[] args) {
		int numero,i=1;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		while(i<=numero) {
			JOptionPane.showMessageDialog(null, "la secuencia de numero es: "+i);
			System.out.println("La secuencia de numero es: "+i);
			i++;
		}
	}
}

