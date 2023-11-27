package Clases.Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author Grupo 1
 */
public class VentanaAcercaDelSistema extends javax.swing.JFrame {

    /** 
     * Creates new form AcercaDelSistema
     */
    public VentanaAcercaDelSistema() {
        initComponents();
        
        // Agregar icono de aplicación
        ImageIcon img = new ImageIcon(getClass().getResource("/Recursos/iconoBanco.png"));
        this.setIconImage(img.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));
        
        // Inicializar los nombres en otro hilo
        initNombres();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVerDocumentación = new javax.swing.JButton();
        jLabelGrupo = new javax.swing.JLabel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabelNombre4 = new javax.swing.JLabel();
        jLabelExamen = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelMateria = new javax.swing.JLabel();
        jLabelFacultad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonVerDocumentación.setBackground(new java.awt.Color(250, 230, 150));
        botonVerDocumentación.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        botonVerDocumentación.setText("Ver Documentación");
        botonVerDocumentación.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDocumentaciónActionPerformed(evt);
            }
        });

        jLabelGrupo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelGrupo.setText("Grupo Nº 1");

        jLabelNombre1.setText("---------------------");

        jLabelNombre2.setText("---------------------");

        jLabelNombre3.setText("---------------------");

        jLabelNombre4.setText("---------------------");

        jLabelExamen.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabelExamen.setForeground(new java.awt.Color(0, 0, 255));
        jLabelExamen.setText("Examen LP2 -  FPUNA 2023");

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabelTitulo.setText("SISTEMA DE GESTION BANCARIA");

        jLabelMateria.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelMateria.setText("Lenguajes de Programacíon II");

        jLabelFacultad.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabelFacultad.setText("Facultad Politécnica - Universidad Nacional de Asunción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFacultad)
                    .addComponent(jLabelMateria))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonVerDocumentación, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre4)
                            .addComponent(jLabelNombre3)
                            .addComponent(jLabelNombre2)
                            .addComponent(jLabelNombre1)
                            .addComponent(jLabelGrupo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelExamen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelTitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExamen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFacultad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVerDocumentación, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Abrir la documentacion en un nuevo hilo
    private void botonVerDocumentaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDocumentaciónActionPerformed
        new Thread(() -> {
            abrirDocumentacion();
        }).start();
    }//GEN-LAST:event_botonVerDocumentaciónActionPerformed

    private void abrirDocumentacion() {
        // Obtener ruta del camino de ejecucion y concatenarlo con el nombre del archivo de documentacion. 
        String rutaArchivo = System.getProperty("user.dir") + File.separator + "documentacion.pdf";
        try {
            File archivo = new File(rutaArchivo);
            if (archivo.exists()) {
                Desktop.getDesktop().open(archivo);
            } else {
                JOptionPane.showMessageDialog(this, "Archivo de documentacion no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error abriendo documentacion: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Inicializar los nombres de los integrantes de los miembros del grupo en un hilo con delay
    private void initNombres() {
        // Crear el nuevo hilo
        new Thread(() -> {
            // Agregar delay entre la aparicion de cada nombre. 
            try {
                Thread.sleep(750);
                jLabelNombre1.setText("Martín Ferrer Canese");
                Thread.sleep(250);
                jLabelNombre2.setText("Javier Toshifumi Goto Dominguez");
                Thread.sleep(250);
                jLabelNombre3.setText("Samuel Yamashita Yamagami");
                Thread.sleep(250);
                jLabelNombre4.setText("Fabrizio Daisuke Kawabata Miyamoto");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }  
        }).start();
    }
    
    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(VentanaAcercaDelSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAcercaDelSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAcercaDelSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAcercaDelSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAcercaDelSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVerDocumentación;
    private javax.swing.JLabel jLabelExamen;
    private javax.swing.JLabel jLabelFacultad;
    private javax.swing.JLabel jLabelGrupo;
    private javax.swing.JLabel jLabelMateria;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
