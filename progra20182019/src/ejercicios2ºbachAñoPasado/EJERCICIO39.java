package ejercicios2�bachA�oPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO39
{
    public static void main (String args[])
    {
      
     int min, max, dato;
     Scanner leer=new Scanner(System.in);
     System.out.println("Introduzca el valor mínimo del rango");
     min=leer.nextInt();
     System.out.println("Introduzca el valor máximo del rango");
     max=leer.nextInt();
     System.out.println("Introduzca un valor dentro del rango");
     dato=leer.nextInt();
     
     while (dato<min || dato>max)
     {
         System.out.println("Por favor, dentro del rango");
         dato=leer.nextInt();  
     }
     
    }
}
