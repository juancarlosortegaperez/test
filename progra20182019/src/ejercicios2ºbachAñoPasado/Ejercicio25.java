package ejercicios2�bachA�oPasado;

/**
 * Write a description of class Ejercicio21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner; 
public class Ejercicio25
{

    public static void main ( String args[])
    {   
        Scanner leer= new Scanner (System.in);
        int num;
        System.out.println("Introduzca un número del 1 al 12");
        num= leer.nextInt();
        if (num== 1 || num== 3 || num==5 || num== 7 || num== 8 || num == 10 || num== 12)
         System.out.println("mes de 31 días");
         else
         {
             if (num == 2)
              System.out.println("Mes de 28 días");
              else
               System.out.println("Mes de 30 días");
            }
    }
}
