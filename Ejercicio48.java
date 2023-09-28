import javax.swing.JOptionPane;

/*Dadas 6 notas escribir la cantidad de alumnos aprobados, condicionados(=4)y suspensos*/
public class Ejercicio48 {
	public static void main(String[] args) {
		int contadorSuspensos=0,contadorCondicionados=0,contadorAprobados=0;
		float notas;
		
		for(int i=1; i<=6; i++) {
			do {
				notas = Float.parseFloat(JOptionPane.showInputDialog("Digite nota " +i+ " \nentre 0 y 10"));	
			}while(notas<0 || notas>10);
			
			if (notas ==4) {
				contadorCondicionados++;
			}
			
			else if(notas>4) {
				contadorAprobados++;
			}
			else {
				contadorSuspensos++;
			}
		}
		JOptionPane.showMessageDialog(null, "Los alumnos suspensos son: "+contadorSuspensos);
		JOptionPane.showMessageDialog(null, "Los alumnos condicionados son: "+contadorCondicionados);
		JOptionPane.showMessageDialog(null, "Los alumnos aprobados son: "+contadorAprobados);
		
	}
}
