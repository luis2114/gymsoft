import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class agrcontra extends JFrame {

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
					agrcontra frame = new agrcontra();
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
	public agrcontra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("inicio");
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JLabel lblIdContrato = new JLabel("id contrato");
		lblIdContrato.setBounds(10, 65, 56, 21);
		contentPane.add(lblIdContrato);
		
		JLabel lblIdMensual = new JLabel("mensual");
		lblIdMensual.setBounds(10, 97, 56, 21);
		contentPane.add(lblIdMensual);
		
		JLabel lblSemanal = new JLabel("semanal");
		lblSemanal.setBounds(10, 129, 56, 21);
		contentPane.add(lblSemanal);
		
		JLabel lblDiario = new JLabel("diario");
		lblDiario.setBounds(10, 161, 56, 21);
		contentPane.add(lblDiario);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 65, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 97, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 129, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 161, 86, 20);
		contentPane.add(textField_3);
		
		JButton button_1 = new JButton("agregar");
		button_1.setBounds(237, 203, 89, 23);
		contentPane.add(button_1);
	}
}
