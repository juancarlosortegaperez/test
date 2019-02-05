package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO41 
{
    public static void main (String args[])
    {
      
     int numimpares=0, productoimpares=1, i;
     Scanner leer=new Scanner(System.in);
 
     i=1;
     while (numimpares<10)
     {
         if (i%2!=0) {productoimpares=productoimpares*i; numimpares=numimpares+1;}
         i=i+10;
     }
    System.out.println("El producto de los primeros impares es:"+productoimpares);
    }
}
