package usermanagment;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class UserGui {

	private JFrame frame;
	private JTextField txtBenutzername;
	private JButton btnNewAnmelden;
	private JLabel lblAnmeldung;
	private JLabel lblBenutzername;
	private JLabel lblNewLabel;
	private JTextField textPasswort;
	private JButton btnNewButton;


	public UserGui() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTxtBenutzername());
		frame.getContentPane().add(getBtnNewAnmelden());
		frame.getContentPane().add(getLblAnmeldung());
		frame.getContentPane().add(getLblBenutzername());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTextPasswort());
		frame.getContentPane().add(getBtnNewButton());
		frame.setVisible(true);
	}
	protected JTextField getTxtBenutzername() {
		if (txtBenutzername == null) {
			txtBenutzername = new JTextField();
			txtBenutzername.setBounds(109, 64, 86, 20);
			
			txtBenutzername.setColumns(10);
		}
		return txtBenutzername;
	}
	protected JButton getBtnNewAnmelden() {
		if (btnNewAnmelden == null) {
			btnNewAnmelden = new JButton("Anmelden");
			btnNewAnmelden.setBounds(10, 137, 89, 23);
		}
		return btnNewAnmelden;
	}
	private JLabel getLblAnmeldung() {
		if (lblAnmeldung == null) {
			lblAnmeldung = new JLabel("Anmeldung");
			lblAnmeldung.setBounds(143, 25, 75, 20);
		}
		return lblAnmeldung;
	}
	private JLabel getLblBenutzername() {
		if (lblBenutzername == null) {
			lblBenutzername = new JLabel("Benutzername");
			lblBenutzername.setBounds(22, 64, 77, 20);
		}
		return lblBenutzername;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Passwort");
			lblNewLabel.setBounds(29, 97, 46, 14);
		}
		return lblNewLabel;
	}
	protected JTextField getTextPasswort() {
		if (textPasswort == null) {
			textPasswort = new JTextField();
			textPasswort.setBounds(109, 94, 86, 20);
			textPasswort.setColumns(10);
		}
		return textPasswort;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Benutzer anlegen");
			btnNewButton.setBounds(141, 137, 129, 23);
		}
		return btnNewButton;
	}
}
