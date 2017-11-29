package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class ModificarAulaTipoMultimedios extends JPanel {
	private JTextField txtNumAula;
	private JTextField txtPisoAula;
	private JTextField txtCapacidadAula;
	private JTextField txtBedel;

	/**
	 * Create the panel.
	 */
	public ModificarAulaTipoMultimedios() {
		setLayout(null);
		
		JPanel ContentPanModifAulaTipoMultimedios = new JPanel();
		ContentPanModifAulaTipoMultimedios.setBounds(0, 0, 600, 400);
		add(ContentPanModifAulaTipoMultimedios);
		ContentPanModifAulaTipoMultimedios.setLayout(null);
		
		JLabel lblNumeroAula = new JLabel("Numero");
		lblNumeroAula.setIconTextGap(10);
		lblNumeroAula.setForeground(Color.WHITE);
		lblNumeroAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNumeroAula.setBounds(217, 30, 73, 22);
		ContentPanModifAulaTipoMultimedios.add(lblNumeroAula);
		
		JLabel lblPisoAula = new JLabel("Piso");
		lblPisoAula.setIconTextGap(10);
		lblPisoAula.setForeground(Color.WHITE);
		lblPisoAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPisoAula.setBounds(217, 65, 37, 22);
		ContentPanModifAulaTipoMultimedios.add(lblPisoAula);
		
		JLabel lblCantidad = new JLabel("Capacidad");
		lblCantidad.setIconTextGap(10);
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCantidad.setBounds(217, 100, 93, 22);
		ContentPanModifAulaTipoMultimedios.add(lblCantidad);
		
		JLabel lblTelevisor = new JLabel("Televisor");
		lblTelevisor.setIconTextGap(10);
		lblTelevisor.setForeground(Color.WHITE);
		lblTelevisor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTelevisor.setBounds(217, 135, 118, 22);
		ContentPanModifAulaTipoMultimedios.add(lblTelevisor);
		
		JLabel lblCanion = new JLabel("Ca\u00F1on");
		lblCanion.setIconTextGap(10);
		lblCanion.setForeground(Color.WHITE);
		lblCanion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCanion.setBounds(217, 170, 58, 22);
		ContentPanModifAulaTipoMultimedios.add(lblCanion);
		
		JLabel lblComputadora = new JLabel("Computadora");
		lblComputadora.setIconTextGap(10);
		lblComputadora.setForeground(Color.WHITE);
		lblComputadora.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblComputadora.setBounds(217, 205, 172, 22);
		ContentPanModifAulaTipoMultimedios.add(lblComputadora);
		
		JLabel lblDvd = new JLabel("Dvd");
		lblDvd.setIconTextGap(10);
		lblDvd.setForeground(Color.WHITE);
		lblDvd.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDvd.setBounds(217, 240, 118, 22);
		ContentPanModifAulaTipoMultimedios.add(lblDvd);
		
		JLabel lblAire = new JLabel("Aire acondicionado");
		lblAire.setIconTextGap(10);
		lblAire.setForeground(Color.WHITE);
		lblAire.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAire.setBounds(217, 275, 172, 22);
		ContentPanModifAulaTipoMultimedios.add(lblAire);
		
		JLabel lblTipoDePizarron = new JLabel("Tipo de pizarron");
		lblTipoDePizarron.setIconTextGap(10);
		lblTipoDePizarron.setForeground(Color.WHITE);
		lblTipoDePizarron.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTipoDePizarron.setBounds(217, 310, 172, 22);
		ContentPanModifAulaTipoMultimedios.add(lblTipoDePizarron);
		
		txtNumAula = new JTextField();
		txtNumAula.setText("MM1");
		txtNumAula.setOpaque(false);
		txtNumAula.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumAula.setForeground(Color.WHITE);
		txtNumAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNumAula.setEditable(false);
		txtNumAula.setColumns(10);
		txtNumAula.setBorder(null);
		txtNumAula.setBounds(441, 31, 112, 20);
		ContentPanModifAulaTipoMultimedios.add(txtNumAula);
		
		txtPisoAula = new JTextField();
		txtPisoAula.setText("1");
		txtPisoAula.setOpaque(false);
		txtPisoAula.setHorizontalAlignment(SwingConstants.CENTER);
		txtPisoAula.setForeground(Color.WHITE);
		txtPisoAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPisoAula.setEditable(false);
		txtPisoAula.setColumns(10);
		txtPisoAula.setBorder(null);
		txtPisoAula.setBounds(441, 66, 112, 20);
		ContentPanModifAulaTipoMultimedios.add(txtPisoAula);
		
		txtCapacidadAula = new JTextField();
		txtCapacidadAula.setText("20");
		txtCapacidadAula.setHorizontalAlignment(SwingConstants.CENTER);
		txtCapacidadAula.setColumns(10);
		txtCapacidadAula.setBounds(480, 104, 37, 20);
		ContentPanModifAulaTipoMultimedios.add(txtCapacidadAula);
		
		JCheckBox checkBoxTelevisor = new JCheckBox("");
		checkBoxTelevisor.setOpaque(false);
		checkBoxTelevisor.setBounds(490, 135, 21, 21);
		ContentPanModifAulaTipoMultimedios.add(checkBoxTelevisor);
		
		JCheckBox checkBoxCanion = new JCheckBox("");
		checkBoxCanion.setOpaque(false);
		checkBoxCanion.setBounds(490, 170, 21, 21);
		ContentPanModifAulaTipoMultimedios.add(checkBoxCanion);
		
		JCheckBox checkBoxComputadora = new JCheckBox("");
		checkBoxComputadora.setOpaque(false);
		checkBoxComputadora.setBounds(490, 205, 21, 21);
		ContentPanModifAulaTipoMultimedios.add(checkBoxComputadora);
		
		JCheckBox checkBoxDvd = new JCheckBox("");
		checkBoxDvd.setOpaque(false);
		checkBoxDvd.setBounds(490, 240, 21, 21);
		ContentPanModifAulaTipoMultimedios.add(checkBoxDvd);
		
		JCheckBox checkBoxAireAcondic = new JCheckBox("");
		checkBoxAireAcondic.setOpaque(false);
		checkBoxAireAcondic.setBounds(490, 275, 21, 21);
		ContentPanModifAulaTipoMultimedios.add(checkBoxAireAcondic);
		
		JComboBox comBoxTipoPizarron = new JComboBox();
		comBoxTipoPizarron.setModel(new DefaultComboBoxModel(new String[] {"Especial", "Fibron", "Tiza"}));
		comBoxTipoPizarron.setMaximumRowCount(4);
		comBoxTipoPizarron.setForeground(Color.BLACK);
		comBoxTipoPizarron.setFont(new Font("Tahoma", Font.BOLD, 14));
		comBoxTipoPizarron.setBackground(Color.WHITE);
		comBoxTipoPizarron.setBounds(458, 312, 82, 23);
		ContentPanModifAulaTipoMultimedios.add(comBoxTipoPizarron);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setRolloverIcon(new ImageIcon(ModificarAulaTipoMultimedios.class.getResource("/imagenes/ModificarAulaTipoMultimedios/button_confirmar2.png")));
		btnConfirmar.setIcon(new ImageIcon(ModificarAulaTipoMultimedios.class.getResource("/imagenes/ModificarAulaTipoMultimedios/button_confirmar.png")));
		btnConfirmar.setOpaque(false);
		btnConfirmar.setFocusable(false);
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBorder(null);
		btnConfirmar.setBounds(227, 343, 143, 40);
		ContentPanModifAulaTipoMultimedios.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setRolloverIcon(new ImageIcon(ModificarAulaTipoMultimedios.class.getResource("/imagenes/ModificarAulaTipoMultimedios/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(ModificarAulaTipoMultimedios.class.getResource("/imagenes/ModificarAulaTipoMultimedios/button_cancelar.png")));
		btnCancelar.setOpaque(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(393, 343, 112, 40);
		ContentPanModifAulaTipoMultimedios.add(btnCancelar);
		
		txtBedel = new JTextField();
		txtBedel.setText("Bedel");
		txtBedel.setOpaque(false);
		txtBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtBedel.setForeground(Color.WHITE);
		txtBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBedel.setEditable(false);
		txtBedel.setColumns(10);
		txtBedel.setBorder(null);
		txtBedel.setBounds(37, 109, 112, 28);
		ContentPanModifAulaTipoMultimedios.add(txtBedel);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(ModificarAulaTipoMultimedios.class.getResource("/imagenes/ModificarAulaTipoMultimedios/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(ModificarAulaTipoMultimedios.class.getResource("/imagenes/ModificarAulaTipoMultimedios/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(47, 149, 86, 33);
		ContentPanModifAulaTipoMultimedios.add(btnAtras);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ModificarAulaTipoMultimedios.class.getResource("/imagenes/ModificarAulaTipoMultimedios/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanModifAulaTipoMultimedios.add(Fondo);

	}

}
