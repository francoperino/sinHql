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
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class RegResEsporadica extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JPanel panelResEsporad;

	/**
	 * Create the panel.
	 */
	public RegResEsporadica() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		panelResEsporad = new JPanel();
		panelResEsporad.setBounds(0, 0, 600, 400);
		add(panelResEsporad);
		panelResEsporad.setLayout(null);
		
		textField = new JTextField();
		textField.setText("Bedel");
		textField.setOpaque(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(38, 105, 112, 28);
		panelResEsporad.add(textField);
		
		JButton button = new JButton("");
		button.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_atras (3)2.png")));
		button.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_atras (3).png")));
		button.setOpaque(false);
		button.setFocusable(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(48, 144, 82, 36);
		panelResEsporad.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1)2.png")));
		button_1.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1).png")));
		button_1.setOpaque(false);
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(22, 200, 132, 40);
		panelResEsporad.add(button_1);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setIconTextGap(10);
		lblDia.setForeground(Color.WHITE);
		lblDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDia.setBounds(205, 31, 25, 20);
		panelResEsporad.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setIconTextGap(10);
		lblMes.setForeground(Color.WHITE);
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMes.setBounds(259, 31, 30, 20);
		panelResEsporad.add(lblMes);
		
		JLabel label = new JLabel("Hora inicio");
		label.setIconTextGap(10);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(310, 31, 86, 20);
		panelResEsporad.add(label);
		
		textField_1 = new JTextField();
		textField_1.setText("00");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(320, 66, 30, 20);
		panelResEsporad.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("00");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(354, 66, 30, 20);
		panelResEsporad.add(textField_2);
		
		JLabel label_1 = new JLabel("Duracion");
		label_1.setIconTextGap(10);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(415, 31, 86, 20);
		panelResEsporad.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(415, 66, 76, 20);
		panelResEsporad.add(comboBox);
		
		JButton button_3 = new JButton("");
		button_3.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_agregar2.png")));
		button_3.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_agregar.png")));
		button_3.setOpaque(false);
		button_3.setFocusable(false);
		button_3.setFocusPainted(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setBounds(499, 30, 86, 31);
		panelResEsporad.add(button_3);
		
		JButton button_2 = new JButton("");
		button_2.setRolloverIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_quitar2.png")));
		button_2.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_quitar.png")));
		button_2.setOpaque(false);
		button_2.setFocusable(false);
		button_2.setFocusPainted(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(499, 73, 86, 31);
		panelResEsporad.add(button_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(205, 66, 49, 20);
		panelResEsporad.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(259, 66, 49, 20);
		panelResEsporad.add(comboBox_2);
		
		JLabel lblCantidadDeAlumnos = new JLabel("Cantidad de alumnos");
		lblCantidadDeAlumnos.setIconTextGap(10);
		lblCantidadDeAlumnos.setForeground(Color.WHITE);
		lblCantidadDeAlumnos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidadDeAlumnos.setBounds(216, 278, 154, 20);
		panelResEsporad.add(lblCantidadDeAlumnos);
		
		textField_3 = new JTextField();
		textField_3.setText("00");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(380, 280, 30, 20);
		panelResEsporad.add(textField_3);
		
		JLabel label_2 = new JLabel("Tipo de aula");
		label_2.setIconTextGap(10);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(217, 216, 95, 20);
		panelResEsporad.add(label_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		comboBox_3.setMaximumRowCount(4);
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(324, 218, 190, 20);
		panelResEsporad.add(comboBox_3);
		
		JLabel label_3 = new JLabel("ID solicitante:");
		label_3.setIconTextGap(10);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(216, 307, 112, 20);
		panelResEsporad.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(332, 307, 70, 20);
		panelResEsporad.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("Correo");
		textField_5.setOpaque(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBounds(412, 306, 173, 20);
		panelResEsporad.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("Apellido");
		textField_6.setOpaque(false);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setForeground(Color.WHITE);
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBounds(216, 338, 160, 20);
		panelResEsporad.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("Nombre");
		textField_7.setOpaque(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setForeground(Color.WHITE);
		textField_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBorder(null);
		textField_7.setBounds(216, 369, 160, 20);
		panelResEsporad.add(textField_7);
		
		JLabel label_4 = new JLabel("Nombre curso");
		label_4.setIconTextGap(10);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(216, 247, 112, 20);
		panelResEsporad.add(label_4);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setMaximumRowCount(4);
		comboBox_4.setForeground(Color.BLACK);
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox_4.setBackground(Color.WHITE);
		comboBox_4.setBounds(323, 247, 190, 20);
		panelResEsporad.add(comboBox_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(216, 115, 358, 90);
		panelResEsporad.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Dia", "Mes", "Hora", "Duracion"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		scrollPane.setViewportView(table);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(RegResEsporadica.class.getResource("/imagenes/RegResEsporadica/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		panelResEsporad.add(Fondo);

	}

	public JPanel getPanel() {
		return panelResEsporad;
	}
}
