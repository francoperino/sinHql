package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class PanelLunes extends JPanel {
	private JTextField txtReservaDelDia;
	private JTextField txtMinutos;
	private JTextField txtHora;
	private JTextField txtNombreBedel;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelLunes() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 602, 401);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblReservaDelDia = new JLabel("Reserva del dia:");
		lblReservaDelDia.setBounds(205, 25, 121, 20);
		panel.add(lblReservaDelDia);
		lblReservaDelDia.setIconTextGap(10);
		lblReservaDelDia.setForeground(Color.WHITE);
		lblReservaDelDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtReservaDelDia = new JTextField();
		txtReservaDelDia.setBounds(336, 28, 76, 17);
		panel.add(txtReservaDelDia);
		txtReservaDelDia.setText("Miercoles");
		txtReservaDelDia.setOpaque(false);
		txtReservaDelDia.setHorizontalAlignment(SwingConstants.CENTER);
		txtReservaDelDia.setForeground(Color.WHITE);
		txtReservaDelDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtReservaDelDia.setEditable(false);
		txtReservaDelDia.setColumns(10);
		txtReservaDelDia.setBorder(null);
		
		JLabel lblTipoDeAula = new JLabel("Tipo de aula:");
		lblTipoDeAula.setBounds(205, 57, 121, 20);
		panel.add(lblTipoDeAula);
		lblTipoDeAula.setIconTextGap(10);
		lblTipoDeAula.setForeground(Color.WHITE);
		lblTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox ComBoxTipoDeAula = new JComboBox();
		ComBoxTipoDeAula.setBounds(312, 57, 123, 20);
		panel.add(ComBoxTipoDeAula);
		ComBoxTipoDeAula.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		ComBoxTipoDeAula.setMaximumRowCount(4);
		ComBoxTipoDeAula.setForeground(Color.BLACK);
		ComBoxTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComBoxTipoDeAula.setBackground(Color.WHITE);
		
		JLabel lblHoraInicioYDuracion = new JLabel("Hora inicio/duracion");
		lblHoraInicioYDuracion.setBounds(445, 25, 145, 20);
		panel.add(lblHoraInicioYDuracion);
		lblHoraInicioYDuracion.setIconTextGap(10);
		lblHoraInicioYDuracion.setForeground(Color.WHITE);
		lblHoraInicioYDuracion.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtMinutos = new JTextField();
		txtMinutos.setBounds(479, 57, 30, 20);
		panel.add(txtMinutos);
		txtMinutos.setText("00");
		txtMinutos.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMinutos.setColumns(10);
		txtMinutos.setBorder(null);
		
		txtHora = new JTextField();
		txtHora.setBounds(445, 57, 30, 20);
		panel.add(txtHora);
		txtHora.setText("00");
		txtHora.setHorizontalAlignment(SwingConstants.CENTER);
		txtHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtHora.setColumns(10);
		txtHora.setBorder(null);
		
		JComboBox ComBoxDuracion = new JComboBox();
		ComBoxDuracion.setBounds(514, 56, 76, 20);
		panel.add(ComBoxDuracion);
		ComBoxDuracion.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracion.setForeground(Color.BLACK);
		ComBoxDuracion.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracion.setBackground(Color.WHITE);
		
		JButton btnVolverABuscar = new JButton("");
		btnVolverABuscar.setBounds(445, 88, 132, 31);
		panel.add(btnVolverABuscar);
		btnVolverABuscar.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_volver-a-buscar2.png")));
		btnVolverABuscar.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_volver-a-buscar.png")));
		btnVolverABuscar.setOpaque(false);
		btnVolverABuscar.setFocusable(false);
		btnVolverABuscar.setFocusPainted(false);
		btnVolverABuscar.setContentAreaFilled(false);
		btnVolverABuscar.setBorderPainted(false);
		btnVolverABuscar.setBorder(null);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setBounds(37, 103, 112, 28);
		panel.add(txtNombreBedel);
		txtNombreBedel.setText("Bedel");
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		
		JButton btnLunes = new JButton("");
		btnLunes.setBounds(47, 140, 79, 33);
		panel.add(btnLunes);
		btnLunes.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_lunes (1)2.png")));
		btnLunes.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_lunes (1).png")));
		btnLunes.setOpaque(false);
		btnLunes.setFocusable(false);
		btnLunes.setFocusPainted(false);
		btnLunes.setContentAreaFilled(false);
		btnLunes.setBorderPainted(false);
		btnLunes.setBorder(null);
		
		JButton btnMartes = new JButton("");
		btnMartes.setBounds(47, 180, 89, 33);
		panel.add(btnMartes);
		btnMartes.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_martes2.png")));
		btnMartes.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_martes.png")));
		btnMartes.setOpaque(false);
		btnMartes.setFocusable(false);
		btnMartes.setFocusPainted(false);
		btnMartes.setContentAreaFilled(false);
		btnMartes.setBorderPainted(false);
		btnMartes.setBorder(null);
		
		JButton btnMiercoles = new JButton("");
		btnMiercoles.setBounds(47, 220, 108, 33);
		panel.add(btnMiercoles);
		btnMiercoles.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_miercoles2.png")));
		btnMiercoles.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_miercoles.png")));
		btnMiercoles.setOpaque(false);
		btnMiercoles.setFocusable(false);
		btnMiercoles.setFocusPainted(false);
		btnMiercoles.setContentAreaFilled(false);
		btnMiercoles.setBorderPainted(false);
		btnMiercoles.setBorder(null);
		
		JButton btnJueves = new JButton("");
		btnJueves.setBounds(47, 260, 87, 33);
		panel.add(btnJueves);
		btnJueves.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_jueves2.png")));
		btnJueves.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_jueves.png")));
		btnJueves.setOpaque(false);
		btnJueves.setFocusable(false);
		btnJueves.setFocusPainted(false);
		btnJueves.setContentAreaFilled(false);
		btnJueves.setBorderPainted(false);
		btnJueves.setBorder(null);
		
		JButton btnViernes = new JButton("");
		btnViernes.setBounds(47, 300, 93, 33);
		panel.add(btnViernes);
		btnViernes.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_viernes2.png")));
		btnViernes.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_viernes.png")));
		btnViernes.setOpaque(false);
		btnViernes.setFocusable(false);
		btnViernes.setFocusPainted(false);
		btnViernes.setContentAreaFilled(false);
		btnViernes.setBorderPainted(false);
		btnViernes.setBorder(null);
		
		JButton btnSabado = new JButton("");
		btnSabado.setBounds(47, 340, 89, 33);
		panel.add(btnSabado);
		btnSabado.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_sabado2.png")));
		btnSabado.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_sabado.png")));
		btnSabado.setOpaque(false);
		btnSabado.setFocusable(false);
		btnSabado.setFocusPainted(false);
		btnSabado.setContentAreaFilled(false);
		btnSabado.setBorderPainted(false);
		btnSabado.setBorder(null);
		
		JScrollPane TablaDatos = new JScrollPane();
		TablaDatos.setBounds(205, 140, 352, 176);
		panel.add(TablaDatos);
		
		table = new JTable();
		table.setRowHeight(50);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Num. Aula", "                    Caracteristicas", "Capacidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				true, true, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		TablaDatos.setViewportView(table);
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_siguiente (1)2.png")));
		btnSiguiente.setSelectedIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_siguiente (1)2.png")));
		btnSiguiente.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_siguiente (1).png")));
		btnSiguiente.setOpaque(false);
		btnSiguiente.setFocusable(false);
		btnSiguiente.setFocusPainted(false);
		btnSiguiente.setContentAreaFilled(false);
		btnSiguiente.setBorderPainted(false);
		btnSiguiente.setBorder(null);
		btnSiguiente.setBounds(205, 333, 132, 40);
		panel.add(btnSiguiente);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_atras (3)2.png")));
		btnAtras.setSelectedIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(365, 333, 82, 36);
		panel.add(btnAtras);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 602, 401);
		panel.add(Fondo);
		Fondo.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/FondoRegBed2.1.png")));

	}
}
