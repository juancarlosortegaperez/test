package ejerciciosPSEUDOCODIGO2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numeroA=0, numeroB=0, resto=0;

		//Inicio
			System.out.println("Introduzca un n�mero");
			numeroA=Entrada.entero();
			System.out.println("Introduzca un n�mero");
			numeroB=Entrada.entero();
	
			if(numeroA==numeroB) {
				System.out.println("Ambos n�meros son iguales, por lo que son m�ltiplos mutuos");
			}
			else {
				resto=numeroA%numeroB;
				if (resto==0) {
				System.out.println("El n�mero "+numeroA+" es m�ltiplo del n�mero "+numeroB);
				}
				else {
					System.out.println("El n�mero "+numeroA+" no es m�ltiplo del n�mero "+numeroB);
				}
				resto=numeroB%numeroA;
				if (resto==0) {
				System.out.println("El n�mero "+numeroB+" es m�ltiplo del n�mero "+numeroA);
				}
				else {
					System.out.println("El n�mero "+numeroB+" no es m�ltiplo del n�mero "+numeroA);
				}
			}
		}
	}