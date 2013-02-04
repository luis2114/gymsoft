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


public class agrrep extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agrrep frame = new agrrep();
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
	public agrrep() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 353);
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
		
		JLabel lblIdReporte = new JLabel("Id reporte");
		lblIdReporte.setBounds(43, 81, 66, 21);
		contentPane.add(lblIdReporte);
		
		JLabel lblTallaPierna = new JLabel("Talla pierna");
		lblTallaPierna.setBounds(43, 113, 66, 21);
		contentPane.add(lblTallaPierna);
		
		JLabel lblTallaCintura = new JLabel("Talla cintura");
		lblTallaCintura.setBounds(43, 145, 66, 21);
		contentPane.add(lblTallaCintura);
		
		JLabel lblTallaCuello = new JLabel("Talla cuello");
		lblTallaCuello.setBounds(43, 177, 66, 21);
		contentPane.add(lblTallaCuello);
		
		JLabel lblTallaBrazo = new JLabel("Talla brazo");
		lblTallaBrazo.setBounds(43, 209, 66, 21);
		contentPane.add(lblTallaBrazo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(173, 81, 86, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(173, 113, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(173, 145, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(173, 177, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(173, 209, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(43, 241, 66, 21);
		contentPane.add(lblPeso);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(173, 240, 86, 20);
		contentPane.add(textField_5);
		
		JButton button_1 = new JButton("registrar");
		button_1.setBounds(316, 265, 89, 23);
		contentPane.add(button_1);
	}

}
