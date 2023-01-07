package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
public static void main(String[] args) {
	
	String answer = JOptionPane.showInputDialog("You were sent by a king to kill a dragon, do you accept? (Yes/No) : ");
	if(answer.equalsIgnoreCase("Yes")) {
		String answer1 = JOptionPane.showInputDialog("You go to the dragon's lair, but have to choose a weapon (Sword/Shoe) : ");
		if(answer1.equalsIgnoreCase("Shoe")) {
			JOptionPane.showMessageDialog(null, "You died the second you stepped on top of the mountain. HAIYAA!");
		}
		if(answer1.equalsIgnoreCase("Sword")) {
			JOptionPane.showMessageDialog(null, "You kill the dragon. FUIYOH!");
		}
	}
	else {
		JOptionPane.showMessageDialog(null, "The king had you executed. FAILIURE!");
	}
	
}
}
