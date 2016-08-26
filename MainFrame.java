package drd0ct0r.passwordgenerator.ui;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import drd0ct0r.passwordgenerator.PasswordGenerator;
import drd0ct0r.passwordgenerator.utility.PasswordUtil;

/**
 * @author DrD0ct0r
 */
public final class MainFrame extends JFrame {

	private static final long serialVersionUID = -6064777964028065448L;

	/**
	 * Initializes all of the frame's components using the specified width and
	 * height.
	 */
	public MainFrame(int width, int height) {
		this.setTitle(String.format("%s v%.1f", PasswordGenerator.TITLE, PasswordGenerator.VERSION));
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(width, height);
		this.setLocationRelativeTo(null);

		final JLabel lengthLabel = new JLabel("Length");
		lengthLabel.setBounds(0, 0, 50, 20);
		this.add(lengthLabel);

		final JTextField length = new JTextField("20");
		length.setBounds(55, 0, 56, 20);
		this.add(length);

		final JLabel useSpecialLabel = new JLabel("Use Special Characters");
		useSpecialLabel.setBounds(width - 185, 0, 200, 20);
		this.add(useSpecialLabel);

		final JCheckBox useSpecial = new JCheckBox();
		useSpecial.setBounds(width - 22, 0, 20, 20);
		this.add(useSpecial);

		final JTextField password = new JTextField();
		password.setBounds(0, height - 101, width - 2, 25);
		this.add(password);

		final JButton copy = new JButton("Copy to Clipboard");
		copy.setBounds(0, height - 76, width - 2, 25);
		copy.addActionListener(listener -> Toolkit.getDefaultToolkit().getSystemClipboard()
				.setContents(new StringSelection(password.getText()), null));
		this.add(copy);

		final JButton generate = new JButton("Generate");
		generate.setBounds(0, height - 51, width - 2, 25);
		generate.addActionListener(listener -> password
				.setText(PasswordUtil.generatePassword(Integer.parseInt(length.getText()), useSpecial.isSelected())));
		this.add(generate);
	}

}