package ejerciciosAnioPasado;

public class CasiPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		
		int primerNumero=0, segundoNumero=0, divisor=2, i=2,
				contadorCasiPrimos=0, contadorPrimos=0, posibleCasiPrimo=0;
		
		//INICIO
		
		System.out.println("Introduce un número:");
		primerNumero=Entrada.entero();
		System.out.println("Introduce otro número:");
		segundoNumero=Entrada.entero();
		
		for (posibleCasiPrimo=primerNumero; posibleCasiPrimo<=segundoNumero;posibleCasiPrimo++) {
			while (divisor<=posibleCasiPrimo/2) {
				if (posibleCasiPrimo%divisor==0) {
					while (i<=(divisor/2) && divisor%i!=0){
						i++;
					}
					if (i>divisor/2) {
						contadorPrimos++;
					}
					i=2;
				}
				divisor++;
			}
			if (contadorPrimos==1) {
				contadorCasiPrimos++;
			}
			contadorPrimos=0;
			divisor=2;
		}
		System.out.println("Entre "+primerNumero+" y "+segundoNumero+" hay "+contadorCasiPrimos+" números casi primos");
	}
}