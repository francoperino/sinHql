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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public ModificarAulaTipoSinRecursosAdic() {
		setLayout(null);
		
		JPanel ContentPanModifAulaTipoSinRecAdic = new JPanel();
		ContentPanModifAulaTipoSinRecAdic.setBounds(0, 0, 600, 400);
		add(ContentPanModifAulaTipoSinRecAdic);
		ContentPanModifAulaTipoSinRecAdic.setLayout(null);
		
		textField = new JTextField();
		textField.setText("Bedel");
		textField.setOpaque(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(37, 109, 112, 28);
		ContentPanModifAulaTipoSinRecAdic.add(textField);
		
		JButton button = new JButton("");
		button.setRolloverIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_atras (3)2.png")));
		button.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_atras (3).png")));
		button.setOpaque(false);
		button.setFocusable(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(47, 149, 86, 33);
		ContentPanModifAulaTipoSinRecAdic.add(button);
		
		JLabel label = new JLabel("Numero");
		label.setIconTextGap(10);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(217, 30, 144, 22);
		ContentPanModifAulaTipoSinRecAdic.add(label);
		
		JLabel label_1 = new JLabel("Piso");
		label_1.setIconTextGap(10);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_1.setBounds(217, 80, 37, 22);
		ContentPanModifAulaTipoSinRecAdic.add(label_1);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setIconTextGap(10);
		lblCapacidad.setForeground(Color.WHITE);
		lblCapacidad.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblCapacidad.setBounds(217, 130, 100, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblCapacidad);
		
		JLabel label_3 = new JLabel("Tipo pizarron");
		label_3.setIconTextGap(10);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_3.setBounds(217, 180, 118, 22);
		ContentPanModifAulaTipoSinRecAdic.add(label_3);
		
		JLabel lblVentilador = new JLabel("Ventilador");
		lblVentilador.setIconTextGap(10);
		lblVentilador.setForeground(Color.WHITE);
		lblVentilador.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVentilador.setBounds(217, 230, 100, 22);
		ContentPanModifAulaTipoSinRecAdic.add(lblVentilador);
		
		JLabel label_5 = new JLabel("Aire acondicionado");
		label_5.setIconTextGap(10);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(217, 280, 172, 22);
		ContentPanModifAulaTipoSinRecAdic.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setText("MM1");
		textField_1.setOpaque(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(444, 32, 112, 20);
		ContentPanModifAulaTipoSinRecAdic.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("1");
		textField_2.setOpaque(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(444, 82, 112, 20);
		ContentPanModifAulaTipoSinRecAdic.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("20");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(481, 132, 37, 20);
		ContentPanModifAulaTipoSinRecAdic.add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Especial", "Fibron", "Tiza"}));
		comboBox.setMaximumRowCount(3);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(444, 182, 106, 28);
		ContentPanModifAulaTipoSinRecAdic.add(comboBox);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setOpaque(false);
		checkBox.setBounds(482, 232, 21, 21);
		ContentPanModifAulaTipoSinRecAdic.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setOpaque(false);
		checkBox_1.setBounds(481, 282, 21, 21);
		ContentPanModifAulaTipoSinRecAdic.add(checkBox_1);
		
		JButton button_1 = new JButton("");
		button_1.setRolloverIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_confirmar2.png")));
		button_1.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_confirmar.png")));
		button_1.setOpaque(false);
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(224, 329, 143, 40);
		ContentPanModifAulaTipoSinRecAdic.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setRolloverIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_cancelar2.png")));
		button_2.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/button_cancelar.png")));
		button_2.setOpaque(false);
		button_2.setFocusable(false);
		button_2.setFocusPainted(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(390, 329, 112, 40);
		ContentPanModifAulaTipoSinRecAdic.add(button_2);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ModificarAulaTipoSinRecursosAdic.class.getResource("/imagenes/ModificarAulaTipoSinRecursosAdic/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanModifAulaTipoSinRecAdic.add(Fondo);

	}

}
