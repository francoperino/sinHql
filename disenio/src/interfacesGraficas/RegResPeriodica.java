package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.SystemColor;
import java.awt.ComponentOrientation;
import javax.swing.JCheckBox;
import java.awt.List;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.sun.org.apache.bcel.internal.generic.ArrayInstruction;

import Entidades.Ciclolectivo;
import Entidades.ConsultaGenerica;
import Logica.GestorCicloLectivo;
import Logica.GestorReserva;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
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
	private static JTextField txtCantAlumnos;
	private static JTextField txtAnual;
	private static JTextField txtIdSolicitante;
	private static JTextField txtNombreBedel;
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private static JPanel ContentPanelsRegRes;
	private static int[] seleccionados =new int[6];
	private static Checkbox ChekBoxLunes = new Checkbox("Lunes");
	private Checkbox ChekBoxMartes = new Checkbox("Martes");
	private Checkbox ChekBoxMiercoles = new Checkbox("Miercoles");
	private Checkbox ChekBoxJueves = new Checkbox("Jueves");
	private Checkbox ChekBoxViernes = new Checkbox("Viernes");
	private Checkbox CheckBoxSabado = new Checkbox("Sabado");
	private static int posicion =0;
	private static CardLayout cl;
	private static JPanel lunes,martes,miercoles,jueves,viernes,sabado;
	private static Boolean bandera = false,band=false;
	private static Integer contadordias=0,contdiasatras=1000;
	private static boolean btnsig=false,btnat=false,cambiardia=false,bandera7=false;
	private static Integer contadorGlobalDias=0;
	private	static ArrayList<ArrayList<String>> selected= new ArrayList<>();
	private static ArrayList<String> l = new ArrayList<>();
	private static ArrayList<String> m = new ArrayList<>();
	private static ArrayList<String> mi= new ArrayList<>();
	private static ArrayList<String> j = new ArrayList<>();
	private static ArrayList<String> v = new ArrayList<>();
	private static ArrayList<String> s = new ArrayList<>();
	private static ArrayList<String> aulas = new ArrayList<>();
	private static ArrayList<String> fech = new ArrayList<>();
	private static ArrayList<String> hi = new ArrayList<>();
	private static ArrayList<String> dur = new ArrayList<>();
	private static JComboBox ComBoxTipoAula, ComBoxNombreCurso;
	
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
		selected.add(0,l);
		selected.add(1,m);
		selected.add(2,mi);
		selected.add(3,j);
		selected.add(4,v);
		selected.add(5,s);
		
		setLayout(null);
		cl=new CardLayout();
		
		ContentPanelsRegRes = new JPanel();
		ContentPanelsRegRes.setBounds(0, 0, 600, 400);
		add(ContentPanelsRegRes);
		ContentPanelsRegRes.setLayout(cl);
		
		JPanel panelSeleccion = new JPanel();
		panelSeleccion.setBounds(0, 0, 600, 400);
		ContentPanelsRegRes.add("panelSeleccion",panelSeleccion);
		panelSeleccion.setLayout(null);
		
		lunes=new PanelLunes();
		ContentPanelsRegRes.add("lunes",lunes);
		martes=new PanelMartes();
		ContentPanelsRegRes.add("martes",martes);
		miercoles=new PanelMiercoles();
		ContentPanelsRegRes.add("miercoles",miercoles);
		jueves=new PanelJueves();
		ContentPanelsRegRes.add("jueves",jueves);
		viernes=new PanelViernes();
		ContentPanelsRegRes.add("viernes",viernes);
		sabado=new PanelSabado();
		ContentPanelsRegRes.add("sabado",sabado);
		
		
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
		
	    ComBoxTipoAula = new JComboBox();
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
		lblCantidadDeAlumnos.setBounds(205, 307, 160, 20);
		panelSeleccion.add(lblCantidadDeAlumnos);
		
		txtCantAlumnos = new JTextField();
		txtCantAlumnos.setText("00");
		txtCantAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantAlumnos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCantAlumnos.setColumns(10);
		txtCantAlumnos.setBounds(375, 307, 30, 20);
		panelSeleccion.add(txtCantAlumnos);
		
		txtAnual = new JTextField();
		txtAnual.setText("Anual");
		txtAnual.setOpaque(false);
		txtAnual.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnual.setForeground(Color.WHITE);
		txtAnual.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAnual.setEditable(false);
		txtAnual.setColumns(10);
		txtAnual.setBorder(null);
		txtAnual.setBounds(10, 251, 155, 20);
		panelSeleccion.add(txtAnual);
		
		JLabel lblSolicitante = new JLabel("ID solicitante:");
		lblSolicitante.setIconTextGap(10);
		lblSolicitante.setForeground(Color.WHITE);
		lblSolicitante.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSolicitante.setBounds(205, 276, 112, 20);
		panelSeleccion.add(lblSolicitante);
		
		txtIdSolicitante = new JTextField();
		txtIdSolicitante.setColumns(10);
		txtIdSolicitante.setBounds(317, 278, 53, 20);
		panelSeleccion.add(txtIdSolicitante);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setText("Sebastian47");
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
		txtApellido.setFont(new Font("Tahoma", Font.BOLD, 16));
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
		
		ComBoxNombreCurso = new JComboBox();
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
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
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
		txtCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCorreo.setEditable(false);
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(null);
		txtCorreo.setBounds(413, 306, 173, 20);
		panelSeleccion.add(txtCorreo);
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarBedel rg = new RegistrarBedel();
				boolean verif=false;
				if(ChekBoxLunes.getState()) {
					String hor0 = ""+HoraIniLunes.getText()+":"+HoraFinLunes.getText()+":00";
					String dur0 = ""+(String)ComBoxDuracionLunes.getSelectedItem()+":00";
					l.add("-1");
					l.add(hor0);
					//selected.add(0,l);
					l.add(dur0);
					
					seleccionados[0]=1;
					verif=true;
				}
				if(ChekBoxMartes.getState()) {
					String hor1 = ""+HoraIniMartes.getText()+":"+HoraFinMartes.getText()+":00";
					String dur1 = ""+(String)ComBoxDuracionMartes.getSelectedItem()+":00";
					m.add("-1");
					m.add(hor1);
					m.add(dur1);
					//selected.add(1,m);
					seleccionados[1]=1;
					verif=true;
				}
				if(ChekBoxMiercoles.getState()) {
					String hor2 = ""+HoraIniMiercoles.getText()+":"+HoraFinMiercoles.getText()+":00"; 
					String dur2 = ""+(String)ComBoxDuracionMiercoles.getSelectedItem()+":00";
					mi.add("-1");
					mi.add(hor2);
					mi.add(dur2);
					//selected.add(2,mi);
					
					seleccionados[2]=1;
					verif=true;
				}
				if(ChekBoxJueves.getState()) {
					String hor3 = ""+HoraIniJueves.getText()+":"+HoraFinJueves.getText()+":00"; 
					String dur3 = ""+(String)ComBoxDuracionJueves.getSelectedItem()+":00";
					j.add("-1");
					j.add(hor3);
					j.add(dur3);
					//selected.add(3,j);
					
					seleccionados[3]=1;
					verif=true;
				}
				if(ChekBoxViernes.getState()) {
					String hor4 = ""+HoraIniViernes.getText()+":"+HoraFinViernes.getText()+":00";
					String dur4 = ""+(String)ComBoxDuracionViernes.getSelectedItem()+":00";
					v.add("-1");
					v.add(hor4);
					v.add(dur4);
					//selected.add(4,v);
					
					seleccionados[4]=1;
					verif=true;
				}
				if(CheckBoxSabado.getState()) {
					String hor5 = ""+HoraIniSabado.getText()+":"+HoraFinSabado.getText()+":00";
					String dur5 = ""+(String)ComBoxDuracionSabado.getSelectedItem()+":00";
					s.add("-1");
					s.add(hor5);
					s.add(dur5);
					//selected.add(5,s);
					seleccionados[5]=1;
					verif=true;
				}
				contadorGlobalDias=0;
				if(verif==false) {
					rg.mensaje("No ha seleccionado ningun dia","ERROR");
				}
				else {
					siguienteDia();
				}
				
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
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarReserva.regresar();
			}
		});
		
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
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//ContentPanelsRegRes.repaint();
				//this.RegResPeriodica();
				ChekBoxLunes.setState(false);
				ChekBoxMartes.setState(false);
				ChekBoxMiercoles.setState(false);
				ChekBoxJueves.setState(false);
				ChekBoxViernes.setState(false);
				CheckBoxSabado.setState(false);
				ComBoxTipoAula.setSelectedIndex(0);
				txtCantAlumnos.setText("");
				txtIdSolicitante.setText("");
				HoraIniLunes.setText("00");
				HoraIniMartes.setText("00");
				HoraIniMiercoles.setText("00");
				HoraIniJueves.setText("00");
				HoraIniViernes.setText("00");
				HoraIniSabado.setText("00");
				HoraFinLunes.setText("00");
				HoraFinMartes.setText("00");
				HoraFinMiercoles.setText("00");
				HoraFinJueves.setText("00");
				HoraFinViernes.setText("00");
				HoraFinSabado.setText("00");
				ComBoxDuracionLunes.setSelectedIndex(0);
				ComBoxDuracionMartes.setSelectedIndex(0);
				ComBoxDuracionMiercoles.setSelectedIndex(0);
				ComBoxDuracionJueves.setSelectedIndex(0);
				ComBoxDuracionViernes.setSelectedIndex(0);
				ComBoxDuracionSabado.setSelectedIndex(0);
				ContentPanelsRegRes.repaint();
			}
		});
		
		JButton btnCargar = new JButton("");
		btnCargar.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_cargar(4).png")));
		btnCargar.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_cargar.png")));
		btnCargar.setOpaque(false);
		btnCargar.setFocusable(false);
		btnCargar.setFocusPainted(false);
		btnCargar.setContentAreaFilled(false);
		btnCargar.setBorderPainted(false);
		btnCargar.setBorder(null);
		btnCargar.setBounds(375, 276, 68, 26);
		panelSeleccion.add(btnCargar);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 600, 400);
		panelSeleccion.add(Fondo);
		Fondo.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/FondoRegBed2.1.png")));
		
		/*PanelLunes panelLunes = new PanelLunes();
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
		ContentPanelsRegRes.add(panelSabado);*/

	}
	public static void siguienteDia() {
		if(btnat==true && cambiardia==false) {
			posicion+=2;
		}
		btnsig=true;
		btnat=false;
		Boolean bandera2 = false;
		int i=0;
		while(posicion<6 && bandera2==false) {
			bandera=false;
			if(seleccionados[posicion]==1) {
				i=posicion+1;
				while(i<6) {
					if(seleccionados[i]==1) {
						bandera=true;
					}
					i++;
				}
				bandera2=true;
				switch (posicion) {
				case 0:
					lunes.setSize(600,400);
		        	lunes.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"lunes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=0;
		            if(contadorGlobalDias>0) {
		            	((PanelLunes) lunes).prenderAtras();
		            }
		            contadorGlobalDias++;
		            for(int h=0;h<6;h++) {
		            	if(seleccionados[h]==1) {
		            		((PanelLunes) lunes).prenderdia(h);
		            	}
		            }
		            lunes.repaint();
					break;
				case 1:
					martes.setSize(600,400);
		        	martes.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"martes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=1;
		            if(contadorGlobalDias>0) {
		            	((PanelMartes) martes).prenderAtras();
		            }
		            contadorGlobalDias++;
		            for(int h=0;h<6;h++) {
		            	if(seleccionados[h]==1) {
		            		((PanelMartes) martes).prenderdia(h);
		            	}
		            }
		            martes.repaint();
					break;
				case 2:
					miercoles.setSize(600,400);
		        	miercoles.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"miercoles");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=2;
		            if(contadorGlobalDias>0) {
		            	((PanelMiercoles) miercoles).prenderAtras();
		            	//miercoles.repaint();
		            }
		            contadorGlobalDias++;
		            for(int h=0;h<6;h++) {
		            	if(seleccionados[h]==1) {
		            		((PanelMiercoles) miercoles).prenderdia(h);
		            	}
		            }
		            miercoles.repaint();
					break;
				case 3:
					jueves.setSize(600,400);
		        	jueves.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"jueves");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=3;
		            if(contadorGlobalDias>0) {
		            	((PanelJueves) jueves).prenderAtras();
		            	//jueves.repaint();
		            }
		            contadorGlobalDias++;
		            for(int h=0;h<6;h++) {
		            	if(seleccionados[h]==1) {
		            		((PanelJueves) jueves).prenderdia(h);
		            	}
		            }
		            jueves.repaint();
					break;
				case 4:
					viernes.setSize(600,400);
		        	viernes.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"viernes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=4;
		            if(contadorGlobalDias>0) {
		            	((PanelViernes) viernes).prenderAtras();
		            	//viernes.repaint();
		            }
		            contadorGlobalDias++;
		            for(int h=0;h<6;h++) {
		            	if(seleccionados[h]==1) {
		            		((PanelViernes) viernes).prenderdia(h);
		            	}
		            }
		            viernes.repaint();
					break;
				case 5:	
					sabado.setSize(600,400);
		        	sabado.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"sabado");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=5;
		            if(contadorGlobalDias>0) {
		            	((PanelSabado) sabado).prenderAtras();
		            	//sabado.repaint();
		            }
		            contadorGlobalDias++;
		            for(int h=0;h<6;h++) {
		            	if(seleccionados[h]==1) {
		            		((PanelSabado) sabado).prenderdia(h);
		            	}
		            }
		            sabado.repaint();
					break;
				}
				
			}
			//System.out.println(posicion);
			posicion++;
			
		}
		if(bandera==false) {
			bandera7=true;
			//System.out.println(posicion);
			switch(contadordias) {
			case 0:
				((PanelLunes) lunes).setboton();
				break;
			case 1:
				((PanelMartes) martes).setboton();
				break;
			case 2:
				((PanelMiercoles) miercoles).setboton();
				break;
			case 3:
				((PanelJueves) jueves).setboton();
				break;
			case 4:
				((PanelViernes) viernes).setboton();
				break;
			case 5:
				((PanelSabado) sabado).setboton();
				break;
			}
			
			
		}
	}
	public static void AnteriorDia() {
		//System.out.println(posicion);
		if(btnsig==true && cambiardia==false) {
			posicion-=2;
		}
		/*else {
			posicion-=1;
		}*/
		btnsig=false;
		btnat=true;
		//posicion-=1;
		//System.out.println(posicion);
		Boolean bandera2 = false;
		int i=0;
		while(posicion>=0 && bandera2==false) {
			band=false;
			if(seleccionados[posicion]==1) {
				i=posicion-1;
				while(i>=0) {
					if(seleccionados[i]==1) {
						band=true;
					}
					i--;
				}
				bandera2=true;
				switch (posicion) {
				case 0:
					lunes.setSize(600,400);
		        	lunes.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"lunes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=0;
					break;
				case 1:
					martes.setSize(600,400);
		        	martes.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"martes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=1;
					break;
				case 2:
					miercoles.setSize(600,400);
		        	miercoles.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"miercoles");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=2;
					break;
				case 3:
					jueves.setSize(600,400);
		        	jueves.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"jueves");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=3;
					break;
				case 4:
					viernes.setSize(600,400);
		        	viernes.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"viernes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=4;
					break;
				case 5:	
					sabado.setSize(600,400);
		        	sabado.setLocation(0,0);
		            cl.show(ContentPanelsRegRes,"sabado");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=5;
					break;
				}
			}
			posicion--;
			
		}
		/*if(band==false) {
			System.out.println("muestro el inicio(donde estan lo check)");
		}*/
		//System.out.println(posicion);
	}
	
	public JPanel getContentPanelsRegRes() {
		return ContentPanelsRegRes;
	}
	public static void avanzar() throws Exception {
		if(bandera7) {
			GestorReserva gr = new GestorReserva();
			Ciclolectivo cic = new Ciclolectivo();
			GestorCicloLectivo gcl = new GestorCicloLectivo();
			cic = gcl.obtenerCicloLectivo();
			ArrayList<String> la1 ;
			ArrayList<String> la2 ;
			ArrayList<String> la3 ;
			ArrayList<String> la4 ;
			ArrayList<String> la5 ;
			ArrayList<String> la6 ;
			
			for(int j=0;j<seleccionados.length;j++) {
				if(seleccionados[j]==1) {
			switch (j) {
			 case  0:
				 la1 = gr.obtenerArrayFechas("Lunes",txtAnual.getText(),cic);
				 for(int a = 0;a<la1.size();a++) {
					 if(selected.get(0).size()!=0) {
				      	 fech.add(la1.get(a));
				      	 aulas.add(selected.get(0).get(0));
				      	 hi.add(selected.get(0).get(1));
				      	 dur.add(selected.get(0).get(2));
				 }
				 }
				 
				 break;
			 case  1:
				 la2 = gr.obtenerArrayFechas("Martes",txtAnual.getText(),cic);
				 for(int a = 0;a<la2.size();a++) {
					 if(selected.get(1).size()!=0) {
			      	 fech.add(la2.get(a));
			      	 aulas.add(selected.get(1).get(0));
			      	 hi.add(selected.get(1).get(1));
			      	 dur.add(selected.get(1).get(2));
					 }
			 }
				 break;
			 case  2:
				 la3 = gr.obtenerArrayFechas("Miercoles",txtAnual.getText(),cic);
				 for(int a = 0;a<la3.size();a++) {
					 if(selected.get(2).size()!=0) {
			      	 fech.add(la3.get(a));
			      	 aulas.add(selected.get(2).get(0));
			      	 hi.add(selected.get(2).get(1));
			      	 dur.add(selected.get(2).get(2));
					 }
			 }
				 break;
			 case  3:
				 la4 = gr.obtenerArrayFechas("Jueves",txtAnual.getText(),cic);
				 for(int a = 0;a<la4.size();a++) {
					 if(selected.get(3).size()!=0) {
			      	 fech.add(la4.get(a));
			      	 aulas.add(selected.get(3).get(0));
			      	 hi.add(selected.get(3).get(1));
			      	 dur.add(selected.get(3).get(2));
					 }
			 }
				 break;
			 case  4:
				 la5 =gr.obtenerArrayFechas("Viernes",txtAnual.getText(),cic);
				 for(int a = 0;a<la5.size();a++) {
					 if(selected.get(4).size()!=0) {
			      	 fech.add(la5.get(a));
			      	 aulas.add(selected.get(4).get(0));
			      	 hi.add(selected.get(4).get(1));
			      	 dur.add(selected.get(4).get(2));
					 }
			 }
				 break;
			 case  5:
				 la6 = gr.obtenerArrayFechas("Sabado",txtAnual.getText(),cic);
				 for(int a = 0;a<la6.size();a++) {
					 if(selected.get(5).size()!=0) {
			      	 fech.add(la6.get(a));
			      	 aulas.add(selected.get(5).get(0));
			      	 hi.add(selected.get(5).get(1));
			      	 dur.add(selected.get(5).get(2));
					 }
			 }
				 break;
				 
			
			}
		
			try {
				gr.registrarReserva(Integer.parseInt(txtCantAlumnos.getText()),(String) ComBoxTipoAula.getSelectedItem(),(String)ComBoxNombreCurso.getSelectedItem(), fech, aulas, hi, dur,txtIdSolicitante.getText(),txtNombreBedel.getText());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}
	        
		}else {
			cambiardia=false;
			siguienteDia();
		}
		
		
	}
	public static void atras() {
		cambiardia=false;
		AnteriorDia();
		
	}
	public static void cambiarDeDia(int dia) {
		cambiardia=true;
		posicion=dia;
		siguienteDia();
		
	}
	public static void seteoVector(String aula, String dia) {
	   
		switch (dia){
		case "l":
			l.remove(0);
			l.add(0,aula);
			break;
		case "m":
			m.remove(0);
			m.add(0,aula);
			break;
		case "mi":
			mi.remove(0);
			mi.add(0,aula);
			break;
		case "j":
			j.remove(0);
			j.add(0,aula);
			break;
		case "v":
			v.remove(0);
			v.add(0,aula);
			break;
		case "s":
			s.remove(0);
			s.add(0,aula);
			break;
			
		}
	}
	  public void seteo(ArrayList<ConsultaGenerica> cursos) {
	        for(int i=0; i<cursos.size();i++) {
	            ComBoxNombreCurso.addItem(cursos.get(i).getValor("nombrecurso").toString());
	            
	        }
	  }
}
