package laboratorio1;

public class Fecha {
    private int mes;
    private int dia;
    private int año;

    //Constructor de la clase
    public Fecha( int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void mostrarFecha() {
        System.out.println(String.format("%02d/%02d/%04d", mes, dia, año));
    }
}
