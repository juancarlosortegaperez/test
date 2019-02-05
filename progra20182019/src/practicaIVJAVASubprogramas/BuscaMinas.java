package practicaIVJAVASubprogramas;

public class BuscaMinas {
	
	static boolean  desc1=false,desc2=false,desc3=false,desc4=false,desc5=false;
	static boolean desc6=false,desc7=false,desc8=false,desc9=false;
	static int casillasDescubiertasSinBombas=0,casillasDescubiertasConBombas=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1=1,b2=4,b3=3;	
		int casilla=0;
		String veredicto=new String("");
		

		
		System.out.println("¡¡BIENVENIDO AL BUSCAMINAS!!");
		System.out.println("¡Intenta destapar las casillas sin bombas y ganarás la partida, hay 3 bombas escondidas!");
		muestraTablero(b1,b2,b3);
		
		while(!partidaTerminada())
		{
			System.out.println("¿Qué casilla quieres descubrir?");
			casilla=Entrada.entero();
			
			if(yaEstaDescubiertaOEsIncorrecta(casilla))
				System.out.println("No puedes elegir esa casilla porque no existe o ya está descubierta");
			else{
				descubirCasilla(casilla);
				incrementaCasillas(casilla,b1,b2,b3);
				muestraMensaje(casilla,b1,b2,b3);
				muestraTablero(b1,b2,b3);
			}
		}
		
		veredicto=devuelveVeredicto();
		System.out.println("Y has llegado al FINAL: "+veredicto);
	}
	
	public static void muestraTablero(int bomb1,int bomb2, int  bomb3){
		
		for(int i=0;i<=12;i++){
			for(int j=0;j<=12;j++)
			{
				if((i==2 || i==6 || i==10) && (j==2 || j==6 || j==10))
				{
					colocarCasillas(i,j,bomb1,bomb2,bomb3);
				}
				else if(i%4==0)
				{
					if(j%4==0)
						System.out.print(" ");
					else
						System.out.print("----");
				}				
				else
					if(j%4==0)
						System.out.print("|");
					else
						System.out.print("    ");
			}
			System.out.println();
		}
		
	}
	
	public static void colocarCasillas(int fil,int col,int b1,int b2, int b3)
	{
		if(fil==2 && col==2){
			if (desc1 && (b1 == 1 || b2 == 1 || b3 == 1))
				System.out.print(" BM ");
			else if (desc1 && !(b1 == 1 || b2 == 1 || b3 == 1))
				System.out.print(" NO ");
			else if (!desc1)
				System.out.print(" XX ");
		}
		else if(fil==2 && col==6){
			if (desc2 && (b1 == 2 || b2 == 2 || b3 == 2))
				System.out.print(" BM ");
			else if (desc2 && !(b1 == 2 || b2 == 2 || b3 == 2))
				System.out.print(" NO ");
			else if (!desc2)
				System.out.print(" XX ");
		}
		else if(fil==2 && col==10){
			if (desc3 && (b1 == 3 || b2 ==3 || b3 == 3))
				System.out.print(" BM ");
			else if (desc3 && !(b1 == 3 || b2 == 3 || b3 == 3))
				System.out.print(" NO ");
			else if (!desc3)
				System.out.print(" XX ");
		}
		else if(fil==6 && col==2)
		{
			if (desc4 && (b1 == 4 || b2 ==4 || b3 == 4))
				System.out.print(" BM ");
			else if (desc4 && !(b1 == 4 || b2 == 4 || b3 == 4))
				System.out.print(" NO ");
			else if (!desc4)
				System.out.print(" XX ");
		}
		else if(fil==6 && col==6)
		{
			if (desc5 && (b1 == 5 || b2 == 5|| b3 == 5))
				System.out.print(" BM ");
			else if (desc5 && !(b1 == 5 || b2 == 5 || b3 == 5))
				System.out.print(" NO ");
			else if (!desc5)
				System.out.print(" XX ");
		}
		else if(fil==6 && col==10)
		{
			if (desc6 && (b1 == 6 || b2 == 6 || b3 == 6))
				System.out.print(" BM ");
			else if (desc6 && !(b1 == 6 || b2 == 6 || b3 == 6))
				System.out.print(" NO ");
			else if (!desc6)
				System.out.print(" XX ");
		}
		else if(fil==10 && col==2)
		{
			if (desc7 && (b1 == 7 || b2 == 7|| b3 == 7))
				System.out.print(" BM ");
			else if (desc7 && !(b1 == 7 || b2 == 7 || b3 == 7))
				System.out.print(" NO ");
			else if (!desc7)
				System.out.print(" XX ");
		}
		else if(fil==10 && col==6)
		{
			if (desc8 && (b1 == 8 || b2 == 8 || b3 == 8))
				System.out.print(" BM ");
			else if (desc8 && !(b1 == 8 || b2 == 8 || b3 == 8))
				System.out.print(" NO ");
			else if (!desc8)
				System.out.print(" XX ");
		}
		else if(fil==10 && col==10)
		{
			if (desc9 && (b1 == 9 || b2 == 9 || b3 == 9))
				System.out.print(" BM ");
			else if (desc9 && !(b1 == 9 || b2 == 9 || b3 == 9))
				System.out.print(" NO ");
			else if (!desc9)
				System.out.print(" XX ");
		}
	}
	
	public static int generaNumeroAleatorio(int mayor, int menor)
	{
		return (int)(Math.round((Math.random()*(mayor-menor))+menor));
	}
	
	public static boolean yaEstaDescubiertaOEsIncorrecta(int cas){
		switch(cas)
		{
			case 1: return desc1;
			case 2: return desc2;
			case 3: return desc3;
			case 4: return desc4;
			case 5: return desc5;
			case 6: return desc6;
			case 7: return desc7;
			case 8: return desc8;
			case 9: return desc9;
			default: return true;
		}
	}
	
	public static void descubirCasilla(int cas)
	{
		switch(cas)
		{
			case 1: desc1=true; break;
			case 2: desc2=true; break;
			case 3: desc3=true; break;
			case 4: desc4=true; break;
			case 5: desc5=true; break;
			case 6: desc6=true; break;
			case 7: desc7=true; break;
			case 8: desc8=true; break;
			case 9: desc9=true; break;
		}
	}
	
	public static  boolean partidaTerminada(){
		if(casillasDescubiertasSinBombas==6 || casillasDescubiertasConBombas==3)
			return true;
		return false;
	}
	
	public static void incrementaCasillas(int casilla,int b1, int b2, int b3)
	{
		if(casilla==b1 || casilla==b2 || casilla==b3)
			casillasDescubiertasConBombas++;
		else
			casillasDescubiertasSinBombas++;
	}
	
	public static void muestraMensaje(int casilla, int b1, int b2, int b3)
	{
		if(casilla==b1 || casilla==b2 || casilla==b3)
			System.out.println("HABÍA BOMBA!!!");
		else
			System.out.println("MENOS MAL! NO HABÍA BOMBA!!");
	}
	
	public static String devuelveVeredicto()
	{
		if (casillasDescubiertasConBombas==3)
			return "OOOOOH! Has perdido! :( ";
		else
			return "BIEN!! Has ganado!! :) ";
	}
}
