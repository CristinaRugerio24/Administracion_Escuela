package AdmonEscuela;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
//import java.util.*;
import java.awt.event.*;
//import java.awt.*;

public class VtnInicio extends JFrame{
	
	JButton btnIcono, salirVtn1;
	JButton btnAcceder;
	JLabel jlabel1;
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
	
	public void inicializar(){
	 	 btnAcceder=new JButton("Acceder Institución");
	 	 btnAcceder.setFont(new Font("Apple Garamond",0,20));
	 	 btnAcceder.setBackground(new Color (178,212,112));//Color Fondo
	     btnAcceder.setBorder(javax.swing.BorderFactory.createEmptyBorder()); //Quita Borde  
	 	 btnAcceder.setToolTipText("Acceder Información del Colegio Saggese");

	 	 
	     btnIcono = new JButton();
	     Icon icono1 = new ImageIcon("C:\\Users\\crist\\git\\Administracion_Escuela\\Administración_Escuela\\img\\inicioAdmin.png");	
	     btnIcono.setIcon(icono1);
	     btnIcono.setToolTipText("Login para Administrador del Colegio Sagesse");
	     btnIcono.setContentAreaFilled(false); //Quita fondo
	     btnIcono.setBorder(javax.swing.BorderFactory.createEmptyBorder());//Quita Borde  
	     
	     salirVtn1=new JButton("Salir de Colegio"); 
	     salirVtn1.setFont(new Font("Apple Garamond",0,20));
	     salirVtn1.setBackground(new Color (178,212,112));//Color Fondo
	     salirVtn1.setBorder(javax.swing.BorderFactory.createEmptyBorder()); //Quita Borde  
	     salirVtn1.setToolTipText("Acceder Información del Colegio Saggese");

	     //IMAGEN FONDO     
	    ImageIcon imagen2= new ImageIcon("C:\\Users\\crist\\git\\Administracion_Escuela\\Administración_Escuela\\img\\PORTADA.png");  
	 	jlabel1= new JLabel(imagen2);
	}
	
	public void agregarComponentes() {
		this.add(btnAcceder);
		this.add(btnIcono);
		this.add(salirVtn1);
		this.add(jlabel1);
		btnAcceder.setBounds(340,300,200,30);
		btnIcono.setBounds(20,10,100,100);
		salirVtn1.setBounds(370,340,150,30);
		jlabel1.setBounds(0, 0, 850, 500); 
		
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
				if(e.getSource() == salirVtn1) {
					VtnLoginAdmin vtnla = new VtnLoginAdmin();
				}

		}
	});		
	}
	
	
	public static void main(String[] args) {
		VtnInicio v = new VtnInicio();

	}

}
