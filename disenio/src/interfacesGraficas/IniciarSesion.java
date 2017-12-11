package interfacesGraficas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.JTextField;

import Entidades.ConsultaGenerica;
import Logica.GestorUsuario;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.JPasswordField;
import interfacesGraficas.InicioBedel;

class IniciarSesion {

	private JFrame frmInicioSesion;
	private JTextField textFieldNick;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IniciarSesion window = new IniciarSesion();
					window.frmInicioSesion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IniciarSesion() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInicioSesion = new JFrame();
		frmInicioSesion.setTitle("Gestor aulas FRSF");
		frmInicioSesion.setResizable(false);
		frmInicioSesion.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmInicioSesion.setBounds(100, 100, 543, 363);
		frmInicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInicioSesion.getContentPane().setLayout(null);
		
		JButton btnIngresar = new JButton("");
		btnIngresar.setFocusPainted(false);
		btnIngresar.setRolloverIcon(new ImageIcon(IniciarSesion.class.getResource("/imagenes/inicioSesionImgs/button_ingresar2.png")));
		btnIngresar.setBorderPainted(false);
		btnIngresar.setContentAreaFilled(false);
		btnIngresar.setBorder(null);
		btnIngresar.setIcon(new ImageIcon(IniciarSesion.class.getResource("/imagenes/inicioSesionImgs/button_ingresar.png")));
		btnIngresar.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent a) {
               
                String cadenaNick = textFieldNick.getText();
                String cadenaPass = passwordField.getText();
               
                   
                 
                   /*  for(ConsultaGenerica usu : res) {
                  System.out.print(usu.getValor("nickusuario") + " - " + usu.getValor("claveactual") );
                  */
                GestorUsuario gu = new GestorUsuario();
                Integer i = null;
                try {
                    i = gu.ConsultaInicio(cadenaNick);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
               
                RegistrarBedel regb = new RegistrarBedel();
 
                 ArrayList<ConsultaGenerica> res = null;
                try {
                    res = (ArrayList<ConsultaGenerica>) gu.ConsultaClave(cadenaNick);
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                switch (i){
                case 7:{
                   
                   
               
                    regb.mensaje("no existe esa combinacion","datos incorrectos");
                   
                   
                    break;
                }
                case 0:{
                   
                   
                    try {
                        if(res.get(0).getValor("claveactual").equals(cadenaPass)) {
                            InicioBedel.main(null);
                            InicioBedel.llamarBedel();
                            frmInicioSesion.dispose();
                           
                        }
                        else {
                            regb.mensaje("Contraseña incorrecta","contraseña no valida");
                        }
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                   
                   
                    break;
                }
                case 1:{
                   
                    try {
                        if(res.get(0).getValor("claveactual").equals(cadenaPass)) {
                           
                            InicioAdmin.main(null);
                            InicioAdmin.llamarAdmin(0);
                            frmInicioSesion.dispose();
                        }
                        else {
                           
                            regb.mensaje("Contraseña incorrecta","contraseña no valida");
                        }
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                   
                   
                    break;
                }
                     
                  }
                     
               
                   
                     
               
               
                               
            }
        });
		
		JButton btnSalir = new JButton("");
		btnSalir.setFocusPainted(false);
		btnSalir.setRolloverIcon(new ImageIcon(IniciarSesion.class.getResource("/imagenes/inicioSesionImgs/button_salir2.png")));
		btnSalir.setBorderPainted(false);
		btnSalir.setContentAreaFilled(false);
		btnSalir.setBorder(null);
		btnSalir.setIcon(new ImageIcon(IniciarSesion.class.getResource("/imagenes/inicioSesionImgs/button_salir.png")));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmInicioSesion.dispose();
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setBounds(377, 194, 139, 20);
		frmInicioSesion.getContentPane().add(passwordField);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalir.setBounds(357, 233, 85, 41);
		frmInicioSesion.getContentPane().add(btnSalir);
		btnIngresar.setBounds(206, 233, 127, 41);
		frmInicioSesion.getContentPane().add(btnIngresar);
		
		textFieldNick = new JTextField();
		textFieldNick.setBounds(377, 148, 139, 20);
		frmInicioSesion.getContentPane().add(textFieldNick);
		textFieldNick.setColumns(10);
		
		JLabel Contra = new JLabel("Contrase\u00F1a");
		Contra.setFont(new Font("Tahoma", Font.BOLD, 22));
		Contra.setBackground(Color.BLACK);
		Contra.setBounds(196, 192, 171, 22);
		frmInicioSesion.getContentPane().add(Contra);
		
		JLabel lblNickDeUsuario = new JLabel("Nick de usuario");
		lblNickDeUsuario.setBackground(Color.BLACK);
		lblNickDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNickDeUsuario.setBounds(196, 146, 171, 22);
		frmInicioSesion.getContentPane().add(lblNickDeUsuario);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBackground(Color.WHITE);
		Fondo.setIcon(new ImageIcon(IniciarSesion.class.getResource("/imagenes/inicioSesionImgs/cambio1.jpg")));
		Fondo.setBounds(0, 0, 538, 336);
		frmInicioSesion.getContentPane().add(Fondo);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
