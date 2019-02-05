package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO49
{
    public static void main (String args[])
    {
      
     int n, divisores ;
     Scanner leer=new Scanner(System.in);
     System.out.println("Introduzca un numero");
     n=leer.nextInt();
     
     
     for (int i=1; i<=n ; i++)
     {
         divisores=0;
         for (int j=1; j<=i; j++)
         {
             if (i%j==0) {divisores++;}
     }
     if (divisores<=2) {System.out.println (i+"-> Es primo");}
     else {System.out.println(i+"->No es primo");}
    
    
    }
}
}
