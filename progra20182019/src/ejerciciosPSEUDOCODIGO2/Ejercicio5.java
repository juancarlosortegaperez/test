package ejerciciosPSEUDOCODIGO2;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables
			char car1=' ', car2=' ', car3=' ';

		//Inicio
			System.out.println("Introduzca tres caracteres");
			car1=Entrada.caracter();
			car2=Entrada.caracter();
			car3=Entrada.caracter();

			if(car1>car2 && car1>car3) {
				if (car2>car3) {
					System.out.println(car1+" "+car2+" "+car3);
				}
				else {
					System.out.println(car1+" "+car3+" "+car2);
				}
			}
			if(car2>car1 && car2>car3) {
				if (car1>car3) {
					System.out.println(car2+" "+car1+" "+car3);
				}
				else {
					System.out.println(car2+" "+car3+" "+car1);
				}
			}
			if(car2>car1 && car3>car2) {
				if (car2>car1) {
					System.out.println(car3+" "+car2+" "+car1);
				}
				else {
					System.out.println(car3+" "+car1+" "+car2);
				}
			}
			if (car1==car2 && car2==3) {
				System.out.println(car3+" "+car2+" "+car1);
			}
		}
	}
