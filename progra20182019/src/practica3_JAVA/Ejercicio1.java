package practica3_JAVA;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			long numeroFinal=0;
			String numeroCadena=" ", numeroAnterior=" ";
			int i=0, j=1, numero=0;
			
		//Inicio
			System.out.println("¿De cuantas cifras quieres construir el número?");
			i=Entrada.entero();
			
			System.out.println("Introduzca una cifra:");
			numeroCadena=Entrada.cadena().toUpperCase();
			System.out.println("PRIMERA CIFRA INTRODUCIDA es: "+numeroCadena);
			i--;
			numeroAnterior=numeroCadena;
			switch (numeroCadena)
			{
				case "CERO":
					numero=0;
					break;
				case "UNO":
					numero=1;
					break;
				case "DOS":
					numero=2;
					break;
				case "TRES":
					numero=3;
					break;
				case "CUATRO":
					numero=4;
					break;
				case "CINCO":
					numero=5;
					break;
				case "SEIS":
					numero=6;
					break;
				case "SIETE":
					numero=7;
					break;
				case "OCHO":
					numero=8;
					break;
				case "NUEVE":
					numero=9;
					break;
			}
			numeroFinal=numero;
			System.out.println("Su número parcialmente es: "+numeroFinal);
			
			while (i>0) {
				System.out.println("Introduzca una cifra:");
				numeroCadena=Entrada.cadena().toUpperCase();
				switch (numeroCadena)
				{
					case "CERO":
						numero=0;
						break;
					case "UNO":
						numero=1;
						break;
					case "DOS":
						numero=2;
						break;
					case "TRES":
						numero=3;
						break;
					case "CUATRO":
						numero=4;
						break;
					case "CINCO":
						numero=5;
						break;
					case "SEIS":
						numero=6;
						break;
					case "SIETE":
						numero=7;
						break;
					case "OCHO":
						numero=8;
						break;
					case "NUEVE":
						numero=9;
						break;
				}
				if (numeroCadena.compareTo(numeroAnterior)>=0) {
					System.out.println("CIFRA VÁLIDA porque la cadena introducida antes fue "+numeroAnterior+" y es menor o igual que "+numeroCadena);
					i--;
					numeroAnterior=numeroCadena;
					j=j*10;
					numeroFinal=numeroFinal+numero*j;
					System.out.println("Su número parcialmente es: "+numeroFinal);
				}
				else {
					System.out.println("CIFRA NO VÁLIDA porque la cadena introducida antes fue "+numeroAnterior+" y es mayor que "+numeroCadena);
				}
			}
			System.out.println("Su número completo es: "+numeroFinal);
	}
}
