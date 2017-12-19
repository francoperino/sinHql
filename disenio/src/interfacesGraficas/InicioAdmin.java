package interfacesGraficas;
 
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
 
public class InicioAdmin extends JFrame {
   
     /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static int tipo;
    static JPanel PanelAdmin = new JPanel();
    private static JTextField txtAdmin;
    static JPanel panel1Admin = new JPanel();
    static InicioAdmin frame = new InicioAdmin();
    private static CardLayout cl;
    private static RegistrarBedel registrarBedel;
    private static BuscarBedel buscarBedel;
    private static String nombreUsuario;
   
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                   
                    frame.setVisible(true);
                    frame.setResizable(false);
                    frame.setTitle("Admin");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setBounds(100, 100, 616, 432);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
   
    public  InicioAdmin() {
       
       
        cl = new CardLayout();
        PanelAdmin.repaint();
        PanelAdmin.setBackground(Color.DARK_GRAY);
        PanelAdmin.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(PanelAdmin);
        PanelAdmin.setLayout(cl);
       
       
        panel1Admin.setBackground(Color.DARK_GRAY);
        panel1Admin.setBorder(null);
        PanelAdmin.add("panel1Admin",panel1Admin);
        panel1Admin.setLayout(null);
       
        txtAdmin = new JTextField();
        txtAdmin.setForeground(Color.WHITE);
        txtAdmin.setBounds(213, 162, 150, 28);
        panel1Admin.add(txtAdmin);
        txtAdmin.setBorder(null);
        txtAdmin.setOpaque(false);
        txtAdmin.setHorizontalAlignment(SwingConstants.CENTER);
        txtAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtAdmin.setEditable(false);
        txtAdmin.setColumns(10);
       
        registrarBedel = new RegistrarBedel();
        PanelAdmin.add("registrarBedel",registrarBedel);
       
       
       
        buscarBedel = new BuscarBedel();
        buscarBedel.setForeground(Color.DARK_GRAY);
        PanelAdmin.add("buscarBedel",buscarBedel);
       
        JButton btnRegBed = new JButton("");
        btnRegBed.setBounds(63, 220, 190, 40);
        panel1Admin.add(btnRegBed);
        btnRegBed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
                if(tipo==1) {
                    PanelAdmin.remove(registrarBedel);
                    registrarBedel = new RegistrarBedel();
                   
                    PanelAdmin.add("registrarBedel",registrarBedel);
                }
               
                registrarBedel.setSize(600,400);
                registrarBedel.setLocation(0,0);
                registrarBedel.verNombre(txtAdmin.getText());
                cl.show(PanelAdmin,"registrarBedel");
                PanelAdmin.revalidate();
                PanelAdmin.repaint();
            }
        });
        btnRegBed.setFocusPainted(false);
        btnRegBed.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_registrar-bedel2.png")));
        btnRegBed.setBorder(null);
        btnRegBed.setContentAreaFilled(false);
        btnRegBed.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_registrar-bedel.png")));
       
        JButton btnBuscarBed = new JButton("");
        btnBuscarBed.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) { //VA A INTERFAZ BUSCAR BEDEL
                if(tipo==2) {
                    PanelAdmin.remove(buscarBedel);
                    buscarBedel = new BuscarBedel();
                    buscarBedel.setForeground(Color.DARK_GRAY);
                    PanelAdmin.add("buscarBedel",buscarBedel);
                }
                buscarBedel.setSize(600,400);
                buscarBedel.setLocation(0,0);
                buscarBedel.verNombre(txtAdmin.getText());
                cl.show(PanelAdmin,"buscarBedel");
                PanelAdmin.revalidate();
                PanelAdmin.repaint();
            }
        });
        btnBuscarBed.setBounds(315, 220, 166, 40);
        panel1Admin.add(btnBuscarBed);
        btnBuscarBed.setFocusPainted(false);
        btnBuscarBed.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_buscar-bedel2.png")));
        btnBuscarBed.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_buscar-bedel.png")));
        btnBuscarBed.setContentAreaFilled(false);
        btnBuscarBed.setBorderPainted(false);
        btnBuscarBed.setBorder(null);
       
        JButton btnCerrarSesAdm = new JButton("");
        btnCerrarSesAdm.setBounds(415, 11, 173, 40);
        panel1Admin.add(btnCerrarSesAdm);
        btnCerrarSesAdm.setFocusPainted(false);
        btnCerrarSesAdm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            frame.setVisible(false);
             IniciarSesion.main(null);
           
           
               
            }
        });
        btnCerrarSesAdm.setBorder(null);
        btnCerrarSesAdm.setRolloverIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_cerrar-sesion2.png")));
        btnCerrarSesAdm.setContentAreaFilled(false);
        btnCerrarSesAdm.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/button_cerrar-sesion.png")));
       
        JLabel Fondo = new JLabel("");
        Fondo.setBounds(0, 0, 600, 398);
        panel1Admin.add(Fondo);
        Fondo.setIcon(new ImageIcon(InicioAdmin.class.getResource("/imagenes/inicioAdminImgs/fondoInicioAdmi.png")));
       
   
               
       
    }
 
    public static void  llamarAdmin(int t) {
        tipo=t;
        if(t==1) {
        	PanelAdmin.remove(registrarBedel);
            registrarBedel = new RegistrarBedel();
            PanelAdmin.add("registrarBedel",registrarBedel);
        }
        else {
        	if(t==2) {
        		PanelAdmin.remove(buscarBedel);
                buscarBedel = new BuscarBedel();
                buscarBedel.setForeground(Color.DARK_GRAY);
                
                PanelAdmin.add("buscarBedel",buscarBedel);
        	}
        }
        cl.show(PanelAdmin,"panel1Admin");
    }
 
 
    public static void mostrarrgistrarbedel() {
        /*if(tipo==1) {
            PanelAdmin.remove(registrarBedel);
            registrarBedel = new RegistrarBedel();
            PanelAdmin.add("registrarBedel",registrarBedel);
        }*/
        registrarBedel.setSize(600,400);
        registrarBedel.setLocation(0,0);
        registrarBedel.verNombre(txtAdmin.getText());
        cl.show(PanelAdmin,"registrarBedel");
        PanelAdmin.revalidate();
        PanelAdmin.repaint();
    }
 
 
    public static void mostrarBuscarBedel() {
        /*if(tipo==2) {
            PanelAdmin.remove(buscarBedel);
            buscarBedel = new BuscarBedel();
            buscarBedel.setForeground(Color.DARK_GRAY);
            
            PanelAdmin.add("buscarBedel",buscarBedel);
        }*/
        buscarBedel.setSize(600,400);
        buscarBedel.setLocation(0,0);
        buscarBedel.verNombre(txtAdmin.getText());
        cl.show(PanelAdmin,"buscarBedel");
        PanelAdmin.revalidate();
        PanelAdmin.repaint();
       
    }
    public static void verNombre(String cadenaNick) {
		txtAdmin.setText(cadenaNick);
		nombreUsuario = cadenaNick;
	}


	public static void llamarAdminPrimeraVez() {
		registrarBedel = new RegistrarBedel();
        PanelAdmin.add("registrarBedel",registrarBedel);
        buscarBedel = new BuscarBedel();
        buscarBedel.setForeground(Color.DARK_GRAY);
        PanelAdmin.add("buscarBedel",buscarBedel);
        cl.show(PanelAdmin,"panel1Admin");
	}
}