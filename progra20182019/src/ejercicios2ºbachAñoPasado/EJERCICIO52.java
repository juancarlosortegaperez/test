package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class EJERCICIO50 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EJERCICIO52{
    public static void main (String args[])
    {   int [] alturas;
        int n=-1;
        double media,suma=0;
        int mayores=0, menores=0;
        Scanner leer=new Scanner(System.in);
        while (n<0) 
        {
          System.out.println("Introduzca el valor de n positivo");
          n=leer.nextInt();
        }
        alturas=new int[n];
        for (int i=0 ;i<n;i++)
        {
            System.out.println("Introduzca la altura del elemtento"+i+1);
            alturas[i]=leer.nextInt();
            suma=suma+alturas[i];
        }
        media=suma/n;
        for (int i=0; i<n; i++)
        {
            if (alturas[i]>media) {mayores++;}
            else {menores++;}
        }
        System.out.println("La media de alturases:"+media);
        System.out.println("Hay"+mayores+"alturas superiores a la media");
        System.out.println("Hoy"+menores+"alturas inferiores a la media");



}
}
