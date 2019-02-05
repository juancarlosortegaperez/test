package ejercicioJAVAMAS;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int i=0, numeroMinimo=0, numeroMaximo=0, numero=0, numeroAnterior=0;
	
		//Inicio
			System.out.println("Introduzca el número mínimo");
			numeroMinimo=Entrada.entero();
			System.out.println("Introduzca el número máximo");
			numeroMaximo=Entrada.entero();
			numeroAnterior=numeroMaximo+1;
			while (i==0) {
				numero=(int) (Math.random()*(numeroMaximo-numeroMinimo+1)+numeroMinimo);
				if (numeroAnterior>numero) {
					System.out.println(numero);
					numeroAnterior=numero;
				}
				else {
					i++;
				}
			}
	}

}
