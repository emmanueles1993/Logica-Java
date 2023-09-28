import javax.swing.JOptionPane;

/*Guillermo tiene n dolares .luis tiene la mitad de lo que posee guillermo.juan tiene la mitad de lo que poseen luis y guillermo 
 * juntos.hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres */
public class Ejercicio3 {

	public static void main(String[] args) {
		float guillermoDolares, luisDolares, juanDolares, totalDolares;

		guillermoDolares = Float.parseFloat(JOptionPane.showInputDialog("Ingrese cuantos dolares tiene guillermo"));

		luisDolares = guillermoDolares / 2;

		juanDolares = guillermoDolares / 2 + luisDolares / 2;

		totalDolares = guillermoDolares + luisDolares + juanDolares;

		JOptionPane.showMessageDialog(null, "El dinero que tiene guillermo, luis y juan en total es: " + totalDolares);
	}

}
