package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Grupo 1
 */
public class Sistema 
{
    // HashMaps para almacenar objetos por su código
    private static HashMap<Integer, Cuenta> cuentaPorCodigo = new HashMap<>();
    private static HashMap<Integer, Cliente> clientePorCodigo = new HashMap<>();
    private static HashMap<Integer, Transaccion> transaccionPorCodigo = new HashMap<>();
    private static HashMap<Integer, Transferencia> transferenciaPorCodigo = new HashMap<>();



    //Retorna una lista de comprobantes correspondiente a una cuenta en especifico
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


    //Retorna una lista de cuentas correspondiente a un cliente
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


    // Métodos para obtener objetos por su código
    public static Cuenta obtenerObjetoCuenta(int idCuenta)
    {
        return cuentaPorCodigo.get(idCuenta);
    }

    public static Cliente obtenerObjetoCliente(int idCliente)
    {
        return clientePorCodigo.get(idCliente);
    }

    public static Transferencia obtenerObjetoTransferencia(int idTransferencia)
    {
        return transferenciaPorCodigo.get(idTransferencia);
    }

    public static Transaccion obtenerObjetoPago(int idPago)
    {
        return transaccionPorCodigo.get(idPago);
    }

    // Método para generar un nuevo ID evitando duplicados
    private static int generarID(Set<Integer> listaID) {
        int id = 1;
        while (listaID.contains(id)) {
            id++;
        }
        return id;
    }

    // Métodos para generar nuevos IDs específicos para cada tipo de objeto
    public static int generarIDCuenta() {
        return generarID(cuentaPorCodigo.keySet());
    }

    public static int generarIDCliente() {
        return generarID(clientePorCodigo.keySet());
    }

    public static int generarIDTransaccion() {
        return generarID(transaccionPorCodigo.keySet());
    }

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
            if(cuenta.tieneDeuda())
                System.out.println("El cliente debe abonar la deuda de la cuenta: " + cuenta.toShortString() + " para eliminar");
            else
            {
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

                // Llamar al método eliminar de la cuenta para realizar acciones específicas de eliminación
            }
        }

        // Eliminar al cliente del HashMap de clientes por su identificador
        clientePorCodigo.remove(clienteEliminar.getID());
    }



    public static void crearTransferencia(int idFuente, int idDestino, int monto)
    {
        int idTranferencia = generarIDTransferencia();
        Transferencia nuevaTransferencia = new Transferencia(idFuente, idDestino, monto);
        transferenciaPorCodigo.put(idTranferencia, nuevaTransferencia);
    }

    public static void crearTransaccion(int pagador, String descripcionServicio, int monto, String metodoPago)
    {
        int idTransaccion = generarIDTransaccion();
        Transaccion nuevaTransaccion = new Transaccion(pagador, descripcionServicio, monto, metodoPago);
        transaccionPorCodigo.put(idTransaccion, nuevaTransaccion);
    }

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



    //TO-DO: IMPLEMENTAR PAGAR SERVICIO
    //public static void pagarServicio()





    public static void depositarEnCuenta(int idCuenta, int monto)
    {
        Cuenta cuenta = cuentaPorCodigo.get(idCuenta);
        cuenta.aumentarSaldo(monto);
    }


    //Muy similar al metodo de transferencia, implementar otra forma?
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

