package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

public class BuscarBedel extends JPanel {
	private JTextField txtAdmin;
	private JTextField textField;
	private JTable table;
	private JPanel ContentPanBuscBed;

	/**
	 * Create the panel.
	 */
	public BuscarBedel() {
		setLayout(null);
		
		ContentPanBuscBed = new JPanel();
		ContentPanBuscBed.setBounds(0, 0, 600, 400);
		add(ContentPanBuscBed);
		ContentPanBuscBed.setLayout(null);
		
		txtAdmin = new JTextField();
		txtAdmin.setText("Admin");
		txtAdmin.setOpaque(false);
		txtAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdmin.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtAdmin.setFocusable(false);
		txtAdmin.setEditable(false);
		txtAdmin.setColumns(10);
		txtAdmin.setBorder(null);
		txtAdmin.setBounds(34, 107, 106, 27);
		ContentPanBuscBed.add(txtAdmin);
		
		JButton btnInicioBed = new JButton("");
		btnInicioBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblApellidoBed = new JLabel("Apellido");
		lblApellidoBed.setBounds(200, 27, 71, 20);
		ContentPanBuscBed.add(lblApellidoBed);
		lblApellidoBed.setIconTextGap(10);
		lblApellidoBed.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(200, 71, 91, 20);
		ContentPanBuscBed.add(lblTurno);
		lblTurno.setIconTextGap(10);
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JComboBox comboBoxTurno = new JComboBox();
		comboBoxTurno.setBounds(310, 71, 115, 20);
		ContentPanBuscBed.add(comboBoxTurno);
		comboBoxTurno.setForeground(Color.BLACK);
		comboBoxTurno.setBackground(Color.WHITE);
		comboBoxTurno.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBoxTurno.setModel(new DefaultComboBoxModel(new String[] {"Todos","Noche", "Tarde", "Ma\u00F1ana"}));
		comboBoxTurno.setMaximumRowCount(4);
		
		btnInicioBed.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_inicio (2).png")));
		btnInicioBed.setIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_inicio.png")));
		btnInicioBed.setOpaque(false);
		btnInicioBed.setFocusable(false);
		btnInicioBed.setFocusPainted(false);
		btnInicioBed.setContentAreaFilled(false);
		btnInicioBed.setBorderPainted(false);
		btnInicioBed.setBorder(null);
		btnInicioBed.setBounds(34, 148, 99, 49);
		ContentPanBuscBed.add(btnInicioBed);
		
		JButton btnRegBed = new JButton("");
		btnRegBed.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_registrar-bedel22.png")));
		btnRegBed.setIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_registrar-bedel2.png")));
		btnRegBed.setFocusable(false);
		btnRegBed.setFocusPainted(false);
		btnRegBed.setContentAreaFilled(false);
		btnRegBed.setBorderPainted(false);
		btnRegBed.setBorder(null);
		btnRegBed.setBounds(0, 201, 190, 49);
		ContentPanBuscBed.add(btnRegBed);
		
		textField = new JTextField();
		textField.setBounds(310, 30, 115, 20);
		ContentPanBuscBed.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("");
		button.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_buscar2.png")));
		button.setIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_buscar.png")));
		button.setOpaque(false);
		button.setFocusable(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(451, 35, 106, 49);
		ContentPanBuscBed.add(button);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Apellido", "Nombre", "Turno", "Nick de usuario"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				true, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.setBounds(200, 107, 357, 208);
		ContentPanBuscBed.add(table);
		
		JButton button_1 = new JButton("");
		button_1.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_cancelar2.png")));
		button_1.setIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_cancelar.png")));
		button_1.setOpaque(false);
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(419, 335, 115, 40);
		ContentPanBuscBed.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_modificar22.png")));
		button_2.setIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_modificar2.png")));
		button_2.setOpaque(false);
		button_2.setFocusable(false);
		button_2.setFocusPainted(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.setBorder(null);
		button_2.setBounds(190, 335, 121, 40);
		ContentPanBuscBed.add(button_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_eliminar (1)2.png")));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/button_eliminar (1).png")));
		btnNewButton.setBounds(310, 335, 110, 40);
		ContentPanBuscBed.add(btnNewButton);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(556, 107, 17, 208);
		ContentPanBuscBed.add(scrollBar);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 602, 401);
		Fondo.setIcon(new ImageIcon(BuscarBedel.class.getResource("/BuscarBedelimgs/FondoRegBed2.2.png")));
		ContentPanBuscBed.add(Fondo);

	}
	public JPanel getContentPanBuscBed() {
		return ContentPanBuscBed;
	}
}
