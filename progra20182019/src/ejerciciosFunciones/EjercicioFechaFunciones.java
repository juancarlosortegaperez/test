package ejerciciosFunciones;

public class EjercicioFechaFunciones {

	static final int DIA_HOY=2, MES_HOY=12, ANIO_HOY=2018;
	
	public static void main(String[] args) {
		int dia = 0, anio = 0, mesEntero = 0;
		String mes = "";

		System.out.println("Introduzca el día de nacimiento");
		dia = Entrada.entero();

		System.out.println("Introduzca el mes de nacimiento");
		mes = Entrada.cadena().toUpperCase();

		System.out.println("Introduzca el año de nacimiento");
		anio = Entrada.entero();

		mesEntero = pasaMesAEntero(mes);
		
		if(fechaCorrecta(dia,mesEntero,anio)) {
			calculaEdad(dia,mesEntero,anio);
		} else
			System.out.println("Has introducido la fecha mal");
	}

	public static boolean esBisiesto(int anyo) {

		if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))) {
			return true;
		} else
			return false;
	}

	public static int diaMes(int mes, int anyo) {
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			return 31;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		} else if (mes == 2 && esBisiesto(anyo) == true) {
			return 29;
		} else // mes 2 y no es bisiesto el año
			return 28;
	}

	public static int pasaMesAEntero(String mesCad) {
		switch (mesCad) {
		case "ENERO":

			return 1;

		case "FEBRERO":

			return 2;

		case "MARZO":

			return 3;

		case "ABRIL":

			return 4;

		case "MAYO":

			return 5;

		case "JUNIO":

			return 6;

		case "JULIO":

			return 7;

		case "AGOSTO":

			return 8;

		case "SEPTIEMBRE":

			return 9;

		case "OCTUBRE":

			return 10;

		case "NOVIEMBRE":

			return 11;

		case "DICIEMBRE":

			return 12;

		default:
			return -1;
		}
		
	}
	
	public static boolean fechaCorrecta(int dia, int mes, int anio) {
		int numDias=diaMes(mes,anio);
		if (numDias<1 || dia>numDias)
			return false;
		else
			return true;
			
	} 
	
	public static boolean esMayor(int dia, int mes) {
		
		if(dia>=DIA_HOY && mes>=MES_HOY) {
			return true;
		} else
			return false;

	}
	
	public static void calculaEdad (int dia, int mes, int anyo) {
		
		if(esMayor(dia,mes)==true) {
			anyo = (ANIO_HOY-anyo)-1;
		} else
			anyo = ANIO_HOY-anyo;
		
		System.out.println("Tienes "+anyo+" años");
	}

}
