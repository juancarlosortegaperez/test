package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO31
{
    public static void main (String args[])
    {   int n1,n2,n3;
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduzca el primer valor");
        n1= leer.nextInt();
        System.out.println("Introduzca el segundo valor");
        n2= leer.nextInt();
        System.out.println("Introduzca el tercer valor");
        n3= leer.nextInt();
        if (n1==n2 && n2==n3)
        {System.out.println(" Son iguales");
        }
        else
        {System.out.println("Son distintos"); 
        }
    }
}   
