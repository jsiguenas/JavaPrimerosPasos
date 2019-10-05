import javax.swing.*;

public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*agregamos un variable de tipo String y una objeto nombre_usuario
			 * a este le declaramos el metodo JOptionPane + mas el metodo, entre
			 * parentecis ingresamos el mensaje String.
			 * lo que hacemos con este metedo es crear un cuadro o panel en la que
			 * introduciremos el nombre , en cuadro de texto y aparecera la opcion
			 * aceptar y cancelar y se almacenara el nombre de usuario.
			 */
	String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre");
		
	/* en este caso se agrego primero el metodo int, pero la opcion showInputDialog
	 * solo acepta el metodo String y se cambia los metodos de int a String
	 */
	
	String edad = JOptionPane.showInputDialog("Ingresa tu edad");
		
	/*Convertimos el String edad a entero con el metodo parseInt(edad) que pertenece a la
	 * clase integer. conseguiremos que dentro de la variable edad_usuario pasarlo a entero
	 *  que corresponde a edad con el metodo parseInt. en el out.print en la concatenacion 
	 *  edad agregamos (edad_usuario+1)*/	
	
	int edad_usuario = Integer.parseInt(edad);
	
	/* utilizando en operador incremento , hacemos lo siguiente alavariable edad usuario
	 * . en el out.print concatenacion (edad_usuario+1) solo dejamos edad_usuario sin
	 * parentesis*/
	
	edad_usuario++; /* nos mostrara el resultado + 1 */
	
		
	System.out.println("Hola " + nombre_usuario + " tienes " + 
	edad_usuario + " años");
	/* al ejecutar el cuadro nos acepta correctamente los datos ingresados pero
	 * en el ingreso de edad a la cual se le suma + 1 (como referencia de cual 
	 * sera tu edad al proximo año este lo agrupa en uno solo por el motivo del
	 * metodo utilizado String la cual acepta solo ingreso de datos.
	 * para que el cuadro funcione correctamente se hacen algunos cambios.
	 *  
	 * 
	 * */
	
	}
	

}
