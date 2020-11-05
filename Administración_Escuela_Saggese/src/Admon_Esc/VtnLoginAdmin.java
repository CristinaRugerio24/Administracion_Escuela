package Admon_Esc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VtnLoginAdmin {

	private JFrame frmLoginAdministrador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnLoginAdmin window = new VtnLoginAdmin();
					window.frmLoginAdministrador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VtnLoginAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginAdministrador = new JFrame();
		frmLoginAdministrador.setTitle("Login Administrador");
	    frmLoginAdministrador.setBounds(0, 0, 850, 500);
	    frmLoginAdministrador.setVisible(true);
	    frmLoginAdministrador.setResizable(false);
	    frmLoginAdministrador.setLocationRelativeTo(null);
		frmLoginAdministrador.getContentPane().setLayout(null);
		
		JButton btnAcceder = new JButton("Acceder");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VtnAdminDocentes window = new VtnAdminDocentes();
			}
		});
		btnAcceder.setToolTipText("Acceder como Administrador");
		btnAcceder.setBackground(new Color(51, 204, 153));
		btnAcceder.setFont(new Font("Apple Garamond", Font.PLAIN, 20));
		btnAcceder.setBounds(630, 386, 113, 33);
		frmLoginAdministrador.getContentPane().add(btnAcceder);
	}

}
