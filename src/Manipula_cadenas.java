
public class Manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "Jonathan";
		
		System.out.println("Mi nombre es "   + nombre + "\r");
		System.out.println("Mi nombre tiene " + nombre.length() 
		+ " letras" + "\r");
		
		System.out.println("La primera letra de " + nombre  
				+ " es la " + nombre.charAt ( 0) + "\r");
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la ultima letra es la "
				+ nombre.charAt(ultima_letra-1));
	}
	

}
