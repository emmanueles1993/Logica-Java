import javax.swing.JOptionPane;

/*Una compañia de venta de carros usados, paga a su personal de ventas un salario de $1000 mensuales, mas una comision de $150 por
 *  cada carro vendido, mas el 5% del valor de la venta por carro. cada mes el capturista de la empresa ingresa en la computadora 
 *  los datos pertinentes. hacer un programa que calcule e imprima el salario mensual de un vendedor dado
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		int ventasCarro;
		float  comisionCarrovendido,valorCarro,comisionValorcarro, salarioTotal;
		final  int salarioMensual = 1000;//constante
		
		ventasCarro = Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de vehiculos vendidos"));
		valorCarro = Float.parseFloat(JOptionPane.showInputDialog("Indique el precio del vehiculo vendido"));
		
		comisionCarrovendido = ventasCarro*150;
		comisionValorcarro = valorCarro/100*5*ventasCarro;
		salarioTotal = salarioMensual+comisionCarrovendido+comisionValorcarro;
		
		JOptionPane.showMessageDialog(null, "El salario mensual del valor es: " + salarioTotal);
		
	}

}
