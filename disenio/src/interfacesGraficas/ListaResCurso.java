package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ListaResCurso extends JPanel {
	private JTextField txtNombreBedel;

	/**
	 * Create the panel.
	 */
	public ListaResCurso() {
		setLayout(null);
		
		JPanel ContentPanListaResCurso = new JPanel();
		ContentPanListaResCurso.setBounds(0, 0, 600, 400);
		add(ContentPanListaResCurso);
		ContentPanListaResCurso.setLayout(null);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setText("Bedel");
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		txtNombreBedel.setBounds(38, 107, 112, 28);
		ContentPanListaResCurso.add(txtNombreBedel);
		
		JButton btnInicio = new JButton("");
		btnInicio.setRolloverIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_inicio (2).png")));
		btnInicio.setIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_inicio.png")));
		btnInicio.setOpaque(false);
		btnInicio.setFocusable(false);
		btnInicio.setFocusPainted(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setBorder(null);
		btnInicio.setBounds(48, 146, 93, 40);
		ContentPanListaResCurso.add(btnInicio);
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InicioBedel.llamarBedel(0);
			}
		});
		
		JComboBox comBoxCurso = new JComboBox();
		comBoxCurso.setModel(new DefaultComboBoxModel(new String[] {"Curso"}));
		comBoxCurso.setForeground(Color.BLACK);
		comBoxCurso.setFont(new Font("Tahoma", Font.BOLD, 18));
		comBoxCurso.setBackground(Color.WHITE);
		comBoxCurso.setBounds(269, 144, 203, 20);
		ContentPanListaResCurso.add(comBoxCurso);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setRolloverIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_buscar2.png")));
		btnBuscar.setIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_buscar.png")));
		btnBuscar.setOpaque(false);
		btnBuscar.setFocusable(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBorder(null);
		btnBuscar.setBounds(319, 182, 106, 40);
		ContentPanListaResCurso.add(btnBuscar);
		
		JLabel lblListRes = new JLabel("Listar Reserva");
		lblListRes.setForeground(Color.WHITE);
		lblListRes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListRes.setBounds(10, 295, 131, 28);
		ContentPanListaResCurso.add(lblListRes);
		
		JButton btnDiaEsp = new JButton("");
		btnDiaEsp.setRolloverIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_dia-especifico (1)2.png")));
		btnDiaEsp.setIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_dia-especifico (1).png")));
		btnDiaEsp.setFocusPainted(false);
		btnDiaEsp.setContentAreaFilled(false);
		btnDiaEsp.setBorderPainted(false);
		btnDiaEsp.setBounds(5, 330, 177, 49);
		ContentPanListaResCurso.add(btnDiaEsp);
		btnDiaEsp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				InicioBedel.mostrarlistadia();
			}
		});
		
		JButton btnRegRes = new JButton("");
		btnRegRes.setRolloverIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_registrar-reserva (1)2.png")));
		btnRegRes.setIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_registrar-reserva (1).png")));
		btnRegRes.setOpaque(false);
		btnRegRes.setFocusable(false);
		btnRegRes.setFocusPainted(false);
		btnRegRes.setContentAreaFilled(false);
		btnRegRes.setBorderPainted(false);
		btnRegRes.setBorder(null);
		btnRegRes.setBounds(10, 197, 158, 40);
		ContentPanListaResCurso.add(btnRegRes);
		btnRegRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				InicioBedel.mostrarregreserva();
			}
		});
		
		JButton btnBuscarAula = new JButton("");
		btnBuscarAula.setRolloverIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_buscar-aula2.png")));
		btnBuscarAula.setIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/button_buscar-aula.png")));
		btnBuscarAula.setOpaque(false);
		btnBuscarAula.setFocusable(false);
		btnBuscarAula.setFocusPainted(false);
		btnBuscarAula.setContentAreaFilled(false);
		btnBuscarAula.setBorderPainted(false);
		btnBuscarAula.setBorder(null);
		btnBuscarAula.setBounds(10, 247, 158, 40);
		ContentPanListaResCurso.add(btnBuscarAula);
		btnBuscarAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				InicioBedel.mostrarbusaula();
			}
		});
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ListaResCurso.class.getResource("/imagenes/ListaResCurso/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanListaResCurso.add(Fondo);

	}
}
