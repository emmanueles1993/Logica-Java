
import javax.swing.JOptionPane;

/*La calificacion final de un estudiantes de informatica se calcula con base a las calificaciones de 4 aspectos de su rendimiento
 *  academico:participacion,primer examen parcial, segundo examen parcial y examen final. sabiendo que las calificaciones anteriores
 *   entran a la calificacion final con ponderaciones del 10%, 25%, 25% y 40% hacer un programa que calcule e imprima la 
 *   calificacion final obtenida por un estudiante
 */
public class Ejercicio5 {
	public static void main(String[] args) {
		float participacion ,examen1, examen2, examenFinal,calificacionFinal;
		
		participacion = Float.parseFloat(JOptionPane.showInputDialog("Indique cuanto saco el alumno en participacion"));
		examen1 = Float.parseFloat(JOptionPane.showInputDialog("Indique cuanto saco el alumno en el examen 1"));
		examen2 = Float.parseFloat(JOptionPane.showInputDialog("Indique cuanto saco el alumno en el examen 2"));
		examenFinal = Float.parseFloat(JOptionPane.showInputDialog("Indique cuanto saco el alumno en el examen final"));
		
		calificacionFinal = participacion/100*10+examen1/100*25+examen2/100*25+examenFinal/100*40;
		
		JOptionPane.showMessageDialog(null, "La calificacion final del estudiante es: " +calificacionFinal);
		

	}
}
