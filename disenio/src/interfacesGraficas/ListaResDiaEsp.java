package interfacesGraficas;
 
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
 
public class ListaResDiaEsp extends JPanel {
    private static JTextField txtNombreBedel;
    private static String nombreUsuario;
 
    /**
     * Create the panel.
     */
    public ListaResDiaEsp() {
        setLayout(null);
        
        JPanel ContentPanListaResDiaEsp = new JPanel();
        ContentPanListaResDiaEsp.setBounds(0, 0, 600, 400);
        add(ContentPanListaResDiaEsp);
        ContentPanListaResDiaEsp.setLayout(null);
        
        txtNombreBedel = new JTextField();
        txtNombreBedel.setText("Bedel");
        txtNombreBedel.setOpaque(false);
        txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
        txtNombreBedel.setForeground(Color.WHITE);
        txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
        txtNombreBedel.setEditable(false);
        txtNombreBedel.setColumns(10);
        txtNombreBedel.setBorder(null);
        txtNombreBedel.setBounds(38, 107, 112, 28);
        ContentPanListaResDiaEsp.add(txtNombreBedel);
        
        JLabel lblDia = new JLabel("Dia");
        lblDia.setIconTextGap(10);
        lblDia.setForeground(Color.WHITE);
        lblDia.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblDia.setBounds(217, 30, 71, 20);
        ContentPanListaResDiaEsp.add(lblDia);
        
        JLabel lblTipoDeAula = new JLabel("Tipo de aula");
        lblTipoDeAula.setIconTextGap(10);
        lblTipoDeAula.setForeground(Color.WHITE);
        lblTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTipoDeAula.setBounds(212, 80, 112, 20);
        ContentPanListaResDiaEsp.add(lblTipoDeAula);
        
        JLabel lblAula = new JLabel("Aula");
        lblAula.setIconTextGap(10);
        lblAula.setForeground(Color.WHITE);
        lblAula.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblAula.setBounds(212, 130, 40, 20);
        ContentPanListaResDiaEsp.add(lblAula);
        
        JComboBox comBoxDia = new JComboBox();
        comBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        comBoxDia.setForeground(Color.BLACK);
        comBoxDia.setFont(new Font("Tahoma", Font.BOLD, 16));
        comBoxDia.setBackground(Color.WHITE);
        comBoxDia.setBounds(346, 30, 48, 20);
        ContentPanListaResDiaEsp.add(comBoxDia);
        
        JComboBox comBoxMes = new JComboBox();
        comBoxMes.setModel(new DefaultComboBoxModel(new String[] {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}));
        comBoxMes.setMaximumRowCount(3);
        comBoxMes.setForeground(Color.BLACK);
        comBoxMes.setFont(new Font("Tahoma", Font.BOLD, 16));
        comBoxMes.setBackground(Color.WHITE);
        comBoxMes.setBounds(421, 30, 132, 20);
        ContentPanListaResDiaEsp.add(comBoxMes);
        
        JComboBox comBoxTipoAula = new JComboBox();
        comBoxTipoAula.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
        comBoxTipoAula.setMaximumRowCount(4);
        comBoxTipoAula.setForeground(Color.BLACK);
        comBoxTipoAula.setFont(new Font("Tahoma", Font.BOLD, 14));
        comBoxTipoAula.setBackground(Color.WHITE);
        comBoxTipoAula.setBounds(345, 83, 190, 20);
        ContentPanListaResDiaEsp.add(comBoxTipoAula);
        
        JComboBox comBoxAula = new JComboBox();
        comBoxAula.setModel(new DefaultComboBoxModel(new String[] {"MM1"}));
        comBoxAula.setMaximumRowCount(3);
        comBoxAula.setForeground(Color.BLACK);
        comBoxAula.setFont(new Font("Tahoma", Font.BOLD, 16));
        comBoxAula.setBackground(Color.WHITE);
        comBoxAula.setBounds(346, 133, 82, 20);
        ContentPanListaResDiaEsp.add(comBoxAula);
        
        JButton btnBuscar = new JButton("");
        btnBuscar.setRolloverIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_buscar2.png")));
        btnBuscar.setIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_buscar.png")));
        btnBuscar.setOpaque(false);
        btnBuscar.setFocusable(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setBorder(null);
        btnBuscar.setBounds(212, 176, 106, 40);
        ContentPanListaResDiaEsp.add(btnBuscar);
        
        JButton bntInicio = new JButton("");
        bntInicio.setRolloverIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_inicio (2).png")));
        bntInicio.setIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_inicio.png")));
        bntInicio.setOpaque(false);
        bntInicio.setFocusable(false);
        bntInicio.setFocusPainted(false);
        bntInicio.setContentAreaFilled(false);
        bntInicio.setBorderPainted(false);
        bntInicio.setBorder(null);
        bntInicio.setBounds(48, 146, 93, 40);
        ContentPanListaResDiaEsp.add(bntInicio);
        bntInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                InicioBedel.llamarBedel(0);
            }
        });
        
        JButton btnRegRes = new JButton("");
        btnRegRes.setRolloverIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_registrar-reserva (1)2.png")));
        btnRegRes.setIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_registrar-reserva (1).png")));
        btnRegRes.setOpaque(false);
        btnRegRes.setFocusable(false);
        btnRegRes.setFocusPainted(false);
        btnRegRes.setContentAreaFilled(false);
        btnRegRes.setBorderPainted(false);
        btnRegRes.setBorder(null);
        btnRegRes.setBounds(10, 197, 158, 40);
        ContentPanListaResDiaEsp.add(btnRegRes);
        btnRegRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				RegistrarReserva.verNombre(nombreUsuario);
				InicioBedel.mostrarregreserva();
			}
		});
        
        JButton btnBuscarAula = new JButton("");
        btnBuscarAula.setRolloverIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResCurso/button_buscar-aula2.png")));
        btnBuscarAula.setIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_buscar-aula.png")));
        btnBuscarAula.setOpaque(false);
        btnBuscarAula.setFocusable(false);
        btnBuscarAula.setFocusPainted(false);
        btnBuscarAula.setContentAreaFilled(false);
        btnBuscarAula.setBorderPainted(false);
        btnBuscarAula.setBorder(null);
        btnBuscarAula.setBounds(10, 247, 158, 40);
        ContentPanListaResDiaEsp.add(btnBuscarAula);
        btnBuscarAula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				BuscarAula.verNombre(nombreUsuario);
				InicioBedel.mostrarbusaula();
			}
		});
        
        JLabel lblListRes = new JLabel("Listar Reserva");
        lblListRes.setForeground(Color.WHITE);
        lblListRes.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblListRes.setBounds(10, 295, 131, 28);
        ContentPanListaResDiaEsp.add(lblListRes);
        
        JButton btnRegCurso = new JButton("");
        btnRegCurso.setRolloverIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_curso2.png")));
        btnRegCurso.setIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/button_curso.png")));
        btnRegCurso.setFocusPainted(false);
        btnRegCurso.setContentAreaFilled(false);
        btnRegCurso.setBorderPainted(false);
        btnRegCurso.setBounds(5, 330, 130, 48);
        ContentPanListaResDiaEsp.add(btnRegCurso);
        btnRegCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				ListaResCurso.verNombre(nombreUsuario);
				InicioBedel.mostrarcurso();
			}
		});
        
        JLabel Fondo = new JLabel("");
        Fondo.setIcon(new ImageIcon(ListaResDiaEsp.class.getResource("/imagenes/ListaResDiaEsp/FondoRegBed2.1.png")));
        Fondo.setBounds(0, 0, 602, 401);
        ContentPanListaResDiaEsp.add(Fondo);
 
    }

	public static void verNombre(String cadenaNick) {
		txtNombreBedel.setText(cadenaNick);
		nombreUsuario = cadenaNick;		
		
	}
 
}