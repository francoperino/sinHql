package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PanelEliminarBedel extends JPanel {
	private JTextField txtApellido;
	private JTextField txtNombre;
	private JTextField txtTurno;
	private JTextField txtNickUs;
	private JPanel ContentPanEliminarBedel;

	/**
	 * Create the panel.
	 */
	public PanelEliminarBedel() {
		setLayout(null);
		
		ContentPanEliminarBedel = new JPanel();
		ContentPanEliminarBedel.setBounds(0, 0, 600, 400);
		add(ContentPanEliminarBedel);
		ContentPanEliminarBedel.setLayout(null);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setIconTextGap(10);
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblApellido.setBounds(255, 117, 71, 20);
		ContentPanEliminarBedel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setIconTextGap(10);
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNombre.setBounds(255, 167, 91, 20);
		ContentPanEliminarBedel.add(lblNombre);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setIconTextGap(10);
		lblTurno.setForeground(Color.WHITE);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTurno.setBounds(255, 217, 91, 20);
		ContentPanEliminarBedel.add(lblTurno);
		
		txtApellido = new JTextField();
		txtApellido.setText("Mansilla");
		txtApellido.setOpaque(false);
		txtApellido.setHorizontalAlignment(SwingConstants.CENTER);
		txtApellido.setForeground(Color.WHITE);
		txtApellido.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtApellido.setEditable(false);
		txtApellido.setColumns(10);
		txtApellido.setBorder(null);
		txtApellido.setBounds(415, 120, 112, 20);
		ContentPanEliminarBedel.add(txtApellido);
		
		txtNombre = new JTextField();
		txtNombre.setText("Milton");
		txtNombre.setOpaque(false);
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombre.setForeground(Color.WHITE);
		txtNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		txtNombre.setBounds(415, 170, 112, 20);
		ContentPanEliminarBedel.add(txtNombre);
		
		txtTurno = new JTextField();
		txtTurno.setText("Noche");
		txtTurno.setOpaque(false);
		txtTurno.setHorizontalAlignment(SwingConstants.CENTER);
		txtTurno.setForeground(Color.WHITE);
		txtTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTurno.setEditable(false);
		txtTurno.setColumns(10);
		txtTurno.setBorder(null);
		txtTurno.setBounds(415, 220, 112, 20);
		ContentPanEliminarBedel.add(txtTurno);
		
		txtNickUs = new JTextField();
		txtNickUs.setText("Admin");
		txtNickUs.setOpaque(false);
		txtNickUs.setHorizontalAlignment(SwingConstants.CENTER);
		txtNickUs.setForeground(Color.WHITE);
		txtNickUs.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtNickUs.setFocusable(false);
		txtNickUs.setEditable(false);
		txtNickUs.setColumns(10);
		txtNickUs.setBorder(null);
		txtNickUs.setBounds(34, 107, 106, 27);
		ContentPanEliminarBedel.add(txtNickUs);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(PanelEliminarBedel.class.getResource("/imagenes/PanelEliminarBedel/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(PanelEliminarBedel.class.getResource("/imagenes/PanelEliminarBedel/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(44, 145, 86, 33);
		ContentPanEliminarBedel.add(btnAtras);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setRolloverIcon(new ImageIcon(PanelEliminarBedel.class.getResource("/imagenes/PanelEliminarBedel/button_confirmar2.png")));
		btnConfirmar.setIcon(new ImageIcon(PanelEliminarBedel.class.getResource("/imagenes/PanelEliminarBedel/button_confirmar.png")));
		btnConfirmar.setOpaque(false);
		btnConfirmar.setFocusable(false);
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBorder(null);
		btnConfirmar.setBounds(240, 291, 143, 40);
		ContentPanEliminarBedel.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setRolloverIcon(new ImageIcon(PanelEliminarBedel.class.getResource("/imagenes/PanelEliminarBedel/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(PanelEliminarBedel.class.getResource("/imagenes/PanelEliminarBedel/button_cancelar.png")));
		btnCancelar.setOpaque(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(393, 291, 127, 40);
		ContentPanEliminarBedel.add(btnCancelar);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(PanelEliminarBedel.class.getResource("/imagenes/PanelEliminarBedel/FondoRegBed2.2.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanEliminarBedel.add(Fondo);

	}

	public JPanel getContentPanEliminarBedel() {
		return ContentPanEliminarBedel;
	}
}
