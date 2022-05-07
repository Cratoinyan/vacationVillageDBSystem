package UI.AnimatorPage;

import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PageAddEmergencyInfo extends Page {
	private JTextField activityNameTextField = new JTextField("Activity Name");
	private JTextField lockerNumberTextField = new JTextField("Locker Number");
	private JTextField phoneNumberTextField = new JTextField("Phone Number");
	private JButton addButton = new JButton("Add");
	private JButton returnToEntryPageButton = new JButton("Return");
	
	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		activityNameTextField.setBounds(250,71,300,50);
		lockerNumberTextField.setBounds(250,143,300,50);
		phoneNumberTextField.setBounds(250,215,300,50);
		addButton.setBounds(350,342,100,50);
		returnToEntryPageButton.setBounds(350,414,100,50);
		
		addButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Add button is clicked.");
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(activityNameTextField);
		components.add(lockerNumberTextField);
		components.add(phoneNumberTextField);
		components.add(addButton);
		components.add(returnToEntryPageButton);
	}
}
