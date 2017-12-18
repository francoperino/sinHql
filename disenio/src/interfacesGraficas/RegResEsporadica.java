package interfacesGraficas;
 
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
 
import com.sun.glass.events.KeyEvent;
 
import com.sun.org.apache.xpath.internal.operations.NotEquals;
 
import Entidades.ConsultaGenerica;
import Logica.GestorCicloLectivo;
import Logica.GestorDocente;
import Logica.GestorReserva;
 
public class RegResEsporadica extends JPanel {
	public void mensaje(String error,String titulo){
        if(JOptionPane.showConfirmDialog(null,
            error, titulo
            , JOptionPane.DEFAULT_OPTION
            , JOptionPane.INFORMATION_MESSAGE)==0);
    }
    private JTextField txtNombreBedel;
    private JTextField txtHora;
    private JTextField txtMinutos;
    private JTextField txtCantAlumnos;
    private JTextField txtIdSolicitante;
    private JTextField txtCorreoSolicitante;
    private JTextField txtApellidoSolicitante;
    private JTextField txtNombreSolicitante;
    private static JTable table;
    private static JPanel panelResEsporad;
    private static DefaultTableModel model ;
    private RegistrarBedel rgb;
    private static Integer n=0;
    private static JPanel control;
    private static CardLayout cl;
    private static PanelResEsporadica panelresEspo;
    private static Integer cont;
    private static JComboBox ComBoxTipoDeAula;
    private static ArrayList<ArrayList<ConsultaGenerica>> ar= new ArrayList<>();
    private static JComboBox ComBoxNombreCurso;
    private static JComboBox ComBoxMes;
    private static JComboBox ComBoxDia;
    ArrayList<ArrayList<ConsultaGenerica>> arreg=null;
    private static Integer cancel=0;
 
 
    /**
     * Create the panel.
     */
   
    public RegResEsporadica() {
        setBackground(Color.DARK_GRAY);
        setLayout(null);
        cl=new CardLayout();
        control = new JPanel();
        control.setBounds(0, 0, 600, 400);
        panelResEsporad = new JPanel();
        panelResEsporad.setBounds(0, 0, 600, 400);
        add(control);
        control.setLayout(cl);
        panelResEsporad.setLayout(null);
       
        control.add("panelResEsporad",panelResEsporad);
        panelresEspo= new PanelResEsporadica();
        control.add("panelresEspo",panelresEspo);
       
       
        txtNombreBedel = new JTextField();
        txtNombreBedel.setText("gtaborda");
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
        btnAtras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrarReserva.regresar();
            }
        });
       
        JLabel lblDia = new JLabel("Dia");
        lblDia.setIconTextGap(10);
        lblDia.setForeground(Color.WHITE);
        lblDia.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblDia.setBounds(259, 31, 30, 20);
        panelResEsporad.add(lblDia);
       
        JLabel lblMes = new JLabel("Mes");
        lblMes.setIconTextGap(10);
        lblMes.setForeground(Color.WHITE);
        lblMes.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblMes.setBounds(205, 31, 37, 20);
        panelResEsporad.add(lblMes);
       
        JLabel label = new JLabel("Hora inicio");
        label.setIconTextGap(10);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 15));
        label.setBounds(310, 31, 86, 20);
        panelResEsporad.add(label);
       
        txtHora = new JTextField();
        txtHora.addKeyListener(new KeyAdapter() {
            int limite = 2;
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (txtHora.getSelectedText() != null) {
                    if (txtHora.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (txtHora.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                  
                        evt.consume();                  
                }    
            }
        });
        txtHora.setText("00");
        txtHora.setHorizontalAlignment(SwingConstants.CENTER);
        txtHora.setFont(new Font("Tahoma", Font.BOLD, 14));
        txtHora.setColumns(10);
        txtHora.setBorder(null);
        txtHora.setBounds(320, 66, 30, 20);
        panelResEsporad.add(txtHora);
       
        txtMinutos = new JTextField();
        txtMinutos.addKeyListener(new KeyAdapter() {            
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                char c = evt.getKeyChar();
                boolean bandera = false;            
                if (txtMinutos.getSelectedText() != null) {
                    if (txtMinutos.getSelectedText().length() == 2) {
                        bandera = true;
                    }
                }
                if (((c < '0' || c > '9') || (txtMinutos.getText().length()== 2)) && (bandera == false || (c < '0' || c > '9'))){                   
                        evt.consume();                  
                }               
            } 
        });
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
           txtCantAlumnos.setBorder(null);
           txtCantAlumnos.setBounds(380, 280, 30, 20);
           panelResEsporad.add(txtCantAlumnos);
         
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
           txtIdSolicitante.setBounds(332, 307, 78, 20);
           panelResEsporad.add(txtIdSolicitante);
         
          ComBoxTipoDeAula = new JComboBox();
          ComBoxTipoDeAula.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
          ComBoxTipoDeAula.setMaximumRowCount(4);
          ComBoxTipoDeAula.setForeground(Color.BLACK);
          ComBoxTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 14));
          ComBoxTipoDeAula.setBackground(Color.WHITE);
          ComBoxTipoDeAula.setBounds(324, 218, 190, 20);
          panelResEsporad.add(ComBoxTipoDeAula);
       
         ComBoxMes = new JComboBox();
         ComBoxMes.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
         ComBoxMes.setForeground(Color.BLACK);
         ComBoxMes.setFont(new Font("Tahoma", Font.BOLD, 18));
         ComBoxMes.setBackground(Color.WHITE);
         ComBoxMes.setBounds(205, 66, 49, 20);
         panelResEsporad.add(ComBoxMes);
         ComBoxMes.addItemListener(new java.awt.event.ItemListener() {
             public void itemStateChanged(java.awt.event.ItemEvent evt) {
                 cambiaMes(evt);
             }
         });
         
       
        JComboBox ComBoxDuracion = new JComboBox();
        ComBoxDuracion.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
        ComBoxDuracion.setForeground(Color.BLACK);
        ComBoxDuracion.setFont(new Font("Tahoma", Font.BOLD, 18));
        ComBoxDuracion.setBackground(Color.WHITE);
        ComBoxDuracion.setBounds(415, 66, 76, 20);
        panelResEsporad.add(ComBoxDuracion);
       
        ComBoxDia = new JComboBox();
        ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        ComBoxDia.setForeground(Color.BLACK);
        ComBoxDia.setFont(new Font("Tahoma", Font.BOLD, 18));
        ComBoxDia.setBackground(Color.WHITE);
        ComBoxDia.setBounds(259, 66, 49, 20);
        panelResEsporad.add(ComBoxDia);
       
        JLabel lblCantidadDeAlumnos = new JLabel("Cantidad de alumnos");
        lblCantidadDeAlumnos.setIconTextGap(10);
        lblCantidadDeAlumnos.setForeground(Color.WHITE);
        lblCantidadDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCantidadDeAlumnos.setBounds(216, 278, 154, 20);
        panelResEsporad.add(lblCantidadDeAlumnos);
       
        JLabel lblTipoDeAula = new JLabel("Tipo de aula");
        lblTipoDeAula.setIconTextGap(10);
        lblTipoDeAula.setForeground(Color.WHITE);
        lblTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTipoDeAula.setBounds(217, 216, 95, 20);
        panelResEsporad.add(lblTipoDeAula);
       
        JLabel lblIdSolicitante = new JLabel("ID solicitante:");
        lblIdSolicitante.setIconTextGap(10);
        lblIdSolicitante.setForeground(Color.WHITE);
        lblIdSolicitante.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblIdSolicitante.setBounds(216, 307, 112, 20);
        panelResEsporad.add(lblIdSolicitante);
       
         JButton btnSiguiente = new JButton("");
         btnSiguiente.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
            	
            	 
                 RegistrarBedel rg = new RegistrarBedel();              
                 boolean controlAlumnos = txtCantAlumnos.getText().equals("00");
                 boolean controlTipoAula = (ComBoxTipoDeAula.getSelectedIndex() == 0);
                 boolean controlDocente = (txtCorreoSolicitante.getText().equals("Correo") && txtApellidoSolicitante.getText().equals("Apellido") && txtNombreSolicitante.getText().equals("Nombre"));
                 boolean controlSeleccion = (table.getSelectedRow() == -1);
                // System.out.println(table.getSelectedRow());
                 if(controlSeleccion == false) {
                    if (controlAlumnos == false) {
                        if(controlTipoAula == false) {
                            if(controlDocente == false) {
                         String tipoAula=null;
                         if(ComBoxTipoDeAula.getSelectedIndex()==0) {
                               
                         }else {
                             if(Integer.parseInt(txtCantAlumnos.getText())<=0) {
                               
                             }
                             else {
                         tipoAula =(String) ComBoxTipoDeAula.getSelectedItem();  
                         int cantAlumnos = Integer.parseInt(txtCantAlumnos.getText());
                         GestorReserva gr = new GestorReserva();
                         ArrayList<String> fecha = new ArrayList<>();
                         ArrayList<String> hora = new ArrayList<>();
                         ArrayList<String> duracion = new ArrayList<>();
                         int filas = table.getRowCount();
                         if(filas==0) {
                           
                         }
                         else {
                           
         
                         for(int i=0; i<=filas-1;i++) {
                             Calendar c = Calendar.getInstance();      
                             String annio = Integer.toString(c.get(Calendar.YEAR));
                             String dia =(String) table.getModel().getValueAt(i,0);
                             String mes =(String) table.getModel().getValueAt(i,1);
                              String  horas =(String) table.getModel().getValueAt(i,2);
                              String duracions =(String) table.getModel().getValueAt(i,3);
                             String AnioMesDia = ""+annio+"-"+mes+"-"+dia+"";
                             fecha.add(AnioMesDia);
                             hora.add(horas);
                             duracion.add(duracions);
                           
                           }
                         PanelResEsporadica.posicion(table.getSelectedRow(),table.getRowCount(),Integer.parseInt(txtCantAlumnos.getText()),filas,(String)txtIdSolicitante.getText(),(String)txtNombreBedel.getText(),fecha,hora,duracion,(String)ComBoxTipoDeAula.getSelectedItem(),(String)ComBoxNombreCurso.getSelectedItem());
                         try {
                              ar = gr.consultarDiaReserva(tipoAula, fecha, cantAlumnos, hora, duracion);
                           
                         } catch (Exception e1) {
                             // TODO Auto-generated catch block
                             e1.printStackTrace();
                         }
                              }
                            }
                         }
                   
                   
                         panelresEspo.apagarAtras();
                         if(table.getRowCount()==1) {
                             panelresEspo.apagarSiguiente();
                         }
                         control.revalidate();
                         control.repaint();
                         cont=0;
                         arreg=ar;
                         siguienteDia(ar);
 
                            }else mensaje("Ingrese los datos del solicitante para continuar","ERROR");
                        }else mensaje("Seleccion un tipo de aula para continuar","ERROR");
                    }else mensaje("La cantidad de alumnos debe ser mayor a cero","ERROR");
                 }else mensaje("seleccione una fila para continuar","ERROR");
 
               
         }      
         });
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
       
        txtCorreoSolicitante = new JTextField();
        txtCorreoSolicitante.setText("Correo");
        txtCorreoSolicitante.setOpaque(false);
        txtCorreoSolicitante.setHorizontalAlignment(SwingConstants.CENTER);
        txtCorreoSolicitante.setForeground(Color.WHITE);
        txtCorreoSolicitante.setFont(new Font("Tahoma", Font.BOLD, 16));
        txtCorreoSolicitante.setEditable(false);
        txtCorreoSolicitante.setColumns(10);
        txtCorreoSolicitante.setBorder(null);
        txtCorreoSolicitante.setBounds(216, 369, 275, 20);
        panelResEsporad.add(txtCorreoSolicitante);
       
        txtApellidoSolicitante = new JTextField();
        txtApellidoSolicitante.setText("Apellido");
        txtApellidoSolicitante.setOpaque(false);
        txtApellidoSolicitante.setHorizontalAlignment(SwingConstants.CENTER);
        txtApellidoSolicitante.setForeground(Color.WHITE);
        txtApellidoSolicitante.setFont(new Font("Tahoma", Font.BOLD, 16));
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
        txtNombreSolicitante.setFont(new Font("Tahoma", Font.BOLD, 16));
        txtNombreSolicitante.setEditable(false);
        txtNombreSolicitante.setColumns(10);
        txtNombreSolicitante.setBorder(null);
        txtNombreSolicitante.setBounds(380, 338, 149, 20);
        panelResEsporad.add(txtNombreSolicitante);
       
        JLabel lblNombreCurso = new JLabel("Nombre curso");
        lblNombreCurso.setIconTextGap(10);
        lblNombreCurso.setForeground(Color.WHITE);
        lblNombreCurso.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNombreCurso.setBounds(216, 247, 112, 20);
        panelResEsporad.add(lblNombreCurso);
       
        ComBoxNombreCurso = new JComboBox();
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
        model = (DefaultTableModel) table.getModel();
       
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
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
               
 
                RegistrarBedel rg = new RegistrarBedel();
                int hora;
                int minutos;
                hora = Integer.parseInt(txtHora.getText()) *100;        
                minutos = Integer.parseInt(txtMinutos.getText());
                int horaInicio= hora + minutos;
                String durac =  (String) ComBoxDuracion.getSelectedItem();
                durac = durac.replace(":","");
                Integer duracion = Integer.valueOf(durac);
                Calendar c = Calendar.getInstance();
                Integer dia = (c.get(Calendar.DATE));
                Integer mes = (c.get(Calendar.MONTH)+1);               
                int cantRenglones = table.getRowCount();
                int banderaRepe = 0;
                int t = 0;
                int nuevoDia = (ComBoxDia.getSelectedIndex()+1);
                int nuevoMes = (ComBoxMes.getSelectedIndex()+1);
                if(cantRenglones > 0) {
                while ((banderaRepe == 0) && (t != cantRenglones)) {  //mientras no detecte solapamiento y haya mas renglones por recorrer
                    String cadenaDiaTabla = (String) table.getValueAt(t, 0);
                    int DiaTabla = Integer.valueOf(cadenaDiaTabla);             //dia de una reserva ya agregada
                    
                    String cadenaMesTabla = (String) table.getValueAt(t, 1);
                    int MesTabla = Integer.valueOf(cadenaMesTabla);             //mes de una reserva ya agregada
                    
                    String cadenaHorainicTabla = table.getValueAt(t, 2).toString();
                    cadenaHorainicTabla = cadenaHorainicTabla.replaceAll(":","");   //hora inicio de una reserva ya agregada
                    int horaInicTabla = Integer.valueOf(cadenaHorainicTabla);
                    
                    String cadenaDuracTabla = table.getValueAt(t, 3).toString();
                    cadenaDuracTabla = cadenaDuracTabla.replaceAll(":","");
                    int duracTabla = Integer.valueOf(cadenaDuracTabla);          
                    
                        if (nuevoDia == DiaTabla) {
                            if (nuevoMes == MesTabla) {                                 
                                if (horaInicio == horaInicTabla) { 
                                    if (duracion == duracTabla) { 
                                        banderaRepe = 1;    //las reservas van a ser iguales
                                    }
                                    else banderaRepe=2; //las reservas se van a solapar (empiezan al mismo horario)
                                }
                                else {
                                    if ((horaInicio > horaInicTabla) && (((horaInicio + duracion) - (horaInicTabla + duracTabla)) <= 0)){
                                            banderaRepe=3;  //estoy colocando una reserva que se solapara con otra ya ingresada
                                    }
                                    if ((horaInicio < horaInicTabla)  && (((horaInicio + duracion) - (horaInicTabla + duracTabla)) >= 0)){
                                        banderaRepe=3;  //estoy colocando una reserva que se solapara con otra ya ingresada
                                    }   
                                    if ((horaInicio < horaInicTabla)  && (horaInicio < (horaInicTabla + duracTabla))){
                                        banderaRepe=3;  //estoy colocando una reserva que se solapara con otra ya ingresada
                                    }
                                    if ((horaInicTabla + duracTabla) > (horaInicio)) {
                                        banderaRepe=3;  //estoy colocando una reserva que se solapara con otra ya ingresada
                                    }
                                }
                            }                           
                        }                                               
                t++;        
                }  
                }
                if ((ComBoxMes.getSelectedIndex()+1) >= mes){
                    if((ComBoxDia.getSelectedIndex()+1) > dia) {
                        if((hora >= 700) && (hora <= 2300)) {
                            if((minutos >= 00) && (minutos < 60)) {
                                if(horaInicio <=2330) {
                                    if((duracion + horaInicio) <=2330){
                                        switch(banderaRepe){
                                        case 0:
                                             model.addRow(new Object[]{ComBoxDia.getSelectedItem(),ComBoxMes.getSelectedItem(),txtHora.getText()+":"+txtMinutos.getText(),ComBoxDuracion.getSelectedItem()});
                                             break;
                                        case 1: mensaje("No pueden existir dos reservas iguales","ERROR");
                                            break;
                                         
                                        case 2: mensaje("la reserva se solapara con otra (mismo hora inicio)","ERROR");
                                        break;
                                        
                                        case 3: mensaje("la reserva se solapara con otra (mismo intervalo horario)","ERROR");
                                        break;
                                        }         
                                    }else mensaje("La reserva no debe durar mas de las 23:30","ERROR");                                 
                                }else mensaje("No se puede reservar despues de las 23:30","ERROR");
                            }else mensaje("error al ingresar los minutos de la reserva","ERROR");
                        }else mensaje("Las reservas deben ser entre las 7:00 y 23:30","ERROR");
                    }else mensaje("La reserva debe ser como minimo el dia siguiente al actual","ERROR");
                }else mensaje("la reserva tiene que ser en el mes actual o siguiente","ERROR");
               
            }
        });      
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
        btnQuitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if(model.getRowCount()!=0 && table.getSelectedRow()==-1) {
                    model.removeRow(table.getRowCount()-1);
                }
               else {
                   while(table.getSelectedRow()!=-1) {
                       model.removeRow(table.getSelectedRow());
                   }
                }
           
        }
               
        });
       
        JButton btnCargar = new JButton("");
        btnCargar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrarBedel rb = new RegistrarBedel();
                if(txtIdSolicitante.getText().isEmpty()) {
                   
                    rb.mensaje("Ingrese id del solicitante","Id no ingresado");
                }
                else {
                    GestorDocente gd = new GestorDocente();
                    try {
                        ArrayList<ConsultaGenerica> var = gd.buscarDocente(txtIdSolicitante.getText());
                        if(var.isEmpty()) {
                            rb.mensaje("No existe el id docente", "Id erroneo");
                        }else {
                        txtApellidoSolicitante.setText(var.get(0).getValor("apellidodoc"));
                        txtNombreSolicitante.setText(var.get(0).getValor("nombredoc"));
                        txtCorreoSolicitante.setText(var.get(0).getValor("mail"));
                        }
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                }
            }
        });
        btnCargar.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_cargar(4).png")));
        btnCargar.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_cargar.png")));
        btnCargar.setOpaque(false);
        btnCargar.setFocusable(false);
        btnCargar.setFocusPainted(false);
        btnCargar.setContentAreaFilled(false);
        btnCargar.setBorderPainted(false);
        btnCargar.setBorder(null);
        btnCargar.setBounds(415, 301, 68, 26);
        panelResEsporad.add(btnCargar);
       
        JLabel Fondo = new JLabel("");
        Fondo.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/FondoRegBed2.1.png")));
        Fondo.setBounds(0, 0, 602, 401);
        panelResEsporad.add(Fondo);
 
    }
 
    public JPanel getPanel() {
        return panelResEsporad;
    }
   
    public static void siguienteDia(ArrayList<ArrayList<ConsultaGenerica>> arr) {
       
        int day= table.getSelectedRow();
        //System.out.println(day);
        String dia;
        String mes;
      int j= table.getSelectedRow();
        int i= table.getRowCount();
       
            if(j+1==i) {
                panelresEspo.apagarSiguiente();
            }
            if(j+1==i-1 && n==1){
                panelresEspo.apagarSiguiente();
                panelresEspo.prenderAtras();
            }  
            else {
                if(table.getSelectedRow()!=0 || cont>0) {
                    panelresEspo.prenderAtras();
                }
               
            }
            control.revalidate();
            control.repaint();
            cont++;
       if(n>0 && cancel==0) {
           table.changeSelection(table.getSelectedRow()+1, 1, false, false);
           day=table.getSelectedRow();
           //System.out.println(day);
       }
            dia = String.valueOf(model.getValueAt(table.getSelectedRow(),0));
            mes = String.valueOf(model.getValueAt(table.getSelectedRow(),1));
            n=1;
            panelresEspo.setDia(dia);
            panelresEspo.setMes(mes);
            panelresEspo.repintartabla();
            panelresEspo.setSize(600,400);
            panelresEspo.setLocation(0,0);
           /* cl.show(control,"panelresEspo");
            control.revalidate();
            control.repaint();*/
            avanzarSeleccion(dia,mes,day,arr);
            
            cl.show(control,"panelresEspo");
            control.revalidate();
            control.repaint();
            cancel=0;
    }
 
    public static void avanzar() {
        siguienteDia(ar);
       
    }
   
   
   
    private void cambiaMes(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cambiaMes
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            Calendar c = Calendar.getInstance();
            Integer anio = (c.get(Calendar.YEAR));          
            int mes = ComBoxMes.getSelectedIndex()+1;
           
            if ((mes == 2) && (anio % 4 == 0)) {
                ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));                
            }
            else if ((mes == 2) && (anio % 4 != 0)) {
                ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));
            }
            else if ((mes % 2) == 0 && (mes <= 6)){
                ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
                }
            else if ((mes % 2) == 0 && (mes > 6)){
                ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30","31"}));
                }
            else if ((mes % 2) != 0 && (mes <= 7)){
                ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30","31"}));
                }
            else if ((mes % 2) != 0 && (mes > 7)){
                ComBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));
                }  
             
        }
     }
   
    private static void anteriorDia(ArrayList<ArrayList<ConsultaGenerica>> arr) {
        //int j= table.getSelectedRow();
        int i= table.getRowCount();
        int j= table.getSelectedRow()-1;
        if(j==0) {
            panelresEspo.apagarAtras();
            panelresEspo.prenderSiguiente();
        }
        else {
            panelresEspo.prenderSiguiente();
        }
        control.revalidate();
        control.repaint();
           
        String dia = String.valueOf(model.getValueAt(table.getSelectedRow()-1,0));
        String mes = String.valueOf(model.getValueAt(table.getSelectedRow()-1,1));
        table.changeSelection(table.getSelectedRow()-1, 1, false, false);
        int day= table.getSelectedRow();
        //System.out.println(day);
        panelresEspo.setDia(dia);
        panelresEspo.setMes(mes);
        panelresEspo.repintartabla();
        panelresEspo.setSize(600,400);
        panelresEspo.setLocation(0,0);
        avanzarSeleccion(dia,mes,day,arr);
        cl.show(control,"panelresEspo");
        control.revalidate();
        control.repaint();
    }
    public static void atras() {
        anteriorDia(ar);
       
    }
 
    public static void volver() {
    	control.remove(panelresEspo);
    	panelresEspo= new PanelResEsporadica();
        control.add("panelresEspo",panelresEspo);
        cl.show(control,"panelResEsporad");
       
    }
    public void seteo(ArrayList<ConsultaGenerica> cursos) {
        for(int i=0; i<cursos.size();i++) {
            ComBoxNombreCurso.addItem(cursos.get(i).getValor("nombrecurso").toString());
           
        }
       
    }
    public static void setcancel(Integer i) {
        cancel=i;
    }
    public static void avanzarSeleccion(String dia,String mes,int day,ArrayList<ArrayList<ConsultaGenerica>> arr) {
        String tipoAula =(String) ComBoxTipoDeAula.getSelectedItem();
        String hayaire="";
        String haydvd="";
        String haytv="";
        String hayproyector= "";
        String hayventilador="";
        String haypc= "";
        String cadena="";
        int z=0;
         while((z<3 && arr.get(day).size()>=3)||(arr.get(day).size()<3 && z<arr.get(day).size())) {
         
            String aire=arr.get(day).get(z).getValor("aireacondicionado");              
            if(Integer.parseInt(aire)==1) {
                hayaire="&emsp;aireacondicionado<br>";
            }
        if(tipoAula=="Multimedios") {
                String dvd=arr.get(day).get(z).getValor("dvd");
                    if(Integer.parseInt(dvd)==1) {
                        haydvd="&emsp;dvd<br>";
                    }
                String tv=arr.get(day).get(z).getValor("tv");
                    if(Integer.parseInt(tv)==1) {
                        haytv= "&emsp;tv<br>";
                    }
           
                String proyector=arr.get(day).get(z).getValor("proyector");
                    if(Integer.parseInt(proyector)==1) {
                        hayproyector= "&emsp;proyector<br>";
                    }
           
                String pc=arr.get(day).get(z).getValor("pc");
                    if(Integer.parseInt(pc)==1) {
                            haypc="&emsp;pc<br>";
                    }
            cadena = "<html>Piso: "+arr.get(day).get(z).getValor("piso")+"<br>"+"Tipo pizarron: "+arr.get(day).get(z).getValor("tipopizarron")+"<br>"+"Posee:<br>"+hayaire+""+haydvd+""+haytv+""+hayproyector+""+haypc+"</html>";                
        }
        else if (tipoAula=="Informatica") {
                String proyector=arr.get(day).get(z).getValor("proyector");
                    if(Integer.parseInt(proyector)==1) {
                        hayproyector= "&emsp;proyector<br>";
                    }
                cadena = "<html>Piso: "+arr.get(day).get(z).getValor("piso")+"<br>"+"Tipo pizarron: "+arr.get(day).get(z).getValor("tipopizarron")+"<br>"+"Cantidad de PCs: "+arr.get(day).get(z).getValor("cantpc")+"<br>"+"Posee:<br>"+hayproyector+"</html>";
               
       }
        else {
                String ventilador=arr.get(day).get(z).getValor("ventiladores");
                    if(ventilador.equals("1")) {
                        hayventilador= "&emsp;ventilador<br>";
                    }
                cadena = "<html>Piso: "+arr.get(day).get(z).getValor("piso")+"<br>"+"Tipo pizarron: "+arr.get(day).get(z).getValor("tipopizarron")+"<br>"+"Posee:<br>"+hayventilador+"</html>";
        }              
        String numAula ="";
        String capacidad="";
        numAula= arr.get(day).get(z).getValor("numeroaula");
        capacidad=arr.get(day).get(z).getValor("capacidad");
       
        panelresEspo.setModel(new Object[] {numAula,cadena,capacidad},tipoAula);
       z++;        
       }  
    }
   
   
}