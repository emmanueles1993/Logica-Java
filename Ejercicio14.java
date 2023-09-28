import javax.swing.JOptionPane;

/*Pedir 3 numeros y mostrarlos de mayor a menor*/
public class Ejercicio14 {
	public static void main(String[] args) {
		int numero1,numero2,numero3;
		
		numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
		numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
		numero3= Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero"));
		
		
		if (numero1>numero2&&numero2>numero3) {
		JOptionPane.showMessageDialog(null, "orden de mayor a  menor "+numero1+"-"+numero2+"-"+numero3);
		}

		else if (numero1>numero2&&numero3>numero2) {
		JOptionPane.showMessageDialog(null, "orden de mayor a  menor "+numero1+"-"+numero3+"-"+numero2);
		}
		
		else if (numero2>numero1&&numero1>numero3) {
		JOptionPane.showMessageDialog(null, "orden de mayor a  menor "+numero2+"-"+numero1+"-"+numero3);
		}
		
		else if (numero2>numero3&&numero3>numero1) {
		JOptionPane.showMessageDialog(null, "orden de mayor a  menor "+numero2+"-"+numero3+"-"+numero1);
		}
			
		else if (numero3>numero1&&numero1>numero2) {
		JOptionPane.showMessageDialog(null, "orden de mayor a  menor "+numero3+"-"+numero1+"-"+numero2);
		}
		else {
			JOptionPane.showMessageDialog(null, "orden de mayor a menor "+numero3+"-"+numero2+"-"+numero1);
		}
	}
}
