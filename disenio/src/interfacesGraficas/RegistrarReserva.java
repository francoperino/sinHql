package interfacesGraficas;
 
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
 
import Entidades.Ciclolectivo;
import Logica.GestorCicloLectivo;
import Logica.GestorCursos;
 
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
 
public class RegistrarReserva extends JPanel {
	
    private static JTextField txtBedel;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private static CardLayout sl;
    private static JPanel  ContentPan ;
    private static JPanel ContentPanRegReserva;
    private static RegResPeriodica  regResPeriodica;
    private static RegResEsporadica regResEsporadica;
    private static String nombreUsuario;
    private static JComboBox comBoxTipoPeriodica;
 
    /**
     * Create the panel.
     */
     public void mensaje(String error,String titulo){
            if(JOptionPane.showConfirmDialog(null,
                error, titulo
                , JOptionPane.DEFAULT_OPTION
                , JOptionPane.INFORMATION_MESSAGE)==0);
        }
    public RegistrarReserva() {
       
         setLayout(null);
         sl = new CardLayout();
         ContentPan = new JPanel();
         ContentPan.setBounds(0, 0, 600, 400);         
         ContentPanRegReserva = new JPanel();
         ContentPanRegReserva.setBounds(0, 0, 600, 400);
         ContentPanRegReserva.setLayout(null);
         //add(ContentPanRegReserva);
         add(ContentPan);
         ContentPan.setLayout(sl);
         
         
         ContentPan.add("ContentPanRegReserva",ContentPanRegReserva);
         
         regResPeriodica = new RegResPeriodica();
         ContentPan.add("regResPeriodica", regResPeriodica);
             
         regResEsporadica = new RegResEsporadica();
         ContentPan.add("regResEsporadica", regResEsporadica);
       
         /*PanelResEsporadica panelResEsporadica = new PanelResEsporadica();
         this.add("panelResEsporadica", panelResEsporadica);*/
       
        txtBedel = new JTextField();        
        txtBedel.setOpaque(false);
        txtBedel.setHorizontalAlignment(SwingConstants.CENTER);
        txtBedel.setForeground(Color.WHITE);
        txtBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtBedel.setEditable(false);
        txtBedel.setColumns(10);
        txtBedel.setBorder(null);
        txtBedel.setBounds(10, 107, 156, 27);
        ContentPanRegReserva.add(txtBedel);
       
        JButton btnInicio = new JButton("");
        btnInicio.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_inicio (2).png")));
        btnInicio.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_inicio.png")));
        btnInicio.setFocusPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.setBorderPainted(false);
        btnInicio.setBounds(38, 146, 103, 40);
        ContentPanRegReserva.add(btnInicio);
       
        btnInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                InicioBedel.llamarBedel(0);
            }
        });
       
        JButton btnBuscarAula = new JButton("");
        btnBuscarAula.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_buscar-aula2.png")));
        btnBuscarAula.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_buscar-aula.png")));
        btnBuscarAula.setFocusPainted(false);
        btnBuscarAula.setContentAreaFilled(false);
        btnBuscarAula.setBorderPainted(false);
        btnBuscarAula.setBounds(10, 197, 161, 49);
        ContentPanRegReserva.add(btnBuscarAula);
        btnBuscarAula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	BuscarAula.verNombre(nombreUsuario);
                InicioBedel.mostrarbusaula();
            }
        });
       
        JLabel label = new JLabel("Listar Reserva");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 18));
        label.setBounds(10, 247, 131, 28);
        ContentPanRegReserva.add(label);
       
        JButton btnCurso = new JButton("");
        btnCurso.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_curso2.png")));
        btnCurso.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_curso.png")));
        btnCurso.setFocusPainted(false);
        btnCurso.setContentAreaFilled(false);
        btnCurso.setBorderPainted(false);
        btnCurso.setBounds(38, 281, 103, 40);
        ContentPanRegReserva.add(btnCurso);
        btnCurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ListaResCurso.verNombre(nombreUsuario);
                InicioBedel.mostrarcurso();
            }
        });
       
        JButton btnDiaEspecifico = new JButton("");
        btnDiaEspecifico.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_dia-especifico (1)2.png")));
        btnDiaEspecifico.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_dia-especifico (1).png")));
        btnDiaEspecifico.setFocusPainted(false);
        btnDiaEspecifico.setContentAreaFilled(false);
        btnDiaEspecifico.setBorderPainted(false);
        btnDiaEspecifico.setBounds(5, 329, 181, 49);
        ContentPanRegReserva.add(btnDiaEspecifico);
        btnDiaEspecifico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ListaResDiaEsp.verNombre(nombreUsuario);
                InicioBedel.mostrarlistadia();
            }
        });
       
        JRadioButton rdbtnEsporadica = new JRadioButton("Esporadica");
        buttonGroup.add(rdbtnEsporadica);
        rdbtnEsporadica.setForeground(Color.WHITE);
        rdbtnEsporadica.setFont(new Font("Tahoma", Font.BOLD, 16));
        rdbtnEsporadica.setContentAreaFilled(false);
        rdbtnEsporadica.setFocusPainted(false);
        rdbtnEsporadica.setBounds(205, 30, 119, 23);
        ContentPanRegReserva.add(rdbtnEsporadica);
       
        JRadioButton rdbtnPeriodica = new JRadioButton("Periodica");
        buttonGroup.add(rdbtnPeriodica);
        rdbtnPeriodica.setForeground(Color.WHITE);
        rdbtnPeriodica.setFont(new Font("Tahoma", Font.BOLD, 16));
        rdbtnPeriodica.setFocusPainted(false);
        rdbtnPeriodica.setContentAreaFilled(false);
        rdbtnPeriodica.setBounds(205, 86, 119, 23);
        ContentPanRegReserva.add(rdbtnPeriodica);
       
        comBoxTipoPeriodica = new JComboBox();
        comBoxTipoPeriodica.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Anual", "1er Cuatrimestre", "2do Cuatrimestre"}));
        comBoxTipoPeriodica.setMaximumRowCount(4);
        comBoxTipoPeriodica.setForeground(Color.BLACK);
        comBoxTipoPeriodica.setFont(new Font("Tahoma", Font.BOLD, 14));
        comBoxTipoPeriodica.setBackground(Color.WHITE);
        comBoxTipoPeriodica.setBounds(330, 86, 149, 20);
        ContentPanRegReserva.add(comBoxTipoPeriodica);
       
        JButton btnCancelar = new JButton("");
        btnCancelar.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_cancelar2.png")));
        btnCancelar.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_cancelar.png")));
        btnCancelar.setFocusPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setBounds(367, 146, 112, 40);
        ContentPanRegReserva.add(btnCancelar);
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                InicioBedel.llamarBedel(3);
            }
        });
       
        JButton btnRegistrar = new JButton("");
        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               
                if(!rdbtnEsporadica.isSelected() && !rdbtnPeriodica.isSelected()) {
                    mensaje("Debe seleccionar el tipo de reserva", "No hay reserva seleccionada");
                }
                else {
                    if(rdbtnEsporadica.isSelected()) {
                        //System.out.println("Seleccionada Esporadica");
                        regResEsporadica.setSize(600,400);
                        regResEsporadica.setLocation(0,0);
                        GestorCursos gc = new GestorCursos();
                        try {
                            regResEsporadica.seteo(gc.buscarCursos());
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        regResEsporadica.verNombre(nombreUsuario);
                        sl.show(ContentPan,"regResEsporadica");
                        ContentPan.revalidate();
                        ContentPan.repaint();
                    }else {
                    if(rdbtnPeriodica.isSelected() && comBoxTipoPeriodica.getSelectedIndex()!=0) {
                        GestorCicloLectivo gcl = new GestorCicloLectivo();
                        Ciclolectivo cl = new Ciclolectivo();
                        GestorCursos gcc = new GestorCursos();
                        try {
                            cl = gcl.obtenerCicloLectivo();
                            regResPeriodica.seteo(gcc.buscarCursos());
                        } catch (Exception e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        Calendar c = Calendar.getInstance();
                        String dia = Integer.toString(c.get(Calendar.DATE));
                        String mes = Integer.toString(c.get(Calendar.MONTH)+1);
                        String annio = Integer.toString(c.get(Calendar.YEAR));
                        String fechaActual= ""+annio+"-"+mes+"-"+dia+"";
                        SimpleDateFormat sdd = new SimpleDateFormat("yyyy-MM-dd");
                        Date actual=null;
                        try {
                            actual = sdd.parse(fechaActual);
                        } catch (ParseException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date finCiclo=null;
                        try {
                            finCiclo = sdf.parse(cl.getFechafinciclo());
                        } catch (ParseException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        Date finCuatri=null;
                        try {
                            finCuatri = sdf.parse(cl.getFechafincuatri());
                        } catch (ParseException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }  
                        if((comBoxTipoPeriodica.getSelectedIndex()==1 || comBoxTipoPeriodica.getSelectedIndex()==2)   && actual.compareTo(finCuatri)>=0) {
                            mensaje("No se pude registrar reserva para este periodo", "Operacion invalida");
                        }else {
                            if(comBoxTipoPeriodica.getSelectedIndex()==3 && actual.compareTo(finCiclo)>=0) {
                                mensaje("El ciclo lectivo ya termino", "Operacion invalida");
                            }else {
                                regResPeriodica.setSize(600,400);
                                regResPeriodica.setLocation(0,0);
                                regResPeriodica.verNombre(nombreUsuario);
                                regResPeriodica.verTipoPeriodo(comBoxTipoPeriodica.getSelectedItem().toString());                                
                                sl.show(ContentPan,"regResPeriodica");
                                ContentPan.revalidate();
                                ContentPan.repaint();  
                                regResPeriodica.setperiodo((String) comBoxTipoPeriodica.getSelectedItem());
                            }  
                        }
       
                    }
                    else { mensaje("Seleccione el tipo de reserva periodica","No selecciono tipo");
                    }
                }}
            }
        });
        btnRegistrar.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_registrar2.png")));
        btnRegistrar.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_registrar.png")));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setBounds(205, 146, 131, 40);
        ContentPanRegReserva.add(btnRegistrar);
       
        JLabel Fondo = new JLabel("");
        Fondo.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/FondoRegBed2.1.png")));
        Fondo.setBounds(0, 0, 602, 401);
        ContentPanRegReserva.add(Fondo);
           
       
       
       
       
       
        }
   
    public static void regresar () {
        sl.show(ContentPan, "ContentPanRegReserva");
       
    }
	public static void verNombre(String cadenaNick) {
		txtBedel.setText(cadenaNick);
		nombreUsuario = cadenaNick;
	}
	public static void volverAinicio() {
		InicioBedel.llamarBedel(3);
		
	}
}