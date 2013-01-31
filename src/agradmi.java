import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class agradmi extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agradmi frame = new agradmi();
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
	public agradmi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 338);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdAdministrador = new JLabel("id administrador");
		lblIdAdministrador.setBounds(21, 65, 56, 21);
		contentPane.add(lblIdAdministrador);
		
		JLabel label_1 = new JLabel("nombre");
		label_1.setBounds(21, 97, 56, 21);
		contentPane.add(label_1);
		
		JLabel lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(21, 129, 56, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("direccion");
		lblDireccion.setBounds(21, 161, 56, 21);
		contentPane.add(lblDireccion);
		
		JLabel lblCorreo = new JLabel("correo");
		lblCorreo.setBounds(21, 193, 56, 21);
		contentPane.add(lblCorreo);
		
		textField = new JTextField();
		textField.setBounds(122, 65, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 97, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(122, 129, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(122, 161, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(122, 193, 86, 20);
		contentPane.add(textField_4);
		
		JButton button = new JButton("inicio");
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
	}
}
