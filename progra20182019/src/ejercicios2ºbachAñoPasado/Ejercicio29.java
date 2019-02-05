package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class Ejercicio21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio29
{

    public static void main ( String args[])
    {
       int n;
       Scanner leer= new Scanner (System.in);
       System.out.println("Introduzca un numero");
       n = leer.nextInt();
       if (n%2== 0 && n%5== 0)
       {
           System.out.println(n+ " es divisible entre 2 y 5");}
           else
           {  System.out.println(n+ " no es divisible entre 2 y 5");}
    }
}