package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO44{
    public static void main (String args[])
    {
      
     int n;
     Scanner leer=new Scanner(System.in);
     System.out.println("Introduzca un numero entre 1 y 10");
     n=leer.nextInt();
     if (n>0 && n<=10)
     {
        
        for (int i=1; i<=10; i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
    else{
        System.out.println("Error en el numero ");}
        
    }
}

