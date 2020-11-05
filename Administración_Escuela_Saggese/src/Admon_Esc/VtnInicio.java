package Admon_Esc;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class VtnInicio {

	private JFrame frmInicio;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnInicio window = new VtnInicio();
					window.frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VtnInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicio = new JFrame();
		frmInicio.setTitle("Inicio");
	    frmInicio.setBounds(0, 0, 850, 500);
	    frmInicio.setVisible(true);
	    frmInicio.setResizable(false);
	    frmInicio.setLocationRelativeTo(null);
		frmInicio.getContentPane().setLayout(null);
		
		JButton btnAdmin = new JButton("");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VtnLoginAdmin window = new VtnLoginAdmin();
			}
		});
		btnAdmin.setAction(action);
		btnAdmin.setIcon(new ImageIcon("C:\\Users\\javie\\eclipse-workspace\\Administraci\u00F3n_Escuela_Saggese\\src\\img\\inicioAdmin.png"));
		btnAdmin.setBounds(10, 11, 108, 91);
	    btnAdmin.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		frmInicio.getContentPane().add(btnAdmin);
		
		JLabel lblFondo = new JLabel("");
		lblFondo.setIcon(new ImageIcon("C:\\Users\\javie\\eclipse-workspace\\Administraci\u00F3n_Escuela_Saggese\\src\\img\\PORTADA.png"));
		lblFondo.setBounds(-34, 0, 868, 461);
		frmInicio.getContentPane().add(lblFondo);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
