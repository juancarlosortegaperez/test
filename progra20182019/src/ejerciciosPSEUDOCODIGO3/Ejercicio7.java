package ejerciciosPSEUDOCODIGO3;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
			int num=0, suma=0;
		//INICIO            
        	while (num>=0) {
        		suma=suma+num;
        		System.out.println("Introduzca un n�mero: ");
        		num=Entrada.entero();
			}
        	System.out.println("La suma de los n�meros introducidos es "+suma);
	}

}
