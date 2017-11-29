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

public class ListadoResDiaEsp extends JPanel {
	private JTextField txtNombreBedel;
	private JTextField txtReservaDelDia;
	private JTextField txtTipoDeAula;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListadoResDiaEsp() {
		setLayout(null);
		
		JPanel ContentPanListadoResDiaEsp = new JPanel();
		ContentPanListadoResDiaEsp.setBounds(0, 0, 600, 400);
		add(ContentPanListadoResDiaEsp);
		ContentPanListadoResDiaEsp.setLayout(null);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setText("Bedel");
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		txtNombreBedel.setBounds(37, 107, 112, 28);
		ContentPanListadoResDiaEsp.add(txtNombreBedel);
		
		JButton button = new JButton("");
		button.setRolloverIcon(new ImageIcon(ListadoResDiaEsp.class.getResource("/imagenes/ListadoResDiaEsp/button_atras (3)2.png")));
		button.setIcon(new ImageIcon(ListadoResDiaEsp.class.getResource("/imagenes/ListadoResDiaEsp/button_atras (3).png")));
		button.setOpaque(false);
		button.setFocusable(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		button.setBorder(null);
		button.setBounds(48, 144, 82, 36);
		ContentPanListadoResDiaEsp.add(button);
		
		JLabel lblResDelDia = new JLabel("Reserva del dia:");
		lblResDelDia.setIconTextGap(10);
		lblResDelDia.setForeground(Color.WHITE);
		lblResDelDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblResDelDia.setBounds(205, 25, 121, 20);
		ContentPanListadoResDiaEsp.add(lblResDelDia);
		
		JLabel lblTipoAula = new JLabel("Tipo de aula:");
		lblTipoAula.setIconTextGap(10);
		lblTipoAula.setForeground(Color.WHITE);
		lblTipoAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoAula.setBounds(205, 60, 121, 20);
		ContentPanListadoResDiaEsp.add(lblTipoAula);
		
		JComboBox ComBoxNumAula = new JComboBox();
		ComBoxNumAula.setModel(new DefaultComboBoxModel(new String[] {"MM1"}));
		ComBoxNumAula.setForeground(Color.BLACK);
		ComBoxNumAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		ComBoxNumAula.setBackground(Color.WHITE);
		ComBoxNumAula.setBounds(342, 94, 121, 20);
		ContentPanListadoResDiaEsp.add(ComBoxNumAula);
		
		JLabel lblNumeroDeAula = new JLabel("Numero de aula:");
		lblNumeroDeAula.setIconTextGap(10);
		lblNumeroDeAula.setForeground(Color.WHITE);
		lblNumeroDeAula.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNumeroDeAula.setBounds(205, 95, 127, 20);
		ContentPanListadoResDiaEsp.add(lblNumeroDeAula);
		
		txtReservaDelDia = new JTextField();
		txtReservaDelDia.setText("01 de Enero");
		txtReservaDelDia.setOpaque(false);
		txtReservaDelDia.setHorizontalAlignment(SwingConstants.CENTER);
		txtReservaDelDia.setForeground(Color.WHITE);
		txtReservaDelDia.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtReservaDelDia.setEditable(false);
		txtReservaDelDia.setColumns(10);
		txtReservaDelDia.setBorder(null);
		txtReservaDelDia.setBounds(357, 28, 170, 20);
		ContentPanListadoResDiaEsp.add(txtReservaDelDia);
		
		txtTipoDeAula = new JTextField();
		txtTipoDeAula.setText("Sin recursos adicionales");
		txtTipoDeAula.setOpaque(false);
		txtTipoDeAula.setHorizontalAlignment(SwingConstants.CENTER);
		txtTipoDeAula.setForeground(Color.WHITE);
		txtTipoDeAula.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTipoDeAula.setEditable(false);
		txtTipoDeAula.setColumns(10);
		txtTipoDeAula.setBorder(null);
		txtTipoDeAula.setBounds(336, 60, 222, 20);
		ContentPanListadoResDiaEsp.add(txtTipoDeAula);
		
		JButton btnImprimir = new JButton("");
		btnImprimir.setRolloverIcon(new ImageIcon(ListadoResDiaEsp.class.getResource("/imagenes/ListadoResDiaEsp/button_imprimir2.png")));
		btnImprimir.setIcon(new ImageIcon(ListadoResDiaEsp.class.getResource("/imagenes/ListadoResDiaEsp/button_imprimir.png")));
		btnImprimir.setOpaque(false);
		btnImprimir.setFocusable(false);
		btnImprimir.setFocusPainted(false);
		btnImprimir.setContentAreaFilled(false);
		btnImprimir.setBorderPainted(false);
		btnImprimir.setBorder(null);
		btnImprimir.setBounds(211, 340, 128, 40);
		ContentPanListadoResDiaEsp.add(btnImprimir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(205, 125, 385, 178);
		ContentPanListadoResDiaEsp.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"     Hora", "                                    Descripcion"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(300);
		scrollPane.setViewportView(table);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ListadoResDiaEsp.class.getResource("/imagenes/ListadoResDiaEsp/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanListadoResDiaEsp.add(Fondo);

	}
}
