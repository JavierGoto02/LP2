package Ejercicio1;
public class main 
{
    

    /**
     * @author Grupo 1 - Laboratorio 10 - Ejercicio 1
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread hilo1 = new Thread(new metodo1());
        Thread hilo2 = new Thread(new metodo2());
        hilo1.start();
        hilo2.start();
        
        
    }
    
}
