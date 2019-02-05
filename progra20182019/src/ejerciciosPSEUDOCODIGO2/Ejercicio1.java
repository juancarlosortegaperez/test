package ejerciciosPSEUDOCODIGO2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			double numero=0.0;
			
		//Inicio
			System.out.println("Introduzca un número");
			numero=Entrada.real();
			
			if(numero>0) {
				System.out.println("El número es positivo");
			}
			else {
				if(numero==0) {
					System.out.println("El número es cero");
				}
				else {
					System.out.println("El número es negativo");
				}
			}
		}
	}
