package Clases;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author Grupo 1
 */
public class Sistema {
    String dominio;
    String nombre;

    //Contiene todas las cuentas creadas en el sistema
    private static HashMap<Integer, Cuenta> cuentaPorCodigo = new HashMap<>();
    private static HashMap<Integer, Cliente> clientePorCodigo = new HashMap<>();
    private static HashMap<Integer, Pago> transaccionPorCodigo = new HashMap<>();
    private static HashMap<Integer, Transferencia> transferenciaPorCodigo = new HashMap<>();

    public Sistema(String dominio, String nombre) {
        this.dominio = dominio;
        this.nombre = nombre;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int generarID(Set<Integer> listaID) {
        int id = 1;
        while (listaID.contains(id)) {
            id++;
        }
        return id;
    }

    public static int generarIDCuenta() {
        return generarID(cuentaPorCodigo.keySet());
    }

    public static void agregarCuenta(Cuenta cuenta) {
        cuentaPorCodigo.put(cuenta.getID(), cuenta);
    }

    public static int generarIDCliente() {
        return generarID(clientePorCodigo.keySet());
    }

    public static void agregarCliente(Cliente cliente) {
        clientePorCodigo.put(cliente.getID(), cliente);
    }

    public static int generarIDTransaccion() {
        return generarID(transaccionPorCodigo.keySet());
    }

    public static void agregarTransaccion(Pago transaccion) {
        transaccionPorCodigo.put(transaccion.getIdTransaccion(), transaccion);
    }

    public static int generarIDTransferencia() {
        return generarID(transferenciaPorCodigo.keySet());
    }

    public static void agregarTransferencia(Transferencia transferencia) {
        transferenciaPorCodigo.put(transferencia.getIdTransferencia(), transferencia);
    }
}
