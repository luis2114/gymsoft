import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class informacion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					informacion frame = new informacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public informacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 448);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("nombre");
		lblNewLabel.setBounds(28, 92, 56, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("inicio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				{
					
					
					inicio miInicio = new inicio();
					miInicio.setVisible(true);
					dispose();
					
					
					
				}
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(28, 132, 56, 21);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(28, 172, 56, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setBounds(28, 212, 56, 21);
		contentPane.add(lblCorreo);
		
		textField = new JTextField();
		textField.setBounds(106, 92, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(106, 132, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(106, 172, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(106, 212, 86, 20);
		contentPane.add(textField_3);
		
		btnRegistrar = new JButton("registrar");
		btnRegistrar.setBounds(152, 275, 89, 23);
		contentPane.add(btnRegistrar);
	}
}
