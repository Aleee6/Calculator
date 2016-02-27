package calculator.core;

import javax.swing.SwingUtilities;

import calculator.gui.MainFrame;

public class Launcher {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
	}

}
