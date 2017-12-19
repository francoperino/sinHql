package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import Logica.GestorDocente;
import Logica.GestorReserva;
import javafx.scene.control.ComboBox;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegResPeriodica extends JPanel {
	public static void mensaje(String error,String titulo){
        if(JOptionPane.showConfirmDialog(null,
            error, titulo
            , JOptionPane.DEFAULT_OPTION
            , JOptionPane.INFORMATION_MESSAGE)==0);
    }
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
	private static JTextField txtTipoPeriodo;
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
	private static ArrayList<ArrayList<ConsultaGenerica>> arreg=null;
	private static String tipoAula;
	private static ArrayList<String> horainit;
	private static ArrayList<String> duracioninit;
	private String periodoelec;
	private static boolean lunesselec=false,martesselec=false,miercolesselec=false,juevesselec=false,viernesselec=false,sabadoselec=false;
	private static Integer contadorseleccion=0,contadorcheckbox=0;
	private static boolean cls=false,cm=false,cmi=false,cj=false,cv=false,cs=false;
	private static JPanel panelSeleccion;
	private static String nombreUsuario;
	/**
	 * Create the panel.
	 */
	public RegResPeriodica() {
		horainit= new ArrayList<>();
		duracioninit =new ArrayList<>();
		horainit.add(0, "");
		horainit.add(1, "");
		horainit.add(2, "");
		horainit.add(3, "");
		horainit.add(4, "");
		horainit.add(5, "");
		
		duracioninit.add(0, "");
		duracioninit.add(1, "");
		duracioninit.add(2, "");
		duracioninit.add(3, "");
		duracioninit.add(4, "");
		duracioninit.add(5, "");
		
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
		
		panelSeleccion = new JPanel();
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
		HoraIniLunes.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraIniLunes.getSelectedText() != null) {
                    if (HoraIniLunes.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraIniLunes.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraIniLunes.setBorder(null);
		HoraIniLunes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniLunes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniLunes.setText("00");
		HoraIniLunes.setBounds(385, 55, 30, 20);
		panelSeleccion.add(HoraIniLunes);
		HoraIniLunes.setColumns(10);
		
		HoraFinLunes = new JTextField();
		HoraFinLunes.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraFinLunes.getSelectedText() != null) {
                    if (HoraFinLunes.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraFinLunes.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraFinLunes.setBorder(null);
		HoraFinLunes.setText("00");
		HoraFinLunes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinLunes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinLunes.setColumns(10);
		HoraFinLunes.setBounds(419, 55, 30, 20);
		panelSeleccion.add(HoraFinLunes);
		
		HoraIniMartes = new JTextField();
		HoraIniMartes.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraIniMartes.getSelectedText() != null) {
                    if (HoraIniMartes.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraIniMartes.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraIniMartes.setBorder(null);
		HoraIniMartes.setText("00");
		HoraIniMartes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniMartes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniMartes.setColumns(10);
		HoraIniMartes.setBounds(385, 80, 30, 20);
		panelSeleccion.add(HoraIniMartes);
		
		HoraFinMartes = new JTextField();
		HoraFinMartes.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraFinMartes.getSelectedText() != null) {
                    if (HoraFinMartes.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraFinMartes.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraFinMartes.setBorder(null);
		HoraFinMartes.setText("00");
		HoraFinMartes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinMartes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinMartes.setColumns(10);
		HoraFinMartes.setBounds(419, 80, 30, 20);
		panelSeleccion.add(HoraFinMartes);
		
		HoraIniMiercoles = new JTextField();
		HoraIniMiercoles.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraIniMiercoles.getSelectedText() != null) {
                    if (HoraIniMiercoles.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraIniMiercoles.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraIniMiercoles.setBorder(null);
		HoraIniMiercoles.setText("00");
		HoraIniMiercoles.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniMiercoles.setColumns(10);
		HoraIniMiercoles.setBounds(385, 105, 30, 20);
		panelSeleccion.add(HoraIniMiercoles);
		
		HoraFinMiercoles = new JTextField();
		HoraFinMiercoles.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraFinMiercoles.getSelectedText() != null) {
                    if (HoraFinMiercoles.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraFinMiercoles.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraFinMiercoles.setBorder(null);
		HoraFinMiercoles.setText("00");
		HoraFinMiercoles.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinMiercoles.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinMiercoles.setColumns(10);
		HoraFinMiercoles.setBounds(419, 105, 30, 20);
		panelSeleccion.add(HoraFinMiercoles);
		
		HoraIniJueves = new JTextField();
		HoraIniJueves.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraIniJueves.getSelectedText() != null) {
                    if (HoraIniJueves.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraIniJueves.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraIniJueves.setBorder(null);
		HoraIniJueves.setText("00");
		HoraIniJueves.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniJueves.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniJueves.setColumns(10);
		HoraIniJueves.setBounds(385, 132, 30, 20);
		panelSeleccion.add(HoraIniJueves);
		
		HoraFinJueves = new JTextField();
		HoraFinJueves.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraFinJueves.getSelectedText() != null) {
                    if (HoraFinJueves.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraFinJueves.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraFinJueves.setBorder(null);
		HoraFinJueves.setText("00");
		HoraFinJueves.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinJueves.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinJueves.setColumns(10);
		HoraFinJueves.setBounds(419, 132, 30, 20);
		panelSeleccion.add(HoraFinJueves);
		
		HoraIniViernes = new JTextField();
		HoraIniViernes.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraIniViernes.getSelectedText() != null) {
                    if (HoraIniViernes.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraIniViernes.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraIniViernes.setBorder(null);
		HoraIniViernes.setText("00");
		HoraIniViernes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniViernes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniViernes.setColumns(10);
		HoraIniViernes.setBounds(385, 157, 30, 20);
		panelSeleccion.add(HoraIniViernes);
		
		HoraFinViernes = new JTextField();
		HoraFinViernes.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraFinViernes.getSelectedText() != null) {
                    if (HoraFinViernes.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraFinViernes.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraFinViernes.setText("00");
		HoraFinViernes.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraFinViernes.setHorizontalAlignment(SwingConstants.CENTER);
		HoraFinViernes.setColumns(10);
		HoraFinViernes.setBounds(419, 157, 30, 20);
		panelSeleccion.add(HoraFinViernes);
		
		HoraIniSabado = new JTextField();
		HoraIniSabado.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraIniSabado.getSelectedText() != null) {
                    if (HoraIniSabado.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraIniSabado.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		HoraIniSabado.setText("00");
		HoraIniSabado.setHorizontalAlignment(SwingConstants.CENTER);
		HoraIniSabado.setFont(new Font("Tahoma", Font.BOLD, 14));
		HoraIniSabado.setColumns(10);
		HoraIniSabado.setBorder(null);
		HoraIniSabado.setBounds(385, 180, 30, 20);
		panelSeleccion.add(HoraIniSabado);
		
		HoraFinSabado = new JTextField();
		HoraFinSabado.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (HoraFinSabado.getSelectedText() != null) {
                    if (HoraFinSabado.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (HoraFinSabado.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
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
		lblTipoDeAula.setBounds(205, 210, 95, 20);
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
		lblCantidadDeAlumnos.setBounds(205, 270, 160, 20);
		panelSeleccion.add(lblCantidadDeAlumnos);
		
		txtCantAlumnos = new JTextField();
		 txtCantAlumnos.addKeyListener(new KeyAdapter() {
             @Override
             public void keyTyped(java.awt.event.KeyEvent evt) {
                 char c = evt.getKeyChar();
                 boolean bandera = false;            
                 if (txtCantAlumnos.getSelectedText() != null) {
                     if (txtCantAlumnos.getSelectedText().length() == 10) {
                         bandera = true;
                     }
                 }
                 if (((c < '0' || c > '9') || (txtCantAlumnos.getText().length()== 10)) && (bandera == false || (c < '0' || c > '9'))){                  
                         evt.consume();                  
                 }     
             }
            });
		txtCantAlumnos.setText("00");
		txtCantAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantAlumnos.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCantAlumnos.setColumns(10);
		txtCantAlumnos.setBounds(375, 270, 30, 20);
		panelSeleccion.add(txtCantAlumnos);
		
		txtTipoPeriodo = new JTextField();		
		txtTipoPeriodo.setOpaque(false);
		txtTipoPeriodo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTipoPeriodo.setForeground(Color.WHITE);
		txtTipoPeriodo.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTipoPeriodo.setEditable(false);
		txtTipoPeriodo.setColumns(10);
		txtTipoPeriodo.setBorder(null);
		txtTipoPeriodo.setBounds(10, 312, 155, 20);
		panelSeleccion.add(txtTipoPeriodo);
		
		JLabel lblSolicitante = new JLabel("ID solicitante:");
		lblSolicitante.setIconTextGap(10);
		lblSolicitante.setForeground(Color.WHITE);
		lblSolicitante.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSolicitante.setBounds(205, 300, 112, 20);
		panelSeleccion.add(lblSolicitante);
		
		txtIdSolicitante = new JTextField();
		txtIdSolicitante.addKeyListener(new KeyAdapter() {
            int limite = 2;
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (txtIdSolicitante.getSelectedText() != null) {
                    if (txtIdSolicitante.getSelectedText().length() == 20) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (txtIdSolicitante.getText().length()== 20)) && (bandera == false || (c < '0' || c > '9'))){                    
                        evt.consume();                  
                }
                }
           });
		txtIdSolicitante.setColumns(10);
		txtIdSolicitante.setBounds(327, 302, 78, 20);
		panelSeleccion.add(txtIdSolicitante);
		
		txtNombreBedel = new JTextField();		
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		txtNombreBedel.setBounds(10, 107, 156, 27);
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
		txtApellido.setBounds(216, 338, 160, 20);
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
		txtNombre.setBounds(380, 338, 149, 20);
		panelSeleccion.add(txtNombre);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Correo");
		txtCorreo.setOpaque(false);
		txtCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCorreo.setForeground(Color.WHITE);
		txtCorreo.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtCorreo.setEditable(false);
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(null);
		txtCorreo.setBounds(216, 365, 275, 20);
		panelSeleccion.add(txtCorreo);
		
		JButton btnSiguiente = new JButton("");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarBedel rg = new RegistrarBedel();
				GestorReserva gr = new GestorReserva();
				ArrayList<Integer> ds= new ArrayList<>();
				
				ds.add(0, 0);
				ds.add(1, 0);
				ds.add(2, 0);
				ds.add(3, 0);
				ds.add(4, 0);
				ds.add(5, 0);				
				int banderaSeleccion = 0;
				int sumaBanderas= 0;
				int banderaLun  = 0;
				int banderaMar  = 0;				
				int banderaMier = 0;
				int banderaJue  = 0;
				int banderaVier = 0;
				int banderaSab  = 0;
				if (ChekBoxLunes.getState()) {
					banderaLun= validar(HoraIniLunes,HoraFinLunes,ComBoxDuracionLunes);
					banderaSeleccion = 1;
				}
				if (ChekBoxMartes.getState()) {
					banderaMar=	validar(HoraIniMartes,HoraFinMartes,ComBoxDuracionMartes);
					banderaSeleccion = 1;
				}
				if (ChekBoxMiercoles.getState()) {
					banderaMier=validar(HoraIniMiercoles,HoraFinMiercoles,ComBoxDuracionMiercoles);
					banderaSeleccion = 1;
				}
				if (ChekBoxJueves.getState()) {
					banderaJue=validar(HoraIniJueves,HoraFinJueves,ComBoxDuracionJueves);
					banderaSeleccion = 1;
				}
				if (ChekBoxViernes.getState()) {
					banderaVier=validar(HoraIniViernes,HoraFinViernes,ComBoxDuracionViernes);
					banderaSeleccion = 1;
				}
				if (CheckBoxSabado.getState()) {
					banderaSab=validar(HoraIniSabado,HoraFinSabado,ComBoxDuracionSabado);
					banderaSeleccion = 1;
				}
				sumaBanderas = banderaLun + banderaMar + banderaMier + banderaJue + banderaVier + banderaSab;
				boolean controlAlumnos = txtCantAlumnos.getText().equals("00");
                boolean controlTipoAula = (ComBoxTipoAula.getSelectedIndex() == 0);
                boolean controlDocente = (txtCorreo.getText().equals("Correo") && txtApellido.getText().equals("Apellido") && txtNombre.getText().equals("Nombre"));                 
                if(banderaSeleccion == 1) {
                	if (controlAlumnos == false) {
                        if(controlTipoAula == false) {
                            if(controlDocente == false) {
 							if(sumaBanderas == 0) {				
 								if(ChekBoxLunes.getState()) {					
 										String hor0 = ""+HoraIniLunes.getText()+":"+HoraFinLunes.getText()+":00";
 										String dur0 = ""+(String)ComBoxDuracionLunes.getSelectedItem()+":00";
 										l.add("-1");
 										l.add(hor0);
 										//selected.add(0,l);
 										l.add(dur0);
 										horainit.add(0, hor0);
 										duracioninit.add(0, dur0);
 										
 										seleccionados[0]=1;
 										contadorcheckbox++; 										
 										ds.add(0, 1);
 								
 								}
 								if(ChekBoxMartes.getState()) {
 									String hor1 = ""+HoraIniMartes.getText()+":"+HoraFinMartes.getText()+":00";
 									String dur1 = ""+(String)ComBoxDuracionMartes.getSelectedItem()+":00";
 									m.add("-1");
 									m.add(hor1);
 									m.add(dur1);
 									//selected.add(1,m);
 									horainit.add(1, hor1);
 									duracioninit.add(1, dur1);
 									seleccionados[1]=1;
 									contadorcheckbox++; 									
 									ds.add(1, 1);
 								}
 								if(ChekBoxMiercoles.getState()) {
 									String hor2 = ""+HoraIniMiercoles.getText()+":"+HoraFinMiercoles.getText()+":00"; 
 									String dur2 = ""+(String)ComBoxDuracionMiercoles.getSelectedItem()+":00";
 									mi.add("-1");
 									mi.add(hor2);
 									mi.add(dur2);
 									//selected.add(2,mi);
 									horainit.add(2, hor2);
 									duracioninit.add(2, dur2);
 									seleccionados[2]=1;
 									contadorcheckbox++; 									
 									ds.add(2, 1);
 								}
 								if(ChekBoxJueves.getState()) {
 									String hor3 = ""+HoraIniJueves.getText()+":"+HoraFinJueves.getText()+":00"; 
 									String dur3 = ""+(String)ComBoxDuracionJueves.getSelectedItem()+":00";
 									j.add("-1");
 									j.add(hor3);
 									j.add(dur3);
 									//selected.add(3,j);
 									horainit.add(3, hor3);
 									duracioninit.add(3, dur3);
 									seleccionados[3]=1;
 									contadorcheckbox++; 									
 									ds.add(3, 1);
 								}
 								if(ChekBoxViernes.getState()) {
 									String hor4 = ""+HoraIniViernes.getText()+":"+HoraFinViernes.getText()+":00";
 									String dur4 = ""+(String)ComBoxDuracionViernes.getSelectedItem()+":00";
 									v.add("-1");
 									v.add(hor4);
 									v.add(dur4);
 									//selected.add(4,v);
 									horainit.add(4, hor4);
 									duracioninit.add(4, dur4);
 									seleccionados[4]=1;
 									contadorcheckbox++; 									
 									ds.add(4, 1);
 								}
 								if(CheckBoxSabado.getState()) {
 									String hor5 = ""+HoraIniSabado.getText()+":"+HoraFinSabado.getText()+":00";
 									String dur5 = ""+(String)ComBoxDuracionSabado.getSelectedItem()+":00";
 									s.add("-1");
 									s.add(hor5);
 									s.add(dur5);
 									//selected.add(5,s);
 									horainit.add(5, hor5);
 									duracioninit.add(5, dur5);
 									seleccionados[5]=1;
 									contadorcheckbox++; 									
 									ds.add(5, 1);
 								}
 								tipoAula =(String) ComBoxTipoAula.getSelectedItem(); 
 								int c=0;
 								for(int f=0;f<seleccionados.length;f++) {
 									if(seleccionados[f]==1) {
 										c++;
 										if(c>1) {
 											switch(f) {
 											case 1:
 												((PanelMartes) martes).prenderAtras();
 												break;
 											case 2:
 												((PanelMiercoles) miercoles).prenderAtras();
 												break;
 											case 3:
 												((PanelJueves) jueves).prenderAtras();
 												break;
 											case 4:
 												((PanelViernes) viernes).prenderAtras();
 												break;
 											case 5:
 												((PanelSabado) sabado).prenderAtras();
 												break;
 											}
 										}
 									}
 								}
 								Integer ca=Integer.parseInt(txtCantAlumnos.getText());
 								try {
 									arreg=gr.validar(ds, tipoAula, periodoelec, ca, horainit, duracioninit);
 								} catch (Exception e1) {
 									// TODO Auto-generated catch block
 									e1.printStackTrace();
 								}
 								contadorGlobalDias=0;
 								siguienteDia();
 								}
                            else if (banderaLun == 1 || banderaMar == 1 ||  banderaMier == 1 || banderaJue == 1 || banderaVier == 1 || banderaSab == 1) {
 								 mensaje("Las reservas deben ser entre las 7:00 y 23:30","ERROR");
 							}
 							else if (banderaLun == 2 || banderaMar == 2 ||  banderaMier == 2 || banderaJue == 2 || banderaVier == 2 || banderaSab == 2) {
 								 mensaje("No se puede reservar despues de las 23:30","ERROR");
 							}
 							else if (banderaLun == 3 || banderaMar == 3 ||  banderaMier == 3 || banderaJue == 3 || banderaVier == 3 || banderaSab == 3) {
 								 mensaje("La reserva no debe durar mas de las 23:30","ERROR");    
 							}else mensaje("error al ingresar los minutos de la reserva","ERROR");							
 						}else mensaje("Ingrese los datos del solicitante para continuar","ERROR");
                     }else mensaje("Seleccione un tipo de aula para continuar","ERROR");
                 }else mensaje("La cantidad de alumnos debe ser mayor a cero","ERROR");
                }else mensaje("No ha seleccionado ningun dia","ERROR");                									
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
		btnSiguiente.setBounds(22, 200, 132, 40);
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
		btnAtras.setBounds(48, 144, 82, 36);
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
		btnResetear.setBounds(22, 256, 128, 40);
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
				txtCantAlumnos.setText("00");
				txtNombre.setText("Nombre");
				txtApellido.setText("Apellido");
				txtCorreo.setText("Correo");				
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
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtIdSolicitante.getText().isEmpty()) {
	                   
                    mensaje("Ingrese id del solicitante","Id no ingresado");
                }
                else {
                    GestorDocente gd = new GestorDocente();
                    try {
                        ArrayList<ConsultaGenerica> var = gd.buscarDocente(txtIdSolicitante.getText());
                        if(var.isEmpty()) {
                            mensaje("No existe el id docente", "Id erroneo");
                        }else {
                        txtApellido.setText(var.get(0).getValor("apellidodoc"));
                        txtNombre.setText(var.get(0).getValor("nombredoc"));
                        txtCorreo.setText(var.get(0).getValor("mail"));
                        }
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
			}
		});
		btnCargar.setRolloverIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_cargar(4).png")));
		btnCargar.setIcon(new ImageIcon(RegResPeriodica.class.getResource("/imagenes/RegResPeriodica/button_cargar.png")));
		btnCargar.setOpaque(false);
		btnCargar.setFocusable(false);
		btnCargar.setFocusPainted(false);
		btnCargar.setContentAreaFilled(false);
		btnCargar.setBorderPainted(false);
		btnCargar.setBorder(null);
		btnCargar.setBounds(419, 300, 68, 26);
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
		        	((PanelLunes) lunes).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"lunes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=0;
		            if(lunesselec==false) {
		            	avanzarSeleccion(0);
		            }
		            lunesselec=true;
		            /*if(contadorGlobalDias>0) {
		            	((PanelLunes) lunes).prenderAtras();
		            }
		            contadorGlobalDias++;*/
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
		        	((PanelMartes) martes).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"martes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=1;
		            if(martesselec==false) {
		            	avanzarSeleccion(1);
		            }
		            martesselec=true;
		           /* if(contadorGlobalDias>0) {
		            	((PanelMartes) martes).prenderAtras();
		            }
		            contadorGlobalDias++;*/
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
		        	((PanelMiercoles) miercoles).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"miercoles");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=2;
		            if(miercolesselec==false) {
		            	avanzarSeleccion(2);
		            }
		            miercolesselec=true;
		           /* if(contadorGlobalDias>0) {
		            	((PanelMiercoles) miercoles).prenderAtras();
		            	//miercoles.repaint();
		            }
		            contadorGlobalDias++;*/
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
		        	((PanelJueves) jueves).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"jueves");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=3;
		            if(juevesselec==false) {
		            	avanzarSeleccion(3);
		            }
		            juevesselec=true;
		           /* if(contadorGlobalDias>0) {
		            	((PanelJueves) jueves).prenderAtras();
		            	//jueves.repaint();
		            }
		            contadorGlobalDias++;*/
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
		        	((PanelViernes) viernes).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"viernes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=4;
		            if(viernesselec==false) {
		            	avanzarSeleccion(4);
		            }
		            viernesselec=true;
		           /* if(contadorGlobalDias>0) {
		            	((PanelViernes) viernes).prenderAtras();
		            	//viernes.repaint();
		            }
		            contadorGlobalDias++;*/
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
		        	((PanelSabado) sabado).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"sabado");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contadordias=5;
		            if(sabadoselec==false) {
		            	avanzarSeleccion(5);
		            }
		            sabadoselec=true;
		            /*if(contadorGlobalDias>0) {
		            	((PanelSabado) sabado).prenderAtras();
		            	//sabado.repaint();
		            }
		            contadorGlobalDias++;*/
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
		        	((PanelLunes) lunes).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"lunes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=0;
		            if(lunesselec==false) {
		            	avanzarSeleccion(0);
		            }
		            lunesselec=true;
					break;
				case 1:
					martes.setSize(600,400);
		        	martes.setLocation(0,0);
		        	((PanelMartes) martes).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"martes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=1;
		            if(martesselec==false) {
		            	avanzarSeleccion(1);
		            }
		            martesselec=true;
					break;
				case 2:
					miercoles.setSize(600,400);
		        	miercoles.setLocation(0,0);
		        	((PanelMiercoles) miercoles).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"miercoles");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=2;
		            if(miercolesselec==false) {
		            	avanzarSeleccion(2);
		            }
		            miercolesselec=true;
					break;
				case 3:
					jueves.setSize(600,400);
		        	jueves.setLocation(0,0);
		        	((PanelJueves) jueves).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"jueves");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=3;
		            if(juevesselec==false) {
		            	avanzarSeleccion(3);
		            }
		            juevesselec=true;
					break;
				case 4:
					viernes.setSize(600,400);
		        	viernes.setLocation(0,0);
		        	((PanelViernes) viernes).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"viernes");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=4;
		            if(viernesselec==false) {
		            	avanzarSeleccion(4);
		            }
		            viernesselec=true;
					break;
				case 5:	
					sabado.setSize(600,400);
		        	sabado.setLocation(0,0);
		        	((PanelSabado) sabado).verNombre(nombreUsuario);
		            cl.show(ContentPanelsRegRes,"sabado");
		            ContentPanelsRegRes.revalidate();
		            ContentPanelsRegRes.repaint();
		            contdiasatras=5;
		            if(sabadoselec==false) {
		            	avanzarSeleccion(5);
		            }
		            sabadoselec=true;
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
			if(contadorcheckbox==contadorseleccion) {
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
				 la1 = gr.obtenerArrayFechas("Lunes",txtTipoPeriodo.getText(),cic);
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
				 la2 = gr.obtenerArrayFechas("Martes",txtTipoPeriodo.getText(),cic);
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
				 la3 = gr.obtenerArrayFechas("Miercoles",txtTipoPeriodo.getText(),cic);
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
				 la4 = gr.obtenerArrayFechas("Jueves",txtTipoPeriodo.getText(),cic);
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
				 la5 =gr.obtenerArrayFechas("Viernes",txtTipoPeriodo.getText(),cic);
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
				 la6 = gr.obtenerArrayFechas("Sabado",txtTipoPeriodo.getText(),cic);
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
			}
			}
			try {
				gr.registrarReserva(Integer.parseInt(txtCantAlumnos.getText()),(String) ComBoxTipoAula.getSelectedItem(),(String)ComBoxNombreCurso.getSelectedItem(), fech, aulas, hi, dur,txtIdSolicitante.getText(),txtNombreBedel.getText(),txtTipoPeriodo.getText());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			mensaje("La reserva se ha realizado con exito","EXITO");
			RegistrarReserva.volverAinicio();
		}
		else {
			mensaje("Seleccione un aula en todos los dias para confirmar","ERROR");
		}
		}else {
			cambiardia=false;
			siguienteDia();
		}
		
	}
	public static void atras() {
		cambiardia=false;
		bandera7=false;
		AnteriorDia();
		
	}
	public static void cambiarDeDia(int dia) {
		cambiardia=true;
		posicion=dia;
		bandera7=false;
		//siguienteDia();
		
	}
	public static void seteoVector(String aula, String dia) {
	   
		switch (dia){
		case "l":
			l.remove(0);
			l.add(0,aula);
			if(cls==false) {
				contadorseleccion++;
			}
			cls=true;
			break;
		case "m":
			m.remove(0);
			m.add(0,aula);
			if(cm==false) {
				contadorseleccion++;
			}
			cm=true;
			break;
		case "mi":
			mi.remove(0);
			mi.add(0,aula);
			if(cmi==false) {
				contadorseleccion++;
			}
			cmi=true;
			break;
		case "j":
			j.remove(0);
			j.add(0,aula);
			if(cj==false) {
				contadorseleccion++;
			}
			cj=true;
			break;
		case "v":
			v.remove(0);
			v.add(0,aula);
			if(cv==false) {
				contadorseleccion++;
			}
			cv=true;
			break;
		case "s":
			s.remove(0);
			s.add(0,aula);
			if(cs==false) {
				contadorseleccion++;
			}
			cs=true;
			break;
			
		}
	}
	  public void seteo(ArrayList<ConsultaGenerica> cursos) {
	        for(int i=0; i<cursos.size();i++) {
	            ComBoxNombreCurso.addItem(cursos.get(i).getValor("nombrecurso").toString());
	            
	        }
	  }
	  public void setperiodo(String t) {
		  periodoelec=t;
	  }
	  public static void avanzarSeleccion(int day) {
	        String tipoAula =(String) ComBoxTipoAula.getSelectedItem();
	        String hayaire="";
	        String haydvd="";
	        String haytv="";
	        String hayproyector= "";
	        String hayventilador="";
	        String haypc= "";
	        String cadena="";
	        int z=0;
	        
	         while((z<3 && arreg.get(day).size()>=3)||(arreg.get(day).size()<3 && z<arreg.get(day).size())) {
	            String aire=arreg.get(day).get(z).getValor("aireacondicionado");              
	            if(Integer.parseInt(aire)==1) {
	                hayaire="&emsp;aireacondicionado<br>";
	            }
	        if(tipoAula=="Multimedios") {
	                String dvd=arreg.get(day).get(z).getValor("dvd");
	                    if(Integer.parseInt(dvd)==1) {
	                        haydvd="&emsp;dvd<br>";
	                    }
	                String tv=arreg.get(day).get(z).getValor("tv");
	                    if(Integer.parseInt(tv)==1) {
	                        haytv= "&emsp;tv<br>";
	                    }
	           
	                String proyector=arreg.get(day).get(z).getValor("proyector");
	                    if(Integer.parseInt(proyector)==1) {
	                        hayproyector= "&emsp;proyector<br>";
	                    }
	           
	                String pc=arreg.get(day).get(z).getValor("pc");
	                    if(Integer.parseInt(pc)==1) {
	                            haypc="&emsp;pc<br>";
	                    }
	            cadena = "<html>Piso: "+arreg.get(day).get(z).getValor("piso")+"<br>"+"Tipo pizarron: "+arreg.get(day).get(z).getValor("tipopizarron")+"<br>"+"Posee:<br>"+hayaire+""+haydvd+""+haytv+""+hayproyector+""+haypc+"</html>";                
	        }
	        else if (tipoAula=="Informatica") {
	                String proyector=arreg.get(day).get(z).getValor("proyector");
	                    if(Integer.parseInt(proyector)==1) {
	                        hayproyector= "&emsp;proyector<br>";
	                    }
	                cadena = "<html>Piso: "+arreg.get(day).get(z).getValor("piso")+"<br>"+"Tipo pizarron: "+arreg.get(day).get(z).getValor("tipopizarron")+"<br>"+"Cantidad de PCs: "+arreg.get(day).get(z).getValor("cantpc")+"<br>"+"Posee:<br>"+hayproyector+"</html>";
	               
	       }
	        else {
	                String ventilador=arreg.get(day).get(z).getValor("ventiladores");
	                    if(ventilador.equals("1")) {
	                        hayventilador= "&emsp;ventilador<br>";
	                    }
	                cadena = "<html>Piso: "+arreg.get(day).get(z).getValor("piso")+"<br>"+"Tipo pizarron: "+arreg.get(day).get(z).getValor("tipopizarron")+"<br>"+"Posee:<br>"+hayventilador+"</html>";
	        }              
	        String numAula ="";
	        String capacidad="";
	        numAula= arreg.get(day).get(z).getValor("numeroaula");
	        capacidad=arreg.get(day).get(z).getValor("capacidad");
	       
	        //panelresEspo.setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
	        switch(day) {
	        case 0:
	        	((PanelLunes) lunes).setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
	        	break;
	        case 1:
	        	((PanelMartes) martes).setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
	        	break;
	        case 2:
	        	((PanelMiercoles) miercoles).setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
	        	break;
	        case 3:
	        	((PanelJueves) jueves).setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
	        	break;
	        case 4:
	        	((PanelViernes) viernes).setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
	        	break;
	        case 5:
	        	((PanelSabado) sabado).setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
	        	break;
	        }
	       z++;        
	       }  
	    }
	  public static void volver() {
		  ContentPanelsRegRes.remove(lunes);
		  ContentPanelsRegRes.remove(martes);
		  ContentPanelsRegRes.remove(miercoles);
		  ContentPanelsRegRes.remove(jueves);
		  ContentPanelsRegRes.remove(viernes);
		  ContentPanelsRegRes.remove(sabado);
		  lunes=new PanelLunes();
		  martes=new PanelMartes();
		  miercoles=new PanelMiercoles();
		  jueves=new PanelJueves();
		  viernes=new PanelViernes();
		  sabado=new PanelSabado();
		  ContentPanelsRegRes.add("lunes",lunes);
		  ContentPanelsRegRes.add("martes",martes);
		  ContentPanelsRegRes.add("miercoles",miercoles);
		  ContentPanelsRegRes.add("jueves",jueves);
		  ContentPanelsRegRes.add("viernes",viernes);
		  ContentPanelsRegRes.add("sabado",sabado);
		  cl.show(ContentPanelsRegRes,"panelSeleccion");
		    horainit.add(0, "");
			horainit.add(1, "");
			horainit.add(2, "");
			horainit.add(3, "");
			horainit.add(4, "");
			horainit.add(5, "");
			
			duracioninit.add(0, "");
			duracioninit.add(1, "");
			duracioninit.add(2, "");
			duracioninit.add(3, "");
			duracioninit.add(4, "");
			duracioninit.add(5, "");
			seleccionados[0]=0;
			seleccionados[1]=0;
			seleccionados[2]=0;
			seleccionados[3]=0;
			seleccionados[4]=0;
			seleccionados[5]=0;
			l = new ArrayList<>();
			m = new ArrayList<>();
			mi= new ArrayList<>();
			j = new ArrayList<>();
			v = new ArrayList<>();
			s = new ArrayList<>();
			posicion =0;
			bandera = false;
			band=false;
			contdiasatras=1000;
			contadordias=0;
			btnsig=false;
			btnat=false;
			cambiardia=false;
			bandera7=false;
			contadorGlobalDias=0;
			selected= new ArrayList<>();
			aulas = new ArrayList<>();
			fech = new ArrayList<>();
			hi = new ArrayList<>();
			dur = new ArrayList<>();
			lunesselec=false;
			martesselec=false;
			miercolesselec=false;
			juevesselec=false;
			viernesselec=false;
			sabadoselec=false;
			contadorseleccion=0;
			contadorcheckbox=0;
			cls=false;
			cm=false;
			cmi=false;
			cj=false;
			cv=false;
			cs=false;
			selected.add(0,l);
			selected.add(1,m);
			selected.add(2,mi);
			selected.add(3,j);
			selected.add(4,v);
			selected.add(5,s);
	    }
	  
	  public static void verNombre(String cadenaNick) {
		  txtNombreBedel.setText(cadenaNick);
			nombreUsuario = cadenaNick;
		}
	  public static void verTipoPeriodo(String cadenaTipoPeriodo) {
		  txtTipoPeriodo.setText(cadenaTipoPeriodo);
		}
	  public int validar(JTextField horaInic,JTextField minutosInic,JComboBox comBoxDuracionLunes) {
		  int resultado = 0;
		  int hora;
          int minutos;
          hora = Integer.parseInt(horaInic.getText()) *100;        
          minutos = Integer.parseInt(minutosInic.getText());
          int horaInicio= hora + minutos;
          String durac =  (String) comBoxDuracionLunes.getSelectedItem();
          durac = durac.replace(":","");
          Integer duracion = Integer.valueOf(durac); 
          if(((hora < 700) || (hora > 2300))) {
        	  resultado = 1;          
          }
          if((horaInicio > 2330)) {
        	  resultado = 2;
          }
          if(((duracion + horaInicio) > 2330 )) {
        	  resultado= 3;   
          }
          if(((minutos < 00) && (minutos >= 60))) {
        	  resultado = 4;
          }
          return resultado;		  
		}	 
}