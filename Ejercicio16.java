import javax.swing.JOptionPane;

/*pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. suponiendo que todos los meses son de 30 dias*/
public class Ejercicio16 {
	public static void main(String[] args) {
		int año, dia ,mes;
		
		año= Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
		dia= Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
		mes= Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));

		if(mes>12||dia>30||mes<1||dia<1||año<1) {
			JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
		}
		else {
			JOptionPane.showMessageDialog(null, "La fecha es correcta");

		}
		
	}
}
