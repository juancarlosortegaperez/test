package ejercicios2ºbachAñoPasado;
/**
 * Write a description of class Ejercicio21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio28
{

    public static void main ( String args[])
    {
        // put your code here
        Scanner leer= new Scanner (System.in);
        int n1,n2,n3;
        System.out.println("Introduzca un numero");
        n1= leer.nextInt();
        System.out.println("Introduzca un numero");
        n2= leer.nextInt();
        System.out.println("Introduzca un numero");
        n3= leer.nextInt();        
        if (n1>=n2 && n1>=n3)
        {
        System.out.println("El mayor es:"+n1);}
        else
        {if (n2>=n1 && n2>=n3)
           {
               System.out.println("El mayor es:"+n2);}
               else {System.out.println("El mayor es:"+n3);}
    }
} 
}