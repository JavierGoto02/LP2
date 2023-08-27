package Ejercicio;

/**
 * @author Grupo 1 - Laboratorio 3
 */
public class Main
{
    public static void main(String[] args) {
        Gerente empleado = new Gerente("Manual", "Lezcano", "2398432",
         "0975123531", 23, 23000, 10, "Obras Publicas");

        TecnicoMantenimiento tecnico = new TecnicoMantenimiento("Jose", "Ramirez",
         "2345687", "0992345789", 19, 130000, "Refrigeracion");
        
         Informatico informatico = new Informatico("Martin", "Ferrer", "3457803",
          "0972333432", 20, 24000, "Desarollo web", "javaScript",
           5, true);

           Programador programador = new Programador(null, null, null, null, 0, 0, null, null, 0, false, null, false, null)
    }

}
