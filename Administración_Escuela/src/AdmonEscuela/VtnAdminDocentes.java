package AdmonEscuela;

import java.awt.event.*;
import javax.swing.*;

public class VtnAdminDocentes extends JFrame{
	
	JButton btnAgregarD;
	JTextField jtfNombreU;
	
	public VtnAdminDocentes() {
		
	     super("Ventana Administración Docentes");
	     this.setBounds(0, 0, 850, 500);
	     this.setVisible(true);
	     this.setResizable(false);
	     this.setLocationRelativeTo(null);
		 inicializar();
		 agregarComponentes();
		 agregarEventos();	     

	}

	public void inicializar() {
		btnAgregarD = new JButton();
		jtfNombreU = new JTextField("145");
	    Icon icono2 = new ImageIcon("C:\\Users\\javie\\eclipse-workspace\\Administración_Escuela\\src\\img\\agregarDoc.jpeg");	
	    btnAgregarD.setIcon(icono2);
	}
	
	public void agregarComponentes() {
		this.add(btnAgregarD);
		this.add(jtfNombreU);
		btnAgregarD.setBounds(100,200,150,100);
		jtfNombreU.setBounds(100,70,150,100);
		
	}
	
	public void agregarEventos(){
		btnAgregarD.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				if(e.getSource() == btnAgregarD) {
					VtnInsertarDocente vtnid = new VtnInsertarDocente();
				}	
			}


		});		
	}	
	
}
