package ejerciciosAnioPasado;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		
		int numeroMin=0, numeroMax=0;
		double resultadoAnterior=0, resultado=0;
		boolean intervaloMin=false;
		
		//INICIO
		
		System.out.println("Introduce el extremo menor del intervalo:");
		numeroMin=Entrada.entero();
		System.out.println("Introduce el extremo mayor del intervalo:");
		numeroMax=Entrada.entero();
		
		resultado=numeroMax;
		resultadoAnterior=numeroMax+1;
		while(resultado>=numeroMin && intervaloMin==false) {
			resultado=(int)(Math.random()*(numeroMax-numeroMin)+numeroMin);
			if (resultado<resultadoAnterior) {
				System.out.println(resultado);
				resultadoAnterior=resultado;
			}
			if (resultado==numeroMin) {
				intervaloMin=true;
			}
		}
	}

}
