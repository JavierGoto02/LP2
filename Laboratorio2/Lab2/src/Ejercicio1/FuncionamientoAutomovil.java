package Ejercicio1;

/**
 * @author Grupo 1 - LP2 - FPUNA
 * Interfaz que designa las caracteristicas y metoods esenciales para el funcionamiento de un
 * Automovil.
 */
public interface FuncionamientoAutomovil {
    /**
     * Enumeración que representa los tipos de tracción de un automóvil.
     */
    enum Traccion {
        /** Tracción delantera (FWD). */
        TRACCION_DELANTERA,
        /** Tracción trasera (RWD). */
        TRACCION_TRASERA,
        /** Tracción en las cuatro ruedas (AWD). */
        TRACCION_AWD,
        /** Tracción en las cuatro ruedas con capacidad off-road (4x4). */
        TRACCION_4X4
    }

    /**
     * Se encarga del funcionamiento de arranque del motor.
     */
    void arrancarMotor();

    /**
     * Se encarga de apagar el motor.
     */
    void detenerMotor();

    /**
     * Aumentar la velocidad del automovil haciendo que este se mueva más rápido.
     */
    void acelerar();

    /**
     * Disminuir la velocidad del automovil haciendo que este se mueva más lento o pare.
     */
    void frenar();

    /**
     * Selecciona el modo de tracción que se va a utilizar entre las opciones,
     * todos los modos están contenidos en {@link Traccion}.
     * @param traccion El tipo de tracción a establecer.
     * @return true si se pudo establecer la tracción al modo solicitado.                                /2false si no.
     */
    boolean establecerTraccion(Traccion traccion);

}
