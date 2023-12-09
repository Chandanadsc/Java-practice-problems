package swingdemo;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {
	public static void main(String[] args)
	{
		Abc obj =new Abc();
		
	}
}
// first you need a class
// frames all components start from j-java
// inbuilt JFrame
class Abc extends JFrame
{
	// create constructor
	// JFrame is by default invisible
	// to store something we need JLabel
	public Abc()
	{
		
		JLabel l =new JLabel("Hello World");
		add(l);
		
		JLabel l1=new JLabel("Welcome Chandana");
		add(l1);
	// JFrame follows Card layout
	// in a stack of cards you can see only top card 
	// the new label overrides the old Label 
	
		setLayout(new FlowLayout());
		
		this.setVisible(true);
		this.setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
