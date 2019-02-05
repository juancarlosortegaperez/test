package practicaIVJAVASubprogramas;

public class MasterMind {

	static char ficha1=' ', ficha2=' ', ficha3=' ', ficha4=' ', ficha5=' ';
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int blancasSecretas=0, negrasSecretas=0;
	}
	public static char pideFicha (int pos) {
		char fic1=' ', fic2=' ', fic3=' ', fic4=' ', fic5=' ';
		if (pos==1) {
			System.out.println("Introduzca una ficha para la posición 1");
			fic1=Entrada.caracter();
			return fic1;
		}
		else if (pos==2) {
			System.out.println("Introduzca una ficha para la posición 2");
			fic2=Entrada.caracter();
			return fic2;
		}
		else if (pos==3) {
			System.out.println("Introduzca una ficha para la posición 3");
			fic3=Entrada.caracter();
			return fic3;
		}
		else if (pos==4) {
			System.out.println("Introduzca una ficha para la posición 4");
			fic4=Entrada.caracter();
			return fic4;
		}
		else if (pos==5) {
			System.out.println("Introduzca una ficha para la posición 5");
			fic5=Entrada.caracter();
			return fic5;
		}
		return ' ';
	}
	
	public static char aleatorioBlancoONegro () {
		char color=' ';
		int num=0;
		num=(int) (Math.random()*(2-1+1)+1);
		if (num==1) {
			return color='N';
		}
		else {
			return color='B';
		}
	}
	
	public static void asignaColorAFichas () {		
		ficha1=aleatorioBlancoONegro();
		ficha2=aleatorioBlancoONegro();
		ficha3=aleatorioBlancoONegro();
		ficha4=aleatorioBlancoONegro();
		ficha5=aleatorioBlancoONegro();
	}
	
	public static int cuentaColorFichasSecretas (char color) {
		int negras=0, blancas=0;
		if (color=='N') {
			negras++;
		}
		else {
			blancas++;
		}
		
		return blancas;
	}
	
	
	
	public static void muestraResultadoParcial () {
		
	}
}
