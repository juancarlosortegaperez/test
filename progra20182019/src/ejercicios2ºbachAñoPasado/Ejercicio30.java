package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class Ejercicio21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Ejercicio30
{

    public static void main ( String args[])
    {
       int dia, mes;
       Scanner leer= new Scanner (System.in);
       System.out.println("Introduzca el dia de nacimiento");
       dia= leer.nextInt();
       System.out.println("Introduzca el mes de nacimiento");
       mes= leer.nextInt();
       if (mes== 1)
       {
           if (dia>20)
           { System.out.println("Acuario");}
               else
               {System.out.println("Capricornio");}
            }
            if (mes== 2)
       {
           if (dia>19)
           { System.out.println("Piscis");}
               else
               {System.out.println("Acuario");}
            }
            if (mes== 3)
       {
           if (dia>20)
           { System.out.println("Aries");}
               else
               {System.out.println("Piscis");}
            }
            if (mes== 4)
       {
           if (dia>20)
           { System.out.println("Tauro");}
               else
               {System.out.println("Aries");}
            }
            if (mes== 5)
       {
           if (dia>21)
           { System.out.println("Geminis");}
               else
               {System.out.println("Tauro");}
            }
            if (mes== 6)
       {
           if (dia>21)
           { System.out.println("Cancer");}
               else
               {System.out.println("Geminis");}
            }
            if (mes== 7)
       {
           if (dia>23)
           { System.out.println("Leo");}
               else
               {System.out.println("Cancer");}
            }
            if (mes== 8)
       {
           if (dia>23)
           { System.out.println("Virgo");}
               else
               {System.out.println("Leo");}
            }
            if (mes== 9)
       {
           if (dia>23)
           { System.out.println("Libra");}
               else
               {System.out.println("Virgo");}
            }
            if (mes== 10)
       {
           if (dia>23)
           { System.out.println("Escorpio");}
               else
               {System.out.println("Libra");}
            }
            if (mes== 11)
       {
           if (dia>23)
           { System.out.println("Sagitario");}
               else
               {System.out.println("Escorpio");}
            }
            if (mes== 12)
       {
           if (dia>21)
           { System.out.println("Capricornio");}
               else
               {System.out.println("Sagitario");}
            }
    }
}
