package ejerciciosPSEUDOCODIGO2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numeroA=0, numeroB=0;
	
		//Inicio
			System.out.println("Introduzca un n�mero");
			numeroA=Entrada.entero();
			System.out.println("Introduzca un n�mero");
			numeroB=Entrada.entero();
		
			if(numeroA%numeroB==0) {
				System.out.println("El n�mero "+numeroA+" es m�ltiplo de "+numeroB);
			}
			else {
				System.out.println("El n�mero "+numeroA+" no es m�ltiplo de "+numeroB);
			}
		}
	}