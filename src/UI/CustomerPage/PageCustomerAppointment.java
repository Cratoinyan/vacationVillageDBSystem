package UI.CustomerPage;

import Business.Model.Appointment;
import Business.ModelManager.ActivityManager;
import Business.ModelManager.CustomerManager;
import DB.DAO.ActivityDAO;
import DB.DAO.AppointmentDAO;
import DB.DAO.CustomerDAO;
import UI.Page;
import UI.PageActivityList;
import UI.PageEntry;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PageCustomerAppointment extends Page {
	private JLabel individualActivityLabel = new JLabel("Individual Activity");
	private JTextField iDateTextField = new JTextField("Date");
	private JTextField iHourTextField = new JTextField("Hour");
	private JButton iSubmitButton = new JButton("Submit");
	private JLabel massActivityLabel = new JLabel("Mass Activity");
	private JTextField mDateTextField = new JTextField("Date");
	private JTextField mHourTextField = new JTextField("Hour");
	private JComboBox<String> mActivityTypeComboBox = new JComboBox<String>();
	private JButton mActivityTypeRefreshButton = new JButton("Refresh");
	private JButton mSubmitButton = new JButton("Submit");
	private JButton mActivityListButton = new JButton("Activities");
	private JButton returnToEntryPageButton = new JButton("Return");

	private ActivityManager activityManager = new ActivityManager(new ActivityDAO());
	private AppointmentDAO appointmentDAO = new AppointmentDAO();
	private CustomerManager customerManager = new CustomerManager(new CustomerDAO());
	
	//Links
	public PageEntry entryPage = null;
	public PageActivityList activityListPage = null;
	
	@Override
	public void startup()
	{
		individualActivityLabel.setBounds(150,122,200,50);
		iDateTextField.setBounds(150,200,200,50);
		iHourTextField.setBounds(150,282,200,50);
		iSubmitButton.setBounds(200,400,100,50);
		massActivityLabel.setBounds(450,122,200,50);
		mDateTextField.setBounds(450,200,200,50);
		mHourTextField.setBounds(450,282,200,50);
		mActivityTypeComboBox.setBounds(450,350,100,25);
		mActivityTypeRefreshButton.setBounds(550,350,100,25);
		mSubmitButton.setBounds(500,400,100,50);
		mActivityListButton.setBounds(350,400,100,50);
		returnToEntryPageButton.setBounds(350,484,100,50);
		
		iSubmitButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){
				 String activityInfo[] = activityManager.getIndActivityInfo(iDateTextField.getText(), iHourTextField.getText());

				 int customerAge = customerManager.getAge(String.valueOf(SessionInformation.customerID));

				 if (customerAge >= Integer.parseInt(activityInfo[2]) ){
					 appointmentDAO.addAppointment(new Appointment(SessionInformation.customerID,
							 Integer.parseInt(activityInfo[0]),Integer.parseInt(activityInfo[1]), iDateTextField.getText(), iHourTextField.getText()));
				 }else{
					 //todo add error message
				 }
		    }  
		});
		
		mActivityTypeRefreshButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){

				 String comboBoxOptions[] = activityManager.getMassActivityTypes();
				 mActivityTypeComboBox.setModel(new DefaultComboBoxModel<String>(comboBoxOptions));
		    }  
		});
		
		mSubmitButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){
				 String newCapacity;
				 String date = mDateTextField.getText();
				 String hour = mHourTextField.getText();

				 String activtiyInfo[] = activityManager.getMassActivityInfo(date, hour);

				 if(activityManager.verifyMassActivityCapacity(date, hour)){
					 appointmentDAO.addAppointment(new Appointment(SessionInformation.customerID,
							 Integer.parseInt(activtiyInfo[0]),Integer.parseInt(activtiyInfo[1]),date,hour));
					 newCapacity = activityManager.getMassActivityParticipantCount(date, hour) + 1 + "-" + activityManager.getMassActivityCapacity(date, hour);
					 activityManager.updateActivityCapacity(mDateTextField.getText(), mHourTextField.getText(), newCapacity);
		    	}
			 }
		});
		
		mActivityListButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){
				 activityListPage.setCaller(0);
				 frame.clear();
				 frame.display(activityListPage);
		    }  
		});
		
		returnToEntryPageButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e){
				 frame.clear();
				 frame.display(entryPage);
		    }  
		});
		
		components.add(individualActivityLabel);
		components.add(iDateTextField);
		components.add(iHourTextField);
		components.add(iSubmitButton);
		components.add(massActivityLabel);
		components.add(mDateTextField);
		components.add(mHourTextField);
		components.add(mActivityTypeComboBox);
		components.add(mActivityTypeRefreshButton);
		components.add(mSubmitButton);
		components.add(mActivityListButton);
		components.add(returnToEntryPageButton);
	}
}
