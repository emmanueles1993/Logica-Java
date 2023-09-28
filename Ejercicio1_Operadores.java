import javax.swing.JOptionPane;
/*escriba un programa que calcule e imprima la suma de 3 calificaciones*/
public class Ejercicio1_Operadores {
	public static void main(String[] args) {
		Double nota1,nota2,nota3,suma;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la primer nota por favor"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite la segunda nota por favor"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite la tercer nota por favor"));

		suma = nota1+nota2+nota3;
		JOptionPane.showMessageDialog(null, "la suma de las calificaciones es :"+suma );
	}
}
