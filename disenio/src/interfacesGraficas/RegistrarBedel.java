package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.LayoutManager;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import Logica.GestorBedel;

public class RegistrarBedel extends JPanel{
	public void mensaje(String error,String titulo){
        if(JOptionPane.showConfirmDialog(null,
            error, titulo
            , JOptionPane.DEFAULT_OPTION
            , JOptionPane.INFORMATION_MESSAGE)==0);
    }
	private JTextField Admin;
	private JTextField textFApellido;
	private JTextField textFNombre;
	private JTextField textFNickUs;
	private JPasswordField PassfieldC;
	private JPasswordField PassfieldConfirmarC;
	private JPanel ContentPanRegBed;

	/**
	 * Create the panel.
	 */
	public RegistrarBedel() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		ContentPanRegBed = new JPanel();
		ContentPanRegBed.setBackground(Color.DARK_GRAY);
		ContentPanRegBed.setLayout(null);
		ContentPanRegBed.setBorder(new EmptyBorder(5, 5, 5, 5));
		ContentPanRegBed.setBounds(0, 0, 598, 398);
		add(ContentPanRegBed);
		
		Admin = new JTextField();
		Admin.setBounds(34, 107, 106, 27);
		ContentPanRegBed.add(Admin);
		Admin.setFocusable(false);
		Admin.setHorizontalAlignment(SwingConstants.CENTER);
		Admin.setText("Admin");
		Admin.setOpaque(false);
		Admin.setBorder(null);
		Admin.setFont(new Font("Tahoma", Font.BOLD, 16));
		Admin.setEditable(false);
		Admin.setColumns(10);
		
		JButton btnInicAdm = new JButton("");
		btnInicAdm.setBounds(34, 148, 99, 49);
		ContentPanRegBed.add(btnInicAdm);
		btnInicAdm.setFocusPainted(false);
		btnInicAdm.setFocusable(false);
		btnInicAdm.setRolloverIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_inicio (2).png")));
		btnInicAdm.setContentAreaFilled(false);
		btnInicAdm.setBorderPainted(false);
		btnInicAdm.setBorder(null);
		btnInicAdm.setOpaque(false);
		btnInicAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnInicAdm.setIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_inicio.png")));
		
		JButton btnBuscarBed = new JButton("");
		btnBuscarBed.setBounds(10, 208, 167, 49);
		ContentPanRegBed.add(btnBuscarBed);
		btnBuscarBed.setFocusPainted(false);
		btnBuscarBed.setFocusable(false);
		btnBuscarBed.setRolloverIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_buscar-bedel2.png")));
		btnBuscarBed.setBorder(null);
		btnBuscarBed.setBorderPainted(false);
		btnBuscarBed.setContentAreaFilled(false);
		btnBuscarBed.setIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_buscar-bedel.png")));
		
		JLabel lblApellidoBed = new JLabel("Apellido");
		lblApellidoBed.setBounds(217, 30, 71, 20);
		ContentPanRegBed.add(lblApellidoBed);
		lblApellidoBed.setIconTextGap(10);
		lblApellidoBed.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNombreBed = new JLabel("Nombre");
		lblNombreBed.setBounds(217, 80, 91, 20);
		ContentPanRegBed.add(lblNombreBed);
		lblNombreBed.setIconTextGap(10);
		lblNombreBed.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNickUs = new JLabel("Nick de usuario");
		lblNickUs.setBounds(217, 130, 140, 20);
		ContentPanRegBed.add(lblNickUs);
		lblNickUs.setIconTextGap(10);
		lblNickUs.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(217, 180, 106, 20);
		ContentPanRegBed.add(lblContrasea);
		lblContrasea.setIconTextGap(10);
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmarContrasea.setBounds(217, 230, 213, 20);
		ContentPanRegBed.add(lblConfirmarContrasea);
		lblConfirmarContrasea.setIconTextGap(10);
		lblConfirmarContrasea.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(217, 280, 91, 20);
		ContentPanRegBed.add(lblTurno);
		lblTurno.setIconTextGap(10);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JComboBox comboBoxTurno = new JComboBox();
		comboBoxTurno.setBounds(444, 280, 115, 20);
		ContentPanRegBed.add(comboBoxTurno);
		comboBoxTurno.setForeground(Color.BLACK);
		comboBoxTurno.setBackground(Color.WHITE);
		comboBoxTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBoxTurno.setModel(new DefaultComboBoxModel(new String[] {"Noche", "Tarde", "Ma\u00F1ana"}));
		comboBoxTurno.setMaximumRowCount(3);
		
		textFApellido = new JTextField();
		textFApellido.setBounds(444, 30, 115, 20);
		ContentPanRegBed.add(textFApellido);
		textFApellido.setColumns(10);
		
		textFNombre = new JTextField();
		textFNombre.setBounds(444, 80, 115, 20);
		ContentPanRegBed.add(textFNombre);
		textFNombre.setColumns(10);
		
		textFNickUs = new JTextField();
		textFNickUs.setBounds(444, 130, 115, 20);
		ContentPanRegBed.add(textFNickUs);
		textFNickUs.setColumns(10);
		
		PassfieldC = new JPasswordField();
		PassfieldC.setBounds(444, 180, 115, 20);
		ContentPanRegBed.add(PassfieldC);
		
		PassfieldConfirmarC = new JPasswordField();
		PassfieldConfirmarC.setBounds(444, 230, 115, 20);
		ContentPanRegBed.add(PassfieldConfirmarC);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				
			}
		});
		button_1.setBounds(335, 320, 115, 43);
		ContentPanRegBed.add(button_1);
		button_1.setFocusPainted(false);
		button_1.setRolloverIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_cancelar2.png")));
		button_1.setIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_cancelar.png")));
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestorBedel gb = new GestorBedel();
			     String myPass=new String (PassfieldC.getPassword());
			     String miPass= new String (PassfieldConfirmarC.getPassword());
			     String tu = (String) comboBoxTurno.getSelectedItem();
			     String apelido = textFApellido.getText();
			     String nobre = textFNombre.getText();
			     String nick = textFNickUs.getText();
			     if(myPass.equals(miPass)){
			        Integer valor = null;
					try {
						valor = gb.registrarBedel(apelido, nobre ,tu,nick,myPass);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			      switch(valor){
			            case 1:
			                mensaje("Debe contener como minimo un caracter especial","contrase�a invalida");
			                break;
			            case 2:
			                mensaje("Debe contener como minimo un digito","contrase�a invalida");
			                break;
			                
			            case 3:
			                mensaje("Debe contener como minimo una mayuscula","contrase�a invalida");
			                break;
			                
			            case 4:
			                mensaje("La contrase�a debe ser mayor a 6 caracteres y menor que 20","contrase�a invalida");
			                break;
			            case 7:
			                mensaje("Bedel registrado correctamente","Registro exitoso");
			                break;
			            case 100:
			                mensaje("El nick del bedel ya existe","Bedel ya registrado");
			                break;
			            
			        }
			     }
			     else{
			         mensaje("Los dos campos de contrase�a, deben ser iguales","Contrase�as distintas");
			     }
				
				
				 
				
				
				
		        
				
			}
		});
		button.setBounds(217, 320, 115, 43);
		ContentPanRegBed.add(button);
		button.setFocusPainted(false);
		button.setRolloverIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_registrar (1)2.png")));
		button.setIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/button_registrar (1).png")));
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 603, 401);
		ContentPanRegBed.add(Fondo);
		Fondo.setIcon(new ImageIcon(RegistrarBedel.class.getResource("/RegistrarBedelimgs/FondoRegBed2.2.png")));

	}
	public JPanel getPanelRegBed() {
		return ContentPanRegBed;
	}
}
