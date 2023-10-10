package Ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 1 - Laboratorio 7 - Ejercicio 4
 */
public class AppCifrado extends javax.swing.JFrame {

    /**
     * Creates new form AppCifrado
     */
    public AppCifrado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBoton = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        datoResultado = new javax.swing.JTextField();
        botonProcesar = new javax.swing.JButton();
        encriptar = new javax.swing.JRadioButton();
        desencriptar = new javax.swing.JRadioButton();
        botonSalida = new javax.swing.JButton();
        datoOriginal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AppCifrado ");

        titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Encriptar/Desencriptar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Original:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Resultado: ");

        datoResultado.setEditable(false);
        datoResultado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        botonProcesar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonProcesar.setText("Procesar");
        botonProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProcesarActionPerformed(evt);
            }
        });

        grupoBoton.add(encriptar);
        encriptar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        encriptar.setText("Encriptar");

        grupoBoton.add(desencriptar);
        desencriptar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        desencriptar.setText("Desencriptar");

        botonSalida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botonSalida.setText("Salir");
        botonSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalidaActionPerformed(evt);
            }
        });

        datoOriginal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(botonSalida))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(datoOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(encriptar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(desencriptar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(datoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonProcesar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(datoOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(datoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encriptar)
                    .addComponent(desencriptar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(botonSalida)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cierra la aplicación cuando se hace clic en el botón "Salir".
     *
     * @param evt Un evento de acción que desencadena esta acción.
     */
    private void botonSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalidaActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_botonSalidaActionPerformed
    
    /**
     * Realiza una acción cuando se hace clic en el botón "Procesar". Obtiene un
     * número de cuatro dígitos del campo de entrada, valida la entrada y luego
     * encripta o desencripta el número según la opción seleccionada.
     *
     * @param evt Un evento de acción que desencadena esta acción.
     */
    private void botonProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProcesarActionPerformed
        String s = datoOriginal.getText();
        boolean valido = true;
        if (s.length() != 4){
            valido = false;
        }
        for(int i = 0; i < s.length(); i++){
            if (!Character.isDigit(s.charAt(i))){
                valido = false;
            }
        }
        if (!valido){
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
        }
        else{
            if (encriptar.isSelected()){
               datoResultado.setText(Integer.toString(encriptar(Integer.valueOf(s))));
            }
            else if (desencriptar.isSelected()){
               datoResultado.setText(Integer.toString(desencriptar(Integer.valueOf(s))));
            }
            else{
                JOptionPane.showMessageDialog(null, "Marque una de las opciones!");
            }
        }   
    }//GEN-LAST:event_botonProcesarActionPerformed
    
    /**
     * Encripta un número de cuatro dígitos utilizando un algoritmo simple.
     *
     * @param numero El número de cuatro dígitos a encriptar.
     * @return El número encriptado.
     */
    private int encriptar(int numero){
        int[] v = new int[4];
        for (int i = 0; i < 4; i++) {
            v[i] = ((numero % 10) + 7) % 10;
            numero /= 10;
        }
        return v[0] + v[1]*10 + v[2]*100 + v[3]*1000;
    }

    /**
     * Desencripta un númsro de cuatro dígitos que ha sido encriptado con el algoritmo anterior.
     *
     * @param numero El número de cuatro dígitos a desencriptar.
     * @return El número desencriptado.
     */
    private int desencriptar(int numero){
        int[] v = new int[4];
        for (int i = 0; i < 4; i++) {
            v[i] = (numero % 10 < 7) ? (numero % 10 + 3) : (numero % 10 - 7);
            numero /= 10;
        }
        return v[0] + v[1]*10 + v[2]*100 + v[3]*1000;
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
            java.util.logging.Logger.getLogger(AppCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCifrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCifrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonProcesar;
    private javax.swing.JButton botonSalida;
    private javax.swing.JTextField datoOriginal;
    private javax.swing.JTextField datoResultado;
    private javax.swing.JRadioButton desencriptar;
    private javax.swing.JRadioButton encriptar;
    private javax.swing.ButtonGroup grupoBoton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
