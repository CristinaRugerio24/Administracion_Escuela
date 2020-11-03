package AdmonEscuela;

import java.awt.event.*;
import javax.swing.*;

public class VtnLoginAdmin extends JFrame{
	JButton btnAcceder;
	JTextField jtfNombreU;
	JLabel jlabelF; 
	
	public VtnLoginAdmin() {
		
	     super("Ventana Login Administrador");
	     this.setBounds(0, 0, 850, 500);
	     this.setVisible(true);
	     this.setResizable(false);
	     this.setLocationRelativeTo(null);
		 inicializar();
		 agregarComponentes();
		 agregarEventos();

	}
	
	public void inicializar() {
		btnAcceder = new JButton("ACCEDER");
		jtfNombreU = new JTextField("145");
		
		ImageIcon imagen3= new ImageIcon("C:\\Users\\crist\\git\\Administracion_Escuela\\Administración_Escuela\\img\\inicioAdmp.png");  
		jlabelF= new JLabel(imagen3); 
		
	}
	
	public void agregarComponentes() {
		this.add(btnAcceder);
		//this.add(jtfNombreU);
		this.add(jlabelF); 
		btnAcceder.setBounds(550,450,150,40);
		jtfNombreU.setBounds(100,70,150,100);
		jlabelF.setBounds(0, 0, 850, 500);
		
	}
	
	public void agregarEventos(){
		btnAcceder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				if(e.getSource() == btnAcceder) {
					VtnAdminDocentes vtnad = new VtnAdminDocentes();
				}	
			}


		});		
	}

}
