package interfacesGraficas;

import javax.swing.JPanel;

public class PanelesRegPeriodica extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelesRegPeriodica() {
		setLayout(null);
		
		PanelJueves panelJueves = new PanelJueves();
		panelJueves.setBounds(0, 335, 258, -334);
		add(panelJueves);
		panelJueves.setVisible(true);

	}
}
