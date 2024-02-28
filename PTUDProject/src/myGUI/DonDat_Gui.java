package myGUI;

import java.awt.BorderLayout;

import javax.swing.*;

public class DonDat_Gui extends JPanel{
	public DonDat_Gui() {
		setSize(1070, 600);
		setVisible(true);
		add(new JLabel("Dat Hang"), BorderLayout.SOUTH);
	}
}
