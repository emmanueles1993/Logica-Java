import javax.swing.JOptionPane;
/*Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro.solo existen tres
 *  productos con precios:
 * 1-0,6 $/litro
 * 2-3 $/litro
 * 3- 1,25 $/litro*/
public class Ejercicio46_For_Dowhile_If_Switch {
	public static void main(String[] args) {
		int codigoArticulo, cantidadLitros, facturacionTotal=0, litrosArticulo1=0,conteomayor600=0 ;
		float precioLitro=0, valorDefactura;

		for (int i = 1; i <= 5; i++) {
			do {
				codigoArticulo = Integer.parseInt(
						JOptionPane.showInputDialog("Articulo numero " + i + " \nIngrese" + " el codigo del articulo"));	
			}while(codigoArticulo<1 ||codigoArticulo>3);
			
			cantidadLitros = Integer
					.parseInt(JOptionPane.showInputDialog("Articulo numero " + i + " \nIngrese litros vendidos"));
			
			switch(codigoArticulo) {
			case 1: precioLitro =0.6f;break;
			case 2: precioLitro =3f;break;
			case 3: precioLitro =1.25f;break;

			}
			
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

