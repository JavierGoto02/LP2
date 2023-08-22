package Ejercicio1;

/**
 * @author Grupo 1 - LP2 - FPUNA
 * Abstraccion en el nivel medio del arbol de jerarquia, representa a un modo de transporte
 * con nombre y descripcion tripulado individualmente, con una cantidad media de pasajeros.
 * Solo implementa funcionamiento general a todos los vehiculos.
 */
public class Vehiculo extends ModoDeTransporte {
    protected String nombre;
    protected String descripcion;
    protected double velocidadTope;
    protected double velocidadActual;
    protected double aceleracion;
    protected double potenciaFrenado;
    private boolean luzPrendida;
    private long tiempoCorriendo;
    private long tiempoDeInicio;
    private long tiempoDeFin;

    /**
     * Constructor para la clase Vehículo.
     * @param nombre El nombre del vehículo.
     * @param descripcion La descripción más detallada del vehículo.
     * @param tipoTerreno El tipo de terreno por el cual se desplaza el vehículo.
     * @param capacidadPasajeros La capacidad maxima de pasajeros del vehículo.
     * @param usoEnergetico El tipo de energía que usa el vehículo.
     */
    public Vehiculo(String nombre, String descripcion, TipoTerreno tipoTerreno, int capacidadPasajeros, UsoEnergetico usoEnergetico) {
        super(tipoTerreno, capacidadPasajeros, usoEnergetico);
        this.nombre = nombre;
        this.descripcion = descripcion;
        tiempoCorriendo = 0;
    }

    /**
     * @return El nombre del automovil
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del automovil.
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return La descripción del automovil.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del automovil
     * @param descripcion La descripción a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return La velocidad topé del automovil.
     */
    public double getVelocidadTope() {
        return velocidadTope;
    }

    /**
     * Establece la velocidad topé del automovil
     * @param velocidadTope La velocidad topé a establecer.
     */
    public void setVelocidadTope(double velocidadTope) {
        this.velocidadTope = velocidadTope;
    }

    /**
     * @return La aceleración del automovil.
     */
    public double getAceleracion() {
        return aceleracion;
    }

    /**
     * Establece la aceleración del automovil
     * @param aceleracion La aceleración a establecer.
     */
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    /**
     * @return La potencia de frenado del automovil (que tan rápido puede frenar).
     */
    public double getPotenciaFrenado() {
        return potenciaFrenado;
    }

    /**
     * Establece potencia de frenado del automovil
     * @param potenciaFrenado La potencia de frenado a establecer.
     */
    public void setPotenciaFrenado(double potenciaFrenado) {
        this.potenciaFrenado = potenciaFrenado;
    }


    @Override
    void iniciar() {
        tiempoDeInicio = System.currentTimeMillis() / 1000;
    }

    @Override
    void detener() {
        tiempoDeFin = System.currentTimeMillis() / 1000;
        tiempoCorriendo += tiempoDeFin - tiempoDeInicio;
        tiempoDeInicio = 0;
    }

    @Override
    double calcularUsoEnergetico() {
        long tiempoTotalCorriendo = tiempoCorriendo;
        if (tiempoDeInicio != 0) {
            tiempoTotalCorriendo += (System.currentTimeMillis() / 1000) - tiempoDeInicio;
        }
        // Estimar uso energético basándonos en el tipo de energía que usa el vehículo
        // y su tiempo corriendo
        switch (usoEnergetico) {
            case GASOLINA:
            case DIESEL:
                return 5 * tiempoTotalCorriendo;
            case ALCOHOL:
                return 3 * tiempoTotalCorriendo;
            case ELECTRICO:
                return 2 * tiempoTotalCorriendo;
            case OTRO:
            default:
                return tiempoTotalCorriendo;
        }
    }

    /**
     * Método para encender las luces del vehículo.
     */
    void encenderLuces() {
        luzPrendida = true;
    }

    /**
     * Método para apagar las luces del vehículo.
     */
    void apagarLuces() {
        luzPrendida = false;
    }

    /**
     * Método para sonar la bocina del vehículo.
     */
    void sonarBocina() {
        System.out.println("¡Pip pip!");
    }
}

