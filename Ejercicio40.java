import javax.swing.JOptionPane;

/*pedir 10 numeros mostrar la media de los numeros positivos, la media de los numeros negativos y la cantidad de 0*/
public class Ejercicio40 {
	public static void main(String[] args) {
	int numero,sumap=0,suman=0,ceros=0;
		double contadorp=0, contadorn=0;
		
	for(int i=1;i<=10;i++) {
		numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		if(numero>0) {
			sumap = sumap+numero;
			contadorp++;
			
		}
		else if(numero<0) {
			suman = suman+numero;
			contadorn++;
		}
		else   {
		 	ceros++;
		}
		
	}
	JOptionPane.showMessageDialog(null, "La media de los numeros positivos es "+ sumap/contadorp);
	JOptionPane.showMessageDialog(null, "La media de los numeros negativos es "+suman/contadorn);
	JOptionPane.showMessageDialog(null, "El numero 0 se ha ingresado "+ceros );
	

	}
}
