package examenJAVA1412;

public class TresEnRaya {
	
	static int x1=0,  x2=0, x3=0;
	static int o1=0, o2=0, o3=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String movimiento=" ";
		char jugar=' ';
		System.out.println("¡Juguemos al tres en raya!");
		while (ganaPrograma()==false || ganaUsuario()==false || jugar==' ' || quedanFichas()==true) {
			imprimeTablero();
			System.out.println("¡Tu turno!");
			System.out.println("Elige donde quieres colocar tu ficha:");
			movimiento=Entrada.cadena().toUpperCase();
			while (usuarioMueveFicha(o1, movimiento)==false) {
				System.out.println("Movimiento erróneo!");
				System.out.println("Elige donde quieres colocar tu ficha:");
				movimiento=Entrada.cadena().toUpperCase();
			}
			System.out.println("¡MOVIMIENTO VÁLIDO!");
			ganaUsuario();
			System.out.println("Turno de la máquina!");
			mueveFichaAleatoria(x1);
			while (mueveFichaAleatoria(x1)==false) {
				System.out.println("Movimiento erróneo del programa");
				mueveFichaAleatoria(x1);
			}
			System.out.println("MOVIMIENTO VÁLIDO");
			if (ganaPrograma()==true) {
				System.out.println("Gana la máquina!");
			}
			else if (ganaUsuario()==true) {
				System.out.println("Ganaste!");
			}
			else {
				System.out.println("¿Otra partidita? (s/n)");
				jugar=Entrada.caracter();
			}
			limpiarTablero();
		}
		System.out.println("ADIOS");
	}
	public static void imprimeTablero () {
		int i=1;
		while (i<=9) {
			if (i==1 || i==4 || i==7) {
				if ((x1==1 || x1==4 || x1==7) || (x2==1 || x2==4 || x2==7) || (x3==1 || x3==4 || x3==7)) {
					System.out.println("x");
				}
				else if ((o1==1 || o1==4 || o1==7) || (o2==1 || o2==4 || o2==7) || (o3==1 || o3==4 || o3==7)) {
						System.out.println("o");
				}
				else {
					System.out.print("-");
				}
			}
			i++;
			if (i==2 || i==5 || i==8) {
				if ((x1==2 || x1==5 || x1==8) || (x2==2 || x2==5 || x2==8) || (x3==2 || x3==5 || x3==8)) {
					System.out.println("	x");
				}
				else if ((o1==2 || o1==5 || o1==8) || (o2==2 || o2==5 || o2==8) || (o3==2 || o3==5 || o3==8)) {
						System.out.println("	o");
				}
				else {
					System.out.print("	-");
				}
			}
			i++;
			if (i==3 || i==6 || i==9) {
				if ((x1==1 || x1==6 || x1==9) || (x2==3 || x2==6 || x2==9) || (x3==3 || x3==6 || x3==9)) {
					System.out.println("	x");
				}
				else if ((o1==3 || o1==6 || o1==9) || (o2==3 || o2==6 || o2==9) || (o3==3 || o3==6 || o3==9)) {
						System.out.println("	o");
				}
				else {
					System.out.print("	-");
				}
			}
			i++;
			System.out.println();
		}
	}
	public static boolean mueveFichaAleatoria (int x) {
		int fichaProg=0;
		fichaProg=(int) (Math.random()*(9-1+1)+1);
		if (x==1) {
			if (fichaProg==o1) {
				return false;
			}
			else {
				return true;
			}
		}
		if (x==2) {
			if (fichaProg==o1 || fichaProg==x1 || fichaProg==o2) {
				return false;
			}
			else {
				return true;
			}
		}
		if (x==3) {
			if (fichaProg==o1 || fichaProg==x1 || fichaProg==o2 || fichaProg==x2 || fichaProg==o3) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}
	public static int convierteAPosicionMovimiento (String mov) {
		switch (mov) {
		case "ARRIBA IZQUIERDA":
			return 1;
		case "ARRIBA CENTRO":
			return 2;
		case "ARRIBA DERECHA":
			return 3;
		case "CENTRO IZQUIERDA":
			return 4;
		case "CENTRO CENTRO":
			return 5;
		case "CENTRO DERECHA":
			return 6;
		case "ABAJO IZQUIERDA":
			return 7;
		case "ABAJO CENTRO":
			return 8;
		case "ABAJO DERECHA":
			return 9;
		}
		return 0;
	}
	public static boolean usuarioMueveFicha (int o, String mov) {
		int fichaUser=0;
		switch (mov) {
		case "ARRIBA IZQUIERDA":
			fichaUser=1;
			break;
		case "ARRIBA CENTRO":
			fichaUser=2;
			break;
		case "ARRIBA DERECHA":
			fichaUser=3;
			break;
		case "CENTRO IZQUIERDA":
			fichaUser=4;
			break;
		case "CENTRO CENTRO":
			fichaUser=5;
			break;
		case "CENTRO DERECHA":
			fichaUser=6;
			break;
		case "ABAJO IZQUIERDA":
			fichaUser=7;
			break;
		case "ABAJO CENTRO":
			fichaUser=8;
			break;
		case "ABAJO DERECHA":
			fichaUser=9;
			break;
		}
		if (o==1) {
			return true;
		}
		if (o==2) {
			if (fichaUser==o1 || fichaUser==x1) {
				return false;
			}
			else {
				return true;
			}
		}
		if (o==3) {
			if (fichaUser==o1 || fichaUser==x1 || fichaUser==o2 || fichaUser==x2) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}
	public static void limpiarTablero () {
		x1=0;
		x2=0;
		x3=0;
		o1=0;
		o2=0;
		o3=0;
	}
	public static boolean quedanFichas () {
		if (x1==0 || x2==0 || x3==0 || o1==0 || o2==0 || o3==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean ganaPrograma () {
		if ((x1==1 || x1==2 || x1==3) && (x2==1 || x2==2 || x2==3) && (x3==1 || x3==2 || x3==3)){
			return true;
		}
		if ((x1==4 || x1==5 || x1==6) && (x2==4 || x2==5 || x2==6) && (x3==4 || x3==5 || x3==6)) {
			return true;
		}
		if ((x1==7 || x1==8 || x1==9) && (x2==7 || x2==8 || x2==9) && (x3==7 || x3==8 || x3==9)) {
			return true;
		}
		if ((x1==1 || x1==4 || x1==7) && (x2==1 || x2==4 || x2==7) && (x3==1 || x3==4 || x3==7)) {
			return true;
		}
		if ((x1==2 || x1==5 || x1==8) && (x2==2 || x2==5 || x2==8) && (x3==2 || x3==5 || x3==8)) {
			return true;
		}
		if ((x1==3 || x1==6 || x1==9) && (x2==3 || x2==6 || x2==9) && (x3==3 || x3==6 || x3==9)) {
			
		}
		if ((x1==1 || x1==5 || x1==9) && (x2==1 || x2==5 || x2==9) && (x3==1 || x3==5 || x3==9)) {
			return true;
		}
		if ((x1==3 || x1==5 || x1==7) && (x2==3 || x2==5 || x2==7) && (x3==3 || x3==5 || x3==7)) {
			return true;
		}
		return false;
	}
	public static boolean ganaUsuario () {
		if ((o1==1 || o1==2 || o1==3) && (o2==1 || o2==2 || o2==3) && (o3==1 || o3==2 || o3==3)){
			return true;
		}
		if ((o1==4 || o1==5 || o1==6) && (o2==4 || o2==5 || o2==6) && (o3==4 || o3==5 || o3==6)) {
			return true;
		}
		if ((o1==7 || o1==8 || o1==9) && (o2==7 || o2==8 || o2==9) && (o3==7 || o3==8 || o3==9)) {
			return true;
		}
		if ((o1==1 || o1==4 || o1==7) && (o2==1 || o2==4 || o2==7) && (o3==1 || o3==4 || o3==7)) {
			return true;
		}
		if ((o1==2 || o1==5 || o1==8) && (o2==2 || o2==5 || o2==8) && (o3==2 || o3==5 || o3==8)) {
			return true;
		}
		if ((o1==3 || o1==6 || o1==9) && (o2==3 || o2==6 || o2==9) && (o3==3 || o3==6 || o3==9)) {
			
		}
		if ((o1==1 || o1==5 || o1==9) && (o2==1 || o2==5 || o2==9) && (o3==1 || o3==5 || o3==9)) {
			return true;
		}
		if ((o1==3 || o1==5 || o1==7) && (o2==3 || o2==5 || o2==7) && (o3==3 || o3==5 || o3==7)) {
			return true;
		}
		return false;
	}
}
