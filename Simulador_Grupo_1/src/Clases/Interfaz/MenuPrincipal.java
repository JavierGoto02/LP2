package Clases.Interfaz;
import java.awt.*;    
import javax.swing.JPanel;

/**
 *
 * @author Grupo 1
 */
public class MenuPrincipal extends javax.swing.JPanel {

    private MainAplicacion mainFrame; // Referencia al frame main de la aplicación
    
    /**
     * Crea el nuevo panel MenuPrincipal
     */
    public MenuPrincipal(MainAplicacion mainFrame) {
        initComponents();  
        this.mainFrame = mainFrame;
    }

   
    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método siempre
     * se regenera por el Editor de Formularios.
     */


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonTransferencias = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botonPagoServicios = new javax.swing.JButton();
        botonPagoTarjetas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botonOpcionesCuenta = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Cuenta");
        add(jLabel1);
        jLabel1.setBounds(59, 47, 39, 16);

        jLabel2.setText("ID");
        add(jLabel2);
        jLabel2.setBounds(90, 96, 15, 21);

        jLabel3.setText("Tipo de Cuenta");
        add(jLabel3);
        jLabel3.setBounds(21, 74, 101, 21);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Saldo de Cuenta");
        add(jLabel4);
        jLabel4.setBounds(294, 47, 89, 16);

        jLabel5.setText("---.---.--");
        add(jLabel5);
        jLabel5.setBounds(337, 74, 54, 21);

        jLabel7.setText("Gs.");
        add(jLabel7);
        jLabel7.setBounds(367, 96, 19, 21);

        botonTransferencias.setBackground(new java.awt.Color(250, 230, 150));
        botonTransferencias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonTransferencias.setText("Transferencias");
        botonTransferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransferenciasActionPerformed(evt);
            }
        });
        add(botonTransferencias);
        botonTransferencias.setBounds(158, 130, 135, 32);

        jSeparator1.setForeground(new java.awt.Color(180, 180, 180));
        add(jSeparator1);
        jSeparator1.setBounds(0, 65, 400, 4);

        botonPagoServicios.setBackground(new java.awt.Color(250, 230, 150));
        botonPagoServicios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPagoServicios.setText("Pagos Servicios");
        botonPagoServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagoServiciosActionPerformed(evt);
            }
        });
        add(botonPagoServicios);
        botonPagoServicios.setBounds(158, 174, 143, 32);

        botonPagoTarjetas.setBackground(new java.awt.Color(250, 230, 150));
        botonPagoTarjetas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPagoTarjetas.setText("Pagos Tarjetas");
        botonPagoTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagoTarjetasActionPerformed(evt);
            }
        });
        add(botonPagoTarjetas);
        botonPagoTarjetas.setBounds(158, 218, 135, 32);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/Interfaz/iconoPagoTC.png"))); // NOI18N
        jLabel6.setText("iconoPagoTarjetas");
        jLabel6.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(681, 640));
        add(jLabel6);
        jLabel6.setBounds(114, 218, 32, 32);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/Interfaz/iconoTransferencias.png"))); // NOI18N
        jLabel8.setText("iconoTransferencias");
        jLabel8.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(681, 640));
        add(jLabel8);
        jLabel8.setBounds(114, 130, 32, 32);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Clases/Interfaz/iconoPagoServicios.png"))); // NOI18N
        jLabel10.setText("iconoPagoServicios");
        jLabel10.setMaximumSize(new java.awt.Dimension(20, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(20, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(681, 640));
        add(jLabel10);
        jLabel10.setBounds(114, 174, 32, 32);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nombre Propietario");
        add(jLabel9);
        jLabel9.setBounds(14, 6, 137, 20);

        botonOpcionesCuenta.setText("Opciones Cuenta");
        botonOpcionesCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionesCuentaActionPerformed(evt);
            }
        });
        add(botonOpcionesCuenta);
        botonOpcionesCuenta.setBounds(162, 6, 150, 29);

        botonCerrarSesion.setText("Cerrar Sesion");
        add(botonCerrarSesion);
        botonCerrarSesion.setBounds(289, 6, 125, 29);

        jSeparator2.setForeground(new java.awt.Color(180, 180, 180));
        add(jSeparator2);
        jSeparator2.setBounds(0, 38, 400, 4);
    }// </editor-fold>//GEN-END:initComponents

    private void botonTransferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransferenciasActionPerformed
        mainFrame.getCardLayout().show(mainFrame.getContentPane(), "Transferencias");
        mainFrame.mostrarInicioMenu(true);
    }//GEN-LAST:event_botonTransferenciasActionPerformed

    private void botonPagoServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagoServiciosActionPerformed
        mainFrame.getCardLayout().show(mainFrame.getContentPane(), "PagoServicios");
        mainFrame.mostrarInicioMenu(true);
    }//GEN-LAST:event_botonPagoServiciosActionPerformed

    private void botonPagoTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagoTarjetasActionPerformed
        mainFrame.getCardLayout().show(mainFrame.getContentPane(), "PagoTC");
        mainFrame.mostrarInicioMenu(true);
    }//GEN-LAST:event_botonPagoTarjetasActionPerformed

    private void botonOpcionesCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionesCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonOpcionesCuentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonOpcionesCuenta;
    private javax.swing.JButton botonPagoServicios;
    private javax.swing.JButton botonPagoTarjetas;
    private javax.swing.JButton botonTransferencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
