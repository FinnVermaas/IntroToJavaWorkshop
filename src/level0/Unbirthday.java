import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {

		String birthday = JOptionPane.showInputDialog(null, "when is your birthday?");
		if (birthday.equals("April 7")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
		} else if (birthday.equals("4/7")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
		}

		else {
			JOptionPane.showMessageDialog(null, "happy un-Birthday");

		}

	}
}
