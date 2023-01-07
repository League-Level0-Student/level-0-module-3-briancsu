package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog(null, "Are you happy? (Yes/No) : ");
	
	if(answer.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	if(answer.equals("No")) {
		String answer1 = JOptionPane.showInputDialog(null, "Do you want to be happy? (Yes/No): ");
		if(answer1.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		if(answer1.equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");	
		}	
	
	}

	
}
}
