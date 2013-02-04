import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class elimadm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					elimadm frame = new elimadm();
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
	public elimadm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdAdministrador = new JLabel("Id administrador");
		lblIdAdministrador.setBounds(10, 93, 103, 21);
		contentPane.add(lblIdAdministrador);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(142, 93, 86, 20);
		contentPane.add(textField);
		
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
		
		JButton btnEliminar = new JButton("eliminar");
		btnEliminar.setBounds(262, 92, 89, 23);
		contentPane.add(btnEliminar);
	}

}
