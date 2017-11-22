package interfacesGraficas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Color;

public class InicioBedel extends JFrame {

	private JPanel contentPane;
	private JTextField txtBedel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioBedel frame = new InicioBedel();
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
	public InicioBedel() {
		setResizable(false);
		setTitle("Bedel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLRDiaEsp = new JButton("");
		btnLRDiaEsp.setFocusPainted(false);
		btnLRDiaEsp.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_dia-especifico (1)2.png")));
		btnLRDiaEsp.setBorderPainted(false);
		btnLRDiaEsp.setContentAreaFilled(false);
		btnLRDiaEsp.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_dia-especifico (1).png")));
		btnLRDiaEsp.setBounds(68, 286, 189, 49);
		contentPane.add(btnLRDiaEsp);
		
		JLabel lblKf = new JLabel("Listar Reservas ");
		lblKf.setForeground(Color.WHITE);
		lblKf.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblKf.setBounds(229, 243, 142, 32);
		contentPane.add(lblKf);
		
		JButton btnBuscarAula = new JButton("");
		btnBuscarAula.setFocusPainted(false);
		btnBuscarAula.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_buscar-aula2.png")));
		btnBuscarAula.setBorderPainted(false);
		btnBuscarAula.setContentAreaFilled(false);
		btnBuscarAula.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_buscar-aula.png")));
		btnBuscarAula.setBounds(339, 167, 166, 49);
		contentPane.add(btnBuscarAula);
		
		JButton btnLRCurso = new JButton("");
		btnLRCurso.setFocusPainted(false);
		btnLRCurso.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_curso2.png")));
		btnLRCurso.setBorderPainted(false);
		btnLRCurso.setContentAreaFilled(false);
		btnLRCurso.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_curso.png")));
		btnLRCurso.setBounds(339, 286, 116, 49);
		contentPane.add(btnLRCurso);
		
		JButton btnRegReserva = new JButton("");
		btnRegReserva.setFocusPainted(false);
		btnRegReserva.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_registrar-reserva2.png")));
		btnRegReserva.setBorderPainted(false);
		btnRegReserva.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_registrar-reserva.png")));
		btnRegReserva.setContentAreaFilled(false);
		btnRegReserva.setBounds(38, 167, 219, 49);
		contentPane.add(btnRegReserva);
		
		JButton btnCerrarSesion = new JButton("");
		btnCerrarSesion.setFocusPainted(false);
		btnCerrarSesion.setBorderPainted(false);
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				IniciarSesion.main(null);
				dispose();
			}
		});
		btnCerrarSesion.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_cerrar-sesion2.png")));
		btnCerrarSesion.setContentAreaFilled(false);
		btnCerrarSesion.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_cerrar-sesion.png")));
		btnCerrarSesion.setBounds(381, 11, 205, 49);
		contentPane.add(btnCerrarSesion);
		
		txtBedel = new JTextField();
		txtBedel.setOpaque(false);
		txtBedel.setEditable(false);
		txtBedel.setBorder(null);
		txtBedel.setDisabledTextColor(Color.WHITE);
		txtBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtBedel.setText("Bedel");
		txtBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBedel.setForeground(Color.WHITE);
		txtBedel.setBounds(228, 134, 116, 22);
		contentPane.add(txtBedel);
		txtBedel.setColumns(10);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/Captura de pantalla (47).png")));
		Fondo.setBounds(0, 0, 599, 400);
		contentPane.add(Fondo);
	}
}