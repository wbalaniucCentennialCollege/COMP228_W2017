package week8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LayoutManagersTest extends JFrame {
	// Variables
	private JPanel pNorth, pCenter, pWest, pEast, pSouth;
	private JLabel lblName, lblPosition;
	private JTextField txtName, txtPosition;
	private JButton left, center, right, bEast, bWest, bSouth1, bSouth2;
	
	// Constructor
	public LayoutManagersTest() {
		super("Multiple layout test");
		
		// Creating new panels for each region
		pNorth = new JPanel();
		pCenter = new JPanel();
		pWest = new JPanel(); 
		pEast = new JPanel();
		pSouth = new JPanel();
		
		// Initialized Buttons
		left = new JButton("Left");
		center = new JButton("Center");
		right = new JButton("Right");
		bWest = new JButton("West");
		bEast = new JButton("East");
		bSouth1 = new JButton("Java Programming");
		bSouth2 = new JButton("COMP228");
	}
	
	// Private inner class
	private class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == left) {
				pNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
			} 
			else if (e.getSource() == center) {
				pNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
			}
			else if(e.getSource() == right) {
				pNorth.setLayout(new FlowLayout(FlowLayout.RIGHT));
			}
			
			pNorth.validate();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
