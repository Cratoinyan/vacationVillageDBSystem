package UI.AnimatorPage;

import UI.Page;
import UI.PageEntry;
import UI.Print;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PageCreateActivity extends Page {
	private JLabel iLabel = new JLabel("Individual Activity");
	private JTextField iNameTextField = new JTextField("Name");
	private JTextField iInternetLinkTextField = new JTextField("Internet Link");
	private JTextField iAgeRequirement = new JTextField("Age Requirement");
	private JButton iSubmitButton = new JButton("Submit");
	private JLabel mLabel = new JLabel("Mass Activity");
	private JTextField mNameTextField = new JTextField("Name");
	private JTextField mInternetLinkTextField = new JTextField("Internet Link");
	private JTextField mCapacityInput = new JTextField("Capacity Input");
	private JButton mSubmitButton = new JButton("Submit");
	private JButton returnToEntryPageButton = new JButton("Return");
	
	//Links
	public PageEntry entryPage = null;
	
	@Override
	public void startup()
	{
		iLabel.setBounds(50,102,300,50);
		iNameTextField.setBounds(50,168,300,50);
		iInternetLinkTextField.setBounds(50,234,300,50);
		iAgeRequirement.setBounds(50,300,300,50);
		iSubmitButton.setBounds(150,386,100,50);
		mLabel.setBounds(450,102,300,50);
		mNameTextField.setBounds(450,168,300,50);
		mInternetLinkTextField.setBounds(450,234,300,50);
		mCapacityInput.setBounds(450,300,300,50);
		mSubmitButton.setBounds(550,386,100,50);
		returnToEntryPageButton.setBounds(350,488,100,50);
		
		iSubmitButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Individual submit button is clicked.");
		    }  
		});
		
		mSubmitButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Mass submit button is clicked.");
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){  
				 Print.info("Return to entry page button is clicked.");
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(iLabel);
		components.add(iNameTextField);
		components.add(iInternetLinkTextField);
		components.add(iAgeRequirement);
		components.add(iSubmitButton);
		components.add(mLabel);
		components.add(mNameTextField);
		components.add(mInternetLinkTextField);
		components.add(mCapacityInput);
		components.add(mSubmitButton);
		components.add(returnToEntryPageButton);
	}
}
