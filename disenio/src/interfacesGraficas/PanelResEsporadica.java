package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelResEsporadica extends JPanel {
	private JTextField txtNombreBedel;
	private JTextField txtReservaDelDia;
	private JTextField txtMes;
	private JLabel lblReservaDelDia;
	private JLabel lblMes;
	private JPanel ContentPanResEsporadica;
	private JTable table;
	private JButton btnSiguiente;
	private JButton btnAtras;
	
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
		
		btnAtras = new JButton("");
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
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegResEsporadica.atras();
			}      
		});
		
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
		
		txtMes = new JTextField();
		txtMes.setText("01");
		txtMes.setOpaque(false);
		txtMes.setHorizontalAlignment(SwingConstants.CENTER);
		txtMes.setForeground(Color.WHITE);
		txtMes.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtMes.setEditable(false);
		txtMes.setColumns(10);
		txtMes.setBorder(null);
		txtMes.setBounds(365, 72, 30, 28);
		ContentPanResEsporadica.add(txtMes);
		
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
		
		btnSiguiente = new JButton("");
		btnSiguiente.setRolloverIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1)2.png")));
		btnSiguiente.setIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/RegResEsporadica/button_siguiente (1).png")));
		btnSiguiente.setOpaque(false);
		btnSiguiente.setFocusable(false);
		btnSiguiente.setFocusPainted(false);
		btnSiguiente.setContentAreaFilled(false);
		btnSiguiente.setBorderPainted(false);
		btnSiguiente.setBorder(null);
		btnSiguiente.setBounds(22, 200, 132, 40);
		ContentPanResEsporadica.add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegResEsporadica.avanzar();
			}      
		});
		
		JButton btnAceptar = new JButton("");
		btnAceptar.setRolloverIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/button_registrar2.png")));
		btnAceptar.setIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/button_registrar.png")));
		btnAceptar.setOpaque(false);
		btnAceptar.setFocusable(false);
		btnAceptar.setFocusPainted(false);
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setBorderPainted(false);
		btnAceptar.setBorder(null);
		btnAceptar.setBounds(22, 258, 132, 40);
		ContentPanResEsporadica.add(btnAceptar);
		
		JButton btnCancerlar = new JButton("");
		btnCancerlar.setIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/button_cancelar.png")));
		btnCancerlar.setRolloverIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/button_cancelar2.png")));
		btnCancerlar.setOpaque(false);
		btnCancerlar.setFocusable(false);
		btnCancerlar.setFocusPainted(false);
		btnCancerlar.setContentAreaFilled(false);
		btnCancerlar.setBorderPainted(false);
		btnCancerlar.setBorder(null);
		btnCancerlar.setBounds(22, 309, 132, 40);
		ContentPanResEsporadica.add(btnCancerlar);
		btnCancerlar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegResEsporadica.volver();
			}      
		});
		
		JLabel Fondo = new JLabel("");
		Fondo.setBounds(0, 0, 602, 401);
		Fondo.setIcon(new ImageIcon(PanelResEsporadica.class.getResource("/imagenes/PanelResEsporadica/FondoRegBed2.1.png")));
		ContentPanResEsporadica.add(Fondo);

	}

	public JPanel getContentPanResEsporadica() {
		return ContentPanResEsporadica;
	}
	public void setMes(String mes) {
		txtMes.setText(mes);
	}
	public void setDia (String dia) {
		txtReservaDelDia.setText(dia);
	}
	public void setbutton1(String txt) {
		btnSiguiente.setText(txt);
	}

	public void apagarSiguiente() {
		btnSiguiente.setEnabled(false);
		
	}

	public void prenderSiguiente() {
		btnSiguiente.setEnabled(true);
		
	}

	public void apagarAtras() {
		btnAtras.setEnabled(false);
		
	}

	public void prenderAtras() {
		btnAtras.setEnabled(true);
		
	}
	
	
}
