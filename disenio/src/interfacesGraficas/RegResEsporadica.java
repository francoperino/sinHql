package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class RegResEsporadica extends JPanel {
	private JTextField txtNombreBedel;
	private JTextField txtHora;
	private JTextField txtMinutos;
	private JTextField txtCantAlumnos;
	private JTextField txtIdSolicitante;
	private JTextField txtCorreoSolicitante;
	private JTextField txtApellidoSolicitante;
	private JTextField txtNombreSolicitante;
	private JTable table;
	private JPanel panelResEsporad;

	/**
	 * Create the panel.
	 */
	public RegResEsporadica() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		panelResEsporad = new JPanel();
		panelResEsporad.setBounds(0, 0, 600, 400);
		add(panelResEsporad);
		panelResEsporad.setLayout(null);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setText("Bedel");
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		txtNombreBedel.setBounds(38, 105, 112, 28);
		panelResEsporad.add(txtNombreBedel);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(48, 144, 82, 36);
		panelResEsporad.add(btnAtras);
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1)2.png")));
		btnSiguiente.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1).png")));
		btnSiguiente.setOpaque(false);
		btnSiguiente.setFocusable(false);
		btnSiguiente.setFocusPainted(false);
		btnSiguiente.setContentAreaFilled(false);
		btnSiguiente.setBorderPainted(false);
		btnSiguiente.setBorder(null);
		btnSiguiente.setBounds(22, 200, 132, 40);
		panelResEsporad.add(btnSiguiente);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setIconTextGap(10);
		lblDia.setForeground(Color.WHITE);
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDia.setBounds(205, 31, 25, 20);
		panelResEsporad.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setIconTextGap(10);
		lblMes.setForeground(Color.WHITE);
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMes.setBounds(259, 31, 30, 20);
		panelResEsporad.add(lblMes);
		
		JLabel label = new JLabel("Hora inicio");
		label.setIconTextGap(10);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(310, 31, 86, 20);
		panelResEsporad.add(label);
		
		txtHora = new JTextField();
		txtHora.setText("00");
		txtHora.setHorizontalAlignment(SwingConstants.CENTER);
		txtHora.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtHora.setColumns(10);
		txtHora.setBorder(null);
		txtHora.setBounds(320, 66, 30, 20);
		panelResEsporad.add(txtHora);
		
		txtMinutos = new JTextField();
		txtMinutos.setText("00");
		txtMinutos.setHorizontalAlignment(SwingConstants.CENTER);
		txtMinutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtMinutos.setColumns(10);
		txtMinutos.setBorder(null);
		txtMinutos.setBounds(354, 66, 30, 20);
		panelResEsporad.add(txtMinutos);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setIconTextGap(10);
		lblDuracion.setForeground(Color.WHITE);
		lblDuracion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDuracion.setBounds(415, 31, 86, 20);
		panelResEsporad.add(lblDuracion);
		
		JComboBox ComBoxDuracion = new JComboBox();
		ComBoxDuracion.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracion.setForeground(Color.BLACK);
		ComBoxDuracion.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracion.setBackground(Color.WHITE);
		ComBoxDuracion.setBounds(415, 66, 76, 20);
		panelResEsporad.add(ComBoxDuracion);
		
		JButton btnAgregar = new JButton("");
		btnAgregar.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_agregar2.png")));
		btnAgregar.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_agregar.png")));
		btnAgregar.setOpaque(false);
		btnAgregar.setFocusable(false);
		btnAgregar.setFocusPainted(false);
		btnAgregar.setContentAreaFilled(false);
		btnAgregar.setBorderPainted(false);
		btnAgregar.setBorder(null);
		btnAgregar.setBounds(499, 30, 86, 31);
		panelResEsporad.add(btnAgregar);
		
		JButton btnQuitar = new JButton("");
		btnQuitar.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_quitar2.png")));
		btnQuitar.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_quitar.png")));
		btnQuitar.setOpaque(false);
		btnQuitar.setFocusable(false);
		btnQuitar.setFocusPainted(false);
		btnQuitar.setContentAreaFilled(false);
		btnQuitar.setBorderPainted(false);
		btnQuitar.setBorder(null);
		btnQuitar.setBounds(499, 73, 86, 31);
		panelResEsporad.add(btnQuitar);
		
		JComboBox ComBoxDia = new JComboBox();
		ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		ComBoxDia.setForeground(Color.BLACK);
		ComBoxDia.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDia.setBackground(Color.WHITE);
		ComBoxDia.setBounds(205, 66, 49, 20);
		panelResEsporad.add(ComBoxDia);
		
		JComboBox ComBoxMes = new JComboBox();
		ComBoxMes.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		ComBoxMes.setForeground(Color.BLACK);
		ComBoxMes.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxMes.setBackground(Color.WHITE);
		ComBoxMes.setBounds(259, 66, 49, 20);
		panelResEsporad.add(ComBoxMes);
		
		JLabel lblCantidadDeAlumnos = new JLabel("Cantidad de alumnos");
		lblCantidadDeAlumnos.setIconTextGap(10);
		lblCantidadDeAlumnos.setForeground(Color.WHITE);
		lblCantidadDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidadDeAlumnos.setBounds(216, 278, 154, 20);
		panelResEsporad.add(lblCantidadDeAlumnos);
		
		txtCantAlumnos = new JTextField();
		txtCantAlumnos.setText("00");
		txtCantAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantAlumnos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCantAlumnos.setColumns(10);
		txtCantAlumnos.setBorder(null);
		txtCantAlumnos.setBounds(380, 280, 30, 20);
		panelResEsporad.add(txtCantAlumnos);
		
		JLabel lblTipoDeAula = new JLabel("Tipo de aula");
		lblTipoDeAula.setIconTextGap(10);
		lblTipoDeAula.setForeground(Color.WHITE);
		lblTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeAula.setBounds(217, 216, 95, 20);
		panelResEsporad.add(lblTipoDeAula);
		
		JComboBox ComBoxTipoDeAula = new JComboBox();
		ComBoxTipoDeAula.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		ComBoxTipoDeAula.setMaximumRowCount(4);
		ComBoxTipoDeAula.setForeground(Color.BLACK);
		ComBoxTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComBoxTipoDeAula.setBackground(Color.WHITE);
		ComBoxTipoDeAula.setBounds(324, 218, 190, 20);
		panelResEsporad.add(ComBoxTipoDeAula);
		
		JLabel lblIdSolicitante = new JLabel("ID solicitante:");
		lblIdSolicitante.setIconTextGap(10);
		lblIdSolicitante.setForeground(Color.WHITE);
		lblIdSolicitante.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIdSolicitante.setBounds(216, 307, 112, 20);
		panelResEsporad.add(lblIdSolicitante);
		
		txtIdSolicitante = new JTextField();
		txtIdSolicitante.setColumns(10);
		txtIdSolicitante.setBounds(332, 307, 70, 20);
		panelResEsporad.add(txtIdSolicitante);
		
		txtCorreoSolicitante = new JTextField();
		txtCorreoSolicitante.setText("Correo");
		txtCorreoSolicitante.setOpaque(false);
		txtCorreoSolicitante.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorreoSolicitante.setForeground(Color.WHITE);
		txtCorreoSolicitante.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtCorreoSolicitante.setEditable(false);
		txtCorreoSolicitante.setColumns(10);
		txtCorreoSolicitante.setBorder(null);
		txtCorreoSolicitante.setBounds(412, 306, 173, 20);
		panelResEsporad.add(txtCorreoSolicitante);
		
		txtApellidoSolicitante = new JTextField();
		txtApellidoSolicitante.setText("Apellido");
		txtApellidoSolicitante.setOpaque(false);
		txtApellidoSolicitante.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellidoSolicitante.setForeground(Color.WHITE);
		txtApellidoSolicitante.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtApellidoSolicitante.setEditable(false);
		txtApellidoSolicitante.setColumns(10);
		txtApellidoSolicitante.setBorder(null);
		txtApellidoSolicitante.setBounds(216, 338, 160, 20);
		panelResEsporad.add(txtApellidoSolicitante);
		
		txtNombreSolicitante = new JTextField();
		txtNombreSolicitante.setText("Nombre");
		txtNombreSolicitante.setOpaque(false);
		txtNombreSolicitante.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreSolicitante.setForeground(Color.WHITE);
		txtNombreSolicitante.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreSolicitante.setEditable(false);
		txtNombreSolicitante.setColumns(10);
		txtNombreSolicitante.setBorder(null);
		txtNombreSolicitante.setBounds(216, 369, 160, 20);
		panelResEsporad.add(txtNombreSolicitante);
		
		JLabel lblNombreCurso = new JLabel("Nombre curso");
		lblNombreCurso.setIconTextGap(10);
		lblNombreCurso.setForeground(Color.WHITE);
		lblNombreCurso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombreCurso.setBounds(216, 247, 112, 20);
		panelResEsporad.add(lblNombreCurso);
		
		JComboBox ComBoxNombreCurso = new JComboBox();
		ComBoxNombreCurso.setMaximumRowCount(4);
		ComBoxNombreCurso.setForeground(Color.BLACK);
		ComBoxNombreCurso.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComBoxNombreCurso.setBackground(Color.WHITE);
		ComBoxNombreCurso.setBounds(323, 247, 190, 20);
		panelResEsporad.add(ComBoxNombreCurso);
		
		JScrollPane tablaDatos = new JScrollPane();
		tablaDatos.setBounds(216, 115, 358, 90);
		panelResEsporad.add(tablaDatos);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Dia", "Mes", "Hora", "Duracion"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		tablaDatos.setViewportView(table);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		panelResEsporad.add(Fondo);

	}

	public JPanel getPanel() {
		return panelResEsporad;
	}
}
