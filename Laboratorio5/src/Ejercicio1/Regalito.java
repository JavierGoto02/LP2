package Ejercicio1;
/**
 * @author Grupo 1 - Laboratorio 5
 */
public class Regalito
{
    private static String imprimir(int veces)
    {
        String cadena = "";
        for(int i = 1; i <= veces; i++)
            cadena += "*";
        return cadena;
    }

    public static void Impresion1()
    {
        System.out.println("a)");
        for(int i = 1; i <= 10; i++)
            System.out.printf("%-10s\n", imprimir(i));
        System.out.println();
    }
    
    public static void Impresion2()
    {
        System.out.println("b)");
        for(int i = 10; i >= 1; i--)
            System.out.printf("%-10s\n", imprimir(i));
        System.out.println();
    }

    public static void Impresion3()
    {
        System.out.println("c)");
        for(int i = 10; i >= 1; i--)
            System.out.printf("%10s\n", imprimir(i));
        System.out.println();
    }


    public static void Impresion4()
    {
        System.out.println("d)");
        for(int i = 1; i <= 10; i++)
            System.out.printf("%10s\n", imprimir(i));
    }

    public static void main(String[] args) 
    {
        Impresion1();
        Impresion2();
        Impresion3();
        Impresion4();
    }
}