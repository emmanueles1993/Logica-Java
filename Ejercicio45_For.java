import javax.swing.JOptionPane;

/*Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. 
 * En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide 
 * de 5 facturas introducidas: Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas
 *  se emitieron de más de $600.*/
public class Ejercicio45_For {
	public static void main(String[] args) {
		int codigoArticulo, cantidadLitros, facturacionTotal=0, litrosArticulo1=0,conteomayor600=0 ;
		float precioLitro, valorDefactura;

		for (int i = 1; i <= 5; i++) {
			codigoArticulo = Integer.parseInt(
					JOptionPane.showInputDialog("Articulo numero " + i + " \nIngrese" + " el codigo del articulo"));
			cantidadLitros = Integer
					.parseInt(JOptionPane.showInputDialog("Articulo numero " + i + " \nIngrese litros vendidos"));
			precioLitro = Float
					.parseFloat(JOptionPane.showInputDialog("Articulo numero " + i + " \nIngrese el valor del litro"));
			
			valorDefactura =(float) cantidadLitros*precioLitro;	
			facturacionTotal+=valorDefactura;
			
			if(codigoArticulo==1) {
				litrosArticulo1+=cantidadLitros;
			}
			
			if(valorDefactura>600) {
				conteomayor600++;
			}
		}
		JOptionPane.showMessageDialog(null, "La facturacion total es: "+facturacionTotal);
		JOptionPane.showMessageDialog(null, "La cantidad de litros vendidos del articulo 1 es: "+litrosArticulo1);
		JOptionPane.showMessageDialog(null, "La cantidad de facturas por mas de 600 dolares  es: "+conteomayor600);

	}
}

