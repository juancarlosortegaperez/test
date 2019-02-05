package ordenacion;

public class golfistas {

	public static final int N=5, M=7;
	public static int golfistas_jornadas[][]=new int [N][M];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rellenaMatriz();
		
		
	}
	
	public static void rellenaMatriz () {
		for (int i=1; i<golfistas_jornadas.length; i++) {
			System.out.println("Jugador "+i+":");
			 for(int j=0 ; j<=(golfistas_jornadas.length - 2); j++) {
				 System.out.println("Introduzca el número de golpes para la jornada "+(j+1)+":");
				 golfistas_jornadas[i][j]=Entrada.entero();
			 }
		}
		for (int i=1; i<golfistas_jornadas.length; i++) {
			System.out.println("Jugador "+i+":");
			 for(int j=0 ; j<=(golfistas_jornadas.length - 2); j++) {
				 System.out.println("golpes "+j);
			 }
		}
	}

}
