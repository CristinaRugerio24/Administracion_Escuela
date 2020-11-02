package AdmonEscuela;

import javax.swing.*;
//import java.util.*;
import java.awt.event.*;
//import java.awt.*;

public class VtnInicio extends JFrame{
	
	JButton btnIcono;
	JButton btnAcceder;
	
	public VtnInicio() {
		 super("Pantalla Inicio");
	     this.setBounds(0, 0, 850, 500);
	     this.setVisible(true);
	     this.setResizable(false);
	     this.setLocationRelativeTo(null);
		 inicializar();
		 agregarComponentes();
		 agregarEventos();

	}

	public void inicializar() {
	 	 btnAcceder=new JButton("Acceder Institución");
	     btnIcono = new JButton();
	     Icon icono1 = new ImageIcon("C:\\Users\\javie\\eclipse-workspace\\Administración_Escuela\\src\\img\\icono.jpeg");	
	     btnIcono.setIcon(icono1);
	}
	
	public void agregarComponentes() {
		this.add(btnAcceder);
		this.add(btnIcono);
		btnAcceder.setBounds(70,350,200,30);
		btnIcono.setBounds(350,70,150,100);
		
	}
	
	public void agregarEventos() {
		btnAcceder.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){	
				if(e.getSource() == btnAcceder) {
					VtnPrincipal vtnp = new VtnPrincipal();
				}	
			}


		});
	
	btnIcono.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(e.getSource() == btnIcono) {
					VtnLoginAdmin vtnla = new VtnLoginAdmin();
				}	

		}
	});		
	}
	
	
	public static void main(String[] args) {
		VtnInicio v = new VtnInicio();

	}

}
