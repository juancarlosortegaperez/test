package practicaIVJAVASubprogramas;

public class pseudoDAMAS {

	static final int TAMCOL=30, TAMFIL=20;
	static boolean fichaProg1=true, fichaProg2=true, fichaProg3=true;
	static boolean fichaUser1=true, fichaUser2=true, fichaUser3=true;
	static int XProg1=3, YProg1=2, XProg2=15, YProg2=2, XProg3=27, YProg3=2;
	static int XUser1=3, YUser1=18, XUser2=15, YUser2=18, XUser3=27, YUser3=18;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char tablas=' ', jugador=' ', ganador=' ';
		int fichaUser=0;
		String movimientoUser=" ";
		System.out.println("¡¡BIENVENIDO AL JUEGO DE DAMAS!!");
		construirTablero();
		System.out.println("Empiezas tú");
		while (((fichaProg1 || fichaProg2 || fichaProg3) 
				&& (fichaUser1 || fichaUser2 || fichaUser3)) || tablas=='n') {
			if (jugador=='u') {
				System.out.println("¿Tablas (s/n)?");
				tablas=Entrada.caracter();
				System.out.println("Indica la ficha que quieres mover:");
				fichaUser=Entrada.entero();
				System.out.println("Indica hacia donde quieres mover la ficha:");
				movimientoUser=Entrada.cadena();
				mueveIzquieraFichaUsuario((int) fichaUser, (String) movimientoUser);
				mueveDerechaFichaUsuario((int) fichaUser, (String) movimientoUser);
				comeFicha((char) jugador, (int) fichaUser);
				construirTablero();
			}
			if (jugador=='p') {
				ladoAleatorio();
				fichaAleatoria();
				mueveIzquieraFichaUsuario((int)fichaAleatoria(), (String)ladoAleatorio());
				mueveDerechaFichaUsuario((int)fichaAleatoria(), (String)ladoAleatorio());
				comeFicha((int)fichaAleatoria(), (String)ladoAleatorio());
				construirTablero();
			}
			if ((fichaProg1 || fichaProg2 || fichaProg3) 
					&& (!fichaUser1 && !fichaUser2 && !fichaUser3)) {
				ganador='p';
			}
			else if ((!fichaProg1 && !fichaProg2 && !fichaProg3) 
					&& (fichaUser1 || fichaUser2 || fichaUser3)) {
				ganador='u';
			}
		}
		if (ganador=='p') {
			System.out.println("¡TE GANÓ EL PROGRAMA!");
		}
		else if (ganador=='u') {
			System.out.println("¡GANASTE!");
		}
		else if (tablas=='s') {
			System.out.println("¡TABLAS!");
		}
	}
	private static void comeFicha(int fichaAleatoria, String ladoAleatorio) {
		// TODO Auto-generated method stub
		
	}
	public static void imprimeLetrasTablero () {
		char letra='A';
		int posicionLetra=0;
		while (posicionLetra<=TAMCOL-3) {
			if ((posicionLetra-3)%6==0) {
				System.out.print(letra);
				letra++;
			}
			else {
				System.out.print(" ");
			}
			posicionLetra++;
		}
		System.out.println();
	}
	
	public static void construirTablero () {
		int i=0, j=0, numero=1;
		imprimeLetrasTablero();
		while (j<=TAMFIL) {
			while (i<=TAMCOL) {
				if (j%4==0 || i%6==0) {
					System.out.print("*");
					if (i==TAMCOL && (j%2==0 && j%4!=0) && j!=0) {
						System.out.print("\t"+numero);
						numero++;
					}
				}
				else {
					imprimeFichas(i, j);
				}
				i++;
			}
			System.out.println();
			j++;
			i=0;
		}
	}
	public static void imprimeFichas (int i, int j) {
		if ((XProg1==i && YProg1==j) || (XProg2==i && YProg2==j) || (XProg3==i && YProg3==j)) {
			System.out.print("P");
		}
		else if ((XUser1==i && YUser1==j)) {
			System.out.print("U");
		}
		else if ((XUser2==i && YUser2==j)) {
			System.out.print("D");
		}
		else if ((XUser3==i && YUser3==j)) {
			System.out.print("T");
		}
		else {
			System.out.print(" ");
		}
	}
	public static boolean mueveIzquierdaFichaPrograma (int numeroFicha) {
		if (numeroFicha==1 && fichaProg1) {
			if ((YProg1+4)<TAMFIL && (XProg1+6)<TAMCOL && fichaProg1) {
				if ((XProg1+6)!=XProg2 || (YProg1+4)!=YProg2 || (((XProg1+6)==XProg2 || (YProg1+4)==YProg2) && !fichaProg2)) {
					return true;
				}
				else if ((XProg1+6)!=XProg3 || (YProg1+4)!=YProg3  || (((XProg1+6)==XProg3 || (YProg1+4)==YProg3) && !fichaProg3)) {
					return true;
				}
			}
		}
		else if (numeroFicha==2 && fichaProg2) {
			if ((YProg2+4)<TAMFIL  && (XProg2+6)<TAMCOL && fichaProg2) {
				if ((XProg2+6)!=XProg1 || (YProg2+4)!=YProg1 || (((XProg2+6)==XProg1 || (YProg2+4)==YProg1) && !fichaProg1)) {
					return true;
				}
				else if ((XProg2+6)!=XProg3 || (YProg2+4)!=YProg3 || (((XProg2+6)==XProg3 || (YProg2+4)==YProg3) & !fichaProg3)) {
					return true;
				}
			}
		}
		else if (numeroFicha==3 && fichaProg3) {
			if ((YProg3+4)<TAMFIL  && (XProg3+6)<TAMCOL && fichaProg3) {
				if ((XProg3+6)!=XProg2 || (YProg3+4)!=YProg2 || (((XProg3+6)==XProg2 || (YProg3+4)==YProg2) && !fichaProg2)) {
					return true;
				}
				else if ((XProg3+6)!=XProg1 || (YProg3+4)!=YProg1 || (((XProg3+6)==XProg1 || (YProg3+4)==YProg1) && !fichaProg1)) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean mueveDerechaFichaPrograma (int numeroFichaProg) {
		if (numeroFichaProg==1 && fichaProg1) {
			if ((YProg1+4)<TAMFIL && XProg1>3) {
				if ((XProg1-6)!=XProg2 || (YProg1+4)!=YProg2 || (((XProg1-6)==XProg2 || (YProg1+4)==YProg2) && !fichaProg2)) {
					return true;
				}
				else if ((XProg1-6)!=XProg3 || (YProg1+4)!=YProg3  || (((XProg1-6)==XProg3 || (YProg1+4)==YProg3) && !fichaProg3)) {
					return true;
				}
			}
		}
		else if (numeroFichaProg==2 && fichaProg2) {
			if ((YProg2+4)<TAMFIL  && XProg2>3) {
				if ((XProg2-6)!=XProg1 || (YProg2+4)!=YProg1 || (((XProg2-6)==XProg1 || (YProg2+4)==YProg1) && !fichaProg1)) {
					return true;
				}
				else if ((XProg2-6)!=XProg3 || (YProg2+4)!=YProg3 || (((XProg2-6)==XProg3 || (YProg2+4)==YProg3) & !fichaProg3)) {
					return true;
				}
			}
		}
		else if (numeroFichaProg==3 && fichaProg3)	{
			if ((YProg3+4)<TAMFIL  && XProg3>3) {
				if ((XProg3-6)!=XProg2 || (YProg3+4)!=YProg2 || (((XProg3-6)==XProg2 || (YProg3+4)==YProg2) && !fichaProg2)) {
					return true;
				}
				else if ((XProg3-6)!=XProg1 || (YProg3+4)!=YProg1 || (((XProg3-6)==XProg1 || (YProg3+4)==YProg1) && !fichaProg1)) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean mueveIzquieraFichaUsuario (int numeroFichaUser, String movimientoUser) {
		if (numeroFichaUser==1 && fichaUser1) {
			if ((YUser1-4)<TAMFIL && XUser1>3) {
				if ((XUser1+6)!=XUser2 || (YUser1-4)!=YUser2 || (((XUser1+6)==XUser2 || (YUser1-4)==YUser2) && !fichaUser2)) {
					return true;
				}
				else if ((XUser1+6)!=XUser3 || (YUser1-4)!=YUser3  || (((XUser1+6)==XUser3 || (YUser1-4)==YUser3) && !fichaUser3)) {
					return true;
				}
			}
		}
		else if (numeroFichaUser==2 && fichaUser2) {
			if ((YUser2-4)<TAMFIL  && XUser2>3) {
				if ((XUser2+6)!=XUser1 || (YUser2-4)!=YUser1 || (((XUser2+6)==XUser1 || (YUser2-4)==YUser1) && !fichaUser1)) {
					return true;
				}
				else if ((XUser2+6)!=XUser3 || (YUser2-4)!=YUser3 || (((XUser2+6)==XUser3 || (YUser2-4)==YUser3) & !fichaUser3)) {
					return true;
				}
			}
		}
		else if (numeroFichaUser==3 && fichaUser3)	{
			if ((YUser3-4)<TAMFIL  && XUser3>3) {
				if ((XUser3+6)!=XUser2 || (YUser3-4)!=YUser2 || (((XUser3+6)==XUser2 || (YUser3-4)==YUser2) && !fichaUser2)) {
					return true;
				}
				else if ((XUser3+6)!=XUser1 || (YUser3-4)!=YUser1 || (((XUser3+6)==XUser1 || (YUser3-4)==YUser1) && !fichaUser1)) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean mueveDerechaFichaUsuario (int numeroFichaUser, String movimientoUser) {
		if (numeroFichaUser==1 && fichaUser1) {
			if ((YUser1-4)<TAMFIL && XUser1>3) {
				if ((XUser1-6)!=XUser2 || (YUser1-4)!=YUser2 || (((XUser1-6)==XUser2 || (YUser1-4)==YUser2) && !fichaUser2)) {
					return true;
				}
				else if ((XUser1-6)!=XUser3 || (YUser1-4)!=YUser3  || (((XUser1-6)==XUser3 || (YUser1-4)==YUser3) && !fichaUser3)) {
					return true;
				}
			}
		}
		else if (numeroFichaUser==2 && fichaUser2) {
			if ((YUser2-4)<TAMFIL  && XUser2>3) {
				if ((XUser2-6)!=XUser1 || (YUser2-4)!=YUser1 || (((XUser2-6)==XUser1 || (YUser2-4)==YUser1) && !fichaUser1)) {
					return true;
				}
				else if ((XUser2-6)!=XUser3 || (YUser2-4)!=YUser3 || (((XUser2-6)==XUser3 || (YUser2-4)==YUser3) & !fichaUser3)) {
					return true;
				}
			}
		}
		else if (numeroFichaUser==3 && fichaUser3)	{
			if ((YUser3-4)<TAMFIL  && XUser3>3) {
				if ((XUser3-6)!=XUser2 || (YUser3-4)!=YUser2 || (((XUser3-6)==XUser2 || (YUser3-4)==YUser2) && !fichaUser2)) {
					return true;
				}
				else if ((XUser3-6)!=XUser1 || (YUser3-4)!=YUser1 || (((XUser3-6)==XUser1 || (YUser3-4)==YUser1) && !fichaUser1)) {
					return true;
				}
			}
		}
		return false;
	}
	public static boolean comeFicha (char jugador, int ficha) {
		if (jugador=='p' && fichaProg1) {
			if (XProg1==XUser1 && YProg1==YUser1) {
				fichaUser1=false;
				return true;
			}
		}
		else if (jugador=='p' && fichaProg2) {
			if (XProg2==XUser2 && YProg2==YUser2) {
				fichaUser2=false;
				return true;
			}
		}
		else if (jugador=='p' && fichaProg3) {
			if (XProg3==XUser3 && YProg3==YUser3) {
				fichaUser3=false;
				return true;
			}
		}
		else if (jugador=='u' && fichaUser1) {
			if (XProg1==XProg1 && YProg1==YProg1) {
				fichaProg1=false;
				return true;
			}
		}
		else if (jugador=='u' && fichaUser2) {
			if (XUser2==XProg2 && YUser2==YProg2) {
				fichaProg2=false;
				return true;
			}
		}
		else if (jugador=='u' && fichaUser3) {
			if (XUser3==XProg3 && YUser3==YProg3) {
				fichaProg3=false;
				return true;
			}
		}
		return false;
	}
	public static String ladoAleatorio () {
		String lado=" ";
		int num=0;
		num=(int) (Math.random()*(2-1+1)+1);
		if (num==1) {
			return lado="IZQUIERDA";
		}
		else {
			return lado="DERECHA";
		}
	}
	public static int fichaAleatoria () {
		int num=0;
		num=(int) (Math.random()*(3-1+1)+1);
		return num;
	}
}
