import java.util.*;/*importamos la clase util*/

public class entrada_ejemplo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ingresamos la variable Scanner, dentro del
		 * las caracteristicas se agrega la palabra new
		 */
		Scanner entrada = new Scanner (System.in);/*System.in 
		es para ingresar informacion*/
		System.out.println("Introduce tu nombre, por favor");
		
		/*si queremos guardar en una variable String lo que el usuario
		 * lo que el usuario introduzca en consola en el caso de ser texto
		 * 
		 * primero declaramos la variable String, agregamos el metodo
		 *  nextLine, pero tenemos que agregar el objeto antes del metodo.
		 */
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad");
		
		int edad = entrada.nextInt(); /* se almacena en una variable
		la edad del usuario, esto con el metodo nextInt*/
		
		System.out.println("Hola " + nombre_usuario + 
				" el año que viene tendras " + (edad+1) + " años");
		/* El out.print se concatena con las variables.*/
		
	}
	

}
