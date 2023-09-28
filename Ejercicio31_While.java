import javax.swing.JOptionPane;

/*Pedir numeros hasta que se introduzca uno negativo, y calcular la media*/

public class Ejercicio31_While {
	public static void main(String[] args) {
		int numero, suma = 0, elementos=0;
		float media;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		while(numero>=0) {
			suma +=numero;
			elementos++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
	
		}
		if(elementos==0) {
			JOptionPane.showMessageDialog(null, "Error la division entre 0 no existe");
		}
		else {
			media=(float)suma/elementos;
			JOptionPane.showMessageDialog(null, "La media es: "+media);

		}
	}
}
