package Ejercicio1;

import java.util.ArrayList;

/**
 * @author Grupo 1 - LP2 - FPUNA
 * Ultima clase en la jerarquia de clases, hereda de Vehículo e implementa las interfaces
 * de FuncionamientoAutomovil y Comodidad. Representa un vehículo terreste y prove
 */
public final class Automovil extends Vehiculo implements FuncionamientoAutomovil, Comodidad {

    private boolean tieneAireAcondicionado;
    private boolean tieneSistemaDeEntretenimiento;
    private int temperaturaAireAcondicionado;
    private String cancionDeReproduccion;
    private ArrayList<Traccion> modosDeTraccionDisponibles;
    private Traccion modoTraccionSelecionado;
    private boolean motorCorriendo;

    /**
     * Constructor por defecto para Automovil, inicializa un automovil con capacidad de 5 personas
     * que consume gasolina y tiene tracción trasera.
     */
    public Automovil() {
        super("Automovil", "Un vehiculo de cuatro ruedas", TipoTerreno.TERRESTRE, 5, UsoEnergetico.GASOLINA);
        modosDeTraccionDisponibles = new ArrayList<>();
        modosDeTraccionDisponibles.add(Traccion.TRACCION_TRASERA);
        modoTraccionSelecionado = modosDeTraccionDisponibles.get(0);
    }

    /**
     * Constructor con parámetros para Automovil.
     * @param nombre El nombre del automovil.
     * @param descripcion La descripción del automovil.
     * @param capacidadPasajeros La capacidad de pasajeros que tiene el automovil.
     * @param usoEnergetico El tipo de combustible/energía que usa el automovil.
     * @param modosDeTraccionDisponibles Los modos de tracción disponibles para el automovil.
     */
    public Automovil(String nombre, String descripcion, int capacidadPasajeros,
                     UsoEnergetico usoEnergetico, ArrayList<Traccion> modosDeTraccionDisponibles) {
        super(nombre, descripcion, TipoTerreno.TERRESTRE, capacidadPasajeros, usoEnergetico);
        this.modosDeTraccionDisponibles = modosDeTraccionDisponibles;
        modoTraccionSelecionado = modosDeTraccionDisponibles.get(0);
    }

    /**
     * @return true si el automovil tiene aire acondicionado, false si no.
     */
    public boolean getTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    /**
     * Establece si el vehículo tiene aire acondicionado.
     * @param tieneAireAcondicionado El valor a establecer
     */
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }

    /**
     * @return true si el automovil tiene sistema de entretenimiento, false si no.
     */
    public boolean getTieneSistemaDeEntretenimiento() {
        return tieneSistemaDeEntretenimiento;
    }

    /**
     * Establece si el vehículo tiene un sistema de entretenimiento.
     * @param tieneSistemaDeEntretenimiento El valor a establecer
     */
    public void setTieneSistemaDeEntretenimiento(boolean tieneSistemaDeEntretenimiento) {
        this.tieneSistemaDeEntretenimiento = tieneSistemaDeEntretenimiento;
    }

    // Implementación de interfaz FuncionamientoAutomovil
    @Override
    public void arrancarMotor() {
        motorCorriendo = true;
        super.iniciar();
    }

    @Override
    public void detenerMotor() {
        motorCorriendo = false;
        super.detener();
    }

    @Override
    public void acelerar() {
        if (velocidadActual + aceleracion < velocidadTope) {
            velocidadActual += aceleracion;
        }
    }

    @Override
    public void frenar() {
        if (velocidadActual - potenciaFrenado < velocidadTope) {
            velocidadActual -= potenciaFrenado;
        }
    }

    @Override
    public boolean establecerTraccion(Traccion traccion) {
        if (modosDeTraccionDisponibles.contains(traccion)) {
            modoTraccionSelecionado = traccion;
            return true;
        } else {
            System.out.println("El modo de tracción " + traccion + "no esta entre los disponibles.");
            return false;
        }
    }

    // Implementación de interfaz Comodidad
    @Override
    public boolean tieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }

    @Override
    public boolean tieneSistemaDeEntretenimiento() {
        return tieneSistemaDeEntretenimiento;
    }

    @Override
    public void ajustarTemperatura(int temperatura) {
        temperaturaAireAcondicionado = temperatura;
        System.out.println("Se ajusto la temperatura a " + temperatura + " grados Celsius." );
    }

    @Override
    public void reproducirMusica(String nombreCancion) {
        cancionDeReproduccion = nombreCancion;
        System.out.println("Ahora reproduciendo: " + nombreCancion) ;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDescripción: " + descripcion;

    }
}
