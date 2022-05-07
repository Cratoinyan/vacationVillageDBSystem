package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PageAddAnimator extends Page {
	private JTextField nameTextField = new JTextField("Name");
	private JTextField phoneNumberTextField = new JTextField("Phone Number");
	private JTextField expertiseAreaTextField = new JTextField("Expertise Area");
	private JButton addButton = new JButton("Add");
	private JButton returnToEntryPageButton = new JButton("Return");
	
	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		nameTextField.setBounds(250,79,300,50);
		phoneNumberTextField.setBounds(250,191,300,50);
		expertiseAreaTextField.setBounds(250,303,300,50);
		addButton.setBounds(350,406,100,50);
		returnToEntryPageButton.setBounds(350,494,100,50);
		
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
		
		components.add(nameTextField);
		components.add(phoneNumberTextField);
		components.add(expertiseAreaTextField);
		components.add(addButton);
		components.add(returnToEntryPageButton);
	}
}
