package drd0ct0r.passwordgenerator.utility;

import java.util.Random;

/**
 * @author DrD0ct0r
 */
public final class PasswordUtil {

	private PasswordUtil() {
	}

	/**
	 * Generates a random String of characters of the specified length.
	 */
	public static String generatePassword(int length, boolean special) {
		final char[] characters = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
				'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
				'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3',
				'4', '5', '6', '7', '8', '9', '~', '`', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '+', '=',
				'[', '{', '}', ']', '\\', '|', ';', ':', '\'', '"', '<', ',', '>', '.', '?', '/' };
		String password = "";
		for (int i = 0; i < length; i++) {
			password += characters[(new Random()).nextInt(special ? characters.length : 62)];
		}
		return password;
	}

}