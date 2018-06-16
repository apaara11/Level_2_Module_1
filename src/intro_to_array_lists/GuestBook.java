package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	
	ArrayList<String> names = new ArrayList();
	
	public static void main(String[] args) {
		GuestBook user = new GuestBook();
		
		user.stuff();
	}
	public void stuff() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		
		
		
		frame.add(panel);
		panel.add(button2);
		panel.add(button1);
		
		frame.pack();
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
			String answer= JOptionPane.showInputDialog("Enter your name here");
		}
		else if(e.getSource()==button2) {
			
			
			
			names.add(answer);
		}
	}
}
