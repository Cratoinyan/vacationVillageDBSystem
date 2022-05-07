package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class PageCustomerLogin extends Page {
	private JTextField phoneNumberTextField = new JTextField("Phone Number");
	private JTextField passwordTextField = new JTextField("Password");
	private JButton loginButton = new JButton("Login");
	private JButton returnToEntryPageButton = new JButton("Return");
	
	//Links
	public PageEntry entryPage = null;
	public PageCustomerAppointment customerAppointmentPage = null;
	
	@Override
	public void startup()
	{
		phoneNumberTextField.setBounds(250,110,300,50);
		passwordTextField.setBounds(250,215,300,50);
		loginButton.setBounds(350,320,100,50);
		returnToEntryPageButton.setBounds(350,400,100,50);
		
		loginButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Login button is clicked.");
				 frame.clear();
				 frame.display(customerAppointmentPage);
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(phoneNumberTextField);
		components.add(passwordTextField);
		components.add(loginButton);
		components.add(returnToEntryPageButton);
	}
}
