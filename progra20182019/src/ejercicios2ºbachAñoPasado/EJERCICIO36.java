package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO21 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO36
{
    public static void main (String args[])
    {
      
     int edad, sumaedades=0, mayores=0;
     double media, numedades=0;
     Scanner leer=new Scanner(System.in);
     System.out.println("Introduzca una edad");
     edad=leer.nextInt();
     
     while (edad>=0)
     {
         sumaedades=sumaedades+edad;
         numedades=numedades+1.0;
         if (edad>=18) {mayores++;}
         System.out.println("Introduzca una edad");
         edad=leer.nextInt();  
     }
     media=sumaedades/numedades;
     System.out.println("Suma:"+sumaedades+"NÃºmero edades:"+numedades+"Media:"+media+"Mayores:"+mayores);
    }
}