package Ejercicio1;

/**
 * @author Grupo 1 - LP2 - FPUNA
 * Abstracción más amplia en la jerarquia de clases, represente a cualquier medio
 * de transporte, sea cual sea su medio (aquifero, aereo, terreste), su tipo de
 * consumo energetico y su cantidad de pasajeros.
 */
public abstract class ModoDeTransporte {

    /**
     * Tipo de terreno por el cual un vehículo puede moverse.
     */
    public enum TipoTerreno {
        AGUA,
        AIRE,
        TERRESTRE,
        OTRO
    }

    /**
     * Fuente de energía que utiliza un modo de transporte
     */
    public enum UsoEnergetico {
        GASOLINA,
        DIESEL,
        ALCOHOL,
        ELECTRICO,

        OTRO
    }

    protected TipoTerreno tipoTerreno;
    protected int capacidadPasajeros;
    protected UsoEnergetico usoEnergetico;

    /**
     * Constructor del tipo de transporte.
     * @param tipoTerreno El tipo de terreno por el cual funciona el modo de transporte.
     * @param capacidadPasajeros La capacidad de personas que tiene el modo de transporte.
     * @param usoEnergetico El tipo de energía que requiere el modo de transporte.
     */
    public ModoDeTransporte(TipoTerreno tipoTerreno, int capacidadPasajeros, UsoEnergetico usoEnergetico) {
        this.tipoTerreno = tipoTerreno;
        this.capacidadPasajeros = capacidadPasajeros;
        this.usoEnergetico = usoEnergetico;
    }

    /**
     * Método para iniciar el modo de transporte y empezar a contar su uso energético.
     */
    abstract void iniciar();

    /**
     * Método para detener el modo de transporte y dejar de contar su uso energético.
     */
    abstract void detener();

    /**
     * Método que calcula el uso energético total dependiendo del tipo específico de transporte.
     * @return Una medida en vatios (watts) de cuanto consumió el modo de transporte al correr.
     */
    abstract double calcularUsoEnergetico();
}
