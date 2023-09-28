import javax.swing.JOptionPane;

/*Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente , Suficiente, Buena, Sobresaliente y Excelente*/
public class Ejercicio20 {
	public static void main(String[] args) {
		int nota;

		nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota de 0-10"));

		switch (nota) {
		case 0:
		case 1:
		case 2:
			JOptionPane.showMessageDialog(null, "Su nota es insuficiente");
			break;
		case 3:
		case 4:
		case 5:
			JOptionPane.showMessageDialog(null, "Su nota es suficiente");
			break;
		case 6:
		case 7:
			JOptionPane.showMessageDialog(null, "Su nota es buena");
			break;
		case 8:
		case 9:
			JOptionPane.showMessageDialog(null, "Su nota es sobresaliente");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "Su nota es excelente");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El rango no  es valido , usted deberia estar en la nasa");
			break;
		}
	}
}
