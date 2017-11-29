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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModificarAulaTipoInformatica extends JPanel {
	private JTextField txtBedel;
	private JTextField txtNumero;
	private JTextField txtPiso;
	private JTextField txtCantidadPCs;

	/**
	 * Create the panel.
	 */
	public ModificarAulaTipoInformatica() {
		setLayout(null);
		
		JPanel ContentPanModifAulaTipoInformatico = new JPanel();
		ContentPanModifAulaTipoInformatico.setBounds(0, 0, 600, 400);
		add(ContentPanModifAulaTipoInformatico);
		ContentPanModifAulaTipoInformatico.setLayout(null);
		
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
		ContentPanModifAulaTipoInformatico.add(txtBedel);
		
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setRolloverIcon(new ImageIcon(ModificarAulaTipoInformatica.class.getResource("/imagenes/ModificarAulaTipoInformatica/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(ModificarAulaTipoInformatica.class.getResource("/imagenes/ModificarAulaTipoInformatica/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(47, 149, 86, 33);
		ContentPanModifAulaTipoInformatico.add(btnAtras);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setIconTextGap(10);
		lblNumero.setForeground(Color.WHITE);
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNumero.setBounds(217, 30, 144, 22);
		ContentPanModifAulaTipoInformatico.add(lblNumero);
		
		JLabel label_1 = new JLabel("Piso");
		label_1.setIconTextGap(10);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(217, 80, 37, 22);
		ContentPanModifAulaTipoInformatico.add(label_1);
		
		JLabel lblCantidadDeComputadoras = new JLabel("Cantidad de computadoras");
		lblCantidadDeComputadoras.setIconTextGap(10);
		lblCantidadDeComputadoras.setForeground(Color.WHITE);
		lblCantidadDeComputadoras.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidadDeComputadoras.setBounds(217, 130, 197, 22);
		ContentPanModifAulaTipoInformatico.add(lblCantidadDeComputadoras);
		
		JLabel lblTipoPizarron = new JLabel("Tipo pizarron");
		lblTipoPizarron.setIconTextGap(10);
		lblTipoPizarron.setForeground(Color.WHITE);
		lblTipoPizarron.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTipoPizarron.setBounds(217, 180, 118, 22);
		ContentPanModifAulaTipoInformatico.add(lblTipoPizarron);
		
		JLabel lblCanion = new JLabel("Ca\u00F1on");
		lblCanion.setIconTextGap(10);
		lblCanion.setForeground(Color.WHITE);
		lblCanion.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCanion.setBounds(217, 230, 58, 22);
		ContentPanModifAulaTipoInformatico.add(lblCanion);
		
		JLabel lblAireAcondicionado = new JLabel("Aire acondicionado");
		lblAireAcondicionado.setIconTextGap(10);
		lblAireAcondicionado.setForeground(Color.WHITE);
		lblAireAcondicionado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAireAcondicionado.setBounds(217, 280, 172, 22);
		ContentPanModifAulaTipoInformatico.add(lblAireAcondicionado);
		
		txtNumero = new JTextField();
		txtNumero.setText("MM1");
		txtNumero.setOpaque(false);
		txtNumero.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero.setForeground(Color.WHITE);
		txtNumero.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNumero.setEditable(false);
		txtNumero.setColumns(10);
		txtNumero.setBorder(null);
		txtNumero.setBounds(444, 32, 112, 20);
		ContentPanModifAulaTipoInformatico.add(txtNumero);
		
		txtPiso = new JTextField();
		txtPiso.setText("1");
		txtPiso.setOpaque(false);
		txtPiso.setHorizontalAlignment(SwingConstants.CENTER);
		txtPiso.setForeground(Color.WHITE);
		txtPiso.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtPiso.setEditable(false);
		txtPiso.setColumns(10);
		txtPiso.setBorder(null);
		txtPiso.setBounds(444, 82, 112, 20);
		ContentPanModifAulaTipoInformatico.add(txtPiso);
		
		txtCantidadPCs = new JTextField();
		txtCantidadPCs.setText("20");
		txtCantidadPCs.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidadPCs.setColumns(10);
		txtCantidadPCs.setBounds(481, 133, 37, 20);
		ContentPanModifAulaTipoInformatico.add(txtCantidadPCs);
		
		JComboBox ComBoxTipoPizzaron = new JComboBox();
		ComBoxTipoPizzaron.setModel(new DefaultComboBoxModel(new String[] {"Especial", "Fibron", "Tiza"}));
		ComBoxTipoPizzaron.setMaximumRowCount(3);
		ComBoxTipoPizzaron.setForeground(Color.BLACK);
		ComBoxTipoPizzaron.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxTipoPizzaron.setBackground(Color.WHITE);
		ComBoxTipoPizzaron.setBounds(444, 184, 106, 28);
		ContentPanModifAulaTipoInformatico.add(ComBoxTipoPizzaron);
		
		JCheckBox CheckboxCanion = new JCheckBox("");
		CheckboxCanion.setOpaque(false);
		CheckboxCanion.setBounds(481, 230, 21, 21);
		ContentPanModifAulaTipoInformatico.add(CheckboxCanion);
		
		JCheckBox checkBoxAireAcondicion = new JCheckBox("");
		checkBoxAireAcondicion.setOpaque(false);
		checkBoxAireAcondicion.setBounds(481, 280, 21, 21);
		ContentPanModifAulaTipoInformatico.add(checkBoxAireAcondicion);
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setRolloverIcon(new ImageIcon(ModificarAulaTipoInformatica.class.getResource("/imagenes/ModificarAulaTipoInformatica/button_confirmar2.png")));
		btnConfirmar.setIcon(new ImageIcon(ModificarAulaTipoInformatica.class.getResource("/imagenes/ModificarAulaTipoInformatica/button_confirmar.png")));
		btnConfirmar.setOpaque(false);
		btnConfirmar.setFocusable(false);
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBorder(null);
		btnConfirmar.setBounds(224, 329, 143, 40);
		ContentPanModifAulaTipoInformatico.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setRolloverIcon(new ImageIcon(ModificarAulaTipoInformatica.class.getResource("/imagenes/ModificarAulaTipoInformatica/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(ModificarAulaTipoInformatica.class.getResource("/imagenes/ModificarAulaTipoInformatica/button_cancelar.png")));
		btnCancelar.setOpaque(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(375, 329, 127, 40);
		ContentPanModifAulaTipoInformatico.add(btnCancelar);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ModificarAulaTipoInformatica.class.getResource("/imagenes/ModificarAulaTipoInformatica/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanModifAulaTipoInformatico.add(Fondo);

	}
}
