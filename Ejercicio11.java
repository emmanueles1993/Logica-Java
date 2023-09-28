import javax.swing.JOptionPane;

/*En megaplaza se hace un 20% de descuento a los clientes cuya compra supere los 300. ¿cual sera la cantidad que pagara una persona 
 * por su compra?*/
public class Ejercicio11 {
	public static void main(String[] args) {
		float compra,descuento;
		
		compra = Integer.parseInt(JOptionPane.showInputDialog("Indique el valor de su compra"));
		
		descuento = compra/100*20;
		
		if(compra>300) {
			JOptionPane.showMessageDialog(null, "la compra de " +compra +" tiene un descuento de: " + descuento + " debe pagar: $"+(compra-descuento));
		}
		else {
			JOptionPane.showMessageDialog(null, " su compra es de:$" +compra);
		}
	}
}
