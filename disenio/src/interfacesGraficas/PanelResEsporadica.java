package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelResEsporadica extends JPanel {
	private JTextField txtNombreBedel;
	private JTextField txtReservaDelDia;
	private JTextField txtDia;
	private JLabel lblReservaDelDia;
	private JLabel lblMes;
	private JPanel ContentPanResEsporadica;
	private JTable table;
	private JButton button_1;

	/**
	 * Create the panel.
	 */
	public PanelResEsporadica() {
		setLayout(null);
		
		ContentPanResEsporadica = new JPanel();
		ContentPanResEsporadica.setBounds(0, 0, 600, 400);
		add(ContentPanResEsporadica);
		ContentPanResEsporadica.setLayout(null);
		
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
		ContentPanResEsporadica.add(txtNombreBedel);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(48, 144, 82, 36);
		ContentPanResEsporadica.add(btnAtras);
		
		txtReservaDelDia = new JTextField();
		txtReservaDelDia.setText("01");
		txtReservaDelDia.setOpaque(false);
		txtReservaDelDia.setHorizontalAlignment(SwingConstants.CENTER);
		txtReservaDelDia.setForeground(Color.WHITE);
		txtReservaDelDia.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtReservaDelDia.setEditable(false);
		txtReservaDelDia.setColumns(10);
		txtReservaDelDia.setBorder(null);
		txtReservaDelDia.setBounds(365, 36, 30, 28);
		ContentPanResEsporadica.add(txtReservaDelDia);
		
		txtDia = new JTextField();
		txtDia.setText("01");
		txtDia.setOpaque(false);
		txtDia.setHorizontalAlignment(SwingConstants.CENTER);
		txtDia.setForeground(Color.WHITE);
		txtDia.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDia.setEditable(false);
		txtDia.setColumns(10);
		txtDia.setBorder(null);
		txtDia.setBounds(365, 72, 30, 28);
		ContentPanResEsporadica.add(txtDia);
		
		lblReservaDelDia = new JLabel("Reserva del dia:");
		lblReservaDelDia.setIconTextGap(10);
		lblReservaDelDia.setForeground(Color.WHITE);
		lblReservaDelDia.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblReservaDelDia.setBounds(197, 40, 148, 20);
		ContentPanResEsporadica.add(lblReservaDelDia);
		
		lblMes = new JLabel("Mes:");
		lblMes.setIconTextGap(10);
		lblMes.setForeground(Color.WHITE);
		lblMes.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMes.setBounds(197, 76, 43, 20);
		ContentPanResEsporadica.add(lblMes);
		
		JScrollPane tablaDatos = new JScrollPane();
		tablaDatos.setBounds(205, 140, 352, 176);
		ContentPanResEsporadica.add(tablaDatos);
		
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
				false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setPreferredWidth(60);
		table.setRowHeight(50);
		tablaDatos.setViewportView(table);
		
		button_1 = new JButton("");
		button_1.setRolloverIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1)2.png")));
		button_1.setIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1).png")));
		button_1.setOpaque(false);
		button_1.setFocusable(false);
		button_1.setFocusPainted(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.setBorder(null);
		button_1.setBounds(22, 200, 132, 40);
		ContentPanResEsporadica.add(button_1);
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 602, 401);
		Fondo.setIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/FondoRegBed2.1.png")));
		ContentPanResEsporadica.add(Fondo);

	}

	public JPanel getContentPanResEsporadica() {
		return ContentPanResEsporadica;
	}
}
