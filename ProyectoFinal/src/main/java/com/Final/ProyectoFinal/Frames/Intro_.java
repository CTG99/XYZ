package com.Final.ProyectoFinal.Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Intro_ extends JFrame {

	private JPanel contentPane;
	boolean seleccion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Intro_ frame = new Intro_();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
	public Intro_() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));*/
		/*Intro i=new Intro();
		setContentPane(i);*/
		
			setLayout(null);
			Border blackb=BorderFactory.createLineBorder(Color.black);
			JPanel panel = new JPanel();
			panel.setBounds(591, 230, 319, 301);
			add(panel);
			panel.setBorder(blackb);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(54, 10, 217, 242);
			lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\Carli\\\\\\\\Workspaces-eclipse\\\\Desarrollo-de interfaces\\\\ProyectoFinal\\\\src\\\\main\\\\resources\\\\Images\\\\CROPS2.png"));
			panel.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("API Crops");
			lblNewLabel_1.setFont( new Font( "Helvetica", Font.BOLD, 18 ) );
			lblNewLabel_1.setBounds(108, 262, 109, 29);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("¡Bienvenido a Plants 'n Stuff!");
			lblNewLabel_2.setFont( new Font( "Helvetica", Font.BOLD, 58 ) );
			lblNewLabel_2.setBounds(343, 52, 874, 162);
			add(lblNewLabel_2);
			
			JButton btnNewButton = new JButton("Mostrar Favoritos");
			btnNewButton.setBounds(850, 546, 120, 21);
			add(btnNewButton);
			
			
			panel.addMouseListener(new MouseListener() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					seleccion=true;
					buscador();
				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}}
			);
			
			btnNewButton.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					seleccion=false;
					
					 buscador();
					
				}});
			

		}
	
		private void buscador() {
			dispose();
			Buscador.main(seleccion);
			
		}
		
		
	

}