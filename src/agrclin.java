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


public class agrclin extends JFrame {

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
					agrclin frame = new agrclin();
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
	public agrclin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 373);
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
		
		JButton button_1 = new JButton("registrar");
		button_1.setBounds(338, 269, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblIdCliente = new JLabel("Id cliente");
		lblIdCliente.setBounds(33, 68, 66, 21);
		contentPane.add(lblIdCliente);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(33, 100, 66, 21);
		contentPane.add(lblNombre);
		
		JLabel lblTipoEmpleo = new JLabel("Tipo empleo");
		lblTipoEmpleo.setBounds(33, 132, 66, 21);
		contentPane.add(lblTipoEmpleo);
		
		JLabel lblHorarioDisponible = new JLabel("Horario disponible");
		lblHorarioDisponible.setBounds(33, 164, 89, 21);
		contentPane.add(lblHorarioDisponible);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(33, 196, 66, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(33, 228, 66, 21);
		contentPane.add(lblDireccion);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(33, 260, 66, 21);
		contentPane.add(lblCorreo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(163, 68, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(163, 100, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(163, 132, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(163, 164, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(163, 196, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(163, 228, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(163, 260, 86, 20);
		contentPane.add(textField_6);
	}

}
