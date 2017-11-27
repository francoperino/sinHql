package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelSabado extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelSabado() {
		setLayout(null);
		
		JLabel label = new JLabel("Reserva del dia:");
		label.setIconTextGap(10);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(205, 25, 121, 20);
		add(label);
		
		textField = new JTextField();
		textField.setText("Miercoles");
		textField.setOpaque(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(336, 28, 76, 17);
		add(textField);
		
		JLabel label_1 = new JLabel("Tipo de aula:");
		label_1.setIconTextGap(10);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(205, 57, 121, 20);
		add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Seleccione", "Multimedios", "Informatica", "Sin recursos adicionales"}));
		comboBox.setMaximumRowCount(4);
		comboBox.setForeground(Color.BLACK);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(312, 57, 123, 20);
		add(comboBox);
		
		JLabel label_2 = new JLabel("Hora inicio/duracion");
		label_2.setIconTextGap(10);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(445, 25, 145, 20);
		add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setText("00");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(479, 57, 30, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("00");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(445, 57, 30, 20);
		add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(514, 56, 76, 20);
		add(comboBox_1);
		
		JButton button = new JButton("");
		button.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_volver-a-buscar2.png")));
		button.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_volver-a-buscar.png")));
		button.setOpaque(false);
		button.setFocusable(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(445, 88, 132, 31);
		add(button);
		
		textField_3 = new JTextField();
		textField_3.setText("Bedel");
		textField_3.setOpaque(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setForeground(Color.WHITE);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(37, 103, 112, 28);
		add(textField_3);
		
		JButton button_1 = new JButton("");
		button_1.setRolloverIcon(new ImageIcon(PanelSabado.class.getResource("/imagenes/PanelesRegReserva/button_lunes2.png")));
		button_1.setIcon(new ImageIcon(PanelSabado.class.getResource("/imagenes/PanelesRegReserva/button_lunes.png")));
		button_1.setOpaque(false);
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(47, 140, 79, 33);
		add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_martes2.png")));
		button_2.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_martes.png")));
		button_2.setOpaque(false);
		button_2.setFocusable(false);
		button_2.setFocusPainted(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(47, 180, 89, 33);
		add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_miercoles2.png")));
		button_3.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_miercoles.png")));
		button_3.setOpaque(false);
		button_3.setFocusable(false);
		button_3.setFocusPainted(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBorder(null);
		button_3.setBounds(47, 220, 108, 33);
		add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_jueves2.png")));
		button_4.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_jueves.png")));
		button_4.setOpaque(false);
		button_4.setFocusable(false);
		button_4.setFocusPainted(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.setBorder(null);
		button_4.setBounds(47, 260, 87, 33);
		add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setRolloverIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_viernes2.png")));
		button_5.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/button_viernes.png")));
		button_5.setOpaque(false);
		button_5.setFocusable(false);
		button_5.setFocusPainted(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.setBorder(null);
		button_5.setBounds(47, 300, 93, 33);
		add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setRolloverIcon(new ImageIcon(PanelSabado.class.getResource("/imagenes/PanelesRegReserva/button_sabado (1)2.png")));
		button_6.setIcon(new ImageIcon(PanelSabado.class.getResource("/imagenes/PanelesRegReserva/button_sabado (1).png")));
		button_6.setOpaque(false);
		button_6.setFocusable(false);
		button_6.setFocusPainted(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.setBorder(null);
		button_6.setBounds(47, 340, 89, 33);
		add(button_6);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(225, 150, 352, 176);
		add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Num. Aula", "                    Caracteristicas", "Capacidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.setRowHeight(50);
		scrollPane.setViewportView(table);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(PanelLunes.class.getResource("/imagenes/PanelesRegReserva/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		add(Fondo);

	}

}