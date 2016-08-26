package drd0ct0r.passwordgenerator;

import drd0ct0r.passwordgenerator.ui.MainFrame;

/**
 * @author DrD0ct0r
 */
public final class PasswordGenerator {

	public static final String TITLE = "Password Generator";

	public static final double VERSION = 1.0;

	private PasswordGenerator() {
	}

	public static void main(String[] args) {
		new MainFrame(300, 150).setVisible(true);
	}

}