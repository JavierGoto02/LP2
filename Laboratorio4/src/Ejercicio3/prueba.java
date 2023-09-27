package Ejercicio3;


 //@author Grupo 1 - Laboratiorio 4
 
public class prueba {
    public static void main(String[] args) {
        System.out.println("PRUEBA DE LA JERARQUIA DE CLASES");

        Empleado emp = new Empleado("Fabrizio Kawabata", "7669776", 2000000.0, "Administracion", 40.0);
        System.out.println(emp.mostrarInformacion());

        Supervisor sup = new Supervisor("Javier Goto", "5406655", 3000000.0, "Informatica", 80.0, 50,
                new String[] { "Hola Mundo", "Calculadora", "Editor de Organigramas" }, 5);
        System.out.println(sup.mostrarInformacion());

        Gerente ger = new Gerente("Martin Ferrer", "5181514", 4000000.0, "Supervision", 100.0, 60,
                new String[] { "Facebook", "Instagram", "Twitter" }, 20, 10000000, 24,
                new String[] { "Compra de equipos informaticos", "Acreedores varios", "Venta de mercaderias" });
        System.out.println(ger.mostrarInformacion());

        DirectorEjecutivo dir = new DirectorEjecutivo("Hiroto Yamashita", "5181514", 5000000.0, "Logistica", 50.0, 80,
                null, 30, 5000000, 48,
                null, null, 670000);
        System.out.println(dir.mostrarInformacion());
    }
}