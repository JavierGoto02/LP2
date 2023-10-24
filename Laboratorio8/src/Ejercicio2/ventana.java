package Ejercicio2;
import Ejercicio1.EjercicioInterface;

/**
 *
 * @author Grupo 1 - Laboratorio 8 - Ejercicio 2
 */
public class ventana extends javax.swing.JFrame implements EjercicioInterface {
    
    /** Población actual para el cálculo. */
    long poblacionact;

    /** Tasa de crecimiento utilizada para las proyecciones. */
    float tasacrecimiento;

    /** Años para mostrar las proyecciones de población. */
    long ano1, ano2, ano3, ano4, ano5;
    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
    }
    
    
    /**
     * Método para recibir datos de la interfaz gráfica.
     * Convierte los datos ingresados en la interfaz a tipos de datos apropiados
     * y los asigna a las variables correspondientes.
     */
    @Override
    public void recibirDatos(){
        poblacionact = Long.parseLong(poblact.getText());
        tasacrecimiento = Float.parseFloat(tasacrec.getText());
    }
    
    /**
     * Método para realizar cálculos basados en la población actual y la tasa de crecimiento.
     * Calcula proyecciones de población para cinco años.
     */
    public void calcular(){
        ano1 = (long) (poblacionact + (poblacionact * tasacrecimiento));
        ano2 = (long) (ano1 + (ano1 * tasacrecimiento));
        ano3 = (long) (ano2 + (ano2 * tasacrecimiento));
        ano4 = (long) (ano3 + (ano3 * tasacrecimiento));
        ano5 = (long) (ano4 + (ano4 * tasacrecimiento));
    }
    
    /**
     * Método para mostrar los resultados de las proyecciones en la interfaz gráfica.
     * Muestra las proyecciones de población calculadas para cada año.
     */
    @Override
    public void mostrarResultado(){
        mundial1.setText(String.valueOf(ano1));
        mundial2.setText(String.valueOf(ano2));
        mundial3.setText(String.valueOf(ano3));
        mundial4.setText(String.valueOf(ano4));
        mundial5.setText(String.valueOf(ano5));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        poblact = new javax.swing.JTextField();
        tasacrec = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mundial1 = new javax.swing.JTextField();
        mundial2 = new javax.swing.JTextField();
        mundial3 = new javax.swing.JTextField();
        mundial4 = new javax.swing.JTextField();
        mundial5 = new javax.swing.JTextField();
        btncalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculadora de Poblacion Mundial");

        jLabel2.setText("Poblacion Mundial Actual:");

        jLabel3.setText("Porcentaje de Tasa de Crecimiento Anual:");

        poblact.setText("8067780194");

        tasacrec.setText("0.91");

        jLabel4.setText("Poblacion Mundial en 1 año:");

        jLabel6.setText("Poblacion Mundial en 2 años:");

        jLabel7.setText("Poblacion Mundial en 3 años:");

        jLabel8.setText("Poblacion Mundial en 4 años:");

        jLabel9.setText("Poblacion Mundial en 5 años:");

        mundial1.setEditable(false);

        mundial2.setEditable(false);
        mundial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mundial2ActionPerformed(evt);
            }
        });

        mundial3.setEditable(false);
        mundial3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mundial3ActionPerformed(evt);
            }
        });

        mundial4.setEditable(false);
        mundial4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mundial4ActionPerformed(evt);
            }
        });

        mundial5.setEditable(false);
        mundial5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mundial5ActionPerformed(evt);
            }
        });

        btncalc.setText("Calcular");
        btncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(poblact, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mundial4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(mundial5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(mundial2)
                                .addComponent(mundial1)
                                .addComponent(mundial3)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(40, 40, 40)
                            .addComponent(tasacrec, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btncalc)
                        .addGap(193, 193, 193))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(poblact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tasacrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncalc)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mundial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mundial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mundial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mundial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(mundial5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mundial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mundial2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mundial2ActionPerformed

    private void mundial3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mundial3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mundial3ActionPerformed

    private void mundial4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mundial4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mundial4ActionPerformed

    private void mundial5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mundial5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mundial5ActionPerformed

    /**
      * Este método se activa cuando se realiza una acción en el botón de cálculo (btncalc).
      * Realiza las siguientes operaciones:
      * 1. Recibe los datos ingresados en la interfaz gráfica llamando al método recibirDatos().
      * 2. Calcula proyecciones de población utilizando el método calcular().
      * 3. Muestra los resultados de las proyecciones en la interfaz gráfica llamando a mostrarResultado().
      *
      * @param evt Objeto ActionEvent que representa el evento de acción.
      *            Puede contener información adicional sobre el evento, aunque en este caso
      *            no se utiliza en el cuerpo del método.
      */
    private void btncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcActionPerformed
        recibirDatos();
        calcular();
        mostrarResultado();
    }//GEN-LAST:event_btncalcActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mundial1;
    private javax.swing.JTextField mundial2;
    private javax.swing.JTextField mundial3;
    private javax.swing.JTextField mundial4;
    private javax.swing.JTextField mundial5;
    private javax.swing.JTextField poblact;
    private javax.swing.JTextField tasacrec;
    // End of variables declaration//GEN-END:variables
}
