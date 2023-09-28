import javax.swing.JOptionPane;

/*Construir un programa que simule el funcionamiento de una calculadora que pueda realizar las 4 funciones aritmeticas basicas
 * (suma, resta, multiplicacion y division) con valores numericos enteros. El usuario debe especificar la operacion 
 * con el primer caracter del primer parametro de la linea de comandos:S o s para la suma, R o r para la resta, P,p, M o m 
 * para el producto y D o d para la division*/
public class Ejercicio19_Switch {
	public static void main(String[] args) {
		int num1, num2, suma, resta, mult, div;
		char operacion;

		num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para realizar la operacion"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para realizar la operacion"));

		operacion = JOptionPane.showInputDialog("Digite una letra para realizar la operacion:s para sumar, r para restar, m o p para multiplar y d para dividir").charAt(0);

		switch (operacion) {
		case 's':
		case 'S':
			suma = num1 + num2;
			JOptionPane.showMessageDialog(null, "La suma es: " + suma);
			break;
		case 'r':
		case 'R':
			resta = num1 - num2;
			JOptionPane.showMessageDialog(null, "La resta es: " + resta);
			break;
		case 'p':
		case 'P':
		case 'm':
		case 'M':
			mult = num1 * num2;
			JOptionPane.showMessageDialog(null, "La multiplicacion es: " + mult);
			break;
		case 'd':
		case 'D':
			div = num1 / num2;
			JOptionPane.showMessageDialog(null, "La division es" + div);
			break;
		default:
			JOptionPane.showMessageDialog(null, "La opcion es incorrecta");
			break;

		}
	}
}
