package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO26
{
    public static void main (String args[])
    {   char caracter;
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduzca un caracter");
        caracter=leer.next().charAt(0);
        if (caracter=='a'|| caracter=='A' || caracter=='e'||
        caracter=='E'|| caracter=='i' || caracter=='I'||
        caracter=='o'|| caracter=='O' || caracter=='u'||
        caracter=='u')
        
        {System.out.println(caracter + " es vocal ");
        }
        else
        {System.out.println(caracter + " es consonante");
        }
    }
}   
        
  