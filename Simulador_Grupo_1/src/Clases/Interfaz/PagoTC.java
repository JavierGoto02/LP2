package Clases.Interfaz;
import Clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 1
 */
public class PagoTC extends javax.swing.JPanel {

    private MainAplicacion mainFrame; // Referencia al frame main de la aplicación
    
    /**
     * Crea el nuevo panel PagoTC
     */
    public PagoTC(MainAplicacion mainFrame) {
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

        botonSiguiente = new javax.swing.JButton();
        montoAbonar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idCuentaCredito = new javax.swing.JTextField();

        botonSiguiente.setBackground(new java.awt.Color(250, 230, 150));
        botonSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.setToolTipText("");
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });

        montoAbonar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        montoAbonar.setText("---.---.---.--");
        montoAbonar.setToolTipText("");
        montoAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoAbonarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setText("Pago de Tarjeta de Credito");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("idTarjetaCredito");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Monto a Abonar (Gs.)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Total a Pagar");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("---.---.---.-- Gs.");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Pago Minimo");

        jLabel7.setText("---.---.-- Gs.");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        idCuentaCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCuentaCreditoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idCuentaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(montoAbonar))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idCuentaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(montoAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(botonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void montoAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoAbonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoAbonarActionPerformed

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        if(montoAbonar.getText().matches("-?\\d+") && idCuentaCredito.getText().matches("-?\\d+"))
        {
            Integer monto = Integer.parseInt(montoAbonar.getText());
            Integer idCuenta = Integer.parseInt(idCuentaCredito.getText());
            if(monto > 0 && Sistema.obtenerObjetoCuenta(idCuenta) != null)
            {
                Cuenta cuenta = Sistema.obtenerObjetoCuenta(idCuenta);
                if(cuenta.getTarjeta() instanceof TarjetaCredito)
                {
                    mainFrame.mostrarSolicitudDePinDeTransaccion();
                    Sistema.pagarTarjetaCredito(mainFrame.getCuenta().getID(), idCuenta, monto);
                }
                else
                    JOptionPane.showMessageDialog(mainFrame, "Esta cuenta no es de credito", "Error",  JOptionPane.ERROR_MESSAGE);
               
            }
        else
        {
            MensajeFracasoOperacion fr = new MensajeFracasoOperacion(mainFrame, true);
            fr.setVisible(true);       
        }
               
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void idCuentaCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCuentaCreditoActionPerformed
        if(idCuentaCredito.getText().matches("-?\\d+"))
        {
            Integer idCuenta = Integer.parseInt(idCuentaCredito.getText());
            Cuenta cuenta = Sistema.obtenerObjetoCuenta(idCuenta);
            if(cuenta.getTarjeta() instanceof TarjetaCredito)
            {
                TarjetaCredito tarjeta = (TarjetaCredito) cuenta.getTarjeta();
                jLabel4.setText(String.valueOf(tarjeta.getSaldoPendiente()));
                jLabel7.setText(String.valueOf(tarjeta.getPagoMinimo()));
            }  
        }
    }//GEN-LAST:event_idCuentaCreditoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JTextField idCuentaCredito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField montoAbonar;
    // End of variables declaration//GEN-END:variables
}
