import javax.swing.JOptionPane;

/*Hacer un programa que simule un cajero automatico con saldo inicial de 1000 dolares, con el siguiente menu de opciones:
  1.Ingrese dinero a la cuenta
  2.Retirar dinero de la cuenta
  3.Salir*/
public class Ejercicio21 {
	public static void main(String[] args) {
		final int saldoInicial = 1000;
		int opcion;
		int ingreso, saldoActual, retiro;

		opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
				+ "1.Ingrese dinero a la cuenta\n" + "2.Retirar dinero de la cuenta\n" + "3.Salir"));

		switch (opcion) {
		case 1:
			ingreso = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a ingresar"));
			saldoActual = saldoInicial + ingreso;
			JOptionPane.showMessageDialog(null, "Su nuevo saldo es: " + saldoActual);
			break;
		case 2:
			retiro = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor a retirar"));
			if (retiro > saldoInicial) {
				JOptionPane.showMessageDialog(null, "saldo insuficiente para retiro");
			} else {
				saldoActual = saldoInicial - retiro;
				JOptionPane.showMessageDialog(null, "Su nuevo saldo es: " + saldoActual);
			}
			break;
		case 3:
			break;
		default:
			JOptionPane.showMessageDialog(null, "La opcion ingresada no es correcta");
			break;

		}
	}
}
