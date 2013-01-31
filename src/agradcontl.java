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


public class agradcontl extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agradcontl frame = new agradcontl();
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
	public agradcontl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
				dispose();
				
				
			}
		});
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("agregar");
		button_1.setBounds(239, 204, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblIdControl = new JLabel("id control");
		lblIdControl.setBounds(22, 65, 56, 21);
		contentPane.add(lblIdControl);
		
		JLabel lblAsistencia = new JLabel("fecha de inicio");
		lblAsistencia.setBounds(22, 97, 77, 21);
		contentPane.add(lblAsistencia);
		
		JLabel lblEstadoDeContrato = new JLabel("estado de contrato");
		lblEstadoDeContrato.setBounds(22, 129, 102, 21);
		contentPane.add(lblEstadoDeContrato);
		
		JLabel lblTipoDeContrato = new JLabel("tipo de contrato");
		lblTipoDeContrato.setBounds(22, 161, 89, 21);
		contentPane.add(lblTipoDeContrato);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(144, 65, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(144, 97, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(144, 129, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(144, 161, 86, 20);
		contentPane.add(textField_3);
	}

}
