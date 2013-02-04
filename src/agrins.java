import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class agrins extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agrins frame = new agrins();
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
	public agrins() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("inicio");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				inicio miInicio = new inicio();
				miInicio.setVisible(true);
				hide();
			}
		});
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JButton btnRegistrar = new JButton("registrar");
		btnRegistrar.setBounds(332, 292, 89, 23);
		contentPane.add(btnRegistrar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 95, 56, 21);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(175, 63, 86, 20);
		contentPane.add(textField);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(37, 127, 89, 21);
		contentPane.add(lblDireccion);
		
		JLabel lblProfesion = new JLabel("Horario de trabajo");
		lblProfesion.setBounds(37, 159, 89, 21);
		contentPane.add(lblProfesion);
		
		JLabel lblCorreo = new JLabel("Profesion");
		lblCorreo.setBounds(37, 191, 56, 21);
		contentPane.add(lblCorreo);
		
		JLabel lblCorreo_1 = new JLabel("Correo");
		lblCorreo_1.setBounds(37, 223, 56, 21);
		contentPane.add(lblCorreo_1);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(37, 255, 56, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblIdInstructor = new JLabel("Id instructor");
		lblIdInstructor.setBounds(37, 63, 66, 21);
		contentPane.add(lblIdInstructor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(175, 95, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(175, 127, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 159, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(175, 191, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(175, 223, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(175, 255, 86, 20);
		contentPane.add(textField_6);
	}
}
