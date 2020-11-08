package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> add2Numbers());
		randNumber.addActionListener(e -> randomNumber());
		tellAJoke.addActionListener(e -> joke());
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	public static void add2Numbers() {
		String m = JOptionPane.showInputDialog("pick a number");
		int x = Integer.parseInt(m);
		String m2 = JOptionPane.showInputDialog("pick another number");
		int y = Integer.parseInt(m2);
		JOptionPane.showMessageDialog(null, x+y);
	}
	
	public static void randomNumber() {
		Random rand = new Random();
		int r = rand.nextInt(1000);
		JOptionPane.showMessageDialog(null, r);
	}
	
	public static void joke() {
		JOptionPane.showInputDialog("Knock knock");
		JOptionPane.showInputDialog("Tank");
		JOptionPane.showMessageDialog(null, "You're welcome!");
	}
	
	
}
