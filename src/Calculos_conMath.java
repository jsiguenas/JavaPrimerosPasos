
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* metod de clases propias*/
		/* averiguar la raiz cuadrada de un numero*/
		
		/*int raiz=Math.sqrt(9);/* en el argumento de SQRT nos 
		 * muestra un parametro de tipo double.
		 * la raiz debe ser detipo doble. por este motivo 
		 * subrallara el metodo en respuesta a que es un entero 
		 * java considera al numero (9) como double, y no se puede
		 * almacenar double en int*/
		
		/*double raiz=Math.sqrt(2);/* la solucion es cambiar
		la variable int a double y ejecutar la varible*/
		
		/*se declarara metodo de round para redondear*/
		
		 /* se declara el tipo de clase double
		para almacenar los numeros con decimales*/
		
		/*System.out.println(raiz);*/
		
		
		
									
				
				
		/*double  num1=5.85;		
		int resultado=(int)Math.round(num1);
		
		System.out.println(resultado);*/
		
		
		
		
		
		
		
		/* metodo Pow hace es elevar un metodo a una potencia*/
		
		double base = 5;
		
		double exponente = 4;
		
		int resultado =(int) Math.pow(base, exponente);/* agregamos una refundicion (int)
		 y nos devollvera elvalor en entero*/
		
		System.out.println("El resultado de "+ base + " elevado a 4 es = " + resultado);
		
		
		
	}

}
