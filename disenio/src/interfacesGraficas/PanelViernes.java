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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelViernes extends JPanel {
	private JTextField txtReservaDelDia;
	private JTextField txtMinutos;
	private JTextField txtHora;
	private JTextField txtNombreBedel;
	private JTable table;
	private static JButton btnSiguiente;

	/**
	 * Create the panel.
	 */
	public PanelViernes() {
		setLayout(null);
		
		JLabel lblReservaDelDia = new JLabel("Reserva del dia:");
		lblReservaDelDia.setIconTextGap(10);
		lblReservaDelDia.setForeground(Color.WHITE);
		lblReservaDelDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblReservaDelDia.setBounds(205, 25, 121, 20);
		add(lblReservaDelDia);
		
		txtReservaDelDia = new JTextField();
		txtReservaDelDia.setText("Miercoles");
		txtReservaDelDia.setOpaque(false);
		txtReservaDelDia.setHorizontalAlignment(SwingConstants.CENTER);
		txtReservaDelDia.setForeground(Color.WHITE);
		txtReservaDelDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtReservaDelDia.setEditable(false);
		txtReservaDelDia.setColumns(10);
		txtReservaDelDia.setBorder(null);
		txtReservaDelDia.setBounds(336, 28, 76, 17);
		add(txtReservaDelDia);
		
		JLabel lblTipoDeAula = new JLabel("Tipo de aula:");
		lblTipoDeAula.setIconTextGap(10);
		lblTipoDeAula.setForeground(Color.WHITE);
		lblTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeAula.setBounds(205, 57, 121, 20);
		add(lblTipoDeAula);
		
		JComboBox ComBoxTipoDeAula = new JComboBox();
		ComBoxTipoDeAula.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		ComBoxTipoDeAula.setMaximumRowCount(4);
		ComBoxTipoDeAula.setForeground(Color.BLACK);
		ComBoxTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComBoxTipoDeAula.setBackground(Color.WHITE);
		ComBoxTipoDeAula.setBounds(312, 57, 123, 20);
		add(ComBoxTipoDeAula);
		
		JLabel lblHoraInicioYDuracion = new JLabel("Hora inicio/duracion");
		lblHoraInicioYDuracion.setIconTextGap(10);
		lblHoraInicioYDuracion.setForeground(Color.WHITE);
		lblHoraInicioYDuracion.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHoraInicioYDuracion.setBounds(445, 25, 145, 20);
		add(lblHoraInicioYDuracion);
		
		txtMinutos = new JTextField();
		txtMinutos.setText("00");
		txtMinutos.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMinutos.setColumns(10);
		txtMinutos.setBorder(null);
		txtMinutos.setBounds(479, 57, 30, 20);
		add(txtMinutos);
		
		txtHora = new JTextField();
		txtHora.setText("00");
		txtHora.setHorizontalAlignment(SwingConstants.CENTER);
		txtHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtHora.setColumns(10);
		txtHora.setBorder(null);
		txtHora.setBounds(445, 57, 30, 20);
		add(txtHora);
		
		JComboBox ComBoxDuracion = new JComboBox();
		ComBoxDuracion.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracion.setForeground(Color.BLACK);
		ComBoxDuracion.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracion.setBackground(Color.WHITE);
		ComBoxDuracion.setBounds(514, 56, 76, 20);
		add(ComBoxDuracion);
		
		JButton btnVolverABuscar = new JButton("");
		btnVolverABuscar.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_volver-a-buscar2.png")));
		btnVolverABuscar.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_volver-a-buscar.png")));
		btnVolverABuscar.setOpaque(false);
		btnVolverABuscar.setFocusable(false);
		btnVolverABuscar.setFocusPainted(false);
		btnVolverABuscar.setContentAreaFilled(false);
		btnVolverABuscar.setBorderPainted(false);
		btnVolverABuscar.setBorder(null);
		btnVolverABuscar.setBounds(445, 88, 132, 31);
		add(btnVolverABuscar);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setText("Bedel");
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		txtNombreBedel.setBounds(37, 103, 112, 28);
		add(txtNombreBedel);
		
		JButton btnLunes = new JButton("");
		btnLunes.setEnabled(false);
		btnLunes.setRolloverIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_lunes2.png")));
		btnLunes.setIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_lunes.png")));
		btnLunes.setOpaque(false);
		btnLunes.setFocusable(false);
		btnLunes.setFocusPainted(false);
		btnLunes.setContentAreaFilled(false);
		btnLunes.setBorderPainted(false);
		btnLunes.setBorder(null);
		btnLunes.setBounds(47, 140, 79, 33);
		add(btnLunes);
		
		JButton btnMartes = new JButton("");
		btnMartes.setEnabled(false);
		btnMartes.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_martes2.png")));
		btnMartes.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_martes.png")));
		btnMartes.setOpaque(false);
		btnMartes.setFocusable(false);
		btnMartes.setFocusPainted(false);
		btnMartes.setContentAreaFilled(false);
		btnMartes.setBorderPainted(false);
		btnMartes.setBorder(null);
		btnMartes.setBounds(47, 180, 89, 33);
		add(btnMartes);
		
		JButton btnMiercoles = new JButton("");
		btnMiercoles.setEnabled(false);
		btnMiercoles.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_miercoles2.png")));
		btnMiercoles.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_miercoles.png")));
		btnMiercoles.setOpaque(false);
		btnMiercoles.setFocusable(false);
		btnMiercoles.setFocusPainted(false);
		btnMiercoles.setContentAreaFilled(false);
		btnMiercoles.setBorderPainted(false);
		btnMiercoles.setBorder(null);
		btnMiercoles.setBounds(47, 220, 108, 33);
		add(btnMiercoles);
		
		JButton btnJueves = new JButton("");
		btnJueves.setEnabled(false);
		btnJueves.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_jueves2.png")));
		btnJueves.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_jueves.png")));
		btnJueves.setOpaque(false);
		btnJueves.setFocusable(false);
		btnJueves.setFocusPainted(false);
		btnJueves.setContentAreaFilled(false);
		btnJueves.setBorderPainted(false);
		btnJueves.setBorder(null);
		btnJueves.setBounds(47, 260, 87, 33);
		add(btnJueves);
		
		JButton btnViernes = new JButton("");
		btnViernes.setRolloverIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_viernes (1)2.png")));
		btnViernes.setIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_viernes (1).png")));
		btnViernes.setOpaque(false);
		btnViernes.setFocusable(false);
		btnViernes.setFocusPainted(false);
		btnViernes.setContentAreaFilled(false);
		btnViernes.setBorderPainted(false);
		btnViernes.setBorder(null);
		btnViernes.setBounds(47, 300, 93, 33);
		add(btnViernes);
		
		JButton btnSabado = new JButton("");
		btnSabado.setEnabled(false);
		btnSabado.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_sabado2.png")));
		btnSabado.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_sabado.png")));
		btnSabado.setOpaque(false);
		btnSabado.setFocusable(false);
		btnSabado.setFocusPainted(false);
		btnSabado.setContentAreaFilled(false);
		btnSabado.setBorderPainted(false);
		btnSabado.setBorder(null);
		btnSabado.setBounds(47, 340, 89, 33);
		add(btnSabado);
		
		JScrollPane TablaDatos = new JScrollPane();
		TablaDatos.setBounds(205, 140, 352, 176);
		add(TablaDatos);
		
		table = new JTable();
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
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.setRowHeight(50);
		TablaDatos.setViewportView(table);
		
		btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegResPeriodica.avanzar();
			}
		});
		btnSiguiente.setRolloverIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_siguiente (1)2.png")));
		btnSiguiente.setIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_siguiente (1).png")));
		btnSiguiente.setOpaque(false);
		btnSiguiente.setFocusable(false);
		btnSiguiente.setFocusPainted(false);
		btnSiguiente.setContentAreaFilled(false);
		btnSiguiente.setBorderPainted(false);
		btnSiguiente.setBorder(null);
		btnSiguiente.setBounds(205, 333, 132, 40);
		add(btnSiguiente);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(365, 333, 82, 36);
		add(btnAtras);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		add(Fondo);

	}
	public void setboton() {
		btnSiguiente.setRolloverIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_registrar (1)2.png")));
		btnSiguiente.setIcon(new ImageIcon(PanelViernes.class.getResource("/imagenes/PanelesRegReserva/button_registrar (1).png")));
		repaint();
	}

}