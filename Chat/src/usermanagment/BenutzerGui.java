package usermanagment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BenutzerGui
{

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textName;
	private JTextField textNachname;
	private JLabel lblNewLabel_2;
	private JTextField textEmail;
	private JLabel lblNewLabel_3;
	private JTextField textNummer;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField;
	private JTextField textUsername;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */

	public BenutzerGui()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTextName());
		frame.getContentPane().add(getTextNachname());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getTextEmail());
		frame.getContentPane().add(getLblNewLabel_3());
		frame.getContentPane().add(getTextNummer());
		frame.getContentPane().add(getLblNewLabel_4());
		frame.getContentPane().add(getLblNewLabel_5());
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getTextUsername());
		frame.getContentPane().add(getBtnNewButton());
		frame.setVisible(true);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Name");
			lblNewLabel.setBounds(10, 11, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Nachname");
			lblNewLabel_1.setBounds(171, 11, 71, 14);
		}
		return lblNewLabel_1;
	}
	protected JTextField getTextName() {
		if (textName == null) {
			textName = new JTextField();
			textName.setBounds(61, 8, 86, 20);
			textName.setColumns(10);
		}
		return textName;
	}
	protected JTextField getTextNachname() {
		if (textNachname == null) {
			textNachname = new JTextField();
			textNachname.setBounds(252, 8, 86, 20);
			textNachname.setColumns(10);
		}
		return textNachname;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Email");
			lblNewLabel_2.setBounds(10, 55, 46, 14);
		}
		return lblNewLabel_2;
	}
	protected JTextField getTextEmail() {
		if (textEmail == null) {
			textEmail = new JTextField();
			textEmail.setBounds(61, 52, 86, 20);
			textEmail.setColumns(10);
		}
		return textEmail;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Telefonnummer");
			lblNewLabel_3.setBounds(172, 55, 70, 14);
		}
		return lblNewLabel_3;
	}
	protected JTextField getTextNummer() {
		if (textNummer == null) {
			textNummer = new JTextField();
			textNummer.setText("");
			textNummer.setBounds(252, 52, 86, 20);
			textNummer.setColumns(10);
		}
		return textNummer;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Passwort");
			lblNewLabel_4.setBounds(10, 91, 46, 14);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Benutzername");
			lblNewLabel_5.setBounds(171, 91, 71, 14);
		}
		return lblNewLabel_5;
	}
	protected JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(61, 88, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	protected JTextField getTextUsername() {
		if (textUsername == null) {
			textUsername = new JTextField();
			textUsername.setBounds(252, 88, 86, 20);
			textUsername.setColumns(10);
		}
		return textUsername;
	}
	protected JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Registrieren");
			btnNewButton.setBounds(146, 150, 102, 23);
		}
		return btnNewButton;
	}
}
