import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* se declara una variable de tipo doble
		double x = 10000.0;*/
		
	/*	System.out.printf("%1.2f",x/3);
	/* en out.print que nos divida entre 3,
	 * entre comillasagregamos el formato "%1.2f"
	 * el println se cambia por printf.
	 * el 1.2 hace referencia a la cantidad de
	 * decimales que tendra e resultado*/
/*---------------------------------------------------------------*/

		/* lo qe haremos ahora es crear un aventana con JOptionPane
		 * en la cual introduciremos un numero y sera guardado en num1*/
	String num1 = JOptionPane.showInputDialog("Introduce un numero");
	
	/* transformano el String a tipo doble por el metodo sqrt de la clase
	 * Math lo exige al momento de sacar una raiz*/
	
	double num2 = Double.parseDouble(num1);/*le decimos que guarde la
	conversion de num1 a double*/
	
	System.out.print("la raiz de " + num2 + " es ");
	
	System.out.printf("%1.4f",Math.sqrt(num2));
	
	
	
	
	
	}
	
	
}
