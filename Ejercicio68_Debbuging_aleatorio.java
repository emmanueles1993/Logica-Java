

import javax.swing.JOptionPane;

public class Ejercicio68_Debbuging_aleatorio {
	public static void main(String[] args) {
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));

		int numAleat[] = new int[elementos];
		for (int i = 0; i < numAleat.length; i++) {
			numAleat[i] = (int) (Math.random() * 100);

		}

		for (int elem : numAleat) {
			System.out.println(elem);
		}

	}
}

