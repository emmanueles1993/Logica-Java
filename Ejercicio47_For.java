import javax.swing.JOptionPane;

/*Dadas 6 notas escribir la cantidad de alumnos aprobados, condicionados(=4)y suspensos*/
public class Ejercicio47_For {
	public static void main(String[] args) {
		int notas,contadorSuspensos=0,contadorCondicionados=0,contadorAprobados=0;
		
		for(int i=1; i<=6; i++) {
			notas = Integer.parseInt(JOptionPane.showInputDialog("Nota "+i +"\nIngrese la nota"));
				
			switch (notas) {
			case 0:
			case 1:
			case 2:
			case 3:
				contadorSuspensos++;
				break;
			case 4:
				contadorCondicionados++;
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				contadorAprobados++;
				break;
			default:
				break;
			}
			
		}
		JOptionPane.showMessageDialog(null, "Los alumnos suspensos son: "+contadorSuspensos);
		JOptionPane.showMessageDialog(null, "Los alumnos condicionados son: "+contadorCondicionados);
		JOptionPane.showMessageDialog(null, "Los alumnos aprobados son: "+contadorAprobados);
	}
}
