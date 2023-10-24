package Ejercicio1;

/**
 *
 * @author Grupo 1 - Laboratorio 9 - Ejercicio 1
 */

/*
 * Comentarios sobre la excepción encontrada: Math.random() genera un punto flotante 
 * perteneciente en el rango 0 < x < 1, entonces al castear al tipo int, solamente 
 * se tendrá en cuenta su valor entero, es decir, el valor cero. Por lo tanto, 
 * r siempre tendrá el valor 0 tras asignarle (int)Math.random().
 */
public class ExcpArt {
    static void atime () {
        int t, r;
        r = (int)Math.random();
        System.out.println("Método atime-LP2");
        try{
            // División entre valor cero conllevará a ArithmeticException(Excepción Aritmética)
            t = 2/r;
        }
        catch (ArithmeticException ae){
            // Manejo de la excepción
            System.out.println("Hubo una división entre el valor cero!");
        }
        
    }
    static void batime(){
        System.out.println("Método batime-LP2");
        atime();
    }

    static void zatime(){
        System.out.println("Método zatime-LP2");
        batime();
    }
    static public void main(String[] arg){
        System.out.println("Entrada al programa principal - LP2");
        zatime();            
    }
}
