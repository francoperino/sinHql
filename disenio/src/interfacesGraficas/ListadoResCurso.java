package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ListadoResCurso extends JPanel {
	private JTextField txtNombreBedel;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ListadoResCurso() {
		setLayout(null);
		
		JPanel ContentPanListadoResCurso = new JPanel();
		ContentPanListadoResCurso.setBounds(0, 0, 600, 400);
		add(ContentPanListadoResCurso);
		ContentPanListadoResCurso.setLayout(null);
		
		JButton btnAtras = new JButton("");
		btnAtras.setRolloverIcon(new ImageIcon(ListadoResCurso.class.getResource("/imagenes/ListadoResCurso/button_atras (3)2.png")));
		btnAtras.setIcon(new ImageIcon(ListadoResCurso.class.getResource("/imagenes/ListadoResCurso/button_atras (3).png")));
		btnAtras.setOpaque(false);
		btnAtras.setFocusable(false);
		btnAtras.setFocusPainted(false);
		btnAtras.setContentAreaFilled(false);
		btnAtras.setBorderPainted(false);
		btnAtras.setBorder(null);
		btnAtras.setBounds(48, 144, 82, 36);
		ContentPanListadoResCurso.add(btnAtras);
		
		txtNombreBedel = new JTextField();
		txtNombreBedel.setText("Bedel");
		txtNombreBedel.setOpaque(false);
		txtNombreBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtNombreBedel.setForeground(Color.WHITE);
		txtNombreBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtNombreBedel.setEditable(false);
		txtNombreBedel.setColumns(10);
		txtNombreBedel.setBorder(null);
		txtNombreBedel.setBounds(37, 103, 112, 28);
		ContentPanListadoResCurso.add(txtNombreBedel);
		
		JLabel lblListaResPara = new JLabel("Lista de reservas para el curso:");
		lblListaResPara.setIconTextGap(10);
		lblListaResPara.setForeground(Color.WHITE);
		lblListaResPara.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblListaResPara.setBounds(260, 40, 235, 19);
		ContentPanListadoResCurso.add(lblListaResPara);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setIconTextGap(10);
		lblCurso.setForeground(Color.WHITE);
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurso.setBounds(356, 70, 43, 19);
		ContentPanListadoResCurso.add(lblCurso);
		
		JButton btnImprimir = new JButton("");
		btnImprimir.setRolloverIcon(new ImageIcon(ListadoResCurso.class.getResource("/imagenes/ListadoResCurso/button_imprimir2.png")));
		btnImprimir.setIcon(new ImageIcon(ListadoResCurso.class.getResource("/imagenes/ListadoResCurso/button_imprimir.png")));
		btnImprimir.setOpaque(false);
		btnImprimir.setFocusable(false);
		btnImprimir.setFocusPainted(false);
		btnImprimir.setContentAreaFilled(false);
		btnImprimir.setBorderPainted(false);
		btnImprimir.setBorder(null);
		btnImprimir.setBounds(211, 340, 128, 40);
		ContentPanListadoResCurso.add(btnImprimir);
		
		JScrollPane tablaDatos = new JScrollPane();
		tablaDatos.setBounds(230, 113, 343, 194);
		ContentPanListadoResCurso.add(tablaDatos);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
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
				"Dia", "Hora Inicio", "Duracion", "Aula"
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
		tablaDatos.setViewportView(table);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ListadoResCurso.class.getResource("/imagenes/ListadoResCurso/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanListadoResCurso.add(Fondo);

	}

}
