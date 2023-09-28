import javax.swing.JOptionPane;

/*leer un numero e indica si es positivo o negativo el proceso se repetira hasta que se introduzca un 0 */
public class Ejercicio25 {
	public static void main(String[] args) {
		int numero;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));

        while(numero != 0){
            while(numero >0){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es positivo");
                break;
            }
            while(numero <0 ){
                JOptionPane.showMessageDialog(null, "El numero "+numero+" es negativo");
                break;
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
	}
}
