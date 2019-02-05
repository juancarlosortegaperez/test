package matrices;

public class Corredores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [][] matriz=new double[2][5];
		
		int corredor=0;
		System.out.println("Indidca de que corredor son los tiempos (1/2):");
		corredor=Entrada.entero();
		
		pideTiempos(matriz,corredor);
	}
	
	public static void pideTiempos (double [][]matriz, int corredor) {
		for(int j=0;j<matriz[corredor].length;j++)
			{
				System.out.println("Introduce los datos de la carrera");
				matriz[0][j]=Entrada.real();
			}
		
		for(int j=0;j<matriz[corredor].length;j++) {
			System.out.println(matriz[0][j]);
			}
	}
}
