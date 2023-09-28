import javax.swing.JOptionPane;

/*Hacer un programa que calcule e imprima el salario semanal de un empleado a partir de sus horas semanales trabajadas y de su 
 * salario por hora*/  
public class Ejercicio2 { 
	public static void main(String[] args) {
		
		int salarioHora;
		float horasSemanales,salarioSemanal;
		
		salarioHora = Integer.parseInt(JOptionPane.showInputDialog("Indique su salario por hora "));
		horasSemanales = Float.parseFloat(JOptionPane.showInputDialog("Indique cuantas horas trabajo en la semana "));

		
		salarioSemanal= salarioHora*horasSemanales;
		
		JOptionPane.showMessageDialog(null, "El salario semanal del empleado es: "+ salarioSemanal);
		
	}

	
	
	
}
