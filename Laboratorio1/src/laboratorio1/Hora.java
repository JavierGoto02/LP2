package laboratorio1;


public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    //Constructor de la clase
    public Hora(int h, int m, int s) { 
        hora = h;
        minuto = m;
        segundo = s;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = (hora < 24) ? hora : 24;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = (minuto < 60) ? minuto : 60;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = (segundo < 60) ? segundo : 60;
    }
    
    public void adelantar(int h, int m, int s) { 
        segundo += s;
        if (segundo >= 60) {
            minuto += segundo / 60;
            segundo %= 60;
        }
        minuto += m;
        if (minuto >= 60) {
            hora += minuto / 60;
            minuto %= 60;
        }
        hora = (hora + h) % 24;
    }
    
    public void reiniciar(int h, int m, int s) {
        hora = h;
        minuto = m;
        segundo = s;        
    }
    
    public void imprimir() {
        System.out.println(String.format("%02d:%02d:%02d", hora, minuto, segundo));       
    }
}
