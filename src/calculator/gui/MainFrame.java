package calculator.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	public MainFrame(){
		setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMinimumSize(new Dimension(800,600));
	}
}
