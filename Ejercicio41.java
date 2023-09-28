import javax.swing.JOptionPane;

/*pedir 10 sueldos, mostrar su suma y cuantos hay mayores de $1000*/
public class Ejercicio41 {
	public static void main(String[] args) {
		int sueldos, suma = 0, contador = 0;

		for (int i = 1; i <= 10; i++) {
			sueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));
			suma += sueldos;

			if (sueldos > 1000) {
				contador++;
			}
			
		}
		JOptionPane.showMessageDialog(null, "la suma de todos  los sueldos es: " + "$"+suma);
		JOptionPane.showMessageDialog(null, "La cantidad de sueldos  mayores a $1000 es de : " + contador+ " sueldos");

	}
}
