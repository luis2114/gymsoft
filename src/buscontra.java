import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class buscontra extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buscontra frame = new buscontra();
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
	public buscontra() {
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
		
		JButton button_1 = new JButton("buscar");
		button_1.setBounds(251, 84, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblIdContrato = new JLabel("id contrato");
		lblIdContrato.setBounds(27, 85, 89, 21);
		contentPane.add(lblIdContrato);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(107, 85, 86, 20);
		contentPane.add(textField);
	}

}
