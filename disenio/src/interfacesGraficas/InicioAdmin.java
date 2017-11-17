package interfacesGraficas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InicioAdmin extends JFrame {

	private JPanel PanelAdmin;
	private JTextField txtAdmin;
	//JPanel Registrarbedel = new JPanel(); //paneles dentro del Frame
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioAdmin frame = new InicioAdmin();
					frame.setVisible(true);
					JPanel RegRes = new JPanel();
					/*frame.getContentPane().add(RegRes);
					frame.Registrarbedel.setBounds(100, 100, 604, 427);*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioAdmin() {
		setResizable(false);
		setTitle("Admin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 432);
		PanelAdmin = new JPanel();
		PanelAdmin.setBackground(Color.DARK_GRAY);
		PanelAdmin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelAdmin);
		PanelAdmin.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(null);
		PanelAdmin.add(panel, "name_135164043419746");
		panel.setLayout(null);
		
		txtAdmin = new JTextField();
		txtAdmin.setBounds(213, 170, 150, 20);
		panel.add(txtAdmin);
		txtAdmin.setBorder(null);
		txtAdmin.setOpaque(false);
		txtAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdmin.setText("Admin\r\n");
		txtAdmin.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtAdmin.setEditable(false);
		txtAdmin.setColumns(10);
		
		RegistrarBedel registrarBedel = new RegistrarBedel();
		PanelAdmin.add(registrarBedel, "name_149023799906942");
		
		JButton btnRegBed = new JButton("");
		btnRegBed.setBounds(63, 220, 190, 40);
		panel.add(btnRegBed);
		btnRegBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registrarBedel.setVisible(true);
				panel.setVisible(false);
			}
		});
		btnRegBed.setFocusPainted(false);
		btnRegBed.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/inicioAdminImgs/button_registrar-bedel2.png")));
		btnRegBed.setBorder(null);
		btnRegBed.setContentAreaFilled(false);
		btnRegBed.setIcon(new ImageIcon(InicioAdmin.class.getResource("/inicioAdminImgs/button_registrar-bedel.png")));
		
		JButton btnBuscarBed = new JButton("");
		btnBuscarBed.setBounds(315, 220, 166, 40);
		panel.add(btnBuscarBed);
		btnBuscarBed.setFocusPainted(false);
		btnBuscarBed.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/inicioAdminImgs/button_buscar-bedel2.png")));
		btnBuscarBed.setIcon(new ImageIcon(InicioAdmin.class.getResource("/inicioAdminImgs/button_buscar-bedel.png")));
		btnBuscarBed.setContentAreaFilled(false);
		btnBuscarBed.setBorderPainted(false);
		btnBuscarBed.setBorder(null);
		
		JButton btnCerrarSesAdm = new JButton("");
		btnCerrarSesAdm.setBounds(415, 11, 173, 40);
		panel.add(btnCerrarSesAdm);
		btnCerrarSesAdm.setFocusPainted(false);
		btnCerrarSesAdm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //cancelar vuelve al inicio sesion
				IniciarSesion.main(null);
				dispose();
			}
		});
		btnCerrarSesAdm.setBorder(null);
		btnCerrarSesAdm.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/inicioAdminImgs/button_cerrar-sesion2.png")));
		btnCerrarSesAdm.setContentAreaFilled(false);
		btnCerrarSesAdm.setIcon(new ImageIcon(InicioAdmin.class.getResource("/inicioAdminImgs/button_cerrar-sesion.png")));
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 600, 398);
		panel.add(Fondo);
		Fondo.setIcon(new ImageIcon(InicioAdmin.class.getResource("/inicioAdminImgs/fondoInicioAdmi.png")));
		
		BuscarBedel buscarBedel = new BuscarBedel();
		buscarBedel.setForeground(Color.DARK_GRAY);
		PanelAdmin.add(buscarBedel, "name_147490125892888");
		
		
		
		
	}

	
}
