package com.Final.ProyectoFinal.Frames;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import com.Final.ProyectoFinal.dto.CropsDto;



public class PanelResultados extends JFrame {

	private JPanel contentPane;
	static int y=0;

	/**
	 * Launch the application.
	 */
	public static void main(List<CropsDto> a,String nc,String es,String cat,String subc,String fr,String fam,String ci,String cons,boolean selector ) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelResultados frame = new PanelResultados(a,nc,es,cat,subc,fr,fam,ci,cons,selector);
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
	public PanelResultados(List<CropsDto> a,String nc,String es,String cat,String subc,String fr,String fam,String ci,String cons,boolean selector ) {//Poner que es de crops dto
		setLayout(null);
		
		
		Border blackb=BorderFactory.createLineBorder(Color.black);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1920, 101);
		panel.setBackground(Color.gray);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Resultados de busqueda");
		lblNewLabel_2.setFont( new Font( "Helvetica", Font.ITALIC, 48 ) );
		lblNewLabel_2.setBounds(493, 10,704, 81);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setBounds(30, 10, 118, 91);
		lblNewLabel_20.setIcon(new ImageIcon("C:\\\\Users\\\\Carli\\\\\\\\Workspaces-eclipse\\\\Desarrollo-de interfaces\\\\ProyectoFinal\\\\src\\\\main\\\\resources\\\\Images\\\\Flecha.png"));
		 
		panel.add(lblNewLabel_20);
		
		lblNewLabel_20.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				dispose();
				Buscador.main(selector);
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
				
			}});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 10, 209, 835);
		panel_1.setBackground(Color.gray);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel.setBounds(82, 5, 45, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aqui estan los resultados de :");
		lblNewLabel_1.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(21, 132, 165, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre común:");
		lblNewLabel_3.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_3.setBounds(21, 179, 165, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Especie");
		lblNewLabel_3_1.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_3_1.setBounds(21, 225, 165, 13);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Categoria:");
		lblNewLabel_3_2.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_3_2.setBounds(21, 272, 165, 13);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Subcategoria:");
		lblNewLabel_3_3.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_3_3.setBounds(21, 318, 165, 13);
		panel_1.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de fruto:");
		lblNewLabel_4.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_4.setBounds(21, 364, 178, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Familia:");
		lblNewLabel_5.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_5.setBounds(21, 415, 165, 13);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ciclo de cultivo:");
		lblNewLabel_6.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_6.setBounds(21, 461, 165, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Consistencia:");
		lblNewLabel_7.setFont( new Font( "Helvetica", Font.PLAIN, 13 ) );
		lblNewLabel_7.setBounds(21, 520, 165, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_11 = new JLabel(nc);
		lblNewLabel_11.setBounds(21, 202, 165, 13);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel(es);
		lblNewLabel_12.setBounds(21, 248, 165, 13);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel(cat);
		lblNewLabel_13.setBounds(21, 295, 165, 13);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel(subc);
		lblNewLabel_14.setBounds(21, 341, 165, 13);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel(fr);
		lblNewLabel_15.setBounds(21, 387, 165, 13);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel(fam);
		lblNewLabel_16.setBounds(21, 438, 165, 13);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel(ci);
		lblNewLabel_17.setBounds(21, 484, 165, 13);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel(cons);
		lblNewLabel_18.setBounds(21, 553, 158, 13);
		panel_1.add(lblNewLabel_18);
		
		
		
		//Paneles grises
		JTextArea textArea = new JTextArea();
		textArea.setVisible(false);
		textArea.setEditable(false);
		textArea.setFont(new Font( "Helvetica", Font.PLAIN, 13 ));
		textArea.setLineWrap(true);
		textArea.setBounds(271, 230, 203, 138);
		add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(blackb);
		panel_2.setBounds(263, 163, 217, 224);
		panel_2.setVisible(false);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(21, 49, 105, 13);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_8 = new JLabel("New label00");
		lblNewLabel_8.setBounds(10, 9, 197, 30);
		panel_2.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_8.setFont( new Font( "Helvetica", Font.PLAIN, 23 ) );
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(blackb);
		panel_2_1.setVisible(false);
		panel_2_1.setBounds(541, 163, 217, 224);
		add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_8_1 = new JLabel("New label11");
		lblNewLabel_8_1.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel_8_1.setBounds(10, 10, 197, 30);
		panel_2_1.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("New label");
		lblNewLabel_9_1.setBounds(10, 50, 105, 13);
		panel_2_1.add(lblNewLabel_9_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setLineWrap(true);
		textArea_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
		textArea_1.setBounds(4, 73, 203, 138);
		panel_2_1.add(textArea_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBorder(blackb);
		panel_2_1_1.setVisible(false);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(820, 163, 217, 224);
		add(panel_2_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("New label222");
		lblNewLabel_8_1_1.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel_8_1_1.setBounds(10, 10, 197, 30);
		panel_2_1_1.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("New label");
		lblNewLabel_9_1_1.setBounds(10, 50, 105, 13);
		panel_2_1_1.add(lblNewLabel_9_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setEditable(false);
		textArea_1_1.setLineWrap(true);
		textArea_1_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
		textArea_1_1.setBounds(4, 73, 203, 138);
		panel_2_1_1.add(textArea_1_1);
		
		JPanel panel_2_1_1_1 = new JPanel();
		panel_2_1_1_1.setBorder(blackb);
		panel_2_1_1_1.setVisible(false);
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(1129, 163, 217, 224);
		add(panel_2_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("New label333");
		lblNewLabel_8_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel_8_1_1_1.setBounds(10, 10, 197, 30);
		panel_2_1_1_1.add(lblNewLabel_8_1_1_1);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("New label");
		lblNewLabel_9_1_1_1.setBounds(10, 50, 105, 13);
		panel_2_1_1_1.add(lblNewLabel_9_1_1_1);
		
		JTextArea textArea_1_1_1 = new JTextArea();
		textArea_1_1_1.setEditable(false);
		textArea_1_1_1.setLineWrap(true);
		textArea_1_1_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
		textArea_1_1_1.setBounds(4, 73, 203, 138);
		panel_2_1_1_1.add(textArea_1_1_1);
		

		
		JPanel panel_2_1_1_3 = new JPanel();
		panel_2_1_1_3.setBorder(blackb);
		panel_2_1_1_3.setVisible(false);
		panel_2_1_1_3.setLayout(null);
		panel_2_1_1_3.setBounds(263, 430, 217, 224);
		add(panel_2_1_1_3);
		
		JLabel lblNewLabel_8_1_1_3 = new JLabel("New label444");
		lblNewLabel_8_1_1_3.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel_8_1_1_3.setBounds(10, 10, 197, 30);
		panel_2_1_1_3.add(lblNewLabel_8_1_1_3);
		
		JLabel lblNewLabel_9_1_1_3 = new JLabel("New label");
		lblNewLabel_9_1_1_3.setBounds(10, 50, 105, 13);
		panel_2_1_1_3.add(lblNewLabel_9_1_1_3);
		
		JTextArea textArea_1_1_3 = new JTextArea();
		textArea_1_1_3.setEditable(false);
		textArea_1_1_3.setLineWrap(true);
		textArea_1_1_3.setFont(new Font("SansSerif", Font.PLAIN, 13));
		textArea_1_1_3.setBounds(4, 73, 203, 138);
		panel_2_1_1_3.add(textArea_1_1_3);
		
		JPanel panel_2_1_1_4 = new JPanel();
		panel_2_1_1_4.setBorder(blackb);
		panel_2_1_1_4.setVisible(false);
		panel_2_1_1_4.setLayout(null);
		panel_2_1_1_4.setBounds(541, 430, 217, 224);
		add(panel_2_1_1_4);
		
		JLabel lblNewLabel_8_1_1_4 = new JLabel("New label555");
		lblNewLabel_8_1_1_4.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel_8_1_1_4.setBounds(10, 10, 197, 30);
		panel_2_1_1_4.add(lblNewLabel_8_1_1_4);
		
		JLabel lblNewLabel_9_1_1_4 = new JLabel("New label");
		lblNewLabel_9_1_1_4.setBounds(10, 50, 105, 13);
		panel_2_1_1_4.add(lblNewLabel_9_1_1_4);
		
		JTextArea textArea_1_1_4 = new JTextArea();
		textArea_1_1_4.setEditable(false);
		textArea_1_1_4.setLineWrap(true);
		textArea_1_1_4.setFont(new Font("SansSerif", Font.PLAIN, 13));
		textArea_1_1_4.setBounds(4, 73, 203, 138);
		panel_2_1_1_4.add(textArea_1_1_4);
		
		JPanel panel_2_1_1_2 = new JPanel();
		panel_2_1_1_2.setBorder(blackb);
		panel_2_1_1_2.setVisible(false);
		panel_2_1_1_2.setLayout(null);
		panel_2_1_1_2.setBounds(820, 430, 217, 224);
		add(panel_2_1_1_2);
		
		JLabel lblNewLabel_8_1_1_2 = new JLabel("New label666");
		lblNewLabel_8_1_1_2.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel_8_1_1_2.setBounds(10, 10, 197, 30);
		panel_2_1_1_2.add(lblNewLabel_8_1_1_2);
		
		JLabel lblNewLabel_9_1_1_2 = new JLabel("New label");
		lblNewLabel_9_1_1_2.setBounds(10, 50, 105, 13);
		panel_2_1_1_2.add(lblNewLabel_9_1_1_2);
		
		JTextArea textArea_1_1_2 = new JTextArea();
		textArea_1_1_2.setEditable(false);
		textArea_1_1_2.setLineWrap(true);
		textArea_1_1_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		textArea_1_1_2.setBounds(4, 73, 203, 138);
		panel_2_1_1_2.add(textArea_1_1_2);
		
		JPanel panel_2_1_1_5 = new JPanel();
		panel_2_1_1_5.setBorder(blackb);
		panel_2_1_1_5 .setVisible(false);
		panel_2_1_1_5.setLayout(null);
		panel_2_1_1_5.setBounds(1129, 430, 217, 224);
		add(panel_2_1_1_5);
		
		JLabel lblNewLabel_8_1_1_5 = new JLabel("New label777");
		lblNewLabel_8_1_1_5.setFont(new Font("SansSerif", Font.PLAIN, 23));
		lblNewLabel_8_1_1_5.setBounds(10, 10, 197, 30);
		panel_2_1_1_5.add(lblNewLabel_8_1_1_5);
		
		JLabel lblNewLabel_9_1_1_5 = new JLabel("New label");
		lblNewLabel_9_1_1_5.setBounds(10, 50, 105, 13);
		panel_2_1_1_5.add(lblNewLabel_9_1_1_5);
		
		JTextArea textArea_1_1_5 = new JTextArea();
		textArea_1_1_5.setEditable(false);
		textArea_1_1_5.setLineWrap(true);
		textArea_1_1_5.setFont(new Font("SansSerif", Font.PLAIN, 13));
		textArea_1_1_5.setBounds(4, 73, 203, 138);
		panel_2_1_1_5.add(textArea_1_1_5);
		
		panel_2.setVisible(false);
		JLabel lblNewLabel_10 = new JLabel("Siguiente pagina");
		lblNewLabel_10.setVisible(false);
		lblNewLabel_10.setBounds(851, 720, 96, 13);
		add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("Mostrar Resultados");
		btnNewButton.setBounds(721, 393, 120, 38);
		add(btnNewButton);
		
		JLabel lblNewLabel_19 = new JLabel("Anterior pagina");
		lblNewLabel_19.setBounds(721, 720, 76, 13);
		add(lblNewLabel_19);
		
		if(y==0) {
			lblNewLabel_19.setVisible(false);
		}
		
		
	lblNewLabel_10.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			panel_2.setVisible(false);
			panel_2_1.setVisible(false);
			panel_2_1_1.setVisible(false);
			panel_2_1_1_1.setVisible(false);
			panel_2_1_1_3.setVisible(false);
			panel_2_1_1_4.setVisible(false);
			panel_2_1_1_2.setVisible(false);
			panel_2_1_1_5.setVisible(false);
			lblNewLabel_19.setVisible(true);
			mostrador();
			if(a.size()/8==y) {
				lblNewLabel_10.setVisible(false);
			}
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
		
		public void mostrador() {
			y++;
			lblNewLabel_8.setVisible(true);
			if(a.size()>=(8*y+0)+1) {
				panel_2.setVisible(true);
				lblNewLabel_8.setText(a.get(y*8+0).getCommonName());
				lblNewLabel_9.setText(a.get(y*8+0).getCategory());
				textArea.setText(a.get(y*8+0).getRemarks());
				
			}
			if(a.size()>=(8*y+1)+1) {
				panel_2_1.setVisible(true);
				lblNewLabel_8_1.setText(a.get(y*8+1).getCommonName());
				lblNewLabel_9_1.setText(a.get(y*8+1).getCategory());
				textArea_1.setText(a.get(y*8+1).getRemarks());
			}
			if(a.size()>=(8*y+2)+1) {
				panel_2_1_1.setVisible(true);
				lblNewLabel_8_1_1.setText(a.get(y*8+2).getCommonName());
				lblNewLabel_9_1_1.setText(a.get(y*8+2).getCategory());
				textArea_1_1.setText(a.get(y*8+2).getRemarks());
				
			}
			if(a.size()>=(8*y+3)+1) {
				panel_2_1_1_1.setVisible(true);
				lblNewLabel_8_1_1_1.setText(a.get(y*8+3).getCommonName());
				lblNewLabel_9_1_1_1.setText(a.get(y*8+3).getCategory());
				textArea_1_1_1.setText(a.get(y*8+3).getRemarks());
				
			}
			if(a.size()>=(8*y+4)+1) {
				panel_2_1_1_3.setVisible(true);
				lblNewLabel_8_1_1_3.setText(a.get(y*8+4).getCommonName());
				lblNewLabel_9_1_1_3.setText(a.get(y*8+4).getCategory());
				textArea_1_1_3.setText(a.get(y*8+4).getRemarks());
				
			}
			if(a.size()>=(8*y+5)+1) {
				panel_2_1_1_4.setVisible(true);
				lblNewLabel_8_1_1_4.setText(a.get(y*8+5).getCommonName());
				lblNewLabel_9_1_1_4.setText(a.get(y*8+5).getCategory());
				textArea_1_1_4.setText(a.get(y*8+5).getRemarks());
				
			}
			if(a.size()>=(8*y+6)+1) {
				panel_2_1_1_2.setVisible(true);
				lblNewLabel_8_1_1_2.setText(a.get(y*8+6).getCommonName());
				lblNewLabel_9_1_1_2.setText(a.get(y*8+6).getCategory());
				textArea_1_1_2.setText(a.get(y*8+6).getRemarks());
				
			}
			if(a.size()>=(8*y+7)+1) {
				panel_2_1_1_5.setVisible(true);
				lblNewLabel_8_1_1_5.setText(a.get(y*8+7).getCommonName());
				lblNewLabel_9_1_1_5.setText(a.get(y*8+7).getCategory());
				textArea_1_1_5.setText(a.get(y*8+7).getRemarks());
			}
			
			if(a.size()>=(8*y+7)+1) {
				lblNewLabel_10.setVisible(true);
			}
			
			
		}

	}
	
			
			);
	/*
	 * lblNewLabel_8
	 * lblNewLabel_9
	 * textArea
	 * */
	btnNewButton.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			lblNewLabel_10.setVisible(true);
			lblNewLabel_8.setVisible(true);
			textArea.setVisible(true);
			btnNewButton.setVisible(false);
			if(a.size()>=(8*y+0)+1) {
				panel_2.setVisible(true);
				lblNewLabel_8.setText(a.get(y*8+0).getCommonName());
				lblNewLabel_9.setText(a.get(y*8+0).getCategory());
				textArea.setText(a.get(y*8+0).getRemarks());
				
			}
			if(a.size()>=(8*y+1)+1) {
				panel_2_1.setVisible(true);
				lblNewLabel_8_1.setText(a.get(y*8+1).getCommonName());
				lblNewLabel_9_1.setText(a.get(y*8+1).getCategory());
				textArea_1.setText(a.get(y*8+1).getRemarks());
			}
			if(a.size()>=(8*y+2)+1) {
				panel_2_1_1.setVisible(true);
				lblNewLabel_8_1_1.setText(a.get(y*8+2).getCommonName());
				lblNewLabel_9_1_1.setText(a.get(y*8+2).getCategory());
				textArea_1_1.setText(a.get(y*8+2).getRemarks());
				
			}
			if(a.size()>=(8*y+3)+1) {
				panel_2_1_1_1.setVisible(true);
				lblNewLabel_8_1_1_1.setText(a.get(y*8+3).getCommonName());
				lblNewLabel_9_1_1_1.setText(a.get(y*8+3).getCategory());
				textArea_1_1_1.setText(a.get(y*8+3).getRemarks());
				
			}
			if(a.size()>=(8*y+4)+1) {
				panel_2_1_1_3.setVisible(true);
				lblNewLabel_8_1_1_3.setText(a.get(y*8+4).getCommonName());
				lblNewLabel_9_1_1_3.setText(a.get(y*8+4).getCategory());
				textArea_1_1_3.setText(a.get(y*8+4).getRemarks());
				
			}
			if(a.size()>=(8*y+5)+1) {
				panel_2_1_1_4.setVisible(true);
				lblNewLabel_8_1_1_4.setText(a.get(y*8+5).getCommonName());
				lblNewLabel_9_1_1_4.setText(a.get(y*8+5).getCategory());
				textArea_1_1_4.setText(a.get(y*8+5).getRemarks());
				
			}
			if(a.size()>=(8*y+6)+1) {
				panel_2_1_1_2.setVisible(true);
				lblNewLabel_8_1_1_2.setText(a.get(y*8+6).getCommonName());
				lblNewLabel_9_1_1_2.setText(a.get(y*8+6).getCategory());
				textArea_1_1_2.setText(a.get(y*8+6).getRemarks());
				
			}
			if(a.size()>=(8*y+7)+1) {
				panel_2_1_1_5.setVisible(true);
				lblNewLabel_8_1_1_5.setText(a.get(y*8+7).getCommonName());
				lblNewLabel_9_1_1_5.setText(a.get(y*8+7).getCategory());
				textArea_1_1_5.setText(a.get(y*8+7).getRemarks());
			}
			
			if(a.size()>=(8*y+7)+1) {
				lblNewLabel_10.setVisible(true);
			}
		}});

	lblNewLabel_19.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			y--;
			
			if(y==0) {
				lblNewLabel_19.setVisible(false);
			}
			if(a.size()>=(8*y+0)+1) {
				panel_2.setVisible(true);
				lblNewLabel_8.setText(a.get(y*8+0).getCommonName());
				lblNewLabel_9.setText(a.get(y*8+0).getCategory());
				textArea.setText(a.get(y*8+0).getRemarks());
				
			}
			if(a.size()>=(8*y+1)+1) {
				panel_2_1.setVisible(true);
				lblNewLabel_8_1.setText(a.get(y*8+1).getCommonName());
				lblNewLabel_9_1.setText(a.get(y*8+1).getCategory());
				textArea_1.setText(a.get(y*8+1).getRemarks());
			}
			if(a.size()>=(8*y+2)+1) {
				panel_2_1_1.setVisible(true);
				lblNewLabel_8_1_1.setText(a.get(y*8+2).getCommonName());
				lblNewLabel_9_1_1.setText(a.get(y*8+2).getCategory());
				textArea_1_1.setText(a.get(y*8+2).getRemarks());
				
			}
			if(a.size()>=(8*y+3)+1) {
				panel_2_1_1_1.setVisible(true);
				lblNewLabel_8_1_1_1.setText(a.get(y*8+3).getCommonName());
				lblNewLabel_9_1_1_1.setText(a.get(y*8+3).getCategory());
				textArea_1_1_1.setText(a.get(y*8+3).getRemarks());
				
			}
			if(a.size()>=(8*y+4)+1) {
				panel_2_1_1_3.setVisible(true);
				lblNewLabel_8_1_1_3.setText(a.get(y*8+4).getCommonName());
				lblNewLabel_9_1_1_3.setText(a.get(y*8+4).getCategory());
				textArea_1_1_3.setText(a.get(y*8+4).getRemarks());
				
			}
			if(a.size()>=(8*y+5)+1) {
				panel_2_1_1_4.setVisible(true);
				lblNewLabel_8_1_1_4.setText(a.get(y*8+5).getCommonName());
				lblNewLabel_9_1_1_4.setText(a.get(y*8+5).getCategory());
				textArea_1_1_4.setText(a.get(y*8+5).getRemarks());
				
			}
			if(a.size()>=(8*y+6)+1) {
				panel_2_1_1_2.setVisible(true);
				lblNewLabel_8_1_1_2.setText(a.get(y*8+6).getCommonName());
				lblNewLabel_9_1_1_2.setText(a.get(y*8+6).getCategory());
				textArea_1_1_2.setText(a.get(y*8+6).getRemarks());
				
			}
			if(a.size()>=(8*y+7)+1) {
				panel_2_1_1_5.setVisible(true);
				lblNewLabel_8_1_1_5.setText(a.get(y*8+7).getCommonName());
				lblNewLabel_9_1_1_5.setText(a.get(y*8+7).getCategory());
				textArea_1_1_5.setText(a.get(y*8+7).getRemarks());
			}
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
			
		}});
	
	panel_2.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			dispose();
		UniqueCrops.main(a.get(y*8+0).getCategory(),a.get(y*8+0).getClase(),a.get(y*8+0).getCommonName(),a.get(y*8+0).getConsistency(),a.get(y*8+0).getCropCycle(),a.get(y*8+0).getDivision(),a.get(y*8+0).getFamily(),a.get(y*8+0).getFruitType(),a.get(y*8+0).getGenus(),a.get(y*8+0).getOrder(),a.get(y*8+0).getRemarks(),a.get(y*8+0).getSpecieName(),a.get(y*8+0).getSubCategory(),a.get(y*8+0).getSubClass(),a.get(y*8+0).getSubDivision(),a.get(y*8+0).getSubFamily(),a.get(y*8+0).getSuperorder(),a.get(y*8+0).getSynonyms(),selector);
			
			
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
	
	panel_2_1.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			dispose();
			UniqueCrops.main(a.get(y*8+1).getCategory(),a.get(y*8+1).getClase(),a.get(y*8+1).getCommonName(),a.get(y*8+1).getConsistency(),a.get(y*8+1).getCropCycle(),a.get(y*8+1).getDivision(),a.get(y*8+1).getFamily(),a.get(y*8+1).getFruitType(),a.get(y*8+1).getGenus(),a.get(y*8+1).getOrder(),a.get(y*8+1).getRemarks(),a.get(y*8+1).getSpecieName(),a.get(y*8+1).getSubCategory(),a.get(y*8+1).getSubClass(),a.get(y*8+1).getSubDivision(),a.get(y*8+1).getSubFamily(),a.get(y*8+1).getSuperorder(),a.get(y*8+1).getSynonyms(),selector);
			
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
	
	panel_2_1_1.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			dispose();
			UniqueCrops.main(a.get(y*8+2).getCategory(),a.get(y*8+2).getClase(),a.get(y*8+2).getCommonName(),a.get(y*8+2).getConsistency(),a.get(y*8+2).getCropCycle(),a.get(y*8+2).getDivision(),a.get(y*8+2).getFamily(),a.get(y*8+2).getFruitType(),a.get(y*8+2).getGenus(),a.get(y*8+2).getOrder(),a.get(y*8+2).getRemarks(),a.get(y*8+2).getSpecieName(),a.get(y*8+2).getSubCategory(),a.get(y*8+2).getSubClass(),a.get(y*8+2).getSubDivision(),a.get(y*8+2).getSubFamily(),a.get(y*8+2).getSuperorder(),a.get(y*8+2).getSynonyms(),selector);
			
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
			
		}});
	
	panel_2_1_1_1.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			dispose();
			UniqueCrops.main(a.get(y*8+3).getCategory(),a.get(y*8+3).getClase(),a.get(y*8+3).getCommonName(),a.get(y*8+3).getConsistency(),a.get(y*8+3).getCropCycle(),a.get(y*8+3).getDivision(),a.get(y*8+3).getFamily(),a.get(y*8+3).getFruitType(),a.get(y*8+3).getGenus(),a.get(y*8+3).getOrder(),a.get(y*8+3).getRemarks(),a.get(y*8+3).getSpecieName(),a.get(y*8+3).getSubCategory(),a.get(y*8+3).getSubClass(),a.get(y*8+3).getSubDivision(),a.get(y*8+3).getSubFamily(),a.get(y*8+3).getSuperorder(),a.get(y*8+3).getSynonyms(),selector);
			
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
			
		}});
	panel_2_1_1_3.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			dispose();
			UniqueCrops.main(a.get(y*8+4).getCategory(),a.get(y*8+4).getClase(),a.get(y*8+4).getCommonName(),a.get(y*8+4).getConsistency(),a.get(y*8+4).getCropCycle(),a.get(y*8+4).getDivision(),a.get(y*8+4).getFamily(),a.get(y*8+4).getFruitType(),a.get(y*8+4).getGenus(),a.get(y*8+4).getOrder(),a.get(y*8+4).getRemarks(),a.get(y*8+4).getSpecieName(),a.get(y*8+4).getSubCategory(),a.get(y*8+4).getSubClass(),a.get(y*8+4).getSubDivision(),a.get(y*8+4).getSubFamily(),a.get(y*8+4).getSuperorder(),a.get(y*8+4).getSynonyms(),selector);
			
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
	panel_2_1_1_4.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			dispose();
			UniqueCrops.main(a.get(y*8+5).getCategory(),a.get(y*8+5).getClase(),a.get(y*8+5).getCommonName(),a.get(y*8+5).getConsistency(),a.get(y*8+5).getCropCycle(),a.get(y*8+5).getDivision(),a.get(y*8+5).getFamily(),a.get(y*8+5).getFruitType(),a.get(y*8+5).getGenus(),a.get(y*8+5).getOrder(),a.get(y*8+5).getRemarks(),a.get(y*8+5).getSpecieName(),a.get(y*8+5).getSubCategory(),a.get(y*8+5).getSubClass(),a.get(y*8+5).getSubDivision(),a.get(y*8+5).getSubFamily(),a.get(y*8+5).getSuperorder(),a.get(y*8+5).getSynonyms(),selector);
			
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
			
		}});
	panel_2_1_1_2.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			dispose();
			UniqueCrops.main(a.get(y*8+6).getCategory(),a.get(y*8+6).getClase(),a.get(y*8+6).getCommonName(),a.get(y*8+6).getConsistency(),a.get(y*8+6).getCropCycle(),a.get(y*8+6).getDivision(),a.get(y*8+6).getFamily(),a.get(y*8+6).getFruitType(),a.get(y*8+6).getGenus(),a.get(y*8+6).getOrder(),a.get(y*8+6).getRemarks(),a.get(y*8+6).getSpecieName(),a.get(y*8+6).getSubCategory(),a.get(y*8+6).getSubClass(),a.get(y*8+6).getSubDivision(),a.get(y*8+6).getSubFamily(),a.get(y*8+6).getSuperorder(),a.get(y*8+6).getSynonyms(),selector);
			
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
			
		}});
	
	panel_2_1_1_5.addMouseListener(new MouseListener() {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			dispose();
			UniqueCrops.main(a.get(y*8+7).getCategory(),a.get(y*8+7).getClase(),a.get(y*8+7).getCommonName(),a.get(y*8+7).getConsistency(),a.get(y*8+7).getCropCycle(),a.get(y*8+7).getDivision(),a.get(y*8+7).getFamily(),a.get(y*8+7).getFruitType(),a.get(y*8+7).getGenus(),a.get(y*8+7).getOrder(),a.get(y*8+7).getRemarks(),a.get(y*8+7).getSpecieName(),a.get(y*8+7).getSubCategory(),a.get(y*8+7).getSubClass(),a.get(y*8+7).getSubDivision(),a.get(y*8+7).getSubFamily(),a.get(y*8+7).getSuperorder(),a.get(y*8+7).getSynonyms(),selector);
			
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
