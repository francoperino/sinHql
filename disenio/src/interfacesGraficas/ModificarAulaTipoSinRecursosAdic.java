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
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class ModificarAulaTipoSinRecursosAdic extends JPanel {
	private JTextField txtNombreBedel;
	private JTextField txtNroAula;
	private JTextField txtPisoAula;
	private JTextField txtCapacidad;

	/**
	 * Create the panel.
	 */
	public ModificarAulaTipoSinRecursosAdic() {
		setLayout(null);
		
		JPanel ContentPanModifAulaTipoSinRecAdic = new JPanel();
		ContentPanModifAulaTipoSinRecAdic.setBounds(0, 0, 600, 400);
		add(ContentPanModifAulaTipoSinRecAdic);
		ContentPanModifAulaTipoSinRecAdic.setLayout(null);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setText("Bedel");
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		txtNombreBedel.setBounds(37, 109, 112, 28);
		ContentPanModifAulaTipoSinRecAdic.add(txtNombreBedel);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(47, 149, 86, 33);
		ContentPanModifAulaTipoSinRecAdic.add(btnAtras);
		
		JLabel lblNroAula = new JLabel("Numero");
		lblNroAula.setIconTextGap(10);
		lblNroAula.setForeground(Color.WHITE);
		lblNroAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNroAula.setBounds(217, 30, 144, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblNroAula);
		
		JLabel lblPisoAula = new JLabel("Piso");
		lblPisoAula.setIconTextGap(10);
		lblPisoAula.setForeground(Color.WHITE);
		lblPisoAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPisoAula.setBounds(217, 80, 37, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblPisoAula);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setIconTextGap(10);
		lblCapacidad.setForeground(Color.WHITE);
		lblCapacidad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCapacidad.setBounds(217, 130, 100, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblCapacidad);
		
		JLabel lblTipoPizarron = new JLabel("Tipo pizarron");
		lblTipoPizarron.setIconTextGap(10);
		lblTipoPizarron.setForeground(Color.WHITE);
		lblTipoPizarron.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTipoPizarron.setBounds(217, 180, 118, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblTipoPizarron);
		
		JLabel lblVentilador = new JLabel("Ventilador");
		lblVentilador.setIconTextGap(10);
		lblVentilador.setForeground(Color.WHITE);
		lblVentilador.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVentilador.setBounds(217, 230, 100, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblVentilador);
		
		JLabel lblAireAcondicionado = new JLabel("Aire acondicionado");
		lblAireAcondicionado.setIconTextGap(10);
		lblAireAcondicionado.setForeground(Color.WHITE);
		lblAireAcondicionado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAireAcondicionado.setBounds(217, 280, 172, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblAireAcondicionado);
		
		txtNroAula = new JTextField();
		txtNroAula.setText("MM1");
		txtNroAula.setOpaque(false);
		txtNroAula.setHorizontalAlignment(SwingConstants.CENTER);
		txtNroAula.setForeground(Color.WHITE);
		txtNroAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNroAula.setEditable(false);
		txtNroAula.setColumns(10);
		txtNroAula.setBorder(null);
		txtNroAula.setBounds(444, 32, 112, 20);
		ContentPanModifAulaTipoSinRecAdic.add(txtNroAula);
		
		txtPisoAula = new JTextField();
		txtPisoAula.setText("1");
		txtPisoAula.setOpaque(false);
		txtPisoAula.setHorizontalAlignment(SwingConstants.CENTER);
		txtPisoAula.setForeground(Color.WHITE);
		txtPisoAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPisoAula.setEditable(false);
		txtPisoAula.setColumns(10);
		txtPisoAula.setBorder(null);
		txtPisoAula.setBounds(444, 82, 112, 20);
		ContentPanModifAulaTipoSinRecAdic.add(txtPisoAula);
		
		txtCapacidad = new JTextField();
		txtCapacidad.setText("20");
		txtCapacidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCapacidad.setColumns(10);
		txtCapacidad.setBounds(481, 132, 37, 20);
		ContentPanModifAulaTipoSinRecAdic.add(txtCapacidad);
		
		JComboBox ComBoxTipoPizarron = new JComboBox();
		ComBoxTipoPizarron.setModel(new DefaultComboBoxModel(new String[] {"Especial", "Fibron", "Tiza"}));
		ComBoxTipoPizarron.setMaximumRowCount(3);
		ComBoxTipoPizarron.setForeground(Color.BLACK);
		ComBoxTipoPizarron.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxTipoPizarron.setBackground(Color.WHITE);
		ComBoxTipoPizarron.setBounds(444, 182, 106, 28);
		ContentPanModifAulaTipoSinRecAdic.add(ComBoxTipoPizarron);
		
		JCheckBox checkBoxVentilador = new JCheckBox("");
		checkBoxVentilador.setOpaque(false);
		checkBoxVentilador.setBounds(482, 232, 21, 21);
		ContentPanModifAulaTipoSinRecAdic.add(checkBoxVentilador);
		
		JCheckBox checkBoxAireAcondic = new JCheckBox("");
		checkBoxAireAcondic.setOpaque(false);
		checkBoxAireAcondic.setBounds(481, 282, 21, 21);
		ContentPanModifAulaTipoSinRecAdic.add(checkBoxAireAcondic);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setRolloverIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_confirmar2.png")));
		btnConfirmar.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_confirmar.png")));
		btnConfirmar.setOpaque(false);
		btnConfirmar.setFocusable(false);
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBorder(null);
		btnConfirmar.setBounds(224, 329, 143, 40);
		ContentPanModifAulaTipoSinRecAdic.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setRolloverIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_cancelar.png")));
		btnCancelar.setOpaque(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(390, 329, 112, 40);
		ContentPanModifAulaTipoSinRecAdic.add(btnCancelar);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanModifAulaTipoSinRecAdic.add(Fondo);

	}

}
