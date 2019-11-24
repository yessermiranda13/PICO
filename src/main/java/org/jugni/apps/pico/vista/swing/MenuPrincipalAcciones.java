/*
 * Ejecuta las acciones del menu
 */
package org.jugni.apps.pico.vista.swing;

import org.jugni.apps.pico.vista.swing.dialogos.Acercade;
import org.jugni.apps.pico.vista.swing.dialogos.Respaldo;

/**
 * Clase que ejecuta las intrucciones del menu
 * 
 * @author gacs
 *
 */
public class MenuPrincipalAcciones {
  public MenuPrincipalAcciones() {}

  public void ejecutarAcercaDe() {
    Acercade about = new Acercade();
    about.setVisible(true);

  }

  public void ejecutarRespaldo() {
    Respaldo respaldo = new Respaldo();
    respaldo.setVisible(true);
  }

  public static void salir() {
    /**
     * Salida el sistema de forma seguro, matar el proceso.
     */
    System.exit(0);
  }

  public static void mostrarVentanaLogin() {
    // new
    // ImageIcon(VentanaPrincipal.class.getResource("/org/tango-project/tango-icon-theme/16x16/actions/contact-new.png")));
    // mnArchivo.add(mntmIniciarSession);
    // JMenuItem mntmIniciarSession = new JMenuItem("Iniciar Session");
    // mntmIniciarSession.setIcon(instancia

  }

  public static void mostrarVentanaDatosEmpresa() {
    /**
     * Llamando un Singleton de Ventana Empresa
     */
    try {
      
      //Agrengao la Venana de Empresa
      VentanaPrincipal.agregar( Empresa.getInstancia() );
      //Establciendola como visible.
      Empresa.getInstancia().setVisible(true);
      
    } catch (Exception e) {

    }
  }

  public static void mostrarParametrosGenerales() {

  }

}
