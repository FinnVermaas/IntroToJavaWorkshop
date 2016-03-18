package day3;

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String clock = JOptionPane.showInputDialog(null, "If you look at the number on my face you won't find thirteen anyplace.");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (clock.equals("Clock")) {
			JOptionPane.showMessageDialog(null, "you are correct");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "The answer is Clock");
		}
		// 6. Add some more riddles
		
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is " + score);

	}
}
