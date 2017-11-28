package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;

public class PanelModificarBedel extends JPanel {
	private JTextField txtAdmin;
	private JPasswordField passwordField;
	private JPasswordField passwordConfPass;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtNickUsuario;
	private JPanel ContentPanModifBedel;

	/**
	 * Create the panel.
	 */
	public PanelModificarBedel() {
		setLayout(null);
		
		ContentPanModifBedel = new JPanel();
		ContentPanModifBedel.setBounds(0, 0, 600, 400);
		add(ContentPanModifBedel);
		ContentPanModifBedel.setLayout(null);
		
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
		ContentPanModifBedel.add(txtAdmin);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(47, 148, 86, 33);
		ContentPanModifBedel.add(btnAtras);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setIconTextGap(10);
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblApellido.setBounds(217, 30, 71, 20);
		ContentPanModifBedel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setIconTextGap(10);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombre.setBounds(217, 80, 91, 20);
		ContentPanModifBedel.add(lblNombre);
		
		JLabel lblNickUsuario = new JLabel("Nick de usuario");
		lblNickUsuario.setIconTextGap(10);
		lblNickUsuario.setForeground(Color.WHITE);
		lblNickUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNickUsuario.setBounds(217, 130, 140, 20);
		ContentPanModifBedel.add(lblNickUsuario);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a");
		lblContraseña.setIconTextGap(10);
		lblContraseña.setForeground(Color.WHITE);
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContraseña.setBounds(217, 180, 106, 20);
		ContentPanModifBedel.add(lblContraseña);
		
		JLabel lblConfirmaContra = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmaContra.setIconTextGap(10);
		lblConfirmaContra.setForeground(Color.WHITE);
		lblConfirmaContra.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConfirmaContra.setBounds(217, 230, 213, 20);
		ContentPanModifBedel.add(lblConfirmaContra);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setIconTextGap(10);
		lblTurno.setForeground(Color.WHITE);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTurno.setBounds(217, 280, 91, 20);
		ContentPanModifBedel.add(lblTurno);
		
		JComboBox ComBox = new JComboBox();
		ComBox.setModel(new DefaultComboBoxModel(new String[] {"Noche", "Tarde", "Ma\u00F1ana"}));
		ComBox.setMaximumRowCount(3);
		ComBox.setForeground(Color.BLACK);
		ComBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBox.setBackground(Color.WHITE);
		ComBox.setBounds(440, 280, 115, 20);
		ContentPanModifBedel.add(ComBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(440, 230, 115, 20);
		ContentPanModifBedel.add(passwordField);
		
		passwordConfPass = new JPasswordField();
		passwordConfPass.setBounds(440, 180, 115, 20);
		ContentPanModifBedel.add(passwordConfPass);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(440, 80, 115, 20);
		ContentPanModifBedel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(440, 30, 115, 20);
		ContentPanModifBedel.add(txtApellido);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setRolloverIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_cancelar.png")));
		btnCancelar.setOpaque(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(373, 324, 112, 40);
		ContentPanModifBedel.add(btnCancelar);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setRolloverIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_confirmar2.png")));
		btnConfirmar.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/button_confirmar.png")));
		btnConfirmar.setOpaque(false);
		btnConfirmar.setFocusable(false);
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBorder(null);
		btnConfirmar.setBounds(217, 324, 143, 40);
		ContentPanModifBedel.add(btnConfirmar);
		
		txtNickUsuario = new JTextField();
		txtNickUsuario.setText("Mansilla97");
		txtNickUsuario.setOpaque(false);
		txtNickUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		txtNickUsuario.setForeground(Color.WHITE);
		txtNickUsuario.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNickUsuario.setEditable(false);
		txtNickUsuario.setColumns(10);
		txtNickUsuario.setBorder(null);
		txtNickUsuario.setBounds(440, 130, 112, 20);
		ContentPanModifBedel.add(txtNickUsuario);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(PanelModificarBedel.class.getResource("/imagenes/PanelModificarBedel/FondoRegBed2.2.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanModifBedel.add(Fondo);

	}

	public JPanel getContentPanModifBedel() {
		return ContentPanModifBedel;
	}
}
