package Clases.Interfaz;
import Clases.*;
import java.awt.*;    
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
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
        actualizarDatosCuenta();
    }
    
    public void actualizarDatosCuenta() {
        Cuenta cuenta = mainFrame.getCuenta();
        if (cuenta == null)
            return;
        
        // Formatear el saldo de cuenta con DecimalFormat con puntos como separador de miles (---.---)
        int saldo = cuenta.getTarjeta().consultarSaldo();
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        DecimalFormat formatoDecimal = new DecimalFormat("###,###", symbols);
        String saldoFormateado = formatoDecimal.format(saldo);
        labelMontoCuenta.setText(saldoFormateado);
        
        Cliente cliente = Sistema.obtenerObjetoCliente(cuenta.getIDPropietario());
        if (cliente instanceof Persona) {
            Persona persona = (Persona)cliente;
            labelTipoDeCuenta.setText("Cuenta Personal");
            labelNombre.setText(persona.getNombre() + " " + persona.getApellido());
            labelIdCuenta.setText(Integer.toString(persona.getCI()));
        }
        else {
            Empresa empresa = (Empresa)cliente;
            labelTipoDeCuenta.setText("Cuenta Empresarial");
            labelNombre.setText(empresa.getRazonSocial());  
            labelIdCuenta.setText(empresa.getRuc());
        }   
    }

   
    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método siempre
     * se regenera por el Editor de Formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCuenta = new javax.swing.JLabel();
        labelIdCuenta = new javax.swing.JLabel();
        labelTipoDeCuenta = new javax.swing.JLabel();
        labelSaldo = new javax.swing.JLabel();
        labelMontoCuenta = new javax.swing.JLabel();
        labelGuaranies = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        botonTransferencias = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botonPagoServicios = new javax.swing.JButton();
        botonPagoTarjetas = new javax.swing.JButton();
        iconoTarjetas = new javax.swing.JLabel();
        iconoTransferencias = new javax.swing.JLabel();
        iconoServicios = new javax.swing.JLabel();
        botonOpcionesCuenta = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setLayout(null);

        labelCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCuenta.setText("Datos Cuenta");
        add(labelCuenta);
        labelCuenta.setBounds(18, 47, 120, 16);

        labelIdCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelIdCuenta.setText("ID");
        add(labelIdCuenta);
        labelIdCuenta.setBounds(20, 96, 240, 16);

        labelTipoDeCuenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTipoDeCuenta.setText("Tipo de Cuenta");
        add(labelTipoDeCuenta);
        labelTipoDeCuenta.setBounds(21, 74, 220, 16);

        labelSaldo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSaldo.setText("Saldo de Cuenta");
        add(labelSaldo);
        labelSaldo.setBounds(294, 47, 89, 16);

        labelMontoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelMontoCuenta.setText("---.---.---");
        labelMontoCuenta.setToolTipText("");
        add(labelMontoCuenta);
        labelMontoCuenta.setBounds(293, 74, 90, 16);

        labelGuaranies.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelGuaranies.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelGuaranies.setText("GS");
        add(labelGuaranies);
        labelGuaranies.setBounds(293, 96, 90, 16);

        labelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNombre.setText("Nombre Propietario");
        add(labelNombre);
        labelNombre.setBounds(14, 6, 137, 20);

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
        jSeparator1.setBounds(0, 65, 400, 3);

        botonPagoServicios.setBackground(new java.awt.Color(250, 230, 150));
        botonPagoServicios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonPagoServicios.setText("Pagos Servicios");
        botonPagoServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagoServiciosActionPerformed(evt);
            }
        });
        add(botonPagoServicios);
        botonPagoServicios.setBounds(158, 174, 135, 32);

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

        iconoTarjetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoPagoTC.png"))); // NOI18N
        iconoTarjetas.setText("iconoPagoTarjetas");
        iconoTarjetas.setMaximumSize(new java.awt.Dimension(20, 20));
        iconoTarjetas.setMinimumSize(new java.awt.Dimension(20, 20));
        iconoTarjetas.setPreferredSize(new java.awt.Dimension(681, 640));
        add(iconoTarjetas);
        iconoTarjetas.setBounds(114, 218, 32, 32);

        iconoTransferencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoTransferencias.png"))); // NOI18N
        iconoTransferencias.setText("iconoTransferencias");
        iconoTransferencias.setMaximumSize(new java.awt.Dimension(20, 20));
        iconoTransferencias.setMinimumSize(new java.awt.Dimension(20, 20));
        iconoTransferencias.setPreferredSize(new java.awt.Dimension(681, 640));
        add(iconoTransferencias);
        iconoTransferencias.setBounds(114, 130, 32, 32);

        iconoServicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/iconoPagoServicios.png"))); // NOI18N
        iconoServicios.setText("iconoPagoServicios");
        iconoServicios.setMaximumSize(new java.awt.Dimension(20, 20));
        iconoServicios.setMinimumSize(new java.awt.Dimension(20, 20));
        iconoServicios.setPreferredSize(new java.awt.Dimension(681, 640));
        add(iconoServicios);
        iconoServicios.setBounds(114, 174, 32, 32);

        botonOpcionesCuenta.setText("Opciones Cuenta");
        botonOpcionesCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionesCuentaActionPerformed(evt);
            }
        });
        add(botonOpcionesCuenta);
        botonOpcionesCuenta.setBounds(162, 6, 121, 23);

        botonCerrarSesion.setText("Cerrar Sesion");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });
        add(botonCerrarSesion);
        botonCerrarSesion.setBounds(289, 6, 99, 23);

        jSeparator2.setForeground(new java.awt.Color(180, 180, 180));
        add(jSeparator2);
        jSeparator2.setBounds(0, 38, 400, 3);
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

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        mainFrame.cerrarSesion();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonOpcionesCuenta;
    private javax.swing.JButton botonPagoServicios;
    private javax.swing.JButton botonPagoTarjetas;
    private javax.swing.JButton botonTransferencias;
    private javax.swing.JLabel iconoServicios;
    private javax.swing.JLabel iconoTarjetas;
    private javax.swing.JLabel iconoTransferencias;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelCuenta;
    private javax.swing.JLabel labelGuaranies;
    private javax.swing.JLabel labelIdCuenta;
    private javax.swing.JLabel labelMontoCuenta;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelSaldo;
    private javax.swing.JLabel labelTipoDeCuenta;
    // End of variables declaration//GEN-END:variables
}
