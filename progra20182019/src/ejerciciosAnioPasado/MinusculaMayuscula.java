package ejerciciosAnioPasado;

public class MinusculaMayuscula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		
		char caracterMinuscula=' ';
		int	caracterMayuscula;
		
		//INICIO
		
		System.out.println("Introduce un carácter en minúscula:");
		caracterMinuscula=Entrada.caracter();
		
		caracterMayuscula=(int)(caracterMinuscula)-32;
		
		System.out.println("El caracter en minúscula "+caracterMinuscula+" es el caracter en mayúscula "+(char)caracterMayuscula);
	}

}
