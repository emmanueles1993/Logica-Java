import javax.swing.JOptionPane;
/*recomendable usar los do while cuando hay un rango, en este al menos se ejecuta una vez la instruccion*/
/*realizar un juego para adivinar un numero. para ello generar un numero aleatorio entre 0-100, y luego ir pidiendo 
 * numeros indicando "Es mayor" o "es menor" segun sea mayor o menor con respecto a n. el proceso  termina cuando el
 *  usuario acierta y mostrar el numero de intentos*/
public class Ejercicio29_Dowhile {
	public static void main(String[] args) {
		int numero, contador = 0;
		int aleatorio = (int) (Math.random() * 100);
		System.out.println(aleatorio);

		do {
		
			numero=Integer.parseInt(JOptionPane.showInputDialog("Adivine un numero entre 0 y 100"));
		
		if(aleatorio>numero) {
			JOptionPane.showMessageDialog(null, "El numero es mayor");
			
		}
		else if(aleatorio<numero){
			JOptionPane.showMessageDialog(null, "El numero es menor");

		}
		contador++;
		}while(aleatorio!=numero);
		
		JOptionPane.showMessageDialog(null, "Usted adivino el numero en "+contador+" Intentos");

	}

}
