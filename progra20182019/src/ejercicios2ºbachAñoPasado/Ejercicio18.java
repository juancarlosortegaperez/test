package ejercicios2ºbachAñoPasado;


/**
 * Write a description of class Ejercicioedadmentalderafa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio18
{
       public static void main (String args[])
    {
        int numprod=10;
        double precio= 2.5, iva=0.21,total;
        total=numprod*precio; // total sin iva
        total=total+(total*iva);//total con iva
        System.out.println ("El total:"+total);
    }
}
