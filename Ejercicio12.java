import javax.swing.JOptionPane;

/*Un obrero necesita calcular su salario semanal , el cual se obtiene de la siguiente manera:
 * si trabaja 40 horas o menos se le paga $16 por hora. 
 * si trabaja  mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		int horasTrabajadas, salarioSemanal;
		
		horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Indique las horas trabajadas en la semana"));
		
		if(horasTrabajadas<=40) {
			salarioSemanal= horasTrabajadas*16;
		}
		else  {
			salarioSemanal=(40*16) +((horasTrabajadas-40)*20);//horas trabajadas 42-40=2*20=40+40*16=640=680
		}
		JOptionPane.showMessageDialog(null,"El salario total es: "+salarioSemanal);
	}
}
