import javax.swing.JOptionPane;

/*pedir un numero n, introducir n sueldos, y mostrar el sueldo maximo*/
public class Ejercicio49 {
	public static void main(String[] args) {
		int numeroN, sueldo,sueldoMaximo=0;
		
		numeroN=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		
		for(int i=1; i<=numeroN; i++) {
			sueldo=Integer.parseInt(JOptionPane.showInputDialog("Introduce "+numeroN+" sueldos"+"\nsueldo "+i));
			
			//260 560 240
			if(sueldo>sueldoMaximo) {
				sueldoMaximo=sueldo;
			}
		}
	JOptionPane.showMessageDialog(null, "El sueldo maximo es: "+ sueldoMaximo);	
	}
}
