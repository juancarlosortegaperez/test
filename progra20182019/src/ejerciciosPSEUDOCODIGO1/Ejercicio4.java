package ejerciciosPSEUDOCODIGO1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CONSTANTES
			final double PI=3.1415;
		
		//variables
			double radio=0.0, area=0.0, perimetro=0.0;
				
		//Inicio
			System.out.println("Introduzca un radio");
			radio=Entrada.real();
			area=PI*(radio*radio);
			System.out.println("El resultado del área de un círculo de radio "+radio+" es: "+area);
			perimetro=(2*PI)*radio;
			System.out.println("El resultado del perímetro de un círculo de radio "+radio+" es: "+perimetro);
	}

}
