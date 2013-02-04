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


public class busclin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					busclin frame = new busclin();
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
	public busclin() {
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
				hide();
			}
		});
		button.setBounds(10, 11, 89, 23);
		contentPane.add(button);
		
		JLabel lblIdCliente = new JLabel("Id cliente");
		lblIdCliente.setBounds(59, 75, 89, 21);
		contentPane.add(lblIdCliente);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 75, 86, 20);
		contentPane.add(textField);
		
		JButton button_1 = new JButton("buscar");
		button_1.setBounds(272, 74, 89, 23);
		contentPane.add(button_1);
	}

}
