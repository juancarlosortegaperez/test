package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class Ejercicio21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio27
{

    public static void main ( String args[])
    {
        // put your code here
        Scanner leer= new Scanner (System.in);
        int num;
        System.out.println("Introduzca un numero");
        num= leer.nextInt();
        if (num>=5)
        {
        System.out.println("Apto");}
        else
        {System.out.println("No Apto");}
    }
}
