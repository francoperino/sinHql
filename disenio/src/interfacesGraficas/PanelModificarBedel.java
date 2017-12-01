package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;

import Entidades.Bedel;
import Entidades.ConsultaGenerica;
import Logica.GestorBedel;
import Logica.GestorUsuario;
import javafx.scene.control.ComboBox;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelModificarBedel extends JPanel {
	private JTextField txtAdmin;
	private JPasswordField passwordField;
	private JPasswordField passwordConfPass;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNickUsuario;
	private JComboBox ComBox;
    private String contra;
	
	public PanelModificarBedel() {
		
		
		this.setLayout(null);
		
		txtAdmin = new JTextField();
		txtAdmin.setText("Admin");
		txtAdmin.setOpaque(false);
		txtAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdmin.setForeground(Color.WHITE);
		txtAdmin.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtAdmin.setEditable(false);
		txtAdmin.setColumns(10);
		txtAdmin.setBorder(null);
		txtAdmin.setBounds(37, 109, 112, 28);
		this.add(txtAdmin);
		
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarBedel.regresar();
			}
		});
		btnAtras.setRolloverIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(47, 148, 86, 33);
		this.add(btnAtras);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setIconTextGap(10);
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblApellido.setBounds(217, 30, 71, 20);
		this.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setIconTextGap(10);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombre.setBounds(217, 80, 91, 20);
		this.add(lblNombre);
		
		JLabel lblNickUsuario = new JLabel("Nick de usuario");
		lblNickUsuario.setIconTextGap(10);
		lblNickUsuario.setForeground(Color.WHITE);
		lblNickUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNickUsuario.setBounds(217, 130, 140, 20);
		this.add(lblNickUsuario);
		
		JLabel lblContrase�a = new JLabel("Contrase\u00F1a");
		lblContrase�a.setIconTextGap(10);
		lblContrase�a.setForeground(Color.WHITE);
		lblContrase�a.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContrase�a.setBounds(217, 180, 106, 20);
		this.add(lblContrase�a);
		
		JLabel lblConfirmaContra = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmaContra.setIconTextGap(10);
		lblConfirmaContra.setForeground(Color.WHITE);
		lblConfirmaContra.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConfirmaContra.setBounds(217, 230, 213, 20);
		this.add(lblConfirmaContra);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setIconTextGap(10);
		lblTurno.setForeground(Color.WHITE);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTurno.setBounds(217, 280, 91, 20);
		this.add(lblTurno);
		
		ComBox = new JComboBox();
		ComBox.setModel(new DefaultComboBoxModel(new String[] {"Noche", "Tarde", "Ma\u00F1ana"}));
		ComBox.setMaximumRowCount(3);
		ComBox.setForeground(Color.BLACK);
		ComBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBox.setBackground(Color.WHITE);
		ComBox.setBounds(440, 280, 115, 20);
		this.add(ComBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(440, 230, 115, 20);
		this.add(passwordField);
		
		passwordField.addKeyListener(new KeyListener(){
			 int limite  = 20;
			public void keyTyped(KeyEvent e)
			 
			{if (passwordField.getText().length()== limite)
			 
			     e.consume();
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			});
		
		passwordConfPass = new JPasswordField();
		passwordConfPass.setBounds(440, 180, 115, 20);
		this.add(passwordConfPass);
		
		passwordConfPass.addKeyListener(new KeyListener(){
			 int limite  = 20;
			public void keyTyped(KeyEvent e)
			 
			{if (passwordConfPass.getText().length()== limite)
			 
			     e.consume();
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			});
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(440, 80, 115, 20);
		this.add(txtNombre);
		
		txtNombre.addKeyListener(new KeyListener(){
			 int limite  = 20;
			public void keyTyped(KeyEvent e)
			 
			{if (txtNombre.getText().length()== limite)
			 
			     e.consume();
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			});
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(440, 30, 115, 20);
		this.add(txtApellido);
		
		txtApellido.addKeyListener(new KeyListener(){
			 int limite  = 20;
			public void keyTyped(KeyEvent e)
			 
			{if (txtApellido.getText().length()== limite)
			 
			     e.consume();
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			});
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				BuscarBedel.cancelar(1);
			}
		});
		btnCancelar.setRolloverIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_cancelar.png")));
		btnCancelar.setOpaque(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(373, 324, 112, 40);
		this.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestorBedel gb = new GestorBedel();
				RegistrarBedel rg = new RegistrarBedel(); 
			     String myPass=new String (passwordField.getPassword());
			     String miPass= new String (passwordConfPass.getPassword());
			     String tu = (String) ComBox.getSelectedItem();
			     String apelido = txtApellido.getText();
			     String nobre = txtNombre.getText();
			     String nic = txtNickUsuario.getText();
			     
			     
			     
			     if(apelido.length()<2 || nobre.length()<2) {
			    	 rg.mensaje("Los campos deben contener al menos 2 digitos","Longitud incorrecta");
			     }else {
			     if(myPass.equals(miPass)){
			        Integer valor = 0;
		
						try {
							valor = gb.modificarBedel(myPass,tu,apelido,nobre,nic,contra);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
			      switch(valor){
			            case 1:
			                rg.mensaje("Debe contener como minimo un caracter especial","contrase�a invalida");
			                break;
			            case 2:
			                rg.mensaje("Debe contener como minimo un digito","contrase�a invalida");
			                break;
			                
			            case 3:
			            	 rg.mensaje("Debe contener como minimo una mayuscula","contrase�a invalida");
			                break;
			                
			            case 4:
			            	 rg.mensaje("La contrase�a no cumple con la longitud minima de la politica","contrase�a invalida");
			                break;
			            case 7:
			            	 rg.mensaje("Bedel modificado correctamente","Modificacion exitosa");
			                break;
			            
			        }
			     }
			     else{
			    	 rg.mensaje("Los dos campos de contrase�a, deben ser iguales","Contrase�as distintas");
			     }
			  }		
			}
		});
		btnConfirmar.setRolloverIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_confirmar2.png")));
		btnConfirmar.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_confirmar.png")));
		btnConfirmar.setOpaque(false);
		btnConfirmar.setFocusable(false);
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBorder(null);
		btnConfirmar.setBounds(217, 324, 143, 40);
		this.add(btnConfirmar);
		
		txtNickUsuario = new JTextField();
		txtNickUsuario.setOpaque(false);
		txtNickUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtNickUsuario.setForeground(Color.WHITE);
		txtNickUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNickUsuario.setEditable(false);
		txtNickUsuario.setColumns(10);
		txtNickUsuario.setBorder(null);
		txtNickUsuario.setBounds(399, 130, 153, 20);
		this.add(txtNickUsuario);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/FondoRegBed2.2.png")));
		Fondo.setBounds(0, 0, 602, 401);
		this.add(Fondo);
		
		

	}
    public void seteo(Bedel b) {
    	txtNombre.setText(b.getNombre());
    	txtApellido.setText(b.getApellido());
    	txtNickUsuario.setText(b.getNickusuario());
    	ComBox.setSelectedItem((String)b.getTurno());
    	ArrayList<ConsultaGenerica> res = null;
    	GestorUsuario gu = new GestorUsuario();
    	try {
			res = (ArrayList<ConsultaGenerica>) gu.ConsultaClave(b.getNickusuario());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	String pass = res.get(0).getValor("max(c.claveactual)");
    	passwordField.setText(pass);
    	passwordConfPass.setText(pass);
    	contra = pass;
    	
    }
	public JPanel getContentPanModifBedel() {
		return this.getContentPanModifBedel();
	}
}
