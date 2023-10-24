package Ejercicio3;

import Ejercicio1.EjercicioInterface;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Clase que representa una calculadora de costo de transacción.
 * 
 * @author Grupo 1 - Laboratorio 8 - Ejercicio 3
 */

public class Ejercicio3 extends javax.swing.JFrame implements EjercicioInterface{
    ArrayList<Integer> cuenta; // Lista para almacenar números de cuenta
    ArrayList<Integer> transacciones; // Lista para almacenar números de transacciones
    ArrayList<Integer> limite; // Lista para almacenar límites de transacciones
    /**
     * Constructor de la clase. Inicializa componentes y las listas.
     */
    public Ejercicio3() {
        initComponents(); // Inicializa componentes de la interfaz
        cuenta = new ArrayList<>(); // Inicializa la lista de cuentas
        transacciones = new ArrayList<>(); // Inicializa la lista de transacciones
        limite = new ArrayList<>(); // Inicializa la lista de límites
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_calcular = new javax.swing.JButton();
        boton_agregar = new javax.swing.JButton();
        boton_vaciar = new javax.swing.JButton();
        etiqueta_cuenta = new javax.swing.JLabel();
        etiqueta_limite = new javax.swing.JLabel();
        etiqueta_transacciones = new javax.swing.JLabel();
        etiqueta_titulo = new javax.swing.JLabel();
        texto_transacciones = new javax.swing.JTextField();
        texto_cuenta = new javax.swing.JTextField();
        texto_limite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        boton_calcular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boton_calcular.setText("Calcular");
        boton_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_calcularActionPerformed(evt);
            }
        });

        boton_agregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boton_agregar.setText("Agregar");
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        boton_vaciar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boton_vaciar.setText("Vaciar");
        boton_vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_vaciarActionPerformed(evt);
            }
        });

        etiqueta_cuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiqueta_cuenta.setText("N° cuenta:");

        etiqueta_limite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiqueta_limite.setText("Límite gratuitas:");

        etiqueta_transacciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiqueta_transacciones.setText("N° de transacciones:");

        etiqueta_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        etiqueta_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_titulo.setText("Calculadora de costo de transacción");

        texto_transacciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        texto_cuenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        texto_limite.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_limite.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiqueta_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(boton_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(boton_vaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(etiqueta_cuenta)
                                .addComponent(etiqueta_limite))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(texto_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(texto_limite, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(etiqueta_transacciones)
                            .addGap(18, 18, 18)
                            .addComponent(texto_transacciones, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta_titulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_cuenta)
                    .addComponent(texto_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_transacciones)
                    .addComponent(texto_transacciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_limite)
                    .addComponent(texto_limite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_vaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_calcularActionPerformed(java.awt.event.ActionEvent evt) {
        if (!cuenta.isEmpty() && !transacciones.isEmpty() && !limite.isEmpty()) {
            mostrarResultado();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha ingresado nada hasta ahora!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_calcularActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {
        recibirDatos();
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void boton_vaciarActionPerformed(java.awt.event.ActionEvent evt) {
        cuenta.clear();
        transacciones.clear();
        limite.clear();
        texto_cuenta.setText("");
        texto_transacciones.setText("");
        texto_limite.setText("");
        JOptionPane.showMessageDialog(null, "Se ha vaciado la lista de cuentas.");
    }//GEN-LAST:event_boton_vaciarActionPerformed
    
    /**
    * Método para mostrar los resultados de los cálculos de costos porcentuales de las cuentas.
    */
    @Override
    public void mostrarResultado() {
        ArrayList<String> lista_cuentas = new ArrayList<>();

        // Itera a través de las listas de cuentas, transacciones y límites
        for (int i = 0; i < cuenta.size(); i++) {
            // Crea un objeto Cliente con el número de cuenta actual
            Cliente cliente = new Cliente(cuenta.get(i));
            // Establece las transacciones realizadas y el límite de transacciones gratuitas
            cliente.setTransaccionesRealizadasMensual(transacciones.get(i));
            cliente.setLimiteDeTransaccionesGratuitas(limite.get(i));
            // Calcula el costo porcentual de la transacción para este cliente
            int costoPorcentual = cliente.costoPorcentualTransaccion();
            // Agrega el resultado al ArrayList lista_cuentas
            lista_cuentas.add("N° cuenta " + cliente.getNumeroDeCuenta() + ": " + costoPorcentual);
        }

        // Construye una cadena de resultados concatenando los elementos de lista_cuentas
        String resultado = "";
        for (String s : lista_cuentas) {
            resultado += s + "%\n";
        }

        // Muestra los resultados en un cuadro de diálogo utilizando JOptionPane
        JOptionPane.showMessageDialog(null, String.format("Los costos porcentuales de las cuentas son:\n%s", resultado));
    }


 
    /**
    * Método para recibir y agregar datos de cuentas, transacciones y límites a las listas.
    */
    @Override
    public void recibirDatos() {
       // Verifica si las entradas son números válidos antes de agregarlos a las listas
        if (numero_valido(texto_cuenta.getText()) && numero_valido(texto_transacciones.getText()) && numero_valido(texto_limite.getText())) {
            // Convierte las entradas de texto a números enteros y las agrega a las respectivas listas
            cuenta.add(Integer.valueOf(texto_cuenta.getText()));
            transacciones.add(Integer.valueOf(texto_transacciones.getText()));
            limite.add(Integer.valueOf(texto_limite.getText()));

            // Muestra un mensaje de éxito y limpia los campos de texto
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente!");
            texto_cuenta.setText("");
            texto_transacciones.setText("");
            texto_limite.setText("");
        } else {
            // Muestra un mensaje de error si las entradas no son válidas
            JOptionPane.showMessageDialog(null, "Entradas inválidas!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Verifica si una entrada es válida (no está vacía).
     *
     * @param entrada La cadena de entrada a validar.
     * @return true si la entrada es válida, false de lo contrario.
     */
   private boolean entrada_valida(String entrada){
        return !entrada.isEmpty();
    }
    
    /**
     * Verifica si una cadena es un número válido.
     *
     * @param entrada La cadena que se desea comprobar.
     * @return true si la cadena es un número válido, false si no lo es.
     */
    private boolean numero_valido(String entrada){
        if (entrada_valida(entrada)){
            try {
                Integer.parseInt(entrada);  
                return true;
            } catch(NumberFormatException e){  
                return false;  
            }  
        }
        return false;
    }
    
  /**
     * Método principal que inicia la aplicación.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_calcular;
    private javax.swing.JButton boton_vaciar;
    private javax.swing.JLabel etiqueta_cuenta;
    private javax.swing.JLabel etiqueta_limite;
    private javax.swing.JLabel etiqueta_titulo;
    private javax.swing.JLabel etiqueta_transacciones;
    private javax.swing.JTextField texto_cuenta;
    private javax.swing.JTextField texto_limite;
    private javax.swing.JTextField texto_transacciones;
    // End of variables declaration//GEN-END:variables
}
