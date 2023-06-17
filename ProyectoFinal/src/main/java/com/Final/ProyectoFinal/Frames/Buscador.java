package com.Final.ProyectoFinal.Frames;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import org.springframework.beans.factory.annotation.Autowired;

import com.Final.ProyectoFinal.dto.CropsDto;
import com.Final.ProyectoFinal.repository.CropsRepository;
import com.Final.ProyectoFinal.repository.ICropsrepository;
import com.Final.ProyectoFinal.services.CropsServices;


public class Buscador extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private String consistencia="";
	

	private ICropsrepository r;

	/**
	 * Launch the application.
	 */
	
	public static void main(boolean seleccion) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscador frame = new Buscador(seleccion);
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
	 * @throws IOException 
	 */
	public Buscador(boolean selector)  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1433, 778);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 JPanel panel = new JPanel();
		 panel.setBounds(0, 0, 1431, 751);
		 contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(605, 542, 74, 31);
		panel.add(btnNewButton);
		
		
		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setBounds(26, 35, 113, 97);
		lblNewLabel.setIcon(new ImageIcon("C:\\\\Users\\\\Carli\\\\\\\\Workspaces-eclipse\\\\Desarrollo-de interfaces\\\\ProyectoFinal\\\\src\\\\main\\\\resources\\\\Images\\\\Flecha.png"));
		 panel.add(lblNewLabel);
		 
		 
		 lblNewLabel.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				dispose();
				Intro_.main(null);
				
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
		 
		 textField = new JTextField();
		 textField.setBounds(402, 281, 262, 19);
		 panel.add(textField);
		 textField.setColumns(10);
		 
		 textField_1 = new JTextField();
		 textField_1.setColumns(10);
		 textField_1.setBounds(402, 357, 262, 21);
		 panel.add(textField_1);
		 
		 textField_2 = new JTextField();
		 textField_2.setColumns(10);
		 textField_2.setBounds(402, 187, 262, 21);
		 panel.add(textField_2);
		 
		 textField_3 = new JTextField();
		 textField_3.setColumns(10);
		 textField_3.setBounds(861, 187, 262, 21);
		 panel.add(textField_3);
		 
		 textField_4 = new JTextField();
		 textField_4.setColumns(10);
		 textField_4.setBounds(861, 280, 262, 21);
		 panel.add(textField_4);
		 
		 textField_5 = new JTextField();
		 textField_5.setColumns(10);
		 textField_5.setBounds(861, 357, 262, 21);
		 panel.add(textField_5);
		 
		 textField_6 = new JTextField();
		 textField_6.setColumns(10);
		 textField_6.setBounds(402, 436, 262, 21);
		 panel.add(textField_6);
		 
		 JLabel lblNewLabel_1 = new JLabel("Nombre com\u00FAn");
		 lblNewLabel_1.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1.setBounds(268, 190, 96, 13);
		 panel.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_1_1 = new JLabel("Especie");
		 lblNewLabel_1_1.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1_1.setBounds(268, 283, 96, 13);
		 panel.add(lblNewLabel_1_1);
		 
		 JLabel lblNewLabel_1_2 = new JLabel("Categoria");
		 lblNewLabel_1_2.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1_2.setBounds(268, 360, 80, 13);
		 panel.add(lblNewLabel_1_2);
		 
		 JLabel lblNewLabel_1_3 = new JLabel("Subcategoria");
		 lblNewLabel_1_3.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1_3.setBounds(268, 439, 96, 13);
		 panel.add(lblNewLabel_1_3);
		 
		 JLabel lblNewLabel_1_4 = new JLabel("Tipo de fruto");
		 lblNewLabel_1_4.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1_4.setBounds(755, 190, 96, 13);
		 panel.add(lblNewLabel_1_4);
		 
		 JLabel lblNewLabel_1_5 = new JLabel("Familia");
		 lblNewLabel_1_5.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1_5.setBounds(755, 283, 96, 13);
		 panel.add(lblNewLabel_1_5);
		 
		 JLabel lblNewLabel_1_6 = new JLabel("Ciclo de cultivo");
		 lblNewLabel_1_6.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1_6.setBounds(738, 360, 113, 13);
		 panel.add(lblNewLabel_1_6);
		 
		 JLabel lblNewLabel_1_7 = new JLabel("Consistencia");
		 lblNewLabel_1_7.setFont( new Font( "Helvetica", Font.BOLD, 13 ) );
		 lblNewLabel_1_7.setBounds(755, 439, 96, 13);
		 panel.add(lblNewLabel_1_7);
		 
		 JRadioButton rdbtnHierba = new JRadioButton("Herb\u00E1cea");
		 rdbtnHierba.setFont( new Font( "Helvetica", Font.PLAIN, 11 ) );
		 rdbtnHierba.setBounds(880, 435, 103, 21);
		 panel.add(rdbtnHierba);
		 
		 JRadioButton rdbtnLenha = new JRadioButton("Le\u00F1osa");
		 rdbtnLenha.setFont( new Font( "Helvetica", Font.PLAIN, 11 ) );
		 rdbtnLenha.setBounds(1011, 435, 103, 21);
		 panel.add(rdbtnLenha);
		 
		 JButton btnNewButton_1 = new JButton("Borrar");
		 btnNewButton_1.setBounds(738, 542, 96, 31);
		 panel.add(btnNewButton_1);	
		 
		 
		 JButton btnNewButton_2 = new JButton("Fuera");
		 btnNewButton_2.setBounds(1250, 283, 85, 21);
		 panel.add(btnNewButton_2);
		 
		 
		 btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			Intro_.main(null);
			
			}});
		 
	
		 
		 rdbtnHierba.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				consistencia="Herbácea";
				rdbtnLenha.setSelected(false);
			}});
		 
		 rdbtnLenha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				consistencia="Leñosa";
				rdbtnHierba.setSelected(false);
			}
			 
		 });
		 
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//Llamada multicrops
					dispose();
				if(selector) {
					CropsServices cs=new CropsServices();
					//cs.getAllCropsSearch(textField_2.getText(),textField.getText() , textField_1.getText(), textField_6.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(), consistencia);
					CropsDto[] cr=cs.getAllCropsSearch(textField_2.getText(),textField.getText() , textField_1.getText(), textField_6.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(), consistencia);
					
					if(cr.length==0) {
						JOptionPane.showMessageDialog(btnNewButton,"Los terminos no han sido aceptados",  null, 2);
						Buscador.main(selector);
					}else {
						List<CropsDto> a =new ArrayList<CropsDto>();
						for(int i=0;i<cr.length;i++) {
							a.add(cr[i]);
						}
						
						PanelResultados.main(a,textField_2.getText(),textField.getText(),textField_1.getText(),textField_6.getText(),textField_3.getText(),textField_4.getText(), textField_5.getText(),consistencia,selector);
					
					}
				}else if(!selector) {
					CropsRepository cr=new CropsRepository();
					
					List<CropsDto> a =r.findAll();
					PanelResultados.main(a,textField_2.getText(),textField.getText(),textField_1.getText(),textField_6.getText(),textField_3.getText(),textField_4.getText(), textField_5.getText(),consistencia,selector);
					
				}
					
					
					/*CropsServices cs=new CropsServices();
					CropsRepository c=new CropsRepository();
					c.getAllCrops();
					System.out.println(c.getAllCrops().toString()); */
/*LA BUENA
 * 	try {
		cs.getAllCropsSearch(textField_2.getText(),textField.getText() , textField_1.getText(), textField_6.getText(), textField_3.getText(), textField_4.getText(), textField_5.getText(), consistencia);
	} catch (URISyntaxException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}*/
					
				}
			});
			
			btnNewButton_1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					textField.setText("");
					textField_1.setText(""); 
					textField_2.setText("");
					textField_3.setText(""); 
					textField_4.setText(""); 
					textField_5.setText("");
					textField_6.setText("");
					rdbtnHierba.setSelected(false);
					rdbtnLenha.setSelected(false);
				}
				
			});

	}
}
