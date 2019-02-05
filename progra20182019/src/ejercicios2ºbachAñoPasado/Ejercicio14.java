package ejercicios2ºbachAñoPasado;

/**
 * Write a description of class Ejercicioedadmentalderafa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio14
{
       public static void main (String args[])
    {
        int cantidad, horas, min, seg, resto;
        cantidad=7199;
        horas= cantidad/3600;//Obtengo mi horas
        resto= cantidad%3600; //El resto serÃ¡ menor a 3600
        min=resto/60; //Obtengo el nÂº segundos
        seg=resto%60;
        System.out.println ("Tenemos hh:"+horas+" mm:"+min+" ss:"+seg);
    }
}
