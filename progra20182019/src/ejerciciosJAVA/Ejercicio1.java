package ejerciciosJAVA;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
		int numero1=0, numero2=0, i=2, j=2;
		
		//Inicio
		System.out.println("Introduzca un n�mero");
		numero1=Entrada.entero();
		System.out.println("Introduzca otro n�mero");
		numero2=Entrada.entero();
		
		while (i<=(numero1/2) && numero1%i!=0) {
			i++;
		}
				
		while (j<=(numero2/2) && numero2%j!=0) {
			j++;
		}
		if (i>numero1/2 && j>numero2/2) {
			if (numero1+2==numero2) {
			System.out.println("Los n�meros son primos gemelos");
			}
			else {
				System.out.println("Los n�meros son primos no gemelos");
			}
		}
		else {
			System.out.println("Los n�meros no son primos");
		}
	}
}
