package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 * El sistema central de la aplicación bancaria que gestiona clientes, cuentas y transacciones.
 * 
 * <p>Mantiene HashMaps para almacenar objetos por su código, como cuentas, clientes, transacciones y transferencias.
 * Se usan estos como una alternativa a implementar una base de datos real para el propósito de la simulación de sistema.</p>
 * 
 * <p>Proporciona métodos para obtener listas de comprobantes, cuentas y objetos por su código,
 * así como métodos para generar nuevos IDs y crear clientes, cuentas, transferencias y transacciones.</p>
 * 
 * <p>Además, incluye métodos para eliminar cuentas y clientes del sistema.</p>
 * 
 * @author Grupo 1
 */
public class Sistema 
{
    private static HashMap<Integer, Cuenta> cuentaPorCodigo = new HashMap<>();
    private static HashMap<Integer, Cliente> clientePorCodigo = new HashMap<>();
    private static HashMap<Integer, Transaccion> transaccionPorCodigo = new HashMap<>();
    private static HashMap<Integer, Transferencia> transferenciaPorCodigo = new HashMap<>();

    /**
     * Retorna una lista de comprobantes correspondientes a una cuenta específica.
     * 
     * @param idCuenta El identificador de la cuenta.
     * @return Una lista de comprobantes asociados a la cuenta.
     */
    public static ArrayList<Comprobante> obtenerListaComprobantes(int idCuenta)
    {
        ArrayList<Comprobante> listaComprobantes = new ArrayList<>();
        for(Map.Entry<Integer, Transaccion> entry : transaccionPorCodigo.entrySet())
        {
            if(entry.getValue().getIDCuenta() == idCuenta)
                listaComprobantes.add(entry.getValue());
        }

        for(Map.Entry<Integer, Transferencia> entry : transferenciaPorCodigo.entrySet())
        {
            if(entry.getValue().getIDCuenta() == idCuenta)
                listaComprobantes.add(entry.getValue());
        }
        return listaComprobantes;
    }

    /**
     * Retorna una lista de cuentas correspondientes a un cliente.
     * 
     * @param idCliente El identificador del cliente.
     * @return Una lista de cuentas asociadas al cliente.
     */
    public static ArrayList<Cuenta> obtenerListaCuentas(int idCliente)
    {
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();

        for(Map.Entry<Integer, Cuenta> entry : cuentaPorCodigo.entrySet())
        {
            if(entry.getValue().getIDPropietario() == idCliente)
                listaCuentas.add(entry.getValue());
    
        }

        return listaCuentas;
    }

    /**
     * Retorna un objeto Cuenta a partir de su identificador.
     * 
     * @param idCuenta El identificador de la cuenta.
     * @return El objeto Cuenta asociado al identificador.
     */
    public static Cuenta obtenerObjetoCuenta(int idCuenta)
    {
        return cuentaPorCodigo.get(idCuenta);
    }
    
    /**
     * Retorna un objeto Cuenta a partir de su Tarjeta asociada.
     * 
     * @param nroTarjeta El numero de tarjeta que tiene la cuenta.
     * @return El objeto Cuenta asociado a la Tarjeta. Retorna null si no existe cuenta.
     */
    public static Cuenta obtenerObjetoCuentaPorTarjeta(int nroTarjeta)
    {
        for(Map.Entry<Integer, Cuenta> entry : cuentaPorCodigo.entrySet())
        {
            if(entry.getValue().getTarjeta().getNroTarjeta() == nroTarjeta)
                return entry.getValue();
    
        }
        return null;
    }

    /**
     * Retorna un objeto Cliente a partir de su identificador.
     * 
     * @param idCliente El identificador del cliente.
     * @return El objeto Cliente asociado al identificador.
     */
    public static Cliente obtenerObjetoCliente(int idCliente)
    {
        return clientePorCodigo.get(idCliente);
    }

    /**
     * Retorna un objeto Transferencia a partir de su identificador.
     * 
     * @param idTransferencia El identificador de la transferencia.
     * @return El objeto Transferencia asociado al identificador.
     */
    public static Transferencia obtenerObjetoTransferencia(int idTransferencia)
    {
        return transferenciaPorCodigo.get(idTransferencia);
    }

    /**
     * Retorna un objeto Transaccion a partir de su identificador.
     * 
     * @param idTransaccion El identificador de la transacción.
     * @return El objeto Transaccion asociado al identificador.
     */
    public static Transaccion obtenerObjetoTransaccion(int idTransaccion)
    {
        return transaccionPorCodigo.get(idTransaccion);
    }

    /**
     * Genera un nuevo identificador único evitando duplicados.
     * 
     * @param listaID El conjunto de identificadores existentes.
     * @return Un nuevo identificador único.
     */
    private static int generarID(Set<Integer> listaID) {
        int id = 1;
        while (listaID.contains(id)) {
            id++;
        }
        return id;
    }

    /**
     * Genera un nuevo identificador único para cuentas.
     * 
     * @return Un nuevo identificador único para cuentas.
     */
    public static int generarIDCuenta() {
        return generarID(cuentaPorCodigo.keySet());
    }

    /**
     * Genera un nuevo identificador único para clientes.
     * 
     * @return Un nuevo identificador único para clientes.
     */
    public static int generarIDCliente() {
        return generarID(clientePorCodigo.keySet());
    }

    /**
     * Genera un nuevo identificador único para transacciones.
     * 
     * @return Un nuevo identificador único para transacciones.
     */
    public static int generarIDTransaccion() {
        return generarID(transaccionPorCodigo.keySet());
    }

    /**
     * Genera un nuevo identificador único para transferencias.
     * 
     * @return Un nuevo identificador único para transferencias.
     */
    public static int generarIDTransferencia() {
        return generarID(transferenciaPorCodigo.keySet());
    }

    /**
     * Crea un nuevo cliente persona y lo agrega al sistema.
     *
     * @param nombre     El nombre del cliente persona.
     * @param apellido   El apellido del cliente persona.
     * @param CI         El número de cédula de identidad del cliente persona.
     * @param direccion  La dirección del cliente persona.
     * @param telefono   El número de teléfono del cliente persona.
     */
    public static void crearClientePersona(String nombre, String apellido, int CI, String direccion, String telefono)
    {
        // Generar un nuevo identificador único para el cliente persona
        int identificadorPersona = generarIDCliente();
        
        // Crear un nuevo objeto Persona con la información proporcionada
        Persona nuevaPersona = new Persona(identificadorPersona, direccion, telefono, CI, nombre, apellido);
        
        // Agregar el cliente persona al HashMap de clientes por su identificador
        clientePorCodigo.put(identificadorPersona, nuevaPersona);
    }

    /**
     * Crea un nuevo cliente empresa y lo agrega al sistema.
     *
     * @param razonSocial La razón social de la empresa.
     * @param ruc         El Registro Único de Contribuyentes (RUC) de la empresa.
     * @param direccion   La dirección de la empresa.
     * @param telefono    El número de teléfono de la empresa.
     */
    public static void crearClienteEmpresa(String razonSocial, String ruc, String direccion, String telefono)
    {
        // Generar un nuevo identificador único para el cliente empresa
        int identificadorEmpresa = generarIDCliente();
        
        // Crear un nuevo objeto Empresa con la información proporcionada
        Empresa nuevaEmpresa = new Empresa(identificadorEmpresa, direccion, telefono, razonSocial, ruc);
        
        // Agregar el cliente empresa al HashMap de clientes por su identificador
        clientePorCodigo.put(identificadorEmpresa, nuevaEmpresa);
    }

    /**
     * Crea una nueva cuenta y la asocia a un cliente existente en el sistema.
     * Este método asume que la tarjeta se solicitará por interfaz.
     *
     * @param IDpropietarioCuenta El identificador del propietario de la cuenta.
     * @param tarjeta             La tarjeta asociada a la cuenta.
     * @param pinTransaccion      El PIN de transacción de la cuenta.
     */
    public static void crearCuenta(int IDpropietarioCuenta, Tarjeta tarjeta, int pinTransaccion)
    {
        // Generar un nuevo identificador único para la cuenta
        int identificadorCuenta = generarIDCuenta();
        
        // Crear un nuevo objeto Cuenta con la información proporcionada
        Cuenta nuevaCuenta = new Cuenta(IDpropietarioCuenta, tarjeta, pinTransaccion, identificadorCuenta);
        
        // Agregar al HashMap de cuentas por su identificador
        cuentaPorCodigo.put(identificadorCuenta, nuevaCuenta);
    }

    /**
     * Elimina una cuenta del sistema.
     * 
     * @param idCuenta El identificador de la cuenta a eliminar.
     */
    public static void eliminarCuenta(int idCuenta)
    {
        Cuenta cuentaEliminar = cuentaPorCodigo.get(idCuenta);
        if(cuentaEliminar.tieneDeuda())
            System.out.println("El cliente debe abonar la deuda de la cuenta: " + cuentaEliminar.toShortString() + " para eliminar");
        else
        {
            // Iterar sobre los comprobantes de la cuenta
            for(Comprobante comprobantesCuenta : cuentaEliminar.getComprobantes())
            {
                // Verificar si el comprobante es una transferencia y eliminarla del HashMap correspondiente
                if(comprobantesCuenta.esTranferencia())
                    transferenciaPorCodigo.remove(comprobantesCuenta.getIdentificador());
                // Si no es una transferencia, eliminar la transacción del HashMap correspondiente
                else
                    transaccionPorCodigo.remove(comprobantesCuenta.getIdentificador());
            }
            cuentaPorCodigo.remove(cuentaEliminar.getID());
        }   
    }

    /**
     * Elimina un cliente del sistema, junto con todas sus cuentas y transacciones asociadas.
     *
     * @param identificadorCliente El identificador del cliente que se desea eliminar.
     */
    public static void eliminarCliente(int identificadorCliente)
    {
        // Obtener el objeto Cliente a partir del identificador
        Cliente clienteEliminar = clientePorCodigo.get(identificadorCliente);
        
        // Iterar sobre las cuentas del cliente
        for(Cuenta cuenta : clienteEliminar.getCuentas())
        {
            // Verificar si la cuenta tiene deuda
            if(cuenta.tieneDeuda()) {
                System.out.println("El cliente debe abonar la deuda de la cuenta: " + cuenta.toShortString() + " para eliminar");
            } else {
                // Iterar sobre los comprobantes de la cuenta
                for(Comprobante comprobantesCuenta : cuenta.getComprobantes())
                {
                    // Verificar si el comprobante es una transferencia y eliminarla del HashMap correspondiente
                    if(comprobantesCuenta.esTranferencia())
                        transferenciaPorCodigo.remove(comprobantesCuenta.getIdentificador());
                    // Si no es una transferencia, eliminar la transacción del HashMap correspondiente
                    else
                        transaccionPorCodigo.remove(comprobantesCuenta.getIdentificador());
                }
                
                // Eliminar la cuenta del HashMap de cuentas por su identificador
                cuentaPorCodigo.remove(cuenta.getID());
            }
        }
        
        // Eliminar al cliente del HashMap de clientes por su identificador
        clientePorCodigo.remove(clienteEliminar.getID());
    }

    /**
     * Crea una nueva transferencia y la agrega al sistema.
     * 
     * @param idFuente  El identificador de la cuenta de origen.
     * @param idDestino El identificador de la cuenta de destino.
     * @param monto     El monto de la transferencia.
     */
    public static void crearTransferencia(int idFuente, int idDestino, int monto)
    {
        int idTranferencia = generarIDTransferencia();
        Transferencia nuevaTransferencia = new Transferencia(idFuente, idDestino, monto);
        transferenciaPorCodigo.put(idTranferencia, nuevaTransferencia);
    }

    /**
     * Crea una nueva transacción y la agrega al sistema.
     * 
     * @param pagador            El identificador de la cuenta del pagador.
     * @param descripcionServicio La descripción del servicio.
     * @param monto              El monto de la transacción.
     * @param metodoPago         El método de pago utilizado.
     */
    public static void crearTransaccion(int pagador, String descripcionServicio, int monto, String metodoPago)
    {
        int idTransaccion = generarIDTransaccion();
        Transaccion nuevaTransaccion = new Transaccion(pagador, descripcionServicio, monto, metodoPago);
        transaccionPorCodigo.put(idTransaccion, nuevaTransaccion);
    }

    /**
     * Realiza una transferencia entre dos cuentas, disminuyendo el saldo de la cuenta de origen
     * y aumentando el saldo de la cuenta de destino. Además, crea una nueva transferencia y la agrega al sistema.
     *
     * @param idFuente  El identificador de la cuenta de origen.
     * @param idDestino El identificador de la cuenta de destino.
     * @param monto     El monto a transferir.
     */
    public static void realizarTransferencia(int idFuente, int idDestino, int monto)
    {
        Cuenta Fuente = obtenerObjetoCuenta(idFuente);
        Cuenta Destino = obtenerObjetoCuenta(idDestino);
        crearTransferencia(idFuente, idDestino, monto);
        if(Fuente.tieneFondoSuficiente(monto))
        {
            Fuente.disminuirSaldo(monto);
            Destino.aumentarSaldo(monto);
        }
        else
            System.out.println("La cuenta " + Fuente.toShortString() + "no tiene fondo suficiente para realizar la transferencia");
            
    }

    /**
     * Realiza el pago de un servicio desde una cuenta, disminuyendo el saldo de la cuenta y creando una nueva transacción.
     *
     * @param idCuenta              El identificador de la cuenta desde la cual se realiza el pago.
     * @param monto                 El monto a pagar por el servicio.
     * @param descripcionServicio   La descripción del servicio a pagar.
     * @param metodeDePago          El método de pago utilizado.
     */
    public static void pagarServicio(int idCuenta, int monto, String descripcionServicio, String metodeDePago)
    {
        Cuenta cuenta = obtenerObjetoCuenta(idCuenta);
        if(cuenta.tieneFondoSuficiente(monto))
        {
            cuenta.disminuirSaldo(monto);
            crearTransaccion(idCuenta, descripcionServicio, monto, metodeDePago);
            JOptionPane.showMessageDialog( null, "Se ha realizado exitosamente el pago!");
        }
        else
            JOptionPane.showMessageDialog( null, "La cuenta " + cuenta.toShortString() + " no tiene fondo suficiente para realizar el pago de servicio", "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Deposita un monto en una cuenta, aumentando su saldo.
     *
     * @param idCuenta El identificador de la cuenta en la que se deposita el monto.
     * @param monto    El monto a depositar.
     */
    public static void depositarEnCuenta(int idCuenta, int monto)
    {
        Cuenta cuenta = cuentaPorCodigo.get(idCuenta);
        cuenta.aumentarSaldo(monto);
    }

    /**
     * Realiza el pago de una tarjeta de crédito desde una cuenta, disminuyendo el saldo de la cuenta de origen
     * y aumentando el saldo de la cuenta de destino. Además, crea una nueva transacción y la agrega al sistema.
     *
     * @param idFuente   El identificador de la cuenta de origen.
     * @param idDestino  El identificador de la cuenta de destino (tarjeta de crédito).
     * @param monto      El monto a pagar.
     */
    public static void pagarTarjetaCredito(int idFuente, int idDestino, int monto)
    {
        Cuenta fuente = cuentaPorCodigo.get(idFuente);
        Cuenta destino = cuentaPorCodigo.get(idDestino);
        crearTransaccion(idFuente, "Pago Tarjeta de Credito", monto, "Tarjeta Debito");
        if(fuente.tieneFondoSuficiente(monto))
        {
            destino.aumentarSaldo(monto);
            fuente.disminuirSaldo(monto);
        }
        else
            System.out.println("La cuenta " + fuente.toShortString() + "no tiene fondo suficiente para realizar la transferencia");
    }
}

