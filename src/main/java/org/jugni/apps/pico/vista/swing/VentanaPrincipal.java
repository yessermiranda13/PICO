package org.jugni.apps.pico.vista.swing;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;


public class VentanaPrincipal extends JFrame{

	
	//propiedad Singleton
	static VentanaPrincipal miInstancia;
	
	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		/**
		 * Se inicializa,
		 * se etablecen los parametros basicos de configuracion.
		 */
		initialize();
		miInstancia = this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("PICO :: Sistema Contable");
		setName("vPrincipal");
		setBounds(100, 100, 626, 375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar_1 = new JToolBar();
		getContentPane().add(toolBar_1, BorderLayout.SOUTH);
		
		JLabel lblFecha = new JLabel("Fecha: ");
		lblFecha.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		toolBar_1.add(lblFecha);
		
		JLabel lblPeriodoFiscal = new JLabel("Periodo Fiscal");
		toolBar_1.add(lblPeriodoFiscal);
		
		JLabel lblNewLabel = new JLabel("New label");
		toolBar_1.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		toolBar_1.add(progressBar);
		
		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Nuevo CD");
		btnNewButton.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/org/tango-project/tango-icon-theme/16x16/actions/document-new.png")));
		toolBar.add(btnNewButton);
		
		JDesktopPane desktopPane = new JDesktopPane();
		getContentPane().add(desktopPane, BorderLayout.CENTER);

		//Agregando el menu principal a la ventana
		setJMenuBar(new MenuPrincipal());
	}


	/**
	 * Metodo para mostrar, porque esta es una clase estandart, que no hereda ninguna otra clase, ergo, debemos usar un Wrapper.
	 */
	public void mostrar() {
		setVisible(true);
	}

  public static void agregar(JInternalFrame ventanaInterna) {
      VentanaPrincipal.getIntancia().add(ventanaInterna);
  }
  
  /**
   * Metodo SingleTon de la Ventana Principal
   * @return
   */
  public static VentanaPrincipal getIntancia() {
    return (null==miInstancia) ? new VentanaPrincipal() : miInstancia;
  }
  
  
}

