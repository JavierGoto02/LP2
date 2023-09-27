package Ejercicio1;


 //@author Grupo 1 - Laboratiorio 4
 
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona x = new Persona(123456, "Hiroto", "Yamashita", 19);
        Empleado y = new Empleado(654321, "Daisuke", "Kawabata", 19, 1, 2.4f);
        Cliente z = new Cliente(135246, "Martin", "Ferrer", 20, 1, 5.0f);
        x.visualizar();
        y.visualizar();
        z.visualizar();
    }
    
}

