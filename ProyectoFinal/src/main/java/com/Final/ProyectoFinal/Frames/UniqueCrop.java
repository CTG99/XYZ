package com.Final.ProyectoFinal.Frames;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class UniqueCrop extends JPanel {

	/**
	 * Create the panel.
	 */
	public UniqueCrop(String categoria,String clase,String nombre,String consistencia,String ciclo,String division,String familia,String fruta,String genero,String orden,String descripcion,String especie,String subcategoria,String subclase,String subdivision,String subfamilia,String superorden,String sinonimos,boolean seleccion) {
		setLayout(null);
		
		categoria="PruebaCat";
		clase="PruebaClase";
		nombre="PruebaNombre";
		consistencia="PruebaConsistencia";
		ciclo="PruebaCiclo";
		division="PruebaDivision";
		familia="PruebaFamilia";
		fruta="PruebaFruta";
		genero="PruebaGenero";
		orden="PruebaOrden";
		descripcion="PruebaDescripcion";
		especie="PruebaEspecie";
		subcategoria="PruebaSubC";
		subclase="PruebaSubclass";
		subdivision="PruebaSubDivision";
		subfamilia="PruebaSubFamilia";
		superorden="PruebaSuperorden";
		sinonimos="PruebaSinonimos";
		
		final String clabel=categoria;
		final String cllabel=clase;
		final String nlabel=nombre;
		final String conslabel=consistencia;
		final String cicllabel=ciclo;
		final String divlabel=division;
		final String famlabel=familia;
		final String frulabel=fruta;
		final String genlabel=genero;
		final String orlabel=orden;
		//Descripcion no es necesaria
		final String esplabel=especie;
		final String subclabel=subcategoria;
		final String subcllabel=subclase;
		final String subdlabel=subdivision;
		final String subflabel=subfamilia;
		final String supolabel=superorden;
		final String sinlabel=sinonimos;
		
		
		int y=50;
		//Para controlar el espacio del campo descripcion
		if(descripcion.length()>2 &&  descripcion.length()<=250) {
			y=64;
		}else if(descripcion.length()>250 && descripcion.length()<=500){
			y=122;
		}else if(descripcion.length()>500 && descripcion.length()<=750) {
			y=166;
		}else if(descripcion.length()>750 && descripcion.length()<=1000) {
			y=227;
		}else if(descripcion.length()>1000 && descripcion.length()<=1250) {
			y=279;
		}else if(descripcion.length()>1250 && descripcion.length()<=1500) {
			y=328;
		}else if(descripcion.length()>1500 && descripcion.length()<=1750){
			y=397;
		}else if(descripcion.length()>1750 && descripcion.length()<=2000){
			y=436;
		}else if(descripcion.length()>2000 && descripcion.length()<=2250) {
			y=485;
		}else if(descripcion.length()>2250 && descripcion.length()<=2500) {
			y=526;
		}else if(descripcion.length()>2500 && descripcion.length()<=2750) {
			y=588;
		}else if(descripcion.length()>2750 && descripcion.length()<=3050) {
			y=647;
		}else if(descripcion.length()>3050) {
			y=60;
			descripcion="La descripción es demasiado larga";
		}
		
		
		//Para 250	textArea.setBounds(653, 57, 519, 64);
		//Para 500 textArea.setBounds(653, 57, 519, 122);
		//Para 750 textArea.setBounds(653, 57, 519, 166);
		//Para 1000 textArea.setBounds(653, 57, 519, 227);	
		//Para 1250 textArea.setBounds(653, 57, 519, 279);
		//Para 1500	textArea.setBounds(653, 57, 519, 328);
		//Para 1750 textArea.setBounds(653, 57, 519, 397);
		//Para 2000 textArea.setBounds(653, 57, 519, 436);
		//Para 2250 textArea.setBounds(653, 57, 519, 485);
		//Para 2500 textArea.setBounds(653, 57, 519, 526);
		//Para 2750 textArea.setBounds(653, 57, 519, 588);
		//Para 3050 textArea.setBounds(653, 57, 519, 647);
		
		
		//Control en caso de que no exista registro 
		if(categoria.length()<2) {
			categoria="No disponible";
		}
		if(clase.length()<2) {
			clase="No disponible";
		}
		if(nombre.length()<2) {
			nombre="No disponible";
		}
		if(consistencia.length()<2) {
			consistencia="No disponible";
		}
		if(ciclo.length()<2) {
			ciclo="No disponible";
		}
		if(division.length()<2) {
			division="No disponible";
		}
		if(familia.length()<2) {
			familia="No disponible";
		}
		if(fruta.length()<2) {
			fruta="No disponible";
		}
		if(genero.length()<2) {
			genero="No disponible";
		}
		if(orden.length()<2) {
			orden="No disponible";
		}
		if(descripcion.length()<2) {
			descripcion="No disponible";
		}
		if(especie.length()<2) {
			especie="No disponible";
		}
		if(subcategoria.length()<2) {
			subcategoria="No disponible";
		}
		if(subclase.length()<2) {
			subclase="No disponible";
		}
		if(subdivision.length()<2) {
			subdivision="No disponible";
		}
		if(subfamilia.length()<2) {
			subfamilia="No disponible";
		}
		if(superorden.length()<2) {
			superorden="No disponible";
		}
		if(sinonimos.length()<2) {
			sinonimos="No disponible";
		}
		//Colocar ifs por si hay mucho texto en la descripcion o no 
		//Ver metodo setSize y hacer Tamaño total/cierto numero para mediaquery
		
		JLabel lblNewLabel = new JLabel("Nombre comun:");
		lblNewLabel.setBounds(179, 107, 105, 13);
		lblNewLabel.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Categoria:");
		lblNewLabel_1.setBounds(223, 177, 78, 13);
		lblNewLabel_1.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Clase:");
		lblNewLabel_2.setBounds(239, 243, 45, 13);
		lblNewLabel_2.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		lblNewLabel_2.setVisible(false);
		add(lblNewLabel_2);
	
		
		JLabel lblNewLabel_3 = new JLabel("Consistencia:");
		lblNewLabel_3.setBounds(194, 302, 90, 13);
		lblNewLabel_3.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ciclo de cultivo:");
		lblNewLabel_4.setBounds(179, 361, 105, 13);
		lblNewLabel_4.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Division:");
		lblNewLabel_5.setBounds(231, 107, 59, 13);
		lblNewLabel_5.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		JLabel lblNewLabel_6 = new JLabel("Familia:");
		lblNewLabel_6.setBounds(225, 468, 59, 13);
		lblNewLabel_6.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);
		
		JLabel lblNewLabel_7 = new JLabel("Tipo de fruto:");
		lblNewLabel_7.setBounds(194, 428, 90, 13);
		lblNewLabel_7.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Genero:");
		lblNewLabel_7_1.setBounds(225, 553, 59, 13);
		lblNewLabel_7_1.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_7_1);
		lblNewLabel_7_1.setVisible(false);
		
		JLabel lblNewLabel_7_2 = new JLabel("Orden:");
		lblNewLabel_7_2.setBounds(239, 428, 45, 13);
		lblNewLabel_7_2.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_7_2);
		lblNewLabel_7_2.setVisible(false);
		
		JLabel lblNewLabel_7_3 = new JLabel("Especie:");
		lblNewLabel_7_3.setBounds(225, 605, 59, 13);
		lblNewLabel_7_3.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_7_3);
		lblNewLabel_7_3.setVisible(false);
		
		JLabel lblNewLabel_8 = new JLabel("Subcategoria:");
		lblNewLabel_8.setBounds(189, 243, 95, 13);
		lblNewLabel_8.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Subclase:");
		lblNewLabel_9.setBounds(201, 302, 67, 13);
		lblNewLabel_9.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);
		
		JLabel lblNewLabel_10 = new JLabel("SubDivision:");
		lblNewLabel_10.setBounds(196, 177, 82, 13);
		lblNewLabel_10.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_10);
		lblNewLabel_10.setVisible(false);
		
		JLabel lblNewLabel_11 = new JLabel("Subfamilia:");
		lblNewLabel_11.setBounds(206, 516, 78, 13);
		lblNewLabel_11.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_11);
		lblNewLabel_11.setVisible(false);
		
		JLabel lblNewLabel_12 = new JLabel("Superorden:");
		lblNewLabel_12.setBounds(196, 361, 105, 13);
		lblNewLabel_12.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_12);
		lblNewLabel_12.setVisible(false);
		
		JLabel lblNewLabel_13 = new JLabel("Sinonimos:");
		lblNewLabel_13.setBounds(214, 468, 70, 13);
		lblNewLabel_13.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Descripción:");
		lblNewLabel_14.setBounds(675, 88, 105, 13);
		lblNewLabel_14.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		add(lblNewLabel_14);
		
		//Nombre y division
		JLabel lblNewLabel_15 = new JLabel(nombre);
		lblNewLabel_15.setBounds(325, 107, 227, 13);
		lblNewLabel_15.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		add(lblNewLabel_15);
		
		//Categoria y subdivision
		JLabel lblNewLabel_16 = new JLabel(categoria);
		lblNewLabel_16.setBounds(325, 177, 227, 13);
		lblNewLabel_16.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		add(lblNewLabel_16);
		
		//Subcategoria y Clase
		JLabel lblNewLabel_17 = new JLabel(subcategoria);
		lblNewLabel_17.setBounds(325, 243, 227, 13);
		lblNewLabel_17.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		add(lblNewLabel_17);
		
		//Consistencia y Subclase
		JLabel lblNewLabel_18 = new JLabel(consistencia);
		lblNewLabel_18.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_18.setBounds(325, 302, 234, 13);
		add(lblNewLabel_18);
		
		//Cultivo y Superorden
		JLabel lblNewLabel_19 = new JLabel(ciclo);
		lblNewLabel_19.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_19.setBounds(325, 361, 234, 13);
		add(lblNewLabel_19);
		
		//Fruto y orden
		JLabel lblNewLabel_20 = new JLabel(fruta);
		lblNewLabel_20.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_20.setBounds(325, 428, 234, 13);
		add(lblNewLabel_20);
		
		//Sinonimos y Familia
		JLabel lblNewLabel_21 = new JLabel(sinonimos);
		lblNewLabel_21.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_21.setBounds(325, 468, 234, 13);
		add(lblNewLabel_21);
		
		
		//Subfamilia
		JLabel lblNewLabel_22 = new JLabel(subfamilia);
		lblNewLabel_22.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_22.setBounds(325, 516, 240, 13);
		lblNewLabel_22.setVisible(false);
		add(lblNewLabel_22);
		
		//Genero
		JLabel lblNewLabel_23 = new JLabel(genero);
		lblNewLabel_23.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_23.setBounds(325, 553, 227, 13);
		lblNewLabel_23.setVisible(false);
		add(lblNewLabel_23);
		
		//Especie
		JLabel lblNewLabel_24 = new JLabel(especie);
		lblNewLabel_24.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_24.setBounds(325, 605, 227, 13);
		lblNewLabel_24.setVisible(false);
		add(lblNewLabel_24);

		
		JTextArea textArea = new JTextArea(descripcion);
		textArea.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(812, 73, 519, y);// Cambia el ultimo numero por y
		add(textArea);
		
		JLabel lblNewLabel_25 = new JLabel("Clasificación");
		lblNewLabel_25.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_25.setBounds(462, 681, 90, 13);
		add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Caracteristicas");
		lblNewLabel_26.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_26.setBounds(469, 665, 105, 13);
		lblNewLabel_26.setVisible(false);
		add(lblNewLabel_26);
		
		JButton btnNewButton = new JButton("A\u00F1adir a favoritos");
		btnNewButton.setBounds(650, 662, 130, 21);
		add(btnNewButton);
		btnNewButton.setVisible(seleccion);
		

		
		lblNewLabel_25.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//Esconde los textos de las vistas de la primera pagina
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_3.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_7.setVisible(false);
				lblNewLabel_8.setVisible(false);
				lblNewLabel_13.setVisible(false);
				
				//Muestra los textos de la segunda pagina
				lblNewLabel_2.setVisible(true);
				lblNewLabel_5.setVisible(true);
				lblNewLabel_6.setVisible(true);
				lblNewLabel_7_1.setVisible(true);
				lblNewLabel_7_2.setVisible(true);
				lblNewLabel_7_3.setVisible(true);
				lblNewLabel_9.setVisible(true);
				lblNewLabel_10.setVisible(true);
				lblNewLabel_11.setVisible(true);
				lblNewLabel_12.setVisible(true);
				lblNewLabel_22.setVisible(true);
				lblNewLabel_23.setVisible(true);
				lblNewLabel_24.setVisible(true);
				
				/*final String clabel=categoria;
				final String cllabel=clase;
				final String nlabel=nombre;
				final String conslabel=consistencia;
				final String cicllabel=ciclo;
				final String divlabel=division;
				final String famlabel=familia;
				final String frulabel=fruta;
				final String genlabel=genero;
				final String orlabel=orden;
				//Descripcion no es necesaria
				final String esplabel=especie;
				final String subclabel=subcategoria;
				final String subcllabel=subclase;
				final String subdlabel=subdivision;
				final String subflabel=subfamilia;
				final String supolabel=superorden;
				final String sinlabel=sinonimos;*/
				
				//Cambia los textos de los labels de resultados
				lblNewLabel_15.setText(divlabel);
				lblNewLabel_16.setText(subdlabel);
				lblNewLabel_17.setText(cllabel);
				lblNewLabel_18.setText(subcllabel);
				lblNewLabel_19.setText(supolabel);
				lblNewLabel_20.setText(orlabel);
				lblNewLabel_21.setText(famlabel);
				
				lblNewLabel_25.setVisible(false);
				lblNewLabel_26.setVisible(true);
				
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
				
			}
			
		});
		
		lblNewLabel_26.addMouseListener(new MouseListener () {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				//Esconde los textos de las vistas de la primera pagina
				lblNewLabel.setVisible(true);
				lblNewLabel_1.setVisible(true);
				lblNewLabel_3.setVisible(true);
				lblNewLabel_4.setVisible(true);
				lblNewLabel_7.setVisible(true);
				lblNewLabel_8.setVisible(true);
				lblNewLabel_13.setVisible(true);
				
				//Muestra los textos de la segunda pagina
				lblNewLabel_2.setVisible(false);
				lblNewLabel_5.setVisible(false);
				lblNewLabel_6.setVisible(false);
				lblNewLabel_7_1.setVisible(false);
				lblNewLabel_7_2.setVisible(false);
				lblNewLabel_7_3.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblNewLabel_11.setVisible(false);
				lblNewLabel_12.setVisible(false);
				lblNewLabel_22.setVisible(false);
				lblNewLabel_23.setVisible(false);
				lblNewLabel_24.setVisible(false);
				
				/*final String clabel=categoria;
				final String cllabel=clase;
				final String nlabel=nombre;
				final String conslabel=consistencia;
				final String cicllabel=ciclo;
				final String divlabel=division;
				final String famlabel=familia;
				final String frulabel=fruta;
				final String genlabel=genero;
				final String orlabel=orden;
				//Descripcion no es necesaria
				final String esplabel=especie;
				final String subclabel=subcategoria;
				final String subcllabel=subclase;
				final String subdlabel=subdivision;
				final String subflabel=subfamilia;
				final String supolabel=superorden;
				final String sinlabel=sinonimos;*/
				
				//Cambia los textos de los labels de resultados
				lblNewLabel_15.setText(nlabel);
				lblNewLabel_16.setText(clabel);
				lblNewLabel_17.setText(subclabel);
				lblNewLabel_18.setText(conslabel);
				lblNewLabel_19.setText(cicllabel);
				lblNewLabel_20.setText(frulabel);
				lblNewLabel_21.setText(sinlabel);
				
				lblNewLabel_26.setVisible(false);
				lblNewLabel_25.setVisible(true);
				
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
				
			}
			
		});
		


		
	}
	

}



