import javax.swing.JOptionPane;

/*construir un programa que dado un numero total de horas devuelve el numero de semanas, dias y horas equivalentes.
 por ejemplo,dado un total de 1000 horas debe mostrar 5 semanas , 6 dias y 16 horas*/
public class Ejercicico7 {
	public static void main(String[] args) {
		int horasTotales,semanas,dias,horas;
		
	
		
		horasTotales= Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de horas"));
		
		
		semanas = horasTotales/168;//168 horas de una semana
		dias =horasTotales%168/24; ///1000/168=5 su residuo es 160 /24 =6
		horas = horasTotales%24;//1000 mod24=16
		

		
		JOptionPane.showMessageDialog(null, semanas + " semanas " + ", " +dias + " dias "+ " y "+ horas+ " horas");
		
	}

}
