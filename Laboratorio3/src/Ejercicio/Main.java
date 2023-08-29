package Ejercicio;

/**
 * @author Grupo 1 - Laboratorio 3
 */
public class Main
{
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Manuel", "Lezcano", "2398432",
         "0975123531", 23, 23000, 10, "Obras Publicas");

        TecnicoMantenimiento tecnico = new TecnicoMantenimiento("Jose", "Ramirez",
         "2345687", "0992345789", 19, 130000, "Refrigeracion");
        
        Informatico informatico = new Informatico("Martin", "Ferrer", "3457803",
        "0972333432", 20, 24000, "Desarollo web", "javaScript",
        5, true);

        Programador programador = new Programador("Javier", "Goto", "4589089",
        "0972366789", 20, 340000, "Creador de video juegos", "Java",
        10, true, "Visual Studio Code", true,
        "GitHub");

        Analista analista = new Analista("Fabrizio", "Kawabata", "6789432",
        "0986789345", 23, 120000, "Diseño de sistemas", "SQL",
        6, false, "Analisis de datos", "Analitico",
        "Diagrama de casos de uso");

        Operador operador = new Operador("Hiroto", "Yamashita", "4567832",
        "0992345765", 19, 55000, "Mantenimiento de servidores", "C",
        16, true, "Zabbix", false);

        System.out.println(gerente.informeExtendido());
        System.out.println(tecnico.informeExtendido());
        System.out.println(informatico.informeExtendido());
        System.out.println(programador.informeExtendido());
        System.out.println(analista.informeExtendido());
        System.out.println(operador.informeExtendido());
    }

}
