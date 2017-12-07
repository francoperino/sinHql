package interfacesGraficas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

public class RegistrarReserva extends JPanel {
	private JTextField txtBedel;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private static CardLayout cl;
	private static RegResEsporadica regResEsporadica;
    private static RegResPeriodica regResPeriodica;
    private static JPanel ContentPanRegReserva;

	/**
	 * Create the panel.
	 */
	public RegistrarReserva() {
		 cl = new CardLayout();
		RegistrarBedel regb = new RegistrarBedel();
		ContentPanRegReserva = new JPanel();
		ContentPanRegReserva.setBounds(0, 0, 600, 400);
		add(ContentPanRegReserva);
		ContentPanRegReserva.setLayout(cl);
		
		
		
		txtBedel = new JTextField();
		txtBedel.setText("Bedel");
		txtBedel.setOpaque(false);
		txtBedel.setHorizontalAlignment(SwingConstants.CENTER);
		txtBedel.setForeground(Color.WHITE);
		txtBedel.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtBedel.setEditable(false);
		txtBedel.setColumns(10);
		txtBedel.setBorder(null);
		txtBedel.setBounds(38, 107, 112, 28);
		ContentPanRegReserva.add(txtBedel);
		
		JButton btnInicio = new JButton("");
		btnInicio.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_inicio (2).png")));
		btnInicio.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_inicio.png")));
		btnInicio.setFocusPainted(false);
		btnInicio.setContentAreaFilled(false);
		btnInicio.setBorderPainted(false);
		btnInicio.setBounds(38, 146, 103, 40);
		ContentPanRegReserva.add(btnInicio);
		
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InicioBedel.llamarBedel();
			}
		});
		
		JButton btnBuscarAula = new JButton("");
		btnBuscarAula.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_buscar-aula2.png")));
		btnBuscarAula.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_buscar-aula.png")));
		btnBuscarAula.setFocusPainted(false);
		btnBuscarAula.setContentAreaFilled(false);
		btnBuscarAula.setBorderPainted(false);
		btnBuscarAula.setBounds(10, 197, 161, 49);
		ContentPanRegReserva.add(btnBuscarAula);
		
		JLabel label = new JLabel("Listar Reserva");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(10, 247, 131, 28);
		ContentPanRegReserva.add(label);
		
		JButton btnCurso = new JButton("");
		btnCurso.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_curso2.png")));
		btnCurso.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_curso.png")));
		btnCurso.setFocusPainted(false);
		btnCurso.setContentAreaFilled(false);
		btnCurso.setBorderPainted(false);
		btnCurso.setBounds(38, 281, 103, 40);
		ContentPanRegReserva.add(btnCurso);
		
		JButton btnDiaEspecifico = new JButton("");
		btnDiaEspecifico.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_dia-especifico (1)2.png")));
		btnDiaEspecifico.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_dia-especifico (1).png")));
		btnDiaEspecifico.setFocusPainted(false);
		btnDiaEspecifico.setContentAreaFilled(false);
		btnDiaEspecifico.setBorderPainted(false);
		btnDiaEspecifico.setBounds(5, 329, 181, 49);
		ContentPanRegReserva.add(btnDiaEspecifico);
		
		JRadioButton rdbtnEsporadica = new JRadioButton("Esporadica");
		buttonGroup.add(rdbtnEsporadica);
		rdbtnEsporadica.setForeground(Color.WHITE);
		rdbtnEsporadica.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnEsporadica.setContentAreaFilled(false);
		rdbtnEsporadica.setFocusPainted(false);
		rdbtnEsporadica.setBounds(205, 30, 119, 23);
		ContentPanRegReserva.add(rdbtnEsporadica);
		
		JRadioButton rdbtnPeriodica = new JRadioButton("Periodica");
		buttonGroup.add(rdbtnPeriodica);
		rdbtnPeriodica.setForeground(Color.WHITE);
		rdbtnPeriodica.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnPeriodica.setFocusPainted(false);
		rdbtnPeriodica.setContentAreaFilled(false);
		rdbtnPeriodica.setBounds(205, 86, 119, 23);
		ContentPanRegReserva.add(rdbtnPeriodica);
		
		JComboBox comBoxTipoPeriodica = new JComboBox();
		comBoxTipoPeriodica.setModel(new DefaultComboBoxModel(new String[] {"Seleccionar", "Anual", "1er Cuatrimestre", "2do Cuatrimestre"}));
		comBoxTipoPeriodica.setMaximumRowCount(4);
		comBoxTipoPeriodica.setForeground(Color.BLACK);
		comBoxTipoPeriodica.setFont(new Font("Tahoma", Font.BOLD, 14));
		comBoxTipoPeriodica.setBackground(Color.WHITE);
		comBoxTipoPeriodica.setBounds(330, 86, 149, 20);
		ContentPanRegReserva.add(comBoxTipoPeriodica);
		
		JButton btnCancelar = new JButton("");
		btnCancelar.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_cancelar2.png")));
		btnCancelar.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_cancelar.png")));
		btnCancelar.setFocusPainted(false);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setBorderPainted(false);
		btnCancelar.setBounds(367, 146, 112, 40);
		ContentPanRegReserva.add(btnCancelar);
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(!rdbtnEsporadica.isSelected() && !rdbtnPeriodica.isSelected()) {
					regb.mensaje("Debe seleccionar el tipo de reserva", "No hay reserva seleccionada");
				}
				else {
					if(rdbtnEsporadica.isSelected()) {
						System.out.println("Seleccionada Esporadica");
					}else {
					if(rdbtnPeriodica.isSelected() && comBoxTipoPeriodica.getSelectedIndex()!=0) {
						System.out.println("Seleccionada Periodica");
						
					}
					else { regb.mensaje("Seleccione el tipo de reserva periodica","No selecciono tipo");
							}
					
			
				}}
			}
		});
		btnRegistrar.setRolloverIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_registrar2.png")));
		btnRegistrar.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/button_registrar.png")));
		btnRegistrar.setFocusPainted(false);
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBounds(205, 146, 131, 40);
		ContentPanRegReserva.add(btnRegistrar);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(RegistrarReserva.class.getResource("/imagenes/RegistrarReserva/FondoRegBed2.1.png")));
		Fondo.setBounds(0, 0, 602, 401);
		ContentPanRegReserva.add(Fondo);
		
		regResPeriodica = new RegResPeriodica();
		ContentPanRegReserva.add(regResPeriodica, "regResPer");
		regResPeriodica.setBounds(0, 0, 104, 18);
		
		regResEsporadica = new RegResEsporadica();
		ContentPanRegReserva.add(regResEsporadica, "regResEsp");
		regResEsporadica.setBounds(0, 0, 1, 1);
		
	
		PanelResEsporadica panelResEsporadica = new PanelResEsporadica();
		ContentPanRegReserva.add(panelResEsporadica, "panelResEsp");
		panelResEsporadica.setBounds(0, 0, 1, 1);

		
		
		}
}
