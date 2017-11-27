package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Entidades.ConsultaGenerica;
import Logica.GestorBedel;
import Logica.GestorUtilidades;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		txtAdmin.setForeground(Color.WHITE);
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
				ContentPanBuscBed.setVisible(false);
				ContentPanBuscBed.removeAll();
				InicioAdmin.llamarAdmin();
			}
		});
		
		JLabel lblApellidoBed = new JLabel("Apellido");
		lblApellidoBed.setForeground(Color.WHITE);
		lblApellidoBed.setBounds(200, 27, 71, 20);
		ContentPanBuscBed.add(lblApellidoBed);
		lblApellidoBed.setIconTextGap(10);
		lblApellidoBed.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setForeground(Color.WHITE);
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
		
		btnInicioBed.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_inicio (2).png")));
		btnInicioBed.setIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_inicio.png")));
		btnInicioBed.setOpaque(false);
		btnInicioBed.setFocusable(false);
		btnInicioBed.setFocusPainted(false);
		btnInicioBed.setContentAreaFilled(false);
		btnInicioBed.setBorderPainted(false);
		btnInicioBed.setBorder(null);
		btnInicioBed.setBounds(34, 148, 99, 49);
		ContentPanBuscBed.add(btnInicioBed);
		
		
		
		JButton btnRegBed = new JButton("");
		btnRegBed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //ACAAAAAAAAAAAAAACAAAAAAAAAAAAAACAAAAAAAAAAAAAACAAAAAAAAAAAAA
				RegistrarBedel RegBed = new RegistrarBedel();
				RegBed.setSize(600,400);
				RegBed.setLocation(0, 0);
				
				ContentPanBuscBed.removeAll();
				ContentPanBuscBed.add(RegBed, BorderLayout.CENTER);
				ContentPanBuscBed.revalidate();
				ContentPanBuscBed.repaint();
			}
		});
		btnRegBed.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_registrar-bedel22.png")));
		btnRegBed.setIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_registrar-bedel2.png")));
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
		
		JButton btnBuscar = new JButton("");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GestorBedel gb = new GestorBedel();
				
				String turno = (String) comboBoxTurno.getSelectedItem();
				String ape = textField.getText().trim();
				String apelido  = ape.replaceAll(" ","");
				
				
				try {
					ArrayList<ConsultaGenerica> list = gb.BuscarBedel(turno, apelido);
					if(list.isEmpty()) {
						RegistrarBedel rb = new RegistrarBedel();
						rb.mensaje("No existe un bedel, con esos parametros", "Bedel no encontrado");
					}else
					GestorUtilidades.llenarTabla(table,list );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnBuscar.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_buscar2.png")));
		btnBuscar.setIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_buscar.png")));
		btnBuscar.setOpaque(false);
		btnBuscar.setFocusable(false);
		btnBuscar.setFocusPainted(false);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setBorder(null);
		btnBuscar.setBounds(451, 35, 106, 49);
		ContentPanBuscBed.add(btnBuscar);
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(556, 107, 17, 208);
		ContentPanBuscBed.add(scrollBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(200, 107, 357, 208);
		ContentPanBuscBed.add(scrollPane);
		
		table = new JTable();
		
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBackground(new Color(255, 255, 255));
		table.setForeground(new Color(0, 0, 0));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Apellido", "Nombre", "Turno", "Nick usuario"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getTableHeader().setVisible(true);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ContentPanBuscBed.setVisible(false);
				ContentPanBuscBed.removeAll();
				InicioAdmin.llamarAdmin();
			}
		});
		btnCancelar.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_cancelar.png")));
		btnCancelar.setOpaque(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBorder(null);
		btnCancelar.setBounds(419, 335, 115, 40);
		ContentPanBuscBed.add(btnCancelar);
		
		JButton btnModif = new JButton("");
		btnModif.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnModif.setEnabled(false);
		btnModif.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_modificar22.png")));
		btnModif.setIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_modificar2.png")));
		btnModif.setOpaque(false);
		btnModif.setFocusable(false);
		btnModif.setFocusPainted(false);
		btnModif.setContentAreaFilled(false);
		btnModif.setBorderPainted(false);
		btnModif.setBorder(null);
		btnModif.setBounds(190, 335, 121, 40);
		ContentPanBuscBed.add(btnModif);
		
		JButton btnEliminar = new JButton("");
		btnEliminar.setFocusPainted(false);
		btnEliminar.setRolloverIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_eliminar (1)2.png")));
		btnEliminar.setContentAreaFilled(false);
		btnEliminar.setBorderPainted(false);
		btnEliminar.setIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/button_eliminar (1).png")));
		btnEliminar.setBounds(310, 335, 110, 40);
		ContentPanBuscBed.add(btnEliminar);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(table.getSelectedRow()<0) {
					
				}else btnModif.setEnabled(true);
			}
		});
		
		JLabel Fondo = new JLabel("");
		Fondo.setBackground(new Color(0, 0, 0));
		Fondo.setBounds(0, 0, 602, 401);
		Fondo.setIcon(new ImageIcon(BuscarBedel.class.getResource("/imagenes/BuscarBedelimgs/FondoRegBed2.2.png")));
		ContentPanBuscBed.add(Fondo);
		
		

	}
}
