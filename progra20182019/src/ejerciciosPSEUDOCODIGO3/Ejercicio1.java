package ejerciciosPSEUDOCODIGO3;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int num=0, i=0;
			
		//Inicio
			System.out.println("Introduzca un n�mero");
			num=Entrada.entero();
			
			while (i<=num) {
				System.out.println("N�mero: "+i);
				i++;
			}
		}
	}