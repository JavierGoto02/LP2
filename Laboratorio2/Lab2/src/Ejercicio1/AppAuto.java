package Ejercicio1;

/**
 * Clase de prueba para la jerarquía de clases de Automovil
 * @author Grupo 1 - LP2 - FPUNA
 * @version 14/08/2023/
 */
public class AppAuto {
     /**
     * @param args los parámetros de la línea de comandos
     */
    public static void main(String[] args) throws InterruptedException {

        Automovil auto = new Automovil(); // Utilizamos el constructor por defecto de automovil
        Vehiculo vehiculo = new Vehiculo(
                "VehiculoJetSkiPrueba",
                "Probando nuestra clase de vehiculo",
                ModoDeTransporte.TipoTerreno.AGUA,
                3,
                ModoDeTransporte.UsoEnergetico.GASOLINA
                );
        ModoDeTransporte modoDeTransporte = new Vehiculo(
                "VehiculoElectricoPrueba",
                "Probando guardar instancia de vehiculo como modo de transporte",
                ModoDeTransporte.TipoTerreno.TERRESTRE,
                5,
                ModoDeTransporte.UsoEnergetico.ELECTRICO
        );
        vehiculo.iniciar();
        modoDeTransporte.iniciar();
        vehiculo.encenderLuces();
        vehiculo.sonarBocina();
        Thread.sleep(1200);
        vehiculo.detener();
        modoDeTransporte.detener();
        System.out.println("El vehiculo " + vehiculo.getNombre() + " consumio " + vehiculo.calcularUsoEnergetico() + "W");
        System.out.println("El modo de transporte consumio " + modoDeTransporte.calcularUsoEnergetico() + "W");
        System.out.println("modo de transporte es instancia de Vehiculo: " + (modoDeTransporte instanceof Vehiculo));
        System.out.println("modo de transporte es instancia de Automovil: " + (modoDeTransporte instanceof Automovil));
        System.out.println("Nombre de modo de transporte: " + ((Vehiculo)modoDeTransporte).getNombre());
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Asignando auto a variable contenedor modo de transporte...");
        modoDeTransporte = auto;
        System.out.println("modo de transporte es instancia de Vehiculo: " + (modoDeTransporte instanceof Vehiculo));
        System.out.println("modo de transporte es instancia de Automovil: " + (modoDeTransporte instanceof Automovil));
        System.out.println("auto implementa FuncionamientoAutomovil: " + (auto instanceof FuncionamientoAutomovil));
        System.out.println("auto implementa Comodidad: " + (auto instanceof Comodidad));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Impresión de automovil: ");
        System.out.println(auto);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Pruebas en la comodidad del vehiculo:");
        System.out.println("Prendiendo el aire acondicionado...");
        auto.setTieneAireAcondicionado(true);
        System.out.println("Tiene aire acondicionado: " + auto.tieneAireAcondicionado());
        auto.ajustarTemperatura(10);
        auto.reproducirMusica("Bandolero - Don Omar");



    }
}



