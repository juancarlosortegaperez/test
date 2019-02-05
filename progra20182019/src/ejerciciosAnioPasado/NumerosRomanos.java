package ejerciciosAnioPasado;

public class NumerosRomanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//VARIABLES
		
		int numeroUsuario=0, miles=0, centenas=0, decenas=0, unidades=0, resto=0;
		String milesCadena=new String(" "), centenasCadena=new String(" "),
				decenasCadena=new String(" "), unidadesCadena=new String(" ");
		
		//INICIO
		
		System.out.println("Introduzca un número menor de 3500");
		numeroUsuario=Entrada.entero();
		
		miles=numeroUsuario/1000;
		resto=numeroUsuario%1000;
		centenas=resto/100;
		resto=resto%100;
		decenas=resto/10;
		unidades=resto%10;
		
			switch (miles){
				case 1:
					milesCadena="M";
					break;
				case 2:
					milesCadena="MM";
					break;
				case 3:
					milesCadena="MMM";
			}
			switch (centenas) { 
				case 1:
					centenasCadena="C";
					break;
				case 2:
					centenasCadena="CC";
					break;
				case 3:
					centenasCadena="CCC";
					break;
				case 4:
					centenasCadena="CD";
					break;
				case 5:
					centenasCadena="D";
					break;
				case 6:
					centenasCadena="DC";
					break;
				case 7:
					centenasCadena="DCC";
					break;
				case 8:
					centenasCadena="DCCC";
					break;
				case 9:
					centenasCadena="CM";
					break;
			}
			switch (decenas) {
				case 1:
					decenasCadena="X";
					break;
				case 2:
					decenasCadena="XX";
					break;
				case 3:
					decenasCadena="XXX";
					break;
				case 4:
					decenasCadena="XL";
					break;
				case 5:
					decenasCadena="L";
					break;
				case 6:
					decenasCadena="LX";
					break;
				case 7:
					decenasCadena="LXX";
					break;
				case 8:
					decenasCadena="LXXX";
					break;
				case 9:
					decenasCadena="XC";
					break;
			}
			switch (unidades) {
				case 1:
					unidadesCadena="I";
					break;
				case 2:
					unidadesCadena="II";
					break;
				case 3:
					unidadesCadena="III";
					break;
				case 4: 
					unidadesCadena="IV";
					break;
				case 5:
					unidadesCadena="V";
					break;
				case 6:
					unidadesCadena="VI";
					break;
				case 7:
					unidadesCadena="VII";
					break;
				case 8:
					unidadesCadena="VIII";
					break;
				case 9:
					unidadesCadena="IX";
					break;
			}
			System.out.println("Su número en romano es: "+milesCadena+centenasCadena+decenasCadena+unidadesCadena);
	}

}
