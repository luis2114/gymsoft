import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;


public class inicio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicio window = new inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(189, 183, 107));
		frame.setBounds(100, 100, 552, 461);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(10, 62, 102, -63);
		frame.getContentPane().add(horizontalBox);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setBounds(10, 0, 497, 64);
		frame.getContentPane().add(horizontalBox_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setBounds(25, 75, 371, -14);
		frame.getContentPane().add(horizontalBox_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 75, 72, -5);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("imagenes"+File.separator+"SLOGAN.gif"));
		lblNewLabel_1.setBounds(168, 125, 223, 127);
		frame.getContentPane().add(lblNewLabel_1);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("gimnasio");
		menuBar.add(mnNewMenu_1);
		mnNewMenu_1.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar informacion");
		mntmNewMenuItem.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				//JOptionPane.showMessageDialog(null,"hola");
				
				
				informacion miInformacion = new informacion();
				miInformacion.setVisible  (true);
				
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenu mnAdministrador = new JMenu("administra");
		menuBar.add(mnAdministrador);
		mnAdministrador.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("agregar administrador");
		mntmNewMenuItem_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				{
					System.out.println("hola");
					//JOptionPane.showMessageDialog(null,"hola");
					
					
					agradmi miAgradmi = new agradmi();
					miAgradmi.setVisible  (true);
					
					
				}
			}
		});
		mnAdministrador.add(mntmNewMenuItem_1);
		
		JMenuItem mntmBuscarAdministrador = new JMenuItem("buscar administrador");
		mnAdministrador.add(mntmBuscarAdministrador);
		
		JMenu mnNewMenu = new JMenu("Control");
		menuBar.add(mnNewMenu);
		mnNewMenu.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		mnNewMenu.setForeground(new Color(0, 0, 0));
		
		JMenuItem mntmAgregarControl = new JMenuItem("agregar control");
		mnNewMenu.add(mntmAgregarControl);
		
		JMenuItem mntmBuscarControl = new JMenuItem("buscar control");
		mnNewMenu.add(mntmBuscarControl);
		
		JMenu mnContrato = new JMenu("contrato");
		menuBar.add(mnContrato);
		mnContrato.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("agregar contrato");
		mnContrato.add(mntmNewMenuItem_2);
		
		JMenuItem mntmBuscarContrato = new JMenuItem("buscar contrato");
		mnContrato.add(mntmBuscarContrato);
		
		JMenu mnInstructores = new JMenu("instructores");
		mnInstructores.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		menuBar.add(mnInstructores);
		
		JMenuItem mntmRegistrarNuevoInstructor = new JMenuItem("registrar nuevo instructor");
		mnInstructores.add(mntmRegistrarNuevoInstructor);
		
		JMenuItem mntmBuscarInstructor = new JMenuItem("buscar instructor");
		mnInstructores.add(mntmBuscarInstructor);
		
		JMenu mnReporte = new JMenu("Cliente");
		menuBar.add(mnReporte);
		mnReporte.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		
		JMenuItem mntmRegistrarNuevoCliente = new JMenuItem("registrar nuevo cliente");
		mnReporte.add(mntmRegistrarNuevoCliente);
		
		JMenuItem mntmBuscarCliente = new JMenuItem("buscar cliente");
		mnReporte.add(mntmBuscarCliente);
		
		JMenu mnRutina = new JMenu("reporte");
		menuBar.add(mnRutina);
		mnRutina.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		
		JMenuItem mntmRegistrarNuevoReporte = new JMenuItem("registrar nuevo reporte");
		mnRutina.add(mntmRegistrarNuevoReporte);
		
		JMenuItem mntmBuscarReporte = new JMenuItem("buscar reporte");
		mnRutina.add(mntmBuscarReporte);
		
		JMenu mnRutina_1 = new JMenu("rutina");
		mnRutina_1.setFont(new Font("Segoe Print", Font.PLAIN, 12));
		menuBar.add(mnRutina_1);
		
		JMenuItem mntmGenerarRutina = new JMenuItem("Generar rutina");
		mnRutina_1.add(mntmGenerarRutina);
		
		JMenuItem mntmBuscarRutina = new JMenuItem("buscar rutina");
		mnRutina_1.add(mntmBuscarRutina);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
