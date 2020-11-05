package Admon_Esc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class VtnAgregarDocente {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellidoP;
	private JTextField txtApellidoM;
	private JTextField txtEdad;
	private JTextField txtFechaNac;
	private JTextField txtCurp;
	private JTextField txtGradoE;
	private JTextField txtDireccion;
	private JTextField txtNSS;
	private JTextField txtNumTel;
	private JTextField txtCorreoI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VtnAgregarDocente window = new VtnAgregarDocente();
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
	public VtnAgregarDocente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Agregar Docente");
		frame.setBounds(0, 0, 850, 500);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre Completo");
		lblNombre.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblNombre.setBounds(346, 48, 137, 25);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblEdad.setBounds(346, 106, 137, 25);
		frame.getContentPane().add(lblEdad);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento");
		lblFechaNac.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblFechaNac.setBounds(548, 106, 149, 25);
		frame.getContentPane().add(lblFechaNac);
		
		JLabel lblCurp = new JLabel("CURP");
		lblCurp.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblCurp.setBounds(346, 164, 137, 25);
		frame.getContentPane().add(lblCurp);
		
		JLabel lblGradoE = new JLabel("Grado de Estudios");
		lblGradoE.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblGradoE.setBounds(548, 164, 137, 25);
		frame.getContentPane().add(lblGradoE);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n Completa");
		lblDireccion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccion.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblDireccion.setBounds(346, 226, 137, 25);
		frame.getContentPane().add(lblDireccion);
		
		JLabel lblNSS = new JLabel("N\u00FAmero de Seguro Social");
		lblNSS.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblNSS.setBounds(548, 226, 172, 25);
		frame.getContentPane().add(lblNSS);
		
		JLabel lblNumTel = new JLabel("N\u00FAmero de Tel\u00E9fono");
		lblNumTel.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblNumTel.setBounds(346, 283, 137, 25);
		frame.getContentPane().add(lblNumTel);
		
		JLabel lblCorreoI = new JLabel("Correo Institucional");
		lblCorreoI.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		lblCorreoI.setBounds(548, 283, 137, 25);
		frame.getContentPane().add(lblCorreoI);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Apple Garamond", Font.PLAIN, 20));
		btnCancelar.setBounds(370, 371, 113, 44);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Apple Garamond", Font.PLAIN, 20));
		btnGuardar.setBounds(516, 371, 113, 44);
		frame.getContentPane().add(btnGuardar);
		
		JComboBox comboArea = new JComboBox();
		comboArea.setModel(new DefaultComboBoxModel(new String[] {"Maternal", "Preescolar", "Primaria", "Secundaria", "Taller"}));
		comboArea.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		comboArea.setBounds(30, 294, 102, 25);
		frame.getContentPane().add(comboArea);
		
		JComboBox comboMateria = new JComboBox();
		comboMateria.setModel(new DefaultComboBoxModel(new String[] {"Ingl\u00E9s", "Espa\u00F1ol"}));
		comboMateria.setFont(new Font("Apple Garamond", Font.PLAIN, 18));
		comboMateria.setBounds(169, 294, 102, 25);
		frame.getContentPane().add(comboMateria);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(346, 75, 143, 25);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidoP = new JTextField();
		txtApellidoP.setColumns(10);
		txtApellidoP.setBounds(506, 75, 143, 25);
		frame.getContentPane().add(txtApellidoP);
		
		txtApellidoM = new JTextField();
		txtApellidoM.setColumns(10);
		txtApellidoM.setBounds(666, 75, 143, 25);
		frame.getContentPane().add(txtApellidoM);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(346, 128, 143, 25);
		frame.getContentPane().add(txtEdad);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setColumns(10);
		txtFechaNac.setBounds(548, 128, 172, 25);
		frame.getContentPane().add(txtFechaNac);
		
		txtCurp = new JTextField();
		txtCurp.setColumns(10);
		txtCurp.setBounds(346, 187, 143, 25);
		frame.getContentPane().add(txtCurp);
		
		txtGradoE = new JTextField();
		txtGradoE.setColumns(10);
		txtGradoE.setBounds(548, 187, 143, 25);
		frame.getContentPane().add(txtGradoE);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(346, 251, 143, 25);
		frame.getContentPane().add(txtDireccion);
		
		txtNSS = new JTextField();
		txtNSS.setColumns(10);
		txtNSS.setBounds(548, 251, 143, 25);
		frame.getContentPane().add(txtNSS);
		
		txtNumTel = new JTextField();
		txtNumTel.setColumns(10);
		txtNumTel.setBounds(346, 307, 143, 25);
		frame.getContentPane().add(txtNumTel);
		
		txtCorreoI = new JTextField();
		txtCorreoI.setColumns(10);
		txtCorreoI.setBounds(548, 307, 143, 25);
		frame.getContentPane().add(txtCorreoI);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon("C:\\Users\\javie\\eclipse-workspace\\Administraci\u00F3n_Escuela_Saggese\\src\\img\\profeM.jpeg"));
		lblImg.setBounds(30, 48, 240, 229);
		frame.getContentPane().add(lblImg);
		
		JLabel lblIconoC = new JLabel("");
		lblIconoC.setIcon(new ImageIcon("C:\\Users\\javie\\eclipse-workspace\\Administraci\u00F3n_Escuela_Saggese\\src\\img\\Calendario.png"));
		lblIconoC.setBounds(730, 128, 23, 25);
		frame.getContentPane().add(lblIconoC);
	}
}
