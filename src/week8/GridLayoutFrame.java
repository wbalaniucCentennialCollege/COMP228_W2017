package week8;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame implements ActionListener {
	private final JButton[] buttons;
	private static final String[] names = {"one", "two", "three", "four", "five", "six"};
	private boolean toggle = true; // Toggle between 2 layers
	private final Container container;
	private final GridLayout gridLayout1; // First gridlayout
	private final GridLayout gridLayout2; // Second gridlayout
	
	public GridLayoutFrame() {
		super("GridLayout Demo");
		
		// Initialize variables
		gridLayout1 = new GridLayout(2, 3, 15, 15); // 2 by 3; gaps of 5
		gridLayout2 = new GridLayout(3, 2);
		container = getContentPane();
		setLayout(gridLayout1); // Default layout
		buttons = new JButton[names.length];
		
		// Create buttons, register for events and add to JFrame
		for(int count = 0; count < names.length; count++) {
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
			add(buttons[count]);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(toggle) {
			container.setLayout(gridLayout2);
		}
		else {
			container.setLayout(gridLayout1);
		}
		
		toggle = !toggle;
		container.validate(); // Called when a layout is modified or swapped for a new layout
	}
}














