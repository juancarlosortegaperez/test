package ejerciciosPSEUDOCODIGO1;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			double numR=0.00, cuadrado=0.0;
		
		//Inicio
			System.out.println("Introduzca un número REAL");
			numR=Entrada.real();
			cuadrado=Math.pow(numR, 2);
			System.out.println("El número multiplicado por sí mismo es: "+cuadrado);
	}

}
