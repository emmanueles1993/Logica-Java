import javax.swing.JOptionPane;

/*Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. con meses de 28, 30 y 31 dias sin años bisiestos*/
public class Ejercicio18 {
	public static void main(String[] args) {
int año,mes,dia;
		
		año= Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
		dia= Integer.parseInt(JOptionPane.showInputDialog("Digite el dia"));
		mes= Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
	
	if(año==0) {
		JOptionPane.showMessageDialog(null, "La fecha es incorrecta");
	}	
	else if(mes==2 && dia <=28 && dia>=1) {
		
		JOptionPane.showMessageDialog(null, "La fecha es correcta");	
	}
	else if(mes ==4 || mes ==6 || mes==9 || mes ==11 && dia <=30 & dia >=1 ) {
		JOptionPane.showMessageDialog(null, "La fecha es correcta");	

	}
	else if(mes ==1|| mes ==3 || mes==5 || mes==7 || mes == 8 || mes ==10 | mes==12 && dia <=31 & dia >=1 ) {
		JOptionPane.showMessageDialog(null, "La fecha es correcta");	
	}
	else {
		JOptionPane.showMessageDialog(null, "La fecha es incorrecta");	

	}
	
	}
}
