package ejerciciosPSEUDOCODIGO3;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int num=0, i=0;
			
		//Inicio
			System.out.println("Introduzca un número");
			num=Entrada.entero();
			
			while (i<=num) {
				System.out.println("Número: "+i);
				i++;
			}
		}
	}