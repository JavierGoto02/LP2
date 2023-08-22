package laboratorio1;

public class Factura {
    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidadDeArticulos;
    private double precioPorArticulo;
    
    //Constructor de la clase
    public Factura(String numeroDePieza, String descripcionDePieza, 
                   int cantidadDeArticulos, double precioPorArticulo) {
        this.numeroDePieza = numeroDePieza;
        this.descripcionDePieza = descripcionDePieza;
        if (cantidadDeArticulos < 0) {
            this.cantidadDeArticulos = 0;
        } else {
            this.cantidadDeArticulos = cantidadDeArticulos;
        }
        if (precioPorArticulo < 0) {
            this.precioPorArticulo = 0.0d;
        } else {
            this.precioPorArticulo = precioPorArticulo;
        }
    }

    public String getNumeroDePieza() {
        return numeroDePieza;
    }

    public void setNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public String getDescripcionDePieza() {
        return descripcionDePieza;
    }

    public void setDescripcionDePieza(String descripcionDePieza) {
        this.descripcionDePieza = descripcionDePieza;
    }

    public int getCantidadDeArticulos() {
        return cantidadDeArticulos;
    }

    public void setCantidadDeArticulos(int cantidadDeArticulos) {
        if (cantidadDeArticulos < 0) {
            this.cantidadDeArticulos = 0;
        } else {
            this.cantidadDeArticulos = cantidadDeArticulos;
        }    
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0) {
            this.precioPorArticulo = 0.0d;
        } else {
            this.precioPorArticulo = precioPorArticulo;
        }
    }
    
    public double obtenerMontoFactura() {
        return cantidadDeArticulos * precioPorArticulo;
    }
}