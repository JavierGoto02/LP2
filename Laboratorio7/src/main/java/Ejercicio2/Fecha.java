package Ejercicio2;

/**
 * La clase Fecha representa una fecha en el calendario, con opciones para inicializarla
 * mediante el mes, día y año, o a través de formatos alternativos como el nombre del mes
 * y el día del año.
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 2
 */
public class Fecha {
    /**
     * El día de la fecha.
     */
    int dia;

    /**
     * El año de la fecha.
     */
    int anho;

    /**
     * El mes de la fecha.
     */
    int mes;

    /**
     * Constructor que inicializa la fecha mediante el mes, día y año.
     *
     * @param mes El mes de la fecha.
     * @param dia El día de la fecha.
     * @param anho El año de la fecha.
     */
    public Fecha(int mes, int dia, int anho) {
        this.mes = mes;
        this.anho = anho;
        this.dia = dia;
    }

    /**
     * Constructor que inicializa la fecha mediante el nombre del mes, día y año.
     *
     * @param mes El nombre del mes.
     * @param dia El día de la fecha.
     * @param anho El año de la fecha.
     */
    public Fecha(String mes, int dia, int anho) {
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        for (int i = 0; i < meses.length; i++) {
            if (mes.equals(meses[i])) {
                this.mes = i;
                break;
            }
        }
        this.dia = dia;
        this.anho = anho;
    }

    /**
     * Constructor que inicializa la fecha mediante el número del día y el año.
     *
     * @param numdia El número del día en el año.
     * @param anho El año de la fecha.
     */
    public Fecha(int numdia, int anho) {
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i = 0;
        while (numdia > meses[i]) {
            numdia -= meses[i];
            i++;
        }
        this.mes = i;
        this.dia = numdia;
        this.anho = anho;
    }

    /**
     * Imprime la fecha en varios formatos: mes/día/año, nombre del mes día, año
     * y el número del día en el año y el año.
     */
    public void print() {
        System.out.printf("%d/%d/%d\n", mes, dia, anho);
        String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
        System.out.printf("%s %d, %d\n", meses[mes], dia, anho);
        int[] mesesint = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numdia = 0;
        for (int i = 0; i < mes; i++) {
            numdia += mesesint[i];
        }
        numdia += dia;
        System.out.printf("%d %d\n", numdia, anho);
    }
}
