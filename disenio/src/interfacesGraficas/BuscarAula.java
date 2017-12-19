package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class BuscarAula extends JPanel {
	private static JTextField txtBedel;
	private JTextField txtNroAula;
	private JTextField txtCapacidad;
	private JTable table;
	private static String nombreUsuario;

	/**
	 * Create the panel.
	 */
	public BuscarAula() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 600, 400);
		add(panel);
		panel.setLayout(null);
		
		txtBedel = new JTextField();
		txtBedel.setEditable(false);
		txtBedel.setForeground(Color.WHITE);
		txtBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtBedel.setBorder(null);
		txtBedel.setOpaque(false);
		txtBedel.setFont(new Font("Tahoma", Font.BOLD, 16));		
		txtBedel.setBounds(10, 107, 156, 27);
		panel.add(txtBedel);
		txtBedel.setColumns(10);
		
		JButton btnInicio = new JButton("");
		btnInicio.setFocusPainted(false);
		btnInicio.setRolloverIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_inicio (2).png")));
		btnInicio.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_inicio.png")));
		btnInicio.setBorderPainted(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBounds(38, 144, 103, 40);
		panel.add(btnInicio);
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InicioBedel.llamarBedel(0);
			}
		});
		
		JButton btnRegBed = new JButton("");
		btnRegBed.setFocusPainted(false);
		btnRegBed.setRolloverIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_registrar-reserva (1)2.png")));
		btnRegBed.setBorderPainted(false);
		btnRegBed.setContentAreaFilled(false);
		btnRegBed.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_registrar-reserva (1).png")));
		btnRegBed.setBounds(10, 195, 161, 49);
		panel.add(btnRegBed);
		btnRegBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RegistrarReserva.verNombre(nombreUsuario);
				InicioBedel.mostrarregreserva();
			}
		});
		
		JLabel lblListarReserva = new JLabel("Listar Reserva");
		lblListarReserva.setForeground(Color.WHITE);
		lblListarReserva.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblListarReserva.setBounds(10, 245, 131, 28);
		panel.add(lblListarReserva);
		
		JButton btnListarReservaCurso = new JButton("");
		btnListarReservaCurso.setFocusPainted(false);
		btnListarReservaCurso.setRolloverIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_curso2.png")));
		btnListarReservaCurso.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_curso.png")));
		btnListarReservaCurso.setContentAreaFilled(false);
		btnListarReservaCurso.setBorderPainted(false);
		btnListarReservaCurso.setBounds(38, 279, 103, 40);
		panel.add(btnListarReservaCurso);
		btnListarReservaCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				ListaResCurso.verNombre(nombreUsuario);
				InicioBedel.mostrarcurso();
			}
		});
		
		JButton btnListarReservaDiaEsp = new JButton("");
		btnListarReservaDiaEsp.setFocusPainted(false);
		btnListarReservaDiaEsp.setRolloverIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_dia-especifico (1)2.png")));
		btnListarReservaDiaEsp.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_dia-especifico (1).png")));
		btnListarReservaDiaEsp.setContentAreaFilled(false);
		btnListarReservaDiaEsp.setBorderPainted(false);
		btnListarReservaDiaEsp.setBounds(5, 327, 181, 49);
		panel.add(btnListarReservaDiaEsp);
		btnListarReservaDiaEsp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				ListaResDiaEsp.verNombre(nombreUsuario);
				InicioBedel.mostrarlistadia();
			}
		});
		
		JLabel lblNroAula = new JLabel("Numero aula");
		lblNroAula.setIconTextGap(10);
		lblNroAula.setForeground(Color.WHITE);
		lblNroAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNroAula.setBounds(205, 30, 123, 20);
		panel.add(lblNroAula);
		
		txtNroAula = new JTextField();
		txtNroAula.setColumns(10);
		txtNroAula.setBounds(348, 30, 60, 20);
		panel.add(txtNroAula);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setIconTextGap(10);
		lblTurno.setForeground(Color.WHITE);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTurno.setBounds(205, 100, 91, 20);
		panel.add(lblTurno);
		
		JComboBox ComBoxTurno = new JComboBox();
		ComBoxTurno.setModel(new DefaultComboBoxModel(new String[] {"Todas", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		ComBoxTurno.setMaximumRowCount(4);
		ComBoxTurno.setForeground(Color.BLACK);
		ComBoxTurno.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComBoxTurno.setBackground(Color.WHITE);
		ComBoxTurno.setBounds(348, 100, 190, 20);
		panel.add(ComBoxTurno);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setIconTextGap(10);
		lblCapacidad.setForeground(Color.WHITE);
		lblCapacidad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCapacidad.setBounds(205, 65, 123, 20);
		panel.add(lblCapacidad);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setText("20");
		txtCapacidad.setColumns(10);
		txtCapacidad.setBounds(348, 65, 28, 20);
		panel.add(txtCapacidad);
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setRolloverIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_buscar2.png")));
		btnBuscar.setFocusPainted(false);
		btnBuscar.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_buscar.png")));
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBounds(418, 30, 117, 40);
		panel.add(btnBuscar);
		
		JScrollPane tablaDatos = new JScrollPane();
		tablaDatos.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		tablaDatos.setBounds(205, 131, 353, 188);
		panel.add(tablaDatos);
		
		table = new JTable();
		tablaDatos.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Numero", "Piso", "        Tipo", "Capacidad", "      Estado"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(48);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(29);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(60);
		
		JButton btnModifAula = new JButton("");
		btnModifAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnModifAula.setRolloverIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarBedelimgs/button_modificar22.png")));
		btnModifAula.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_modificar2.png")));
		btnModifAula.setFocusPainted(false);
		btnModifAula.setContentAreaFilled(false);
		btnModifAula.setBorderPainted(false);
		btnModifAula.setBounds(215, 344, 123, 40);
		panel.add(btnModifAula);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setRolloverIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/button_cancelar.png")));
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBounds(372, 344, 123, 40);
		panel.add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InicioBedel.llamarBedel(4);
			}
		});
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 602, 401);
		Fondo.setIcon(new ImageIcon(BuscarAula.class.getResource("/imagenes/BuscarAula/FondoRegBed2.1.png")));
		panel.add(Fondo);

	}

	public static void verNombre(String cadenaNick) {
		txtBedel.setText(cadenaNick);
		nombreUsuario= cadenaNick;
	}
}
