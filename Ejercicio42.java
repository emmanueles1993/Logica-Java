import javax.swing.JOptionPane;

/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 
 * y la cantidad de alumnos que midan mas de 1.75 */
public class Ejercicio42 {
	public static void main(String[] args) {
		int edad,contadorEdad=0,contadorAltura=0,contadorMayores=0,contador=0,sumaEdad=0;
		double altura,sumaAltura=0;
		
		for(int i=1; i<=5; i++) {
			edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno"+i));
			altura= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura"+i));
			sumaEdad+=edad;
			contadorEdad++;
			sumaAltura+=altura;
			contadorAltura++;
			if(edad>18) {
				contadorMayores++;
			}
			if(altura>1.75) {
				contador++;

			}
		}
		JOptionPane.showMessageDialog(null, "La edad media de los alumnos es: "+ sumaEdad/contadorEdad);
		JOptionPane.showMessageDialog(null, "La altura media de los alumnos es: "+ sumaAltura/contadorAltura);
		JOptionPane.showMessageDialog(null, "La cantidad de alumnos mayores a 18 es: "+ contadorMayores);
		JOptionPane.showMessageDialog(null, "La cantidad de alumnos mayores a 1.75 es: "+ contador);

	}
}
