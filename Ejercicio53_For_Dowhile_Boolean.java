import javax.swing.JOptionPane;

/*pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso, el reprobado saca menos de 5*/
public class Ejercicio53_For_Dowhile_Boolean {
	public static void main(String[] args) {
		int calificaciones,contador=0;
		boolean suspensos= false;
		
		for(int i=1 ; i<=5; i++) {
			do {
				calificaciones =Integer.parseInt(JOptionPane.showInputDialog("Digite la calificacion: "+i));
			}while(calificaciones<0 || calificaciones>10);
		
			if(calificaciones <5) {
				suspensos=true;
				contador++;
			}
		}
		if(suspensos==true) {
			JOptionPane.showMessageDialog(null, "Hay algun alumno reprobado y son: "+contador);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Todos los alumnos han sido aprobados");

		}
	}
}
