package week8;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class BorderLayoutFrame extends JFrame implements ActionListener {
	private final JButton[] buttons; // Array of buttons to hide regions
	private static final String[] names = {"Hide North", "Hide South", "Hide East", "Hide West", "Hide Center"};
	private final BorderLayout layout;
	
	public BorderLayoutFrame() {
		super("BorderLayout Demo");
		
		layout = new BorderLayout(5, 5); // 5 pixel gap on horizontal and vertical axis
		setLayout(layout);
		buttons = new JButton[names.length];
		
		// Create JButtons and register listeners for them
		for(int count = 0; count < names.length; count++) {
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this);
		}
		
		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.EAST);
		add(buttons[3], BorderLayout.WEST);
		add(buttons[4], BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(JButton button: buttons) {
			if(e.getSource() == button) {
				button.setVisible(false); // Hide the button that was clicked
			}
			else {
				button.setVisible(true); // Show all other buttons
			}
		}
		
		layout.layoutContainer(getContentPane());
	}
}









