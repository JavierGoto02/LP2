/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Clases.Interfaz;
import Clases.Cuenta;
import Clases.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author fabri
 */
public class VentanaLogin extends javax.swing.JPanel {

    private MainAplicacion mainFrame; // Referencia al frame main de la aplicación
    /**
     * Crea un nuevo panel VentanaLogin
     */
    public VentanaLogin(MainAplicacion mainFrame) {
        initComponents();
        this.mainFrame = mainFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        labelSolicitudRecuperación = new javax.swing.JLabel();
        campoClave = new javax.swing.JPasswordField();
        campoIdentificador = new javax.swing.JTextField();
        labelIdentificador = new javax.swing.JLabel();
        labelClave = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        botonCrearCuenta = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        comboBoxMetodoIngreso = new javax.swing.JComboBox<>();
        labelMetodoDeIngreso = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca del Sistema");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("jMenu4");
        jMenuBar1.add(jMenu4);

        labelSolicitudRecuperación.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        labelSolicitudRecuperación.setText("Solicitá recuperar tu Clave de Acceso");

        campoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoClaveActionPerformed(evt);
            }
        });

        campoIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdentificadorActionPerformed(evt);
            }
        });

        labelIdentificador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelIdentificador.setText("Identificador");

        labelClave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelClave.setText("Clave");

        labelTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        labelTitulo.setText("Inicio de Sesion");

        botonCrearCuenta.setText("Crear Cuenta");
        botonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCuentaActionPerformed(evt);
            }
        });

        botonIngresar.setBackground(new java.awt.Color(250, 230, 150));
        botonIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        comboBoxMetodoIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta", "Tarjeta" }));

        labelMetodoDeIngreso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelMetodoDeIngreso.setText("Metodo de Ingreso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelSolicitudRecuperación)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCrearCuenta)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelMetodoDeIngreso)
                    .addComponent(labelIdentificador)
                    .addComponent(labelClave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoIdentificador)
                    .addComponent(comboBoxMetodoIngreso, 0, 187, Short.MAX_VALUE)
                    .addComponent(campoClave)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetodoDeIngreso)
                    .addComponent(comboBoxMetodoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdentificador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelClave)
                    .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSolicitudRecuperación)
                    .addComponent(botonCrearCuenta))
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campoIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdentificadorActionPerformed

    private void botonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCuentaActionPerformed
        mainFrame.cambiarAVentana("CrearCuenta");
        mainFrame.mostrarInicioMenu(true);
    }//GEN-LAST:event_botonCrearCuentaActionPerformed
    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        boolean error = true;    
        if (campoIdentificador.getText().matches("-?\\d+")){
            Integer id = Integer.valueOf(campoIdentificador.getText());
            Cuenta cuentaTemp = null;
            switch ((String)comboBoxMetodoIngreso.getSelectedItem()) {
                case "Cuenta":
                    cuentaTemp = Sistema.obtenerObjetoCuenta(id);
                    break;
                case "Tarjeta":
                    cuentaTemp = Sistema.obtenerObjetoCuentaPorTarjeta(id);
                    break;
            }
            if (cuentaTemp != null){
                if (cuentaTemp.getPinTransaccion() == Integer.parseInt(new String(campoClave.getPassword()))){
                    mainFrame.setCuenta(cuentaTemp);
                    mainFrame.cambiarAMenuPrincipal();
                    error = false;
                }
            }
        }
        if (error){
            JOptionPane.showMessageDialog(this, 
                    "¡Datos incorrectos, intente nuevamente!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void campoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearCuenta;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JPasswordField campoClave;
    private javax.swing.JTextField campoIdentificador;
    private javax.swing.JComboBox<String> comboBoxMetodoIngreso;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelClave;
    private javax.swing.JLabel labelIdentificador;
    private javax.swing.JLabel labelMetodoDeIngreso;
    private javax.swing.JLabel labelSolicitudRecuperación;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
