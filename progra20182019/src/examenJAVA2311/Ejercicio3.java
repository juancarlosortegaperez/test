package examenJAVA2311;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			int numero=0, i=2;
			char letra=' ', resultado=' ';
			
		//Inicio
			numero=(int) (Math.random()*(25-1+1)+1);
			while (i<=(numero/2) && numero%i!=0) {
				i++;
			}
			while (i<=numero/2) {
				i=2;
				numero=(int) (Math.random()*(25-1+1)+1);
				while (i<=(numero/2) && numero%i!=0) {
					i++;
				}
			}
			
			System.out.println("El número primo secreto es: "+numero);
			System.out.println("Escribe una letra: ");
			letra=Entrada.caracter();
			resultado=letra;
			resultado=(char) (resultado+numero);
			if (resultado<=122) {
				System.out.println("La letra "+letra+" encriptada pasará a ser la letra "+resultado);
			}
			else {
				resultado=(char) (resultado%numero);
				letra=(char) (97+letra);
				System.out.println("La letra "+letra+" encriptada pasará a ser la letra "+resultado);
			}
	}

}
