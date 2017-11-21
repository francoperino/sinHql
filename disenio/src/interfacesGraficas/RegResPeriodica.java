package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Checkbox;
import java.awt.SystemColor;
import java.awt.ComponentOrientation;
import javax.swing.JCheckBox;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class RegResPeriodica extends JPanel {
	private JTextField HoraIniLunes;
	private JTextField HoraFinLunes;
	private JTextField HoraIniMartes;
	private JTextField HoraFinMartes;
	private JTextField HoraIniMiercoles;
	private JTextField HoraFinMiercoles;
	private JTextField HoraIniJueves;
	private JTextField HoraFinJueves;
	private JTextField HoraIniViernes;
	private JTextField HoraFinViernes;
	private JTextField HoraIniSabado;
	private JTextField HoraFinSabado;
	private JTextField txtCantAlumnos;
	private JTextField txtAnual;
	private JTextField textField_1;
	private JTextField textField_5;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtCorreo;

	/**
	 * Create the panel.
	 */
	public RegResPeriodica() {
		setLayout(null);
		
		JPanel ContentPanelsRegRes = new JPanel();
		ContentPanelsRegRes.setBounds(0, 0, 600, 400);
		add(ContentPanelsRegRes);
		ContentPanelsRegRes.setLayout(null);
		
		JPanel panelSeleccion = new JPanel();
		panelSeleccion.setBounds(0, 0, 600, 400);
		ContentPanelsRegRes.add(panelSeleccion);
		panelSeleccion.setLayout(null);
		
		JLabel lblDiasDeLa = new JLabel("Dia/s de la semana");
		lblDiasDeLa.setIconTextGap(10);
		lblDiasDeLa.setForeground(Color.WHITE);
		lblDiasDeLa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDiasDeLa.setBounds(205, 30, 143, 20);
		panelSeleccion.add(lblDiasDeLa);
		
		JLabel lblHoraInicio = new JLabel("Hora inicio");
		lblHoraInicio.setIconTextGap(10);
		lblHoraInicio.setForeground(Color.WHITE);
		lblHoraInicio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHoraInicio.setBounds(375, 30, 86, 20);
		panelSeleccion.add(lblHoraInicio);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setIconTextGap(10);
		lblDuracion.setForeground(Color.WHITE);
		lblDuracion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDuracion.setBounds(500, 30, 86, 20);
		panelSeleccion.add(lblDuracion);
		
		Checkbox ChekBoxLunes = new Checkbox("Lunes");
		ChekBoxLunes.setBackground(SystemColor.inactiveCaptionBorder);
		ChekBoxLunes.setBounds(205, 55, 95, 22);
		panelSeleccion.add(ChekBoxLunes);
		
		Checkbox ChekBoxMartes = new Checkbox("Martes");
		ChekBoxMartes.setBounds(205, 80, 95, 22);
		panelSeleccion.add(ChekBoxMartes);
		
		Checkbox ChekBoxMiercoles = new Checkbox("Miercoles");
		ChekBoxMiercoles.setBounds(205, 105, 95, 22);
		panelSeleccion.add(ChekBoxMiercoles);
		
		Checkbox ChekBoxJueves = new Checkbox("Jueves");
		ChekBoxJueves.setBounds(205, 130, 95, 22);
		panelSeleccion.add(ChekBoxJueves);
		
		Checkbox ChekBoxViernes = new Checkbox("Viernes");
		ChekBoxViernes.setBounds(205, 155, 95, 22);
		panelSeleccion.add(ChekBoxViernes);
		
		Checkbox checkboxSabado = new Checkbox("Sabado");
		checkboxSabado.setBounds(205, 180, 95, 22);
		panelSeleccion.add(checkboxSabado);
		
		HoraIniLunes = new JTextField();
		HoraIniLunes.setBorder(null);
		HoraIniLunes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniLunes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniLunes.setText("00");
		HoraIniLunes.setBounds(385, 55, 30, 20);
		panelSeleccion.add(HoraIniLunes);
		HoraIniLunes.setColumns(10);
		
		HoraFinLunes = new JTextField();
		HoraFinLunes.setBorder(null);
		HoraFinLunes.setText("00");
		HoraFinLunes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinLunes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinLunes.setColumns(10);
		HoraFinLunes.setBounds(419, 55, 30, 20);
		panelSeleccion.add(HoraFinLunes);
		
		HoraIniMartes = new JTextField();
		HoraIniMartes.setBorder(null);
		HoraIniMartes.setText("00");
		HoraIniMartes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniMartes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniMartes.setColumns(10);
		HoraIniMartes.setBounds(385, 80, 30, 20);
		panelSeleccion.add(HoraIniMartes);
		
		HoraFinMartes = new JTextField();
		HoraFinMartes.setBorder(null);
		HoraFinMartes.setText("00");
		HoraFinMartes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinMartes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinMartes.setColumns(10);
		HoraFinMartes.setBounds(419, 80, 30, 20);
		panelSeleccion.add(HoraFinMartes);
		
		HoraIniMiercoles = new JTextField();
		HoraIniMiercoles.setBorder(null);
		HoraIniMiercoles.setText("00");
		HoraIniMiercoles.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniMiercoles.setColumns(10);
		HoraIniMiercoles.setBounds(385, 105, 30, 20);
		panelSeleccion.add(HoraIniMiercoles);
		
		HoraFinMiercoles = new JTextField();
		HoraFinMiercoles.setBorder(null);
		HoraFinMiercoles.setText("00");
		HoraFinMiercoles.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinMiercoles.setColumns(10);
		HoraFinMiercoles.setBounds(419, 105, 30, 20);
		panelSeleccion.add(HoraFinMiercoles);
		
		HoraIniJueves = new JTextField();
		HoraIniJueves.setBorder(null);
		HoraIniJueves.setText("00");
		HoraIniJueves.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniJueves.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniJueves.setColumns(10);
		HoraIniJueves.setBounds(385, 132, 30, 20);
		panelSeleccion.add(HoraIniJueves);
		
		HoraFinJueves = new JTextField();
		HoraFinJueves.setBorder(null);
		HoraFinJueves.setText("00");
		HoraFinJueves.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinJueves.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinJueves.setColumns(10);
		HoraFinJueves.setBounds(419, 132, 30, 20);
		panelSeleccion.add(HoraFinJueves);
		
		HoraIniViernes = new JTextField();
		HoraIniViernes.setBorder(null);
		HoraIniViernes.setText("00");
		HoraIniViernes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniViernes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniViernes.setColumns(10);
		HoraIniViernes.setBounds(385, 157, 30, 20);
		panelSeleccion.add(HoraIniViernes);
		
		HoraFinViernes = new JTextField();
		HoraFinViernes.setText("00");
		HoraFinViernes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinViernes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinViernes.setColumns(10);
		HoraFinViernes.setBounds(419, 157, 30, 20);
		panelSeleccion.add(HoraFinViernes);
		
		HoraIniSabado = new JTextField();
		HoraIniSabado.setText("00");
		HoraIniSabado.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniSabado.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniSabado.setColumns(10);
		HoraIniSabado.setBorder(null);
		HoraIniSabado.setBounds(385, 180, 30, 20);
		panelSeleccion.add(HoraIniSabado);
		
		HoraFinSabado = new JTextField();
		HoraFinSabado.setText("00");
		HoraFinSabado.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinSabado.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinSabado.setColumns(10);
		HoraFinSabado.setBounds(419, 180, 30, 20);
		panelSeleccion.add(HoraFinSabado);
		
		JComboBox ComboxDuraLunes = new JComboBox();
		ComboxDuraLunes.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComboxDuraLunes.setForeground(Color.BLACK);
		ComboxDuraLunes.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComboxDuraLunes.setBackground(Color.WHITE);
		ComboxDuraLunes.setBounds(498, 55, 76, 20);
		panelSeleccion.add(ComboxDuraLunes);
		
		JComboBox ComboxDuraMartes = new JComboBox();
		ComboxDuraMartes.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComboxDuraMartes.setForeground(Color.BLACK);
		ComboxDuraMartes.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComboxDuraMartes.setBackground(Color.WHITE);
		ComboxDuraMartes.setBounds(498, 80, 76, 20);
		panelSeleccion.add(ComboxDuraMartes);
		
		JComboBox ComboxDuraMiercoles = new JComboBox();
		ComboxDuraMiercoles.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComboxDuraMiercoles.setForeground(Color.BLACK);
		ComboxDuraMiercoles.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComboxDuraMiercoles.setBackground(Color.WHITE);
		ComboxDuraMiercoles.setBounds(498, 105, 76, 20);
		panelSeleccion.add(ComboxDuraMiercoles);
		
		JComboBox ComboxDuraJueves = new JComboBox();
		ComboxDuraJueves.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComboxDuraJueves.setForeground(Color.BLACK);
		ComboxDuraJueves.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComboxDuraJueves.setBackground(Color.WHITE);
		ComboxDuraJueves.setBounds(498, 130, 76, 20);
		panelSeleccion.add(ComboxDuraJueves);
		
		JComboBox ComboxDuraViernes = new JComboBox();
		ComboxDuraViernes.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComboxDuraViernes.setForeground(Color.BLACK);
		ComboxDuraViernes.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComboxDuraViernes.setBackground(Color.WHITE);
		ComboxDuraViernes.setBounds(498, 155, 76, 20);
		panelSeleccion.add(ComboxDuraViernes);
		
		JComboBox ComboxDuraSabado = new JComboBox();
		ComboxDuraSabado.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComboxDuraSabado.setForeground(Color.BLACK);
		ComboxDuraSabado.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComboxDuraSabado.setBackground(Color.WHITE);
		ComboxDuraSabado.setBounds(498, 180, 76, 20);
		panelSeleccion.add(ComboxDuraSabado);
		
		JLabel lblTipoDeAula = new JLabel("Tipo de aula");
		lblTipoDeAula.setIconTextGap(10);
		lblTipoDeAula.setForeground(Color.WHITE);
		lblTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeAula.setBounds(205, 209, 95, 20);
		panelSeleccion.add(lblTipoDeAula);
		
		JComboBox ComboxTipoAula = new JComboBox();
		ComboxTipoAula.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		ComboxTipoAula.setMaximumRowCount(4);
		ComboxTipoAula.setForeground(Color.BLACK);
		ComboxTipoAula.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComboxTipoAula.setBackground(Color.WHITE);
		ComboxTipoAula.setBounds(312, 211, 190, 20);
		panelSeleccion.add(ComboxTipoAula);
		
		JLabel lblCantidadDeAlumnos = new JLabel("Cantidad de alumnos:");
		lblCantidadDeAlumnos.setIconTextGap(10);
		lblCantidadDeAlumnos.setForeground(Color.WHITE);
		lblCantidadDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidadDeAlumnos.setBounds(205, 276, 160, 20);
		panelSeleccion.add(lblCantidadDeAlumnos);
		
		txtCantAlumnos = new JTextField();
		txtCantAlumnos.setText("00");
		txtCantAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantAlumnos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCantAlumnos.setColumns(10);
		txtCantAlumnos.setBounds(375, 276, 30, 20);
		panelSeleccion.add(txtCantAlumnos);
		
		txtAnual = new JTextField();
		txtAnual.setText("2\u00B0 cuatrimestre");
		txtAnual.setOpaque(false);
		txtAnual.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnual.setForeground(Color.WHITE);
		txtAnual.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAnual.setEditable(false);
		txtAnual.setColumns(10);
		txtAnual.setBorder(null);
		txtAnual.setBounds(419, 275, 155, 20);
		panelSeleccion.add(txtAnual);
		
		JLabel lblSolicitante = new JLabel("ID solicitante:");
		lblSolicitante.setIconTextGap(10);
		lblSolicitante.setForeground(Color.WHITE);
		lblSolicitante.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSolicitante.setBounds(205, 307, 112, 20);
		panelSeleccion.add(lblSolicitante);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(321, 307, 70, 20);
		panelSeleccion.add(textField_1);
		
		textField_5 = new JTextField();
		textField_5.setText("Bedel");
		textField_5.setOpaque(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBounds(38, 105, 112, 28);
		panelSeleccion.add(textField_5);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setOpaque(false);
		txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellido.setForeground(Color.WHITE);
		txtApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBorder(null);
		txtApellido.setBounds(205, 338, 160, 20);
		panelSeleccion.add(txtApellido);
		
		JLabel lblCurso = new JLabel("Nombre curso");
		lblCurso.setIconTextGap(10);
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurso.setBounds(205, 240, 112, 20);
		panelSeleccion.add(lblCurso);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(4);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(312, 240, 190, 20);
		panelSeleccion.add(comboBox);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setOpaque(false);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		txtNombre.setBounds(205, 369, 160, 20);
		panelSeleccion.add(txtNombre);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Correo");
		txtCorreo.setOpaque(false);
		txtCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorreo.setForeground(Color.WHITE);
		txtCorreo.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtCorreo.setEditable(false);
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(null);
		txtCorreo.setBounds(401, 306, 173, 20);
		panelSeleccion.add(txtCorreo);
		
		JButton btnRegResPer = new JButton("");
		btnRegResPer.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_siguiente (1)2.png")));
		btnRegResPer.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_siguiente (1).png")));
		btnRegResPer.setOpaque(false);
		btnRegResPer.setFocusable(false);
		btnRegResPer.setFocusPainted(false);
		btnRegResPer.setContentAreaFilled(false);
		btnRegResPer.setBorderPainted(false);
		btnRegResPer.setBorder(null);
		btnRegResPer.setBounds(387, 338, 132, 40);
		panelSeleccion.add(btnRegResPer);
		
		JButton button = new JButton("");
		button.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_atras (3)2.png")));
		button.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_atras (3).png")));
		button.setOpaque(false);
		button.setFocusable(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(48, 144, 90, 40);
		panelSeleccion.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_resetear (1)2.png")));
		button_1.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_resetear (1).png")));
		button_1.setOpaque(false);
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(22, 200, 128, 40);
		panelSeleccion.add(button_1);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 602, 401);
		panelSeleccion.add(Fondo);
		Fondo.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/FondoRegBed2.1.png")));
		
		PanelLunes panelLunes = new PanelLunes();
		panelLunes.setBounds(0, 0, 1, 1);
		ContentPanelsRegRes.add(panelLunes);
		
		PanelMartes panelMartes = new PanelMartes();
		panelMartes.setBounds(0, 0, 1, 1);
		ContentPanelsRegRes.add(panelMartes);
		
		PanelMiercoles panelMiercoles = new PanelMiercoles();
		panelMiercoles.setBounds(0, 0, 1, 1);
		ContentPanelsRegRes.add(panelMiercoles);
		
		PanelJueves panelJueves = new PanelJueves();
		panelJueves.setBounds(0, 0, 1, 1);
		ContentPanelsRegRes.add(panelJueves);
		
		PanelViernes panelViernes = new PanelViernes();
		panelViernes.setBounds(0, 0, 1, 1);
		ContentPanelsRegRes.add(panelViernes);
		
		PanelSabado panelSabado = new PanelSabado();
		panelSabado.setBounds(0, 0, 1, 1);
		ContentPanelsRegRes.add(panelSabado);

	}
}
