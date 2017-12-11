package interfacesGraficas;
 
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.SwingConstants;
 
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
 
public class InicioBedel extends JFrame {
 
    //private JPanel contentPane;
    private JTextField txtBedel;
    static JPanel InicoBedel = new JPanel();
    static JPanel InicoBedel1 = new JPanel();
    private static CardLayout cl;
    static InicioBedel frame = new InicioBedel();
    private JPanel   curso = new ListaResCurso();
    private JPanel  listadia = new ListaResDiaEsp();
    private JPanel regreserva = new RegistrarReserva();
    private JPanel busaula = new BuscarAula();
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame.setVisible(true);
                    frame.setResizable(false);
                    frame.setTitle("Bedel");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setBounds(100, 100,603, 426);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public InicioBedel() {
    	
    	
        cl = new CardLayout();
        InicoBedel.repaint();
        InicoBedel.setBackground(Color.DARK_GRAY);
        InicoBedel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(InicoBedel);
        InicoBedel.setLayout(cl);
        
        
        InicoBedel1.setBackground(Color.DARK_GRAY);
       InicoBedel1.setBorder(null); 
       InicoBedel1.setLayout(null);
        InicoBedel.add("InicioBedel1",InicoBedel1);
        cl.show(InicoBedel, "InicioBedel1");
       
        
        
        InicoBedel.add("listadia",listadia);
        InicoBedel.add("curso",curso);
        InicoBedel.add("regreserva",regreserva);
        InicoBedel.add("busaula",busaula);
        
        
        
        
        JButton btnLRDiaEsp = new JButton("");
        btnLRDiaEsp.setFocusPainted(false);
        btnLRDiaEsp.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_dia-especifico (1)2.png")));
        btnLRDiaEsp.setBorderPainted(false);
        btnLRDiaEsp.setContentAreaFilled(false);
        btnLRDiaEsp.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_dia-especifico (1).png")));
        btnLRDiaEsp.setBounds(68, 286, 189, 49);
        InicoBedel1.add(btnLRDiaEsp);
        btnLRDiaEsp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    //VA A INTERFAZ REGISTRAR BEDEL
                listadia.setSize(600,400);
                listadia.setLocation(0,0);
                cl.show(InicoBedel,"listadia");
                InicoBedel.revalidate();
                InicoBedel.repaint();
            }
        });
        
        JLabel lblKf = new JLabel("Listar Reservas ");
        lblKf.setForeground(Color.WHITE);
        lblKf.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblKf.setBounds(229, 243, 142, 32);
        InicoBedel1.add(lblKf);
        
        JButton btnBuscarAula = new JButton("");
        btnBuscarAula.setFocusPainted(false);
        btnBuscarAula.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_buscar-aula2.png")));
        btnBuscarAula.setBorderPainted(false);
        btnBuscarAula.setContentAreaFilled(false);
        btnBuscarAula.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_buscar-aula.png")));
        btnBuscarAula.setBounds(339, 167, 166, 49);
        InicoBedel1.add(btnBuscarAula);
        btnBuscarAula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    //VA A INTERFAZ REGISTRAR BEDEL
                curso.setSize(600,400);
                curso.setLocation(0,0);
                cl.show(InicoBedel,"busaula");
                InicoBedel.revalidate();
                InicoBedel.repaint();
            }
        });
        
        JButton btnLRCurso = new JButton("");
        btnLRCurso.setFocusPainted(false);
        btnLRCurso.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_curso2.png")));
        btnLRCurso.setBorderPainted(false);
        btnLRCurso.setContentAreaFilled(false);
        btnLRCurso.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_curso.png")));
        btnLRCurso.setBounds(339, 286, 116, 49);
        InicoBedel1.add(btnLRCurso);
        btnLRCurso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    //VA A INTERFAZ REGISTRAR BEDEL
                curso.setSize(600,400);
                curso.setLocation(0,0);
                cl.show(InicoBedel,"curso");
                InicoBedel.revalidate();
                InicoBedel.repaint();
            }
        });
        
        JButton btnRegReserva = new JButton("");
        btnRegReserva.setFocusPainted(false);
        btnRegReserva.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_registrar-reserva2.png")));
        btnRegReserva.setBorderPainted(false);
        btnRegReserva.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_registrar-reserva.png")));
        btnRegReserva.setContentAreaFilled(false);
        btnRegReserva.setBounds(38, 167, 219, 49);
        InicoBedel1.add(btnRegReserva);
        btnRegReserva.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    //VA A INTERFAZ REGISTRAR BEDEL
                regreserva.setSize(600,400);
                regreserva.setLocation(0,0);
                cl.show(InicoBedel,"regreserva");
                InicoBedel.revalidate();
                InicoBedel.repaint();
            }
        });
        
        JButton btnCerrarSesion = new JButton("");
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	frame.setVisible(false);
                IniciarSesion.main(null);
                dispose();
            }
        });
        btnCerrarSesion.setRolloverIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_cerrar-sesion2.png")));
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/button_cerrar-sesion.png")));
        btnCerrarSesion.setBounds(381, 11, 205, 49);
        InicoBedel1.add(btnCerrarSesion);
        
        txtBedel = new JTextField();
        txtBedel.setOpaque(false);
        txtBedel.setEditable(false);
        txtBedel.setBorder(null);
        txtBedel.setDisabledTextColor(Color.WHITE);
        txtBedel.setHorizontalAlignment(SwingConstants.CENTER);
        txtBedel.setText("Bedel");
        txtBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtBedel.setForeground(Color.WHITE);
        txtBedel.setBounds(228, 134, 116, 22);
        InicoBedel1.add(txtBedel);
        txtBedel.setColumns(10);
        
        JLabel Fondo = new JLabel("");
        Fondo.setIcon(new ImageIcon(InicioBedel.class.getResource("/imagenes/InicioBedelImgs/Captura de pantalla (47).png")));
        Fondo.setBounds(0, 0, 599, 400);
        InicoBedel1.add(Fondo);
        
        
        InicoBedel.add("listadia",listadia);
        InicoBedel.add("curso",curso);
        InicoBedel.add("regreserva",regreserva);
        InicoBedel.add("busaula",busaula);
      
    }
    public static void  llamarBedel() {
        cl.show(InicoBedel,"InicioBedel1");
    }

}