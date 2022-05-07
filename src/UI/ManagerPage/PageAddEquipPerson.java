package UI.ManagerPage;

import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PageAddEquipPerson extends Page {
	private JTextField ssnTextField = new JTextField("SSN");
	private JTextField nameTextField = new JTextField("Name");
	private JTextField surnameTextField = new JTextField("Surname");
	private JTextField contactPhoneTextField = new JTextField("Contact Phone");
	private JButton addButton = new JButton("Add");
	private JButton returnToEntryPageButton = new JButton("Return");
	
	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		ssnTextField.setBounds(250,57,300,50);
		nameTextField.setBounds(250,144,300,50);
		surnameTextField.setBounds(250,231,300,50);
		contactPhoneTextField.setBounds(250,318,300,50);
		addButton.setBounds(350,405,100,50);
		returnToEntryPageButton.setBounds(350,492,100,50);
		
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
		
		components.add(ssnTextField);
		components.add(nameTextField);
		components.add(surnameTextField);
		components.add(contactPhoneTextField);
		components.add(addButton);
		components.add(returnToEntryPageButton);
	}
}
