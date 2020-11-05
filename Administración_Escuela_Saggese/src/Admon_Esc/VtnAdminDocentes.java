package Admon_Esc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VtnAdminDocentes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnAdminDocentes window = new VtnAdminDocentes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VtnAdminDocentes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Administración Docentes");
		frame.setBounds(0, 0, 850, 500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JButton btnAgregarDoc = new JButton("");
		btnAgregarDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VtnAgregarDocente window = new VtnAgregarDocente();
			}
		});
		btnAgregarDoc.setIcon(new ImageIcon("C:\\Users\\javie\\eclipse-workspace\\Administraci\u00F3n_Escuela_Saggese\\src\\img\\agregarDoc.jpeg"));
		btnAgregarDoc.setBounds(714, 40, 69, 73);
		frame.getContentPane().add(btnAgregarDoc);
	}

}
