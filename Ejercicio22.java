import javax.swing.JOptionPane;

/*Hacer un programa que pase de Kg a otra unidad de medidad de masa, mostrar en pantalla un menu con las opciones posibles*/
public class Ejercicio22 {
	public static void main(String[] args) {
		float kilogramo,hectogramo,decagramo,gramo,decigramo,centigramo,miligramo;
		int opcion;
		
		kilogramo=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos"));
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
				+"1.Hectogramos\n"
				+"2.Decagramos\n"
				+"3.Gramos\n"
				+"4.Decigramos\n"
				+"5 Centigramos\n"
				+"6 Miligramos"));
		switch(opcion) {
		case 1:
			hectogramo = kilogramo*10;
			JOptionPane.showMessageDialog(null, "Su conversion es: "+hectogramo+ " Hectogramos");
			break;
		case 2:
			decagramo = kilogramo*100;
			JOptionPane.showMessageDialog(null, "Su conversion es: "+decagramo+ " decagramos");
			break;
		case 3:
			gramo = kilogramo*1000;
			JOptionPane.showMessageDialog(null, "Su conversion es: "+gramo+ " gramos");
			break;
		case 4:
			decigramo = kilogramo*10000;
			JOptionPane.showMessageDialog(null, "Su conversion es: "+decigramo+ " decigramos");
			break;
		case 5:
			centigramo = kilogramo*100000;
			JOptionPane.showMessageDialog(null, "Su conversion es: "+centigramo+ " centigramos");
			break;
		case 6:
			miligramo = kilogramo*1000000;
			JOptionPane.showMessageDialog(null, "Su conversion es: "+miligramo+ " miligramos");
			break;
			default:
				JOptionPane.showMessageDialog(null, "Digito invalido adios");
				break;
			
		
		}
	}
}
