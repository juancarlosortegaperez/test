package ejerciciosAnioPasado;

public class MinusculaMayuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		
		char caracterMinuscula=' ';
		int	caracterMayuscula;
		
		//INICIO
		
		System.out.println("Introduce un car�cter en min�scula:");
		caracterMinuscula=Entrada.caracter();
		
		caracterMayuscula=(int)(caracterMinuscula)-32;
		
		System.out.println("El caracter en min�scula "+caracterMinuscula+" es el caracter en may�scula "+(char)caracterMayuscula);
	}

}
