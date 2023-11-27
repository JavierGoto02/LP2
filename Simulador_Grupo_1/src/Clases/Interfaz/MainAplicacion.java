package Clases.Interfaz;
import Clases.*;
import java.awt.*;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;
import javax.swing.*;

/**
 * Clase principal que representa el marco principal de la aplicación.
 * Utiliza un CardLayout para cambiar entre las distintas ventanas de la aplicación.
 * Contiene una barra de menú con botones para "Inicio" y "Acerca del Sistema".
 * También maneja la inicialización de componentes y la lógica de la interfaz.
 * 
 * @author Grupo 1 
 */
public final class MainAplicacion extends javax.swing.JFrame {

    // Utilizamos un CardLayout para cambiar entre las distintas ventanas de la aplicación.
    private CardLayout cardLayout;
    
    // Atributo que contiene los datos del sistema.
    private Sistema sistema;
    
    // Atributo que contiene la cuenta de la sesión actual.
    private Cuenta cuenta; 

    // Componentes de la barra de menú
    private JMenuBar menuBar;
    private JButton inicioBoton;
    private MenuPrincipal menuPrincipal; // Campo para guardar el panel de menu principal
    private VentanaAcercaDelSistema ventanaAcercaDelSistema; // Campo para guardar referencia a la ventana de acerca del sistema que funciona en otro hilo.

    /**
     * Constructor de la clase. Inicializa componentes y configura el CardLayout.
     */
    public MainAplicacion() {
        cuenta = null;
        initComponents();
        
        // Agregar icono de aplicación
        ImageIcon img = new ImageIcon(getClass().getResource("/Recursos/iconoBanco.png"));
        this.setIconImage(img.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH));

        // Configurar la barra de menú
        crearBarraDeMenu();
        
        // Inicializar el CardLayout
        cardLayout = new CardLayout();
        getContentPane().setLayout(cardLayout);

        // Agregar JPanels al CardLayout
        menuPrincipal = new MenuPrincipal(this);
        getContentPane().add("MenuPrincipal", menuPrincipal);
        getContentPane().add("Transferencias", new Transferencias(this));
        getContentPane().add("PagoServicios", new PagoServicios(this));
        getContentPane().add("PagoTC", new PagoTC(this));
        getContentPane().add("VentanaLogin", new VentanaLogin(this));
        getContentPane().add("CrearCuenta", new CrearCuenta(this));
        getContentPane().add("CrearTarjeta", new CrearTarjeta(this));
        // Leer los datos del sistema desde un archivo a modo de simular una base de datos. 
        recuperarDatosSistema();

        //Dato de prueba

        Sistema.crearCuenta(1, new TarjetaDebito(4500, new Date(), 1, 1, 10000), 2023);
        Sistema.crearCuenta(2, new TarjetaCredito(2711, new Date(), 1, 2, 10000, 20000, (float)0.12, (float)0.06, new Date()), 1234);
        Sistema.crearCuenta(3, new TarjetaDebito(3, new Date(),1,  3, 15000), 345);
        Sistema.crearClientePersona("Fabrizio", "Kawabata", 7669776, "Calle Palma", "69");
        Sistema.crearClienteEmpresa("Fabri Ferretería", "6969420-69", "Mcal Estigarribia", "420");
        if (cuenta == null){
            cambiarAVentana("VentanaLogin");
        }
    }
      
    /**
     * Lee los datos del sistema, funciona como nuestra base de datos.
     */
    public void recuperarDatosSistema() 
    {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datosSistema"))) {
            sistema = (Sistema) ois.readObject();
            System.out.println("Datos del sistema recuperados exitosamente.");
        } catch (FileNotFoundException e) {
            // Manejar el caso cuando el archivo no existe
            System.out.println("No se encontró el archivo 'datosSistema'. Se creará un nuevo sistema.");
            sistema = new Sistema();  // Crea un nuevo sistema o toma alguna medida apropiada.
        } catch (IOException e) {
            // Manejar otras excepciones de E/S (lectura, escritura)
            e.printStackTrace();
            System.out.println("Error al leer o escribir en el archivo 'datosSistema'.");
        } catch (ClassNotFoundException e) {
            // Manejar la excepción de clase no encontrada
            e.printStackTrace();
            System.out.println("Error: Clase 'Sistema' no encontrada.");
        }
    }
    
    /**
     * Sobreescribe en el archivo "datosSistema" con los nuevos datos del sistema, este metodo se llamara siempre al cerrar la aplicacion.
     */
    public void guardarDatosSistema()
    {
        try 
        {
            ObjectOutputStream oos = new ObjectOutputStream(FileOutputStream("datosSistema"));
            oos.writeObject(sistema);
            System.out.println("Datos del sistema guardado exitosamente");
        } catch (IOException e) {
            // Manejar excepciones de E/S (lectura, escritura)
            e.printStackTrace();
            System.out.println("Error al escribir en el archivo 'datosSistema'.");
        }
    }
    
    /**
     * Configura la barra de menú con botones y eventos.
     */
    private void crearBarraDeMenu() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Crear el botón de menú "Inicio"
        inicioBoton = new JButton("Inicio");
             
        // Agregar evento al botón para cambiar al menú principal cuando se presiona
        inicioBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarAMenuPrincipal();
            }
        });

        // Crear el botón de menú "Acerca del Sistema"
        JButton acercaDelSistemaBoton = new JButton("Acerca del Sistema");
        
        // Agregar evento al botón para abrir la ventana de acerca del sistema en un hilo distinto cuando se presiona
        acercaDelSistemaBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaAcercaDelSistemaEnNuevoHilo();
            }
        });
        
        // Agregar los elementos del menú a la barra de menú
        menuBar.add(inicioBoton);
        menuBar.add(acercaDelSistemaBoton);
        
        // Inicialmente, ocultar el botón "Inicio"
        mostrarInicioMenu(false);
    }
    
    /**
     * Método para obtener el CardLayout.
     * @return CardLayout
     */
    public CardLayout getCardLayout() {
        return cardLayout;
    }
    
    /**
     * Método para cambiar a un panel específico.
     * @param panelName Nombre del panel al que se quiere cambiar.
     */
    public void cambiarAVentana(String panelName) {
        cardLayout.show(getContentPane(), panelName);
    }
    
     /**
     * Método para cambiar al panel de menu principal.
     */
    public void cambiarAMenuPrincipal() {
        cambiarAVentana("MenuPrincipal");
        menuPrincipal.actualizarDatosCuenta();
    }
    
    /**
     * Método para mostrar un cuadro de diálogo solicitando un PIN de transacción.
     */
    public void mostrarSolicitudDePinDeTransaccion() {
        SolicitudPinDeTransaccion dialogoPin = new SolicitudPinDeTransaccion(this, true);
        dialogoPin.setLocationRelativeTo(this); // Centrar el diálogo en el marco principal
        dialogoPin.setVisible(true);
    }
       
    /**
     * Método para mostrar u ocultar el botón "Inicio" en la barra de menú.
     * @param mostrar true si se debe mostrar, false si se debe ocultar.
     */
    public void mostrarInicioMenu(boolean mostrar) {
        inicioBoton.setVisible(mostrar);
    }

    /**
     * Método para abrir la ventana de acerca del sistema en un hilo separado.
     */
    private void abrirVentanaAcercaDelSistemaEnNuevoHilo() {
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                if (ventanaAcercaDelSistema == null || !ventanaAcercaDelSistema.isVisible()) {
                    // Crear una nueva ventana solo si no está abierta
                    ventanaAcercaDelSistema = new VentanaAcercaDelSistema();
                    ventanaAcercaDelSistema.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    ventanaAcercaDelSistema.setVisible(true);
                    ventanaAcercaDelSistema.setLocationRelativeTo(MainAplicacion.this);
                } else {
                    // Si la ventana ya está abierta, traerla al frente y enfocarla.
                    if (ventanaAcercaDelSistema.getState() == JFrame.ICONIFIED) {
                        // Si la ventana está minimizada, maximizarla
                        ventanaAcercaDelSistema.setLocationRelativeTo(MainAplicacion.this);
                        ventanaAcercaDelSistema.setExtendedState(JFrame.NORMAL);
                    }
                    ventanaAcercaDelSistema.toFront();
                }
                return null;
            }
        };

        worker.execute();
    }

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    /**
     * Retorna la cuenta de la sesión actual. 
     * 
     * @return la cuenta de la sesión actual. 
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Cierra la sesión del usuario y abre la ventana de login. 
     */
    public void cerrarSesion() {
        cuenta = null;
        cambiarAVentana("VentanaLogin");
    }   
    
    public boolean validarPinTransaccion(String pin) {
        return Integer.toString(cuenta.getPinTransaccion()).equals(pin);
    }
    
    /**
     * Método generado automáticamente por el editor de formularios.
     * Se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modificar este código. El contenido de este método siempre
     * se regenera por el Editor de Formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crear y mostrar el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private OutputStream FileOutputStream(String datosSistema) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
