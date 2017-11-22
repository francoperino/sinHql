package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InicioAdmin extends JFrame {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JPanel PanelAdmin = new JPanel();
	private JTextField txtAdmin;
	static JPanel panel1Admin = new JPanel();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioAdmin frame = new InicioAdmin();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("Admin");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setBounds(100, 100, 616, 432);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public  InicioAdmin() {
		
		
		
		PanelAdmin.repaint();
		PanelAdmin.setBackground(Color.DARK_GRAY);
		PanelAdmin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelAdmin);
		PanelAdmin.setLayout(new CardLayout(0, 0));
		
		
		panel1Admin.setBackground(Color.DARK_GRAY);
		panel1Admin.setBorder(null);
		PanelAdmin.add(panel1Admin, "name_135164043419746");
		panel1Admin.setLayout(null);
		
		txtAdmin = new JTextField();
		txtAdmin.setForeground(Color.WHITE);
		txtAdmin.setBounds(213, 162, 150, 28);
		panel1Admin.add(txtAdmin);
		txtAdmin.setBorder(null);
		txtAdmin.setOpaque(false);
		txtAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdmin.setText("Admin\r\n");
		txtAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAdmin.setEditable(false);
		txtAdmin.setColumns(10);
		//con esto se mostraba antes, probando nuevo metodo
		RegistrarBedel registrarBedel = new RegistrarBedel();
		PanelAdmin.add(registrarBedel, "name_149023799906942");
		
		BuscarBedel buscarBedel = new BuscarBedel();
		buscarBedel.setForeground(Color.DARK_GRAY);
		PanelAdmin.add(buscarBedel, "name_147490125892888");
		
		JButton btnRegBed = new JButton("");
		btnRegBed.setBounds(63, 220, 190, 40);
		panel1Admin.add(btnRegBed);
		btnRegBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	//VA A INTERFAZ REGISTRAR BEDEL
				registrarBedel.setVisible(true);
				panel1Admin.setVisible(false);
				/*RegistrarBedel RegBed = new RegistrarBedel();
				RegBed.setSize(600,400);
				RegBed.setLocation(0,0);
				
				//PanelAdmin.removeAll();
				PanelAdmin.add(RegBed, BorderLayout.CENTER);
				PanelAdmin.revalidate();
				PanelAdmin.repaint();*/
			}
		});
		btnRegBed.setFocusPainted(false);
		btnRegBed.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_registrar-bedel2.png")));
		btnRegBed.setBorder(null);
		btnRegBed.setContentAreaFilled(false);
		btnRegBed.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_registrar-bedel.png")));
		
		JButton btnBuscarBed = new JButton("");
		btnBuscarBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	//VA A INTERFAZ BUSCAR BEDEL
				/*buscarBedel.setVisible(true);
				panel.setVisible(false);*/
				BuscarBedel BuscBed = new BuscarBedel();
				BuscBed.setSize(600,400);
				BuscBed.setLocation(0,0);
				
				PanelAdmin.removeAll();
				PanelAdmin.add(BuscBed, BorderLayout.CENTER);
				PanelAdmin.revalidate();
				PanelAdmin.repaint();
			}
		});
		btnBuscarBed.setBounds(315, 220, 166, 40);
		panel1Admin.add(btnBuscarBed);
		btnBuscarBed.setFocusPainted(false);
		btnBuscarBed.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_buscar-bedel2.png")));
		btnBuscarBed.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_buscar-bedel.png")));
		btnBuscarBed.setContentAreaFilled(false);
		btnBuscarBed.setBorderPainted(false);
		btnBuscarBed.setBorder(null);
		
		JButton btnCerrarSesAdm = new JButton("");
		btnCerrarSesAdm.setBounds(415, 11, 173, 40);
		panel1Admin.add(btnCerrarSesAdm);
		btnCerrarSesAdm.setFocusPainted(false);
		btnCerrarSesAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //cancelar vuelve al inicio sesion
				IniciarSesion.main(null);
				dispose();
			}
		});
		btnCerrarSesAdm.setBorder(null);
		btnCerrarSesAdm.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_cerrar-sesion2.png")));
		btnCerrarSesAdm.setContentAreaFilled(false);
		btnCerrarSesAdm.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_cerrar-sesion.png")));
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 600, 398);
		panel1Admin.add(Fondo);
		Fondo.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/fondoInicioAdmi.png")));
		
	
				
		
	}
public static void  llamarAdmin() {
     PanelAdmin.removeAll();
	 PanelAdmin.add(panel1Admin,BorderLayout.CENTER);
	 PanelAdmin.revalidate();
	 PanelAdmin.repaint();
	}
	
}
