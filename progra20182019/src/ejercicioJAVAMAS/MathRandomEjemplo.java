package ejercicioJAVAMAS;

public class MathRandomEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0, numero_Minimo=0, numero_Maximo=0, x=0;
		
		System.out.println("Introduzca el número mínimo");
		numero_Minimo=Entrada.entero();
		System.out.println("Introduzca el número máximo");
		numero_Maximo=Entrada.entero();
		while (i<10) {
			x=(int) (Math.random()*(numero_Maximo-numero_Minimo+1)+numero_Minimo);
			System.out.println(x);
			
		}
	}

}
