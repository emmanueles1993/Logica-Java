import javax.swing.JOptionPane;

/*pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. si el dia es correcto, si el año es correcto,
 *  si el mes es correcto*/
public class Ejercicicio17 {
	public static void main(String[] args) {
		int año,mes,dia;
		
		año= Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
		dia= Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
		mes= Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
	
		if(dia >=1 && dia <=30) {//condicionales anidados
			if(mes>=1 && mes <=12) {
				if(año!=0) {
				JOptionPane.showMessageDialog(null, "La fecha es correcta");	
				}
				else {
					JOptionPane.showMessageDialog(null, "La fecha es incorrecta, año incorrecto");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "La fecha es incorrecta, mes incorrecto");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "La fecha es incorrecta, dia incorrecto");
		}
	}
}
