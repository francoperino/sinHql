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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField txtIdSolicitante;
	private JTextField txtNombreBedel;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JPanel ContentPanelsRegRes;
	private int[] seleccionados =new int[6];
	private static Checkbox ChekBoxLunes = new Checkbox("Lunes");
	private Checkbox ChekBoxMartes = new Checkbox("Martes");
	private Checkbox ChekBoxMiercoles = new Checkbox("Miercoles");
	private Checkbox ChekBoxJueves = new Checkbox("Jueves");
	private Checkbox ChekBoxViernes = new Checkbox("Viernes");
	private Checkbox CheckBoxSabado = new Checkbox("Sabado");
	private int posicion =0;
	
	/**
	 * Create the panel.
	 */
	public RegResPeriodica() {
		seleccionados[0]=0;
		seleccionados[1]=0;
		seleccionados[2]=0;
		seleccionados[3]=0;
		seleccionados[4]=0;
		seleccionados[5]=0;
		
		setLayout(null);
		
		ContentPanelsRegRes = new JPanel();
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
		
		
		ChekBoxLunes.setBackground(SystemColor.inactiveCaptionBorder);
		ChekBoxLunes.setBounds(205, 55, 95, 22);
		panelSeleccion.add(ChekBoxLunes);
		
		
		ChekBoxMartes.setBounds(205, 80, 95, 22);
		panelSeleccion.add(ChekBoxMartes);
		
		
		ChekBoxMiercoles.setBounds(205, 105, 95, 22);
		panelSeleccion.add(ChekBoxMiercoles);
		
		
		ChekBoxJueves.setBounds(205, 130, 95, 22);
		panelSeleccion.add(ChekBoxJueves);
		
		
		ChekBoxViernes.setBounds(205, 155, 95, 22);
		panelSeleccion.add(ChekBoxViernes);
		
		
		CheckBoxSabado.setBounds(205, 180, 95, 22);
		panelSeleccion.add(CheckBoxSabado);
		
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
		
		JComboBox ComBoxDuracionLunes = new JComboBox();
		ComBoxDuracionLunes.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracionLunes.setForeground(Color.BLACK);
		ComBoxDuracionLunes.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracionLunes.setBackground(Color.WHITE);
		ComBoxDuracionLunes.setBounds(498, 55, 76, 20);
		panelSeleccion.add(ComBoxDuracionLunes);
		
		JComboBox ComBoxDuracionMartes = new JComboBox();
		ComBoxDuracionMartes.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracionMartes.setForeground(Color.BLACK);
		ComBoxDuracionMartes.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracionMartes.setBackground(Color.WHITE);
		ComBoxDuracionMartes.setBounds(498, 80, 76, 20);
		panelSeleccion.add(ComBoxDuracionMartes);
		
		JComboBox ComBoxDuracionMiercoles = new JComboBox();
		ComBoxDuracionMiercoles.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracionMiercoles.setForeground(Color.BLACK);
		ComBoxDuracionMiercoles.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracionMiercoles.setBackground(Color.WHITE);
		ComBoxDuracionMiercoles.setBounds(498, 105, 76, 20);
		panelSeleccion.add(ComBoxDuracionMiercoles);
		
		JComboBox ComBoxDuracionJueves = new JComboBox();
		ComBoxDuracionJueves.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracionJueves.setForeground(Color.BLACK);
		ComBoxDuracionJueves.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracionJueves.setBackground(Color.WHITE);
		ComBoxDuracionJueves.setBounds(498, 130, 76, 20);
		panelSeleccion.add(ComBoxDuracionJueves);
		
		JComboBox ComBoxDuracionViernes = new JComboBox();
		ComBoxDuracionViernes.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracionViernes.setForeground(Color.BLACK);
		ComBoxDuracionViernes.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracionViernes.setBackground(Color.WHITE);
		ComBoxDuracionViernes.setBounds(498, 155, 76, 20);
		panelSeleccion.add(ComBoxDuracionViernes);
		
		JComboBox ComBoxDuracionSabado = new JComboBox();
		ComBoxDuracionSabado.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		ComBoxDuracionSabado.setForeground(Color.BLACK);
		ComBoxDuracionSabado.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxDuracionSabado.setBackground(Color.WHITE);
		ComBoxDuracionSabado.setBounds(498, 180, 76, 20);
		panelSeleccion.add(ComBoxDuracionSabado);
		
		JLabel lblTipoDeAula = new JLabel("Tipo de aula");
		lblTipoDeAula.setIconTextGap(10);
		lblTipoDeAula.setForeground(Color.WHITE);
		lblTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeAula.setBounds(205, 209, 95, 20);
		panelSeleccion.add(lblTipoDeAula);
		
		JComboBox ComBoxTipoAula = new JComboBox();
		ComBoxTipoAula.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		ComBoxTipoAula.setMaximumRowCount(4);
		ComBoxTipoAula.setForeground(Color.BLACK);
		ComBoxTipoAula.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComBoxTipoAula.setBackground(Color.WHITE);
		ComBoxTipoAula.setBounds(312, 211, 190, 20);
		panelSeleccion.add(ComBoxTipoAula);
		
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
		
		txtIdSolicitante = new JTextField();
		txtIdSolicitante.setColumns(10);
		txtIdSolicitante.setBounds(321, 307, 70, 20);
		panelSeleccion.add(txtIdSolicitante);
		
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
		panelSeleccion.add(txtNombreBedel);
		
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
		
		JComboBox ComBoxNombreCurso = new JComboBox();
		ComBoxNombreCurso.setMaximumRowCount(4);
		ComBoxNombreCurso.setForeground(Color.BLACK);
		ComBoxNombreCurso.setFont(new Font("Tahoma", Font.BOLD, 14));
		ComBoxNombreCurso.setBackground(Color.WHITE);
		ComBoxNombreCurso.setBounds(312, 240, 190, 20);
		panelSeleccion.add(ComBoxNombreCurso);
		
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
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ChekBoxLunes.getState()) {
					seleccionados[0]=1;
				}
				if(ChekBoxMartes.getState()) {
					seleccionados[1]=1;
				}
				if(ChekBoxMiercoles.getState()) {
					seleccionados[2]=1;
				}
				if(ChekBoxJueves.getState()) {
					seleccionados[3]=1;
				}
				if(ChekBoxViernes.getState()) {
					seleccionados[4]=1;
				}
				if(CheckBoxSabado.getState()) {
					seleccionados[5]=1;
				}
				
				siguienteDia();
				
			}
		});
		btnSiguiente.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_siguiente (1)2.png")));
		btnSiguiente.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_siguiente (1).png")));
		btnSiguiente.setOpaque(false);
		btnSiguiente.setFocusable(false);
		btnSiguiente.setFocusPainted(false);
		btnSiguiente.setContentAreaFilled(false);
		btnSiguiente.setBorderPainted(false);
		btnSiguiente.setBorder(null);
		btnSiguiente.setBounds(387, 338, 132, 40);
		panelSeleccion.add(btnSiguiente);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(48, 144, 90, 40);
		panelSeleccion.add(btnAtras);
		
		JButton btnResetear = new JButton("");
		btnResetear.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_resetear (1)2.png")));
		btnResetear.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_resetear (1).png")));
		btnResetear.setOpaque(false);
		btnResetear.setFocusable(false);
		btnResetear.setFocusPainted(false);
		btnResetear.setContentAreaFilled(false);
		btnResetear.setBorderPainted(false);
		btnResetear.setBorder(null);
		btnResetear.setBounds(22, 200, 128, 40);
		panelSeleccion.add(btnResetear);
		
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
	public void siguienteDia() {
		Boolean bandera = false;
		if(posicion ==0) {
		System.out.println("lunes");
		}
		else {
			int i = posicion+1;
		while(i<=6 && bandera==false) {
			if(seleccionados[i]==1) {
				bandera=true;
				posicion=i;
				switch (i) {
				case 1:
					System.out.println("martes");
					break;
				case 2:
					System.out.println("miercoles");
					break;
				case 3:
					System.out.println("jueves");
					break;
				case 4:
					System.out.println("viernes");
					break;
				case 5:	
					System.out.println("sabado");
					break;
				}
			}
			i++;
			
		}
		if(bandera==false) {
			System.out.println("cambiar boton, por el de aceptar");
		}
	  }
	}
	public void AnteriorDia() {
		Boolean bandera = false;
		if(posicion ==0) {
		System.out.println("mostrar primer pantalla(donde estan checkbox)");
		}
		else {
			int i = posicion-1;
		while(i>=0 && bandera==false) {
			if(seleccionados[i]==1) {
				bandera=true;
				posicion=i;
				switch (i) {
				case 0:
					System.out.println("lunes");
					break;
				case 1:
					System.out.println("martes");
					break;
				case 2:
					System.out.println("miercoles");
					break;
				case 3:
					System.out.println("jueves");
					break;
				case 4:
					System.out.println("viernes");
					break;
				case 5:	
					System.out.println("sabado");
					break;
				}
			}
			i--;
			
		}
		if(bandera==false) {
			System.out.println("muestro el inicio(donde estan lo check)");
		}
	  }
	}
	
	public JPanel getContentPanelsRegRes() {
		return ContentPanelsRegRes;
	}
}
